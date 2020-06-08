package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.commander.StarShip;
import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.classes.procurements.*;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.engineers.Engineer;
import com.controllerface.cmdr_j.enums.equipment.modules.HardpointModule;
import com.controllerface.cmdr_j.enums.equipment.modules.ModulePurchaseType;
import com.controllerface.cmdr_j.enums.equipment.modules.OptionalInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.OptionalInternalSlot;
import com.controllerface.cmdr_j.threads.UserTransaction;
import com.controllerface.cmdr_j.ui.Displayable;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.SVGPath;
import javafx.util.Pair;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/2/2018.
 */
public class ShipModuleData implements Displayable
{
    private final StarShip currentShip;
    private final Statistic moduleSlot;
    private final ShipModule module;

    private final ModificationBlueprint modificationBlueprint;
    private final ExperimentalRecipe experimentalEffectRecipe;

    private final List<ModifierData> modifiers;
    private final int level;
    private final double quality;
    private final BlockingQueue<UserTransaction> userTransactions;

    private final TitledPane displayPane = new TitledPane();
    private final AtomicBoolean initialRenderComplete = new AtomicBoolean(false);

    private ShipModuleData(Builder builder)
    {
        this.currentShip = builder.currentShip;
        this.moduleSlot = builder.moduleName;
        this.module = builder.module;
        this.modifiers = builder.modifiers;
        this.modificationBlueprint = builder.modificationBlueprint;
        this.experimentalEffectRecipe = builder.experimentalEffectRecipe;
        this.level = builder.level;
        this.quality = builder.quality;
        this.userTransactions = builder.userTransactions;

        displayPane.getStyleClass().addAll("general_panel", "base_font");
    }

    public Statistic getModuleSlot()
    {
        return moduleSlot;
    }

    public ShipModule getModule()
    {
        return module;
    }

    /**
     * Maps a {@code ProcurementBlueprint} object to a {@code Pair<ProcurementType, ProcurementRecipe>} object,
     * suitable for adding as a new task the the tracked task list.
     *
     * @param blueprint ProcurementBlueprint to map
     * @return a new Pair<ProcurementType, ProcurementRecipe>
     */
    private Stream<Pair<ProcurementType, ProcurementRecipe>> mapBlueprint(ProcurementBlueprint blueprint)
    {
        return blueprint.recipeStream().map(recipe ->
        {
            ProcurementType type = recipe instanceof ModificationRecipe
                    ? module.modificationType()
                    : recipe instanceof ExperimentalRecipe
                            ? module.experimentalType()
                            : module.modificationType(); // todo: handle other types of recipes

            return new Pair<>(type, recipe);
        });
    }

    private HBox createRecipeControl(Pair<ProcurementType, ProcurementRecipe> recipePair)
    {
        HBox container = new HBox();
        container.getStyleClass().addAll("information_panel","no_border");

        Button button = createTaskButton(recipePair);
        TitledPane infoPane = createInfoPane(recipePair);
        infoPane.getStyleClass().addAll("information_panel", "no_border");
        infoPane.prefWidthProperty().bind(container.widthProperty()
                .subtract(button.widthProperty())
                .subtract(button.graphicTextGapProperty().multiply(4)));
        //infoPane.requestLayout();
        container.getChildren().addAll(button, infoPane);
        return container;
    }

    private Button createTaskButton(Pair<ProcurementType, ProcurementRecipe> recipePair)
    {
        Button button = new Button();
        button.getStyleClass().addAll("add_task_button", "base_font");
        button.setText("add");

        Tooltip tooltip = new Tooltip();
        tooltip.getStyleClass().addAll("base_font");
        tooltip.setText("Add " + recipePair.getValue().getDisplayLabel() + " to Tracked Tasks");
        button.setTooltip(tooltip);

        button.setOnAction(event -> userTransactions.add(UserTransaction.start(UserTransaction.TransactionType.BLUEPRINT)
                .setTransactionAmount(1)
                .setBlueprint(recipePair)
                .build()));

        return button;
    }

    private TitledPane createInfoPane(Pair<ProcurementType, ProcurementRecipe> recipePair)
    {
        TitledPane infoPane = new TitledPane();
        infoPane.setExpanded(false);
        infoPane.setAnimated(false);

        Label nameLabel = new Label(recipePair.getValue().getDisplayLabel());
        nameLabel.getStyleClass().addAll("general_panel_label", "base_font");
        infoPane.setGraphic(nameLabel);

        VBox costEffectContainer = new VBox();
        costEffectContainer.getStyleClass().addAll("information_panel", "no_border");
        infoPane.setContent(costEffectContainer);

        infoPane.expandedProperty().addListener((_x, wasCollapsed, wasExpanded) ->
        {
            if (wasExpanded && costEffectContainer.getChildren().isEmpty())
            {
                // effects
                recipePair.getValue().effects().effectStream()
                        .map(UIFunctions.Convert.effectToLabel)
                        .sorted(UIFunctions.Sort.byGoodness)
                        .forEach(label -> costEffectContainer.getChildren().add(label));

                if (recipePair.getValue().effects() != ItemEffects.EMPTY)
                {
                    Separator separator = new Separator();
                    separator.setPrefHeight(10);
                    costEffectContainer.getChildren().add(separator);
                }

                // costs
                recipePair.getValue().costStream()
                        .map(c->
                        {
                            String quantity = c.getQuantity() < 0
                                    ? "+" + Math.abs(c.getQuantity())
                                    : "-" + c.getQuantity();
                            Label next = new Label(quantity + " " + c.getCost().getLocalizedName());
                            next.getStyleClass().addAll("light_color_label", "base_font");
                            return next;
                        })
                        .forEach(label -> costEffectContainer.getChildren().add(label));


                List<Engineer> engineers = Engineer.findSupportedEngineers(recipePair.getKey(), recipePair.getValue().getGrade());
                if (!engineers.isEmpty())
                {
                    Separator separator2 = new Separator();
                    separator2.setPrefHeight(10);
                    costEffectContainer.getChildren().add(separator2);

                    for (Engineer engineer : engineers)
                    {
                        Label engineerLabel = new Label(engineer.getFullName() + " :: "
                                + engineer.getLocation().getSystemName());
                        engineerLabel.setTextFill(UIFunctions.Style.darkOrange);
                        engineerLabel.getStyleClass().add("base_font");
                        costEffectContainer.getChildren().add(engineerLabel);
                    }
                }
            }
        });



        return infoPane;
    }

    private void renderGuardianInfo(HBox moduleNameContainer)
    {
        double sizew = 22;
        double sizeh = 18;

        HBox guardianBox = new HBox();
        guardianBox.setAlignment(Pos.CENTER_LEFT);
        SVGPath icon = UIFunctions.Icons.guardian;

        final Region svgShape = new Region();
        svgShape.setShape(icon);
        svgShape.setMinSize(sizew, sizeh);
        svgShape.setPrefSize(sizew, sizeh);
        svgShape.setMaxSize(sizew, sizeh);
        svgShape.setLayoutX(5);
        svgShape.setStyle("-fx-background-color: #0077cc;");

        String text = "Guardian Module";

        if (module instanceof HardpointModule)
        {
            text = "Guardian Weapon";
        }

        Tooltip tooltip = new Tooltip(text);
        Tooltip.install(guardianBox, tooltip);
        guardianBox.getChildren().add(svgShape);
        moduleNameContainer.getChildren().add(guardianBox);
    }

    private void renderPowerPlayInfo(HBox moduleNameContainer)
    {
        double sizew = 20;
        double sizeh = 18;

        HBox powerPlayBox = new HBox();
        powerPlayBox.setAlignment(Pos.CENTER_LEFT);
        SVGPath icon = UIFunctions.Icons.powerplay;

        final Region svgShape = new Region();
        svgShape.setShape(icon);
        svgShape.setMinSize(sizew, sizeh);
        svgShape.setPrefSize(sizew, sizeh);
        svgShape.setMaxSize(sizew, sizeh);
        svgShape.setStyle("-fx-background-color: #ffffff;");

        String text = "Powerplay Module";

        if (module instanceof HardpointModule)
        {
            text = "Powerplay Weapon";
        }

        Tooltip tooltip = new Tooltip(text);
        Tooltip.install(powerPlayBox, tooltip);
        powerPlayBox.getChildren().add(svgShape);
        Label spacer = new Label(" ");
        moduleNameContainer.getChildren().addAll(powerPlayBox, spacer);
    }

    private void renderExperimentalInfo(HBox moduleNameContainer, boolean fromTechBroker)
    {
        double sizew = 22;
        double sizeh = 18;

        HBox experimentBox = new HBox();
        experimentBox.setAlignment(Pos.CENTER_LEFT);
        SVGPath icon = UIFunctions.Icons.aegis;

        final Region svgShape = new Region();
        svgShape.setShape(icon);
        svgShape.setMinSize(sizew, sizeh);
        svgShape.setPrefSize(sizew, sizeh);
        svgShape.setMaxSize(sizew, sizeh);
        svgShape.setLayoutX(5);

        if (fromTechBroker) svgShape.setStyle("-fx-background-color: #b70000;");
        else svgShape.setStyle("-fx-background-color: #025B30;");

        String prefix = fromTechBroker ? " Experimental " : " Anti-Xeno ";
        String suffix = module instanceof HardpointModule ? "Weapon" : "Module";
        String text = prefix + suffix;

        Tooltip tooltip = new Tooltip(text);
        Tooltip.install(experimentBox, tooltip);
        experimentBox.getChildren().add(svgShape);

        moduleNameContainer.getChildren().add(experimentBox);
    }

    private void renderModificationInfo(HBox moduleNameContainer, VBox detailsContainer)
    {
        if (modificationBlueprint != null)
        {
            // in some cases, a blueprint can temporarily be set with no modifiers. This state requires some extra
            // text to let the player know the data will be refreshed when they exit the outfitting menu
            boolean needsRefresh = modifiers.isEmpty();
            HBox modBox = new HBox();
            modBox.setAlignment(Pos.CENTER_LEFT);
            // generate the text and Label object, setting up the font/color, add the label to the name container
            String labelText = " G" + level + " " + modificationBlueprint.toString() +" ";

            if (needsRefresh) { labelText += " (*needs refresh*) "; }

            Label modificationLabel = new Label(labelText);
            modificationLabel.getStyleClass().add("base_font");
            modificationLabel.setTextFill(UIFunctions.Style.darkOrange);
            modificationLabel.alignmentProperty().setValue(Pos.CENTER_LEFT);

            //modBox.getChildren().add(svgShape);

            modBox.getChildren().add(modificationLabel);

            moduleNameContainer.getChildren().add(modBox);

            // if we need a refresh, also add a tooltip to make it clearer what needs to be done to refresh the module
            if (needsRefresh)
            {
                Tooltip refreshNotice = new Tooltip("This module was retrieved from storage in outfitting\n" +
                        "Exit outfitting menu to refresh this module's information");

                refreshNotice.getStyleClass().addAll("base_font");
                modificationLabel.setTooltip(refreshNotice);
            }

            // this container shows the player a progress percentage for the modification
            //HBox modProgressBox = new HBox();
            //modProgressBox.setAlignment(Pos.CENTER_LEFT);

            // this is the static progress text
            Label modProgressLabel = new Label("Current Modification Progress: ");
            modProgressLabel.getStyleClass().add("base_font");
            modProgressLabel.setPadding(new Insets(0,0,5,0));
            modProgressLabel.getStyleClass().add("general_panel_label");

            // here we set up the progress percentage value
            Label modProgressValue = new Label();
            modProgressValue.setTextFill(UIFunctions.Style.darkOrange);
            modProgressValue.getStyleClass().add("base_font");
            modProgressValue.setPadding(new Insets(0,0,5,0));
            modProgressValue.setText((int)(quality * 100d) + "%");

            // now add the labels to the progress box
            //modProgressBox.getChildren().add(modProgressLabel);
            //modProgressBox.getChildren().add(modProgressValue);
            //modProgressBox.setAlignment(Pos.BASELINE_CENTER);

            // finally add the progress indicator itself to the detail container
            //detailsContainer.getChildren().add(modProgressBox);
        }

        if (experimentalEffectRecipe != null)
        {
            Label special = new Label(" " + experimentalEffectRecipe.getDisplayLabel());
            special.getStyleClass().add("base_font");
            special.setTextFill(UIFunctions.Style.darkYellow);
            HBox expBox = new HBox();
            expBox.setAlignment(Pos.CENTER_LEFT);
            expBox.getChildren().add(special);

            moduleNameContainer.getChildren().add(expBox);
        }


        ProcurementType modificationType = module.modificationType();
        ProcurementType experimentalType = module.experimentalType();
        if (modificationType != null || experimentalType != null)
        {
            if (modificationType != null)
            {
                TitledPane modPane = new TitledPane();
                modPane.setText("Available Modifications");
                modPane.setTextFill(UIFunctions.Style.darkOrange);
                modPane.setExpanded(false);
                modPane.setAnimated(false);
                modPane.getStyleClass().addAll("modification_pane", "base_font");
                VBox modBox = new VBox();
                modBox.getStyleClass().addAll("information_panel", "base_font");
                modPane.setContent(modBox);
                detailsContainer.getChildren().add(modPane);

                modPane.expandedProperty().addListener((_x, oldValue, newValue) ->
                {
                    if (newValue && modBox.getChildren().isEmpty())
                    {
                        modificationType.getBluePrints()
                                .stream()
                                .map(blueprint ->
                                {
                                    TitledPane gradePane = new TitledPane();
                                    gradePane.setText(blueprint.toString());
                                    gradePane.setExpanded(false);
                                    gradePane.setAnimated(false);
                                    gradePane.getStyleClass().addAll("information_panel", "base_font");
                                    VBox gradeBox = new VBox();
                                    gradeBox.getStyleClass().addAll("information_panel", "base_font");
                                    gradePane.setContent(gradeBox);

                                    gradePane.expandedProperty().addListener((_y, oldValue1, newValue1) ->
                                    {
                                        if (newValue1 && gradeBox.getChildren().isEmpty())
                                        {
                                            mapBlueprint(blueprint)
                                                    .map(this::createRecipeControl)
                                                    .peek(button -> button.prefWidthProperty().bind(modPane.widthProperty()))
                                                    .forEach(b -> gradeBox.getChildren().add(b));
                                        }
                                    });

                                    return gradePane;
                                })
                                .forEach(b -> modBox.getChildren().add(b));
                    }
                });


            }

            if (experimentalType != null)
            {
                TitledPane expPane = new TitledPane();
                expPane.setText("Available Experimental Effects");
                expPane.setTextFill(UIFunctions.Style.darkYellow);
                expPane.setExpanded(false);
                expPane.setAnimated(false);
                expPane.getStyleClass().addAll("experiment_pane", "base_font");
                VBox expBox = new VBox();
                expBox.getStyleClass().addAll("information_panel", "base_font");
                expPane.setContent(expBox);
                detailsContainer.getChildren().add(expPane);

                expPane.expandedProperty().addListener((_x, wasCollapsed, wasExpanded) ->
                {
                    if (wasExpanded && expBox.getChildren().isEmpty())
                    {
                        experimentalType.getBluePrints()
                                .stream()
                                .flatMap(this::mapBlueprint)
                                .map(this::createRecipeControl)
                                .peek(button ->
                                {
                                    button.prefWidthProperty().bind(expPane.widthProperty());
                                })
                                .forEach(b -> expBox.getChildren().add(b));
                    }
                });
            }
        }
    }

    private void renderAvailableModules(VBox effectsContainer)
    {
        Map<Integer, List<ShipModule>> moduleMap = new LinkedHashMap<>();
        ProcurementType procurementType;
        AtomicBoolean armorSlot = new AtomicBoolean(false);

        if (moduleSlot instanceof HardpointSlot)
        {
            procurementType = ModulePurchaseType.Hardpoint;
            HardpointSlot hardpointSlot = ((HardpointSlot) moduleSlot);
            List<ShipModule> compatibleModules = HardpointModule.findModulesBySize(hardpointSlot.getSize());
            compatibleModules.forEach(m->
            {
                int s = m.itemEffects().effectByName(ItemEffect.Size).map(ItemEffectData::getDoubleValue)
                        .map(Double::intValue)
                        .orElse(-1);

                moduleMap.computeIfAbsent(s, (_s) -> new ArrayList<>()).add(m);
            });
        }
        else if (moduleSlot instanceof OptionalInternalSlot)
        {
            procurementType = ModulePurchaseType.Optional;
            OptionalInternalSlot internalSlot = ((OptionalInternalSlot) moduleSlot);
            if (internalSlot.getSize() == 0)
            {
                // bail on size 0 for this slot, it means it is the "planetary landing" module placeholder
                return;
            }

            OptionalInternalSlot hardpointSlot = ((OptionalInternalSlot) moduleSlot);
            List<ShipModule> compatibleModules = OptionalInternalModule.findModulesBySize(hardpointSlot.getSize());
            compatibleModules.forEach(m->
            {
                int s = m.itemEffects().effectByName(ItemEffect.Size).map(ItemEffectData::getDoubleValue)
                        .map(Double::intValue)
                        .orElse(-1);

                moduleMap.computeIfAbsent(s, (_s) -> new ArrayList<>()).add(m);
            });
        }
        else if (moduleSlot instanceof CoreInternalSlot)
        {
            procurementType = ModulePurchaseType.Core;
            CoreInternalSlot internalSlot = ((CoreInternalSlot) moduleSlot);
            // consult ship for modules that can be fitted

            System.out.println("DEBUG: " + internalSlot);

            CoreModuleLayoutData moduleLayoutData = currentShip.getShip().getCoreModules();

            int sizeValue = 0;
            switch (internalSlot)
            {
                case Armour:
                    moduleMap.put(0, Stream.of(currentShip.getShip().getArmorModules()).collect(Collectors.toList()));
                    armorSlot.set(true);
                    break;

                case PowerPlant:
                    sizeValue = moduleLayoutData.getPowerPlant().intValue;
                    break;

                case MainEngines:
                    sizeValue = moduleLayoutData.getThrusters().intValue;
                    break;

                case FrameShiftDrive:
                    sizeValue = moduleLayoutData.getFrameShiftDrive().intValue;
                    break;

                case LifeSupport:
                    sizeValue = moduleLayoutData.getLifeSupport().intValue;
                    break;

                case PowerDistributor:
                    sizeValue = moduleLayoutData.getPowerDistributor().intValue;
                    break;

                case Radar:
                    sizeValue = moduleLayoutData.getSensors().intValue;
                    break;

                case FuelTank:
                    sizeValue = moduleLayoutData.getFuelTank().intValue;
                    break;

                // if we are looking at one of the non changeable slots, just bail
                default:
                    return;
            }

            if (!armorSlot.get())
            {
                internalSlot.findModulesBySize(sizeValue).forEach(m->
                {
                    int s = m.itemEffects().effectByName(ItemEffect.Size).map(ItemEffectData::getDoubleValue)
                            .map(Double::intValue)
                            .orElse(-1);

                    moduleMap.computeIfAbsent(s, (_s) -> new ArrayList<>()).add(m);
                });
            }
        }
        else
        {
            // other wise we can't list anything
            return;
        }

        if (moduleMap.isEmpty())
        {
            return;
        }


        TitledPane statPane = new TitledPane();
        statPane.setExpanded(false);
        statPane.setAnimated(false);
        statPane.setText("Available Modules");
        statPane.setTextFill(UIFunctions.Style.neutralWhite);
        statPane.getStyleClass().addAll("modules_pane", "base_font");
        VBox moduleBox = new VBox();
        moduleBox.getStyleClass().addAll("information_panel", "base_font");

        statPane.expandedProperty().addListener((_x, statCollapsed, statExpanded) ->
        {
            if (statExpanded && moduleBox.getChildren().isEmpty())
            {
                moduleMap.forEach((size, modules)->
                {
                    TitledPane sizePane = new TitledPane();
                    sizePane.setExpanded(false);
                    sizePane.setAnimated(false);

                    if (armorSlot.get())
                    {
                        sizePane.setText("Bulkheads");
                    }
                    else
                    {
                        sizePane.setText("Size " + size);
                    }

                    moduleBox.getChildren().add(sizePane);
                    VBox contentBox = new VBox();
                    sizePane.setContent(contentBox);

                    sizePane.expandedProperty().addListener((_y, sizeCollapsed, sizeExpanded) ->
                    {
                        if (sizeExpanded && contentBox.getChildren().isEmpty())
                        {
                            modules.forEach(module->
                            {
                                ProcurementRecipe moduleRecipe = procurementType.getBluePrints().stream()
                                        .flatMap(ProcurementBlueprint::recipeStream)
                                        .filter(recipe -> recipe.costStream()
                                                .map(CostData::getCost)
                                                .anyMatch(cost -> cost == module))
                                        .findAny().orElse(null);

                                if (moduleRecipe == null) return;

                                Pair<ProcurementType, ProcurementRecipe> recipePair = new Pair<>(procurementType, moduleRecipe);

                                TitledPane titledPane = new TitledPane();
                                titledPane.setText(moduleRecipe.toString());
                                titledPane.setExpanded(false);
                                titledPane.setAnimated(false);
                                titledPane.getStyleClass().addAll("information_panel", "base_font");
                                VBox gradeBox = new VBox();
                                gradeBox.getStyleClass().addAll("information_panel", "base_font");
                                titledPane.setContent(gradeBox);
                                contentBox.getChildren().add(titledPane);

                                titledPane.expandedProperty().addListener((_z, wasCollapsed, wasExpanded) ->
                                {
                                    if (wasExpanded && gradeBox.getChildren().isEmpty())
                                    {
                                        HBox h = createRecipeControl(recipePair);
                                        h.prefWidthProperty().bind(sizePane.widthProperty());
                                        gradeBox.getChildren().add(h);
                                    }
                                });

                            });
                        }
                    });
                });
            }
        });

        statPane.setContent(moduleBox);
        effectsContainer.getChildren().add(statPane);
    }

    private void renderEffectTable(VBox effectsContainer)
    {
        List<Pair<ItemEffect, Label>> effects = prepareEffectData();

        TableColumn<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>> nameColumn = new TableColumn<>();
        nameColumn.setCellValueFactory((param) -> new ReadOnlyObjectWrapper<>(param.getValue()));
        nameColumn.setCellFactory(UIFunctions.Data.moduleNameCellFactory);
        //nameColumn.setText("Statistic");

        TableColumn<Pair<ItemEffect, Label>, Label> valueColumn = new TableColumn<>();
        valueColumn.prefWidthProperty().set(125);
        valueColumn.setCellFactory(UIFunctions.Data.moduleEffectValueFactory);
        valueColumn.setCellValueFactory((param) -> new ReadOnlyObjectWrapper<>(param.getValue().getValue()));
        //valueColumn.setText("Value");

        TableColumn<Pair<ItemEffect, Label>, Label> unitColumn = new TableColumn<>();
        unitColumn.prefWidthProperty().set(125);
        unitColumn.setCellFactory(UIFunctions.Data.moduleEffectUnitFactory);
        unitColumn.setCellValueFactory(param ->
        {
            Label unit = new Label(param.getValue().getKey().unit);
            unit.getStyleClass().add("base_font");
            return new ReadOnlyObjectWrapper<>(unit);
        });
        //unitColumn.setText("Unit");

        TitledPane statPane = new TitledPane();
        statPane.setExpanded(true);
        statPane.setAnimated(false);
        statPane.setText("Current Module Statistics");
        statPane.setTextFill(UIFunctions.Style.neutralWhite);
        statPane.getStyleClass().addAll("stats_pane", "base_font");

        VBox statBox = new VBox();
        statBox.fillWidthProperty().set(true);
        statBox.getStyleClass().add("information_panel");

        TableView<Pair<ItemEffect, Label>> effectTable = new TableView<>();

        effectTable.getStyleClass().addAll("no_header"/*, "no_scrollbars"*/, "stat_table");

        effectTable.getColumns().add(nameColumn);
        effectTable.getColumns().add(valueColumn);
        effectTable.getColumns().add(unitColumn);

        nameColumn.prefWidthProperty()
                .bind(effectTable.prefWidthProperty()
                        .subtract(valueColumn.prefWidthProperty())
                        .subtract(unitColumn.prefWidthProperty()).subtract(30));

        effectTable.setItems(FXCollections.observableArrayList(effects));
        effectTable.prefHeightProperty()
                .bind(effectTable.fixedCellSizeProperty()
                        .multiply(Bindings.size(effectTable.getItems())).add(3));

        effectTable.prefWidthProperty().bind(displayPane.widthProperty().subtract(30));

        effectTable.getStyleClass().add("general_stat_table");

        statBox.getChildren().add(effectTable);
        statPane.setContent(statBox);

        effectsContainer.getChildren().add(statPane);
    }

    private void renderSupplementalIcons(HBox moduleNameContainer)
    {

        ItemEffectData weaponMount = module.itemEffects().effectByName(ItemEffect.WeaponMode)
                .orElse(null);

        if (weaponMount != null)
        {
            Icon icon = null;

            switch (weaponMount.getStringValue())
            {
                case "Fixed":
                    icon = UIFunctions.Icons.fixedIcon;
                    break;

                case "Gimbal":
                    icon = UIFunctions.Icons.gimbalIcon;
                    break;

                case "Turret":
                    icon = UIFunctions.Icons.turretIcon;
                    break;

                default:
            }

            if (icon != null)
            {
                double sizew = 20; //icon.getBaseWidth();
                double sizeh = 20; //icon.getBaseHeight();
                HBox modBox = new HBox();
                modBox.setAlignment(Pos.CENTER_LEFT);

                SVGPath iconPath = icon.getIconPath();

                final Region svgShape = new Region();
                svgShape.setShape(iconPath);
                svgShape.setMinSize(sizew, sizeh);
                svgShape.setPrefSize(sizew, sizeh);
                svgShape.setMaxSize(sizew, sizeh);
                svgShape.translateYProperty().set(2);

                if (icon == UIFunctions.Icons.turretIcon)
                {
                    svgShape.translateYProperty().set(6.5);
                    svgShape.setMinSize(sizew, 15);
                    svgShape.setPrefSize(sizew, 15);
                    svgShape.setMaxSize(sizew, 15);
                }

                svgShape.setStyle("-fx-background-color: " + icon.getHexColorString());
                Label spacer = new Label(" ");
                moduleNameContainer.getChildren().addAll(svgShape, spacer);
            }
        }

        if (!module.icons().isEmpty())
        {
            Icon icon = module.icons().get(0);

            double sizew = 20; //icon.getBaseWidth();
            double sizeh = 20; //icon.getBaseHeight();
            HBox modBox = new HBox();
            modBox.setAlignment(Pos.CENTER_LEFT);

            SVGPath iconPath = icon.getIconPath();

            final Region svgShape = new Region();
            svgShape.setShape(iconPath);
            svgShape.setMinSize(sizew, sizeh);
            svgShape.setPrefSize(sizew, sizeh);
            svgShape.setMaxSize(sizew, sizeh);
            svgShape.translateYProperty().set(2);

            if (icon == UIFunctions.Icons.guardianIcon
                    || icon == UIFunctions.Icons.aegisIcon
                    || icon == UIFunctions.Icons.axIcon)
            {
                svgShape.translateYProperty().set(5);
                svgShape.setMinSize(sizew, 18);
                svgShape.setPrefSize(sizew, 18);
                svgShape.setMaxSize(sizew, 18);
            }

            svgShape.setStyle("-fx-background-color: " + icon.getHexColorString());
            Label spacer = new Label(" ");
            moduleNameContainer.getChildren().addAll(svgShape, spacer);
        }

        if (modificationBlueprint != null)
        {
            double sizew = 20;
            double sizeh = 22;

            SVGPath icon = modificationBlueprint.byLevel(level)
                    .map(r->r.getIcon().getIconPath())
                    .orElse(UIFunctions.Icons.engineering);

            final Region svgShape = new Region();
            svgShape.setShape(icon);
            svgShape.setMinSize(sizew, sizeh);
            svgShape.setPrefSize(sizew, sizeh);
            svgShape.setMaxSize(sizew, sizeh);
            //svgShape.setLayoutX(5);
            svgShape.translateYProperty().set(1.5);
            svgShape.setStyle("-fx-background-color: " +
                    UIFunctions.Icons.toHexString(UIFunctions.Style.standardOrange));
            Label spacer = new Label(" ");
            moduleNameContainer.getChildren().addAll(svgShape, spacer);
        }

        if (experimentalEffectRecipe != null)
        {
            double sizew = 20;
            double sizeh = 22;

            SVGPath icon = modificationBlueprint.byLevel(level)
                    .map(r->r.getIcon().getIconPath())
                    .orElse(UIFunctions.Icons.engineering);

            final Region svgShape = new Region();
            svgShape.setShape(icon);
            svgShape.setMinSize(sizew, sizeh);
            svgShape.setPrefSize(sizew, sizeh);
            svgShape.setMaxSize(sizew, sizeh);
            svgShape.translateYProperty().set(1.5);
            svgShape.setStyle("-fx-background-color: " +
                    UIFunctions.Icons.toHexString(UIFunctions.Style.specialYellow));
            Label spacer = new Label(" ");
            moduleNameContainer.getChildren().addAll(svgShape, spacer);
        }


        boolean powerPlay = module.itemEffects().effectStream()
                .anyMatch(e->e.getEffect() == ItemEffect.power_play);

        if (powerPlay)
        {
            renderPowerPlayInfo(moduleNameContainer);
        }
    }

    private void renderDisplayGraphic()
    {
        Label moduleLabel = new Label(module.displayText() + " ");
        moduleLabel.alignmentProperty().setValue(Pos.CENTER_LEFT);
        moduleLabel.getStyleClass().addAll("general_panel_label", "base_font");

        HBox moduleNameContainer = new HBox();

        renderSupplementalIcons(moduleNameContainer);

        moduleNameContainer.getChildren().add(moduleLabel);
        moduleNameContainer.getStyleClass().add("general_panel_label");


        VBox detailsContainer = new VBox();
        detailsContainer.setAlignment(Pos.CENTER_LEFT);
        detailsContainer.getStyleClass().add("general_panel");

        renderModificationInfo(moduleNameContainer, detailsContainer);

        VBox modulesContainer = new VBox();
        modulesContainer.fillWidthProperty().setValue(true);
        modulesContainer.getStyleClass().add("general_panel");
        detailsContainer.getChildren().add(modulesContainer);

        renderAvailableModules(modulesContainer);

        VBox effectsContainer = new VBox();
        effectsContainer.fillWidthProperty().setValue(true);
        effectsContainer.getStyleClass().add("general_panel");
        detailsContainer.getChildren().add(effectsContainer);

        renderEffectTable(effectsContainer);

        HBox statContainer = new HBox();
        statContainer.getChildren().add(detailsContainer);
        statContainer.getStyleClass().add("general_panel");

        if (moduleNameContainer.getChildren().get(0) != moduleLabel)
        {
            moduleLabel.textProperty().set(" " + moduleLabel.getText());
        }

        displayPane.setContent(statContainer);
        displayPane.setGraphic(moduleNameContainer);
        displayPane.setExpanded(false);
        displayPane.setAnimated(false);
    }

    private List<Pair<ItemEffect, Label>> prepareEffectData()
    {
        // base stats, filtered so any stats that have stored modifiers are skipped
        List<Pair<ItemEffect, Label>> effects = module.itemEffects().effectStream()

                // these are marker effects, handled elsewhere so filter out
                .filter(effectData -> effectData.getEffect() != ItemEffect.guardian)
                .filter(effectData -> effectData.getEffect() != ItemEffect.experimental)
                .filter(effectData -> effectData.getEffect() != ItemEffect.power_play)

                // size does not need to be displayed in the stat table as it is in the item description
                .filter(effectData -> effectData.getEffect() != ItemEffect.Size)

                // filter out any stats that are affected by modifiers
                .filter(effectData -> modifiers.stream()
                        .noneMatch(modifierData -> modifierData.getEffect().equals(effectData.getEffect())))

                .map(effectPair ->
                {
                    Label label =  new Label(effectPair.getValueString());
                    label.getStyleClass().addAll("general_stat_label", "base_font");
                    return new Pair<>(effectPair.getEffect(), label);
                })
                .collect(Collectors.toList());

        // now process modified stats
        modifiers.stream()
                .map(modifier ->
                {
                    String vals = String.valueOf(modifier.getValue());
                    Label label = new Label(vals);
                    Tooltip origVal = new Tooltip("Original Value:\n" + modifier.getOriginalValue());
                    origVal.getStyleClass().add("base_font");
                    label.getStyleClass().add("base_font");
                    label.setTooltip(origVal);
                    boolean isLess = Double.compare(modifier.getValue(), modifier.getOriginalValue()) < 0;
                    boolean isGood = modifier.isLessIsGood() == isLess;
                    if (isGood) label.setTextFill(UIFunctions.Style.positiveBlue);
                    else label.setTextFill(UIFunctions.Style.negativeRed);
                    return new Pair<>(modifier.getEffect(), label);
                })
                .forEach(effects::add);

        effects.sort(Comparator.comparing(Pair::getKey));

        if (modificationBlueprint != null)
        {
            double progress = UIFunctions.Data.round(quality * 100d, 3);
            String progressText = progress < 1
                    ? "." + quality
                    : String.valueOf(progress);

            Label modProgressValue = new Label();
            modProgressValue.setTextFill(UIFunctions.Style.standardOrange);
            modProgressValue.getStyleClass().add("base_font");
            modProgressValue.setText(progressText);
            Pair<ItemEffect, Label> p = new Pair<>(ItemEffect.Modification_Progress, modProgressValue);
            effects.add(0, p);
        }

        // special experimental effects that are not "normal" modified effects. always add to top of list
        if (experimentalEffectRecipe != null)
        {
            experimentalEffectRecipe.effects().effectStream()
                    // filter out stats already accounted for via modifiers or on the module itself
                    .filter(e->modifiers.stream().noneMatch(m->m.getEffect().equals(e.getEffect())))
                    .filter(e->module.itemEffects().effectStream().noneMatch(m->m.getEffect().equals(e.getEffect())))

                    // use an empty label for the value, only the effect itself is important
                    .forEach(exe->
                    {
                        Label label = new Label("");
                        Pair<ItemEffect, Label> p = new Pair<>(exe.getEffect(), label);
                        effects.add(0, p);
                    });
        }

        return effects;
    }



    /**
     * For the provided ItemEffect, returns the actual value this item has for that effect, if any.
     * If the module has modifications that override the stock value, this method will return the
     * modified value. If the provided effect is not present on this module, will return 0.0d.
     *
     * @param effect the ItemEffect to get the value of from this module
     * @return the actual applied value on this module for the given effect, or 0.0d if the effect is not present
     */
    public double getEffectValue(ItemEffect effect)
    {
        Double stockValue = module.itemEffects().effectStream()
                .filter(effectData -> effectData.getEffect() == effect)
                .filter(ItemEffectData::isNumerical)
                .map(ItemEffectData::getDoubleValue)
                .findAny().orElse(null);

        Double modifiedValue = modifiers.stream()
                .filter(modifierData -> modifierData.getEffect() == effect)
                .map(ModifierData::getValue)
                .findAny().orElse(null);

        return (modifiedValue == null && stockValue == null)
                ? 0.0d
                : modifiedValue == null
                        ? stockValue
                        : modifiedValue;
    }

    @Override
    public void prepareGraphic() {}

    public synchronized Node getGraphic()
    {
        if (!initialRenderComplete.getAndSet(true)) renderDisplayGraphic();
        return displayPane;
    }

    @Override
    public int hashCode()
    {
        return moduleSlot.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof ShipModuleData))
        {
            return false;
        }
        ShipModuleData other = ((ShipModuleData) obj);
        return other == this || other.getModuleSlot() == this.moduleSlot;
    }

    public static class Builder
    {
        private StarShip currentShip;
        private Statistic moduleName;
        private ShipModule module;
        private List<ModifierData> modifiers;
        private ModificationBlueprint modificationBlueprint;
        private ExperimentalRecipe experimentalEffectRecipe;
        private int level;
        private double quality;
        private BlockingQueue<UserTransaction> userTransactions;

        public Builder setCurrentShip(StarShip currentShip)
        {
            this.currentShip = currentShip;
            return this;
        }

        public Builder setModuleName(Statistic moduleName)
        {
            this.moduleName = moduleName;
            return this;
        }

        public Builder setModule(ShipModule module)
        {
            this.module = module;
            return this;
        }

        public Builder setModifiers(List<ModifierData> modifiers)
        {
            this.modifiers = modifiers;
            return this;
        }

        public Builder setModificationBlueprint(ModificationBlueprint modificationBlueprint)
        {
            this.modificationBlueprint = modificationBlueprint;
            return this;
        }

        public Builder setExperimentalEffectRecipe(ExperimentalRecipe experimentalEffectName)
        {
            this.experimentalEffectRecipe = experimentalEffectName;
            return this;
        }

        public Builder setLevel(Integer level)
        {
            if (level != null) this.level = level;
            return this;
        }

        public Builder setQuality(Double quality)
        {
            if (quality != null) this.quality = quality;
            return this;
        }

        public Builder setUserTransactions(BlockingQueue<UserTransaction> userTransactions)
        {
            if (userTransactions != null) this.userTransactions = userTransactions;
            return this;
        }

        public ShipModuleData build()
        {
            if (modifiers == null) modifiers = new ArrayList<>();
            return new ShipModuleData(this);
        }
    }
}
