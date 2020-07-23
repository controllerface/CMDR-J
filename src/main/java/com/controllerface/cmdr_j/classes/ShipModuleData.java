package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.commander.StarShip;
import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.classes.tasks.*;
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
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.SVGPath;
import javafx.util.Pair;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
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
     * Maps a {@code TaskBlueprint} object to a {@code Pair<TaskType, TaskRecipe>} object,
     * suitable for adding as a new task the the tracked task list.
     *
     * @param blueprint TaskBlueprint to map
     * @return a new Pair<TaskType, TaskRecipe>
     */
    private Stream<Pair<TaskType, TaskRecipe>> mapBlueprint(TaskBlueprint blueprint)
    {
        return blueprint.recipeStream().map(recipe ->
        {
            TaskType type = recipe instanceof ModificationRecipe
                    ? module.modificationType()
                    : recipe instanceof ExperimentalRecipe
                            ? module.experimentalType()
                            : module.modificationType(); // todo: handle other types of recipes

            return new Pair<>(type, recipe);
        });
    }

    private TitledPane createRecipeControl(Pair<TaskType, TaskRecipe> recipePair)
    {
        //VBox container = new VBox();
        //container.getStyleClass().addAll("information_panel","no_border");

//        Button button = createTaskButton(recipePair);
        TitledPane infoPane = createInfoPane(recipePair);
        infoPane.getStyleClass().addAll("modification_pane", "no_border");
//        infoPane.prefWidthProperty().bind(container.widthProperty()
//                .subtract(button.widthProperty())
//                .subtract(button.graphicTextGapProperty().multiply(4)));
        //container.getChildren().addAll(infoPane);
        return infoPane;
    }

    private VBox createModuleControl(Pair<TaskType, TaskRecipe> recipePair)
    {
        VBox container = new VBox();
        container.getStyleClass().addAll("information_panel","no_border");

        //Button button = createTaskButton2(recipePair);
        //button.prefWidthProperty().bind(container.widthProperty());
        VBox infoPane = createModulePane(recipePair);

        infoPane.getStyleClass().addAll("information_panel", "no_border");
        container.getChildren().addAll(infoPane);
        return container;
    }

    private Button createTaskButton(Pair<TaskType, TaskRecipe> recipePair)
    {
        Button button = new Button();
        HBox buttonGraphic = new HBox();
        Label addLabel = new Label("Add ");
        addLabel.getStyleClass().addAll("module_purchase_label");
        Label gradeLabel = new Label(recipePair.getValue().getGrade().toString());
        gradeLabel.getStyleClass().addAll("inventory_label");
        button.getStyleClass().addAll("add_task_button", "base_font");
        buttonGraphic.getChildren().addAll(addLabel, gradeLabel);
        button.setGraphic(buttonGraphic);

        //button.setText("Add " + recipePair.getValue().getGrade());

        Tooltip tooltip = new Tooltip();
        tooltip.getStyleClass().addAll("base_font");
        tooltip.setText("Add " + recipePair.getValue().getDisplayLabel() + " to Tracked Tasks");
        button.setTooltip(tooltip);

        button.setOnAction(event -> userTransactions.add(UserTransaction.type(UserTransaction.TransactionType.BLUEPRINT)
                .setTransactionAmount(1)
                .setBlueprint(recipePair)
                .build()));

        return button;
    }


    private Button createTaskButton2(Pair<TaskType, TaskRecipe> recipePair)
    {
        Button button = new Button();
        button.getStyleClass().addAll("add_task_button", "base_font");

        HBox hBox = new HBox();

        CostData costData = recipePair.getValue().costStream().filter(c->c.getQuantity() < 0).findAny()
                .orElse(null);

        String xTxt = "Buy ";

        Label x = new Label(xTxt);
        x.getStyleClass().add("module_purchase_label");


        CostData costData2 = recipePair.getValue().costStream().filter(c->c.getQuantity() >= 0).findAny()
                .orElse(null);

        String yTxt = "";

        if (costData2 != null)
        {
            yTxt += String.format("%,8d%n", costData2.getQuantity()).trim()
                    + " " + costData2.getCost().getLocalizedName();
        }

        Label y = new Label(yTxt);
        y.getStyleClass().add("inventory_label");




        //Region spacer = new Region();
        //HBox.setHgrow(spacer, Priority.ALWAYS);
        hBox.getChildren().addAll(x, y);

        button.setGraphic(hBox);
        //button.setText(recipePair.getValue().getDisplayLabel());




        Tooltip tooltip = new Tooltip();
        tooltip.getStyleClass().addAll("base_font");
        tooltip.setText("Add " + recipePair.getValue().getDisplayLabel() + " to Tracked Tasks");
        button.setTooltip(tooltip);

        button.setOnAction(event -> userTransactions.add(UserTransaction.type(UserTransaction.TransactionType.BLUEPRINT)
                .setTransactionAmount(1)
                .setBlueprint(recipePair)
                .build()));

        return button;
    }

    private TitledPane createInfoPane(Pair<TaskType, TaskRecipe> recipePair)
    {
        TitledPane infoPane = new TitledPane();
        infoPane.setExpanded(false);
        infoPane.setAnimated(false);
        infoPane.getStyleClass().addAll("module_item_pane");

        HBox x = new HBox();
        Label nameLabel = new Label(recipePair.getValue().getDisplayLabel());
        Region s = new Region();
        HBox.setHgrow(s, Priority.ALWAYS);
        Button button = createTaskButton(recipePair);
        x.getChildren().addAll(nameLabel, s, button);
        nameLabel.getStyleClass().addAll("general_panel_label", "base_font");
        infoPane.setGraphic(x);

        VBox costEffectContainer = new VBox();
        costEffectContainer.getStyleClass().addAll("information_panel");
        infoPane.setContent(costEffectContainer);
        costEffectContainer.fillWidthProperty().setValue(true);
        x.minWidthProperty().bind(costEffectContainer.widthProperty().subtract(46));

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

    private static class ModuleComparison
    {
        private final boolean moreIsGood;
        private final boolean modified;
        private final String name;
        private final Object base;
        private final Object comparison;

        private ModuleComparison(boolean moreIsGood, boolean modified, String name, Object base, Object comparison)
        {
            this.moreIsGood = moreIsGood;
            this.modified = modified;
            this.name = name;
            this.base = base;
            this.comparison = comparison;
        }
    }

    private VBox createModulePane(Pair<TaskType, TaskRecipe> recipePair)
    {
        VBox box = new VBox();

        box.fillWidthProperty().setValue(true);

        box.prefWidthProperty().set(1000);

        TableView<ModuleComparison> costEffectContainer = new TableView<>();
        costEffectContainer.setFixedCellSize(30);
        costEffectContainer.getStyleClass().add("comp_table");

        TableColumn<ModuleComparison, Label> nameColumn = new TableColumn<>();
        nameColumn.setCellValueFactory(param ->
        {
            Label label = new Label(param.getValue().name);
            label.getStyleClass().addAll("inventory_label", "module_purchase_stat_label");
            return new ReadOnlyObjectWrapper<>(label);
        });

        // the "base" value column shows the values
        TableColumn<ModuleComparison, Label> baseColumn = new TableColumn<>();
        baseColumn.setCellValueFactory(param ->
        {

            Label label = new Label();

            ModuleComparison com = param.getValue();
            if (com.base instanceof String || com.comparison instanceof String)
            {
                label.setText(param.getValue().base.toString());
                label.getStyleClass().addAll("light_color_label");
            }
            else
            {
                label.setText(String.valueOf(UIFunctions.Data.round(((Double) com.base), 2)));
                Double c = ((Double) com.base);
                Double b = ((Double) com.comparison);
                if (param.getValue().moreIsGood)
                {
                    if (c > b) label.getStyleClass().addAll("positive_stat");
                    else if (c < b) label.getStyleClass().addAll("negative_stat");
                    else label.getStyleClass().addAll("light_color_label");
                }
                else
                {
                    if (c > b) label.getStyleClass().addAll("negative_stat");
                    else if (c < b) label.getStyleClass().addAll("positive_stat");
                    else label.getStyleClass().addAll("light_color_label");
                }
            }

            return new ReadOnlyObjectWrapper<>(label);
        });

        // the "current" column shows the value of the
        TableColumn<ModuleComparison, Label> currentColumn = new TableColumn<>();
        currentColumn.setCellValueFactory(param ->
        {
            Label label = new Label(param.getValue().comparison.toString());
            if (param.getValue().modified)
            {
                label.getStyleClass().addAll("modification_stat_label");
            }
            else
            {
                label.getStyleClass().addAll("light_color_label");
            }
            return new ReadOnlyObjectWrapper<>(label);
        });

        nameColumn.setText("Module Statistics");
        baseColumn.setText("Comparison");
        currentColumn.setText("Current");

        // todo: see if this can be removed/lowered by adding icons for damage types
        baseColumn.setPrefWidth(140);
        currentColumn.setPrefWidth(140);

        nameColumn.setSortable(false);
        baseColumn.setSortable(false);
        currentColumn.setSortable(false);

        nameColumn.setResizable(false);
        baseColumn.setResizable(false);
        currentColumn.setResizable(false);

        nameColumn.setReorderable(false);
        baseColumn.setReorderable(false);
        currentColumn.setReorderable(false);

        costEffectContainer.getColumns().add(nameColumn);
        costEffectContainer.getColumns().add(baseColumn);
        costEffectContainer.getColumns().add(currentColumn);

        ObservableList<ModuleComparison> observableBaseStatistics = FXCollections.observableArrayList();
        costEffectContainer.setItems(observableBaseStatistics);

        nameColumn.prefWidthProperty()
                .bind(costEffectContainer.widthProperty()
                        .subtract(baseColumn.widthProperty())
                        .subtract(currentColumn.widthProperty()).subtract(5));

        costEffectContainer.prefHeightProperty()
                .bind(Bindings.size(costEffectContainer.getItems())
                        .multiply(costEffectContainer.fixedCellSizeProperty())
                        .add(costEffectContainer.fixedCellSizeProperty())
                        .add(10));

        costEffectContainer.prefWidthProperty().bind(box.widthProperty());

        //costEffectContainer.getStyleClass().addAll("ship_stats_table", "no_border");
        box.getChildren().add(costEffectContainer);

        ShipModule shipModule = recipePair.getValue().costStream().filter(costData -> costData.getQuantity() < 0).findFirst()
                .map(o-> ((ShipModule) o.getCost()))
                .orElse(null);

        if (shipModule == null) return box;

        // effects
        shipModule.itemEffects()
                .effectStream()
                .map(x ->
                {
                    Pair<String, Object> l = UIFunctions.Convert.moduleEffectToLabel.apply(x);
                    ItemEffectData c = module.itemEffects().effectByName(x.getEffect()).orElse(null);
                    ModifierData s = modifiers.stream()
                            .filter(m->m.getEffect() == x.getEffect())
                            .findAny()
                            .orElse(null);

                    Object cn;
                    boolean moreIsGood = false;
                    boolean modified = false;
                    if (c == null && s == null)
                    {
                        cn = "-";
                    }
                    else if (s != null)
                    {
                        moreIsGood = s.getEffect().moreIsGood;
                        modified = true;

                        if (s.getValue() == Double.MAX_VALUE)
                        {
                            cn = UIFunctions.Symbols.INFINITY;
                        }
                        else
                        {
                            cn = UIFunctions.Data.round(s.getValue(), 2);
                        }
                    }
                    else
                    {
                        moreIsGood = c.getEffect().moreIsGood;
                        if (c.isNumerical())
                        {
                            if (c.getDoubleValue() == Double.MAX_VALUE)
                            {
                                cn = UIFunctions.Symbols.INFINITY;
                            }
                            else
                            {
                                cn = UIFunctions.Data.round(c.getDoubleValue(), 2);
                            }
                        }
                        else
                        {
                            cn = c.getStringValue();
                        }
                    }
                    return new ModuleComparison(moreIsGood, modified, l.getKey(), l.getValue(), cn);
                })
                .forEach(observableBaseStatistics::add);

        module.itemEffects().effectStream()
                .filter(m -> shipModule.itemEffects().effectByName(m.getEffect())
                        .isEmpty())
                .filter(m -> modifiers.stream().noneMatch(x->x.getEffect() == m.getEffect()))
                .map(m -> new ModuleComparison(m.getEffect().moreIsGood,
                        false,
                        m.getEffect().toString(),
                        "-",
                        m.getValueString()))
                .forEach(observableBaseStatistics::add);

        modifiers.stream().filter(m -> shipModule.itemEffects().effectByName(m.getEffect()).isEmpty())
                .map(m -> new ModuleComparison(m.getEffect().moreIsGood,
                        true,
                        m.getEffect().toString(),
                        "-",
                        m.getValue()))
                .forEach(observableBaseStatistics::add);

        return box;
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
        }

        if (experimentalEffectRecipe != null)
        {
            Label special = new Label(" " + experimentalEffectRecipe.getDisplayLabel());
            special.getStyleClass().add("base_font");
            special.setTextFill(UIFunctions.Style.specialYellow);
            HBox expBox = new HBox();
            expBox.setAlignment(Pos.CENTER_LEFT);
            expBox.getChildren().add(special);

            moduleNameContainer.getChildren().add(expBox);
        }


        TaskType modificationType = module.modificationType();
        TaskType experimentalType = module.experimentalType();
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

                // deferred rendering
                modPane.expandedProperty().addListener((_a, _b, modePaneOpened) ->
                {
                    if (modePaneOpened && modBox.getChildren().isEmpty())
                    {
                        modificationType.getBluePrints()
                                .stream()
                                .map(blueprint ->
                                {
                                    HBox categoryGraphic = new HBox();
                                    Label categoryLabel = new Label(blueprint.toString());
                                    categoryLabel.getStyleClass()
                                            .addAll("modification_stat_label", "base_font");

                                    Button fullRollButton = new Button();
                                    HBox buttonGraphic = new HBox();
                                    Label addLabel = new Label("Add All ");
                                    Label gradeLabel = new Label();
                                    gradeLabel.getStyleClass().addAll("inventory_label");
                                    addLabel.getStyleClass().addAll("module_purchase_label");
                                    buttonGraphic.getChildren().addAll(addLabel, gradeLabel);
                                    long count = blueprint.recipeStream().count();
                                    if (count > 1)
                                    {
                                        gradeLabel.setText("Grades 1 - " + count);
                                    }
                                    else
                                    {
                                        gradeLabel.setText("Grade 1");
                                    }

                                    fullRollButton.setGraphic(buttonGraphic);
                                    fullRollButton.getStyleClass().addAll("full_roll_button", "base_font");

                                    fullRollButton.setOnAction(_e ->
                                            mapBlueprint(blueprint).forEach(recipePair ->
                                            {
                                                UserTransaction transaction = UserTransaction
                                                        .type(UserTransaction.TransactionType.BLUEPRINT)
                                                        .setTransactionAmount(1)
                                                        .setBlueprint(recipePair)
                                                        .build();

                                                userTransactions.add(transaction);
                                            }));

                                    Region spacer = new Region();
                                    HBox.setHgrow(spacer, Priority.ALWAYS);
                                    categoryGraphic.getChildren().addAll(categoryLabel, spacer, fullRollButton);

                                    TitledPane gradePane = new TitledPane();
                                    categoryGraphic.minWidthProperty().bind(modBox.widthProperty().subtract(75));
                                    gradePane.setGraphic(categoryGraphic);
                                    gradePane.setExpanded(false);
                                    gradePane.setAnimated(false);
                                    gradePane.getStyleClass().addAll("module_category_pane", "base_font");
                                    Accordion gradeBox = new Accordion();
                                    gradeBox.getStyleClass().addAll("modification_pane");
                                    gradePane.setContent(gradeBox);

                                    // deferred rendering
                                    gradePane.expandedProperty().addListener((_c, _d, gradePaneOpened) ->
                                    {
                                        if (gradePaneOpened && gradeBox.getPanes().isEmpty())
                                        {
                                            mapBlueprint(blueprint)
                                                    .map(this::createRecipeControl)
                                                    .peek(button -> button.prefWidthProperty().bind(modPane.widthProperty()))
                                                    .forEach(b -> gradeBox.getPanes().add(b));
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
                expPane.setTextFill(UIFunctions.Style.specialYellow);
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
                                .peek(button -> button.prefWidthProperty().bind(expPane.widthProperty()))
                                .forEach(button -> expBox.getChildren().add(button));
                    }
                });
            }
        }
    }

    private void renderAvailableModules(VBox effectsContainer)
    {
        Map<Integer, List<ShipModule>> moduleMap = new LinkedHashMap<>();
        TaskType taskType;
        AtomicBoolean armorSlot = new AtomicBoolean(false);
        AtomicBoolean exactSizeOnly = new AtomicBoolean(false);


        if (moduleSlot instanceof HardpointSlot)
        {
            taskType = ModulePurchaseType.Hardpoint;
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
            taskType = ModulePurchaseType.Optional;
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
            taskType = ModulePurchaseType.Core;
            CoreInternalSlot internalSlot = ((CoreInternalSlot) moduleSlot);
            // consult ship for modules that can be fitted

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
                    exactSizeOnly.set(true);
                    break;

                case PowerDistributor:
                    sizeValue = moduleLayoutData.getPowerDistributor().intValue;
                    break;

                case Radar:
                    sizeValue = moduleLayoutData.getSensors().intValue;
                    exactSizeOnly.set(true);
                    break;

                case FuelTank:
                    sizeValue = moduleLayoutData.getFuelTank().intValue;
                    break;

                // if we are looking at one of the non changeable slots, just bail
                default:
                    return;
            }

            if (!armorSlot.get() && !exactSizeOnly.get())
            {
                internalSlot.findModulesBySize(sizeValue).forEach(m->
                {
                    int s = m.itemEffects().effectByName(ItemEffect.Size).map(ItemEffectData::getDoubleValue)
                            .map(Double::intValue)
                            .orElse(-1);

                    moduleMap.computeIfAbsent(s, (_s) -> new ArrayList<>()).add(m);
                });
            }
            else if (exactSizeOnly.get())
            {
                internalSlot.findModulesByExactSize(sizeValue).forEach(m->
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

        // defer rendering until pane is expanded
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
                        sizePane.setText("Armor");
                    }
                    else
                    {
                        sizePane.setText("Size " + size);
                    }

                    moduleBox.getChildren().add(sizePane);
                    Accordion contentBox = new Accordion();
                    sizePane.setContent(contentBox);
                    sizePane.expandedProperty().addListener((observable, oldValue, newValue) ->
                    {
                        if (newValue)
                        {
                            sizePane.getParent().getChildrenUnmodifiable().stream()
                                    .map(n -> ((TitledPane) n))
                                    .filter(c->c != sizePane)
                                    .forEach(p->p.expandedProperty().setValue(false));
                        }
                    });

                    // defer rendering until pane is expanded
                    sizePane.expandedProperty().addListener((_y, sizeCollapsed, sizeExpanded) ->
                    {
                        if (sizeExpanded && contentBox.getPanes().isEmpty())
                        {
                            // all the types of modules we come across
                            Map<TaskType, Accordion> types = new HashMap<>();
                            Map<String, Accordion> altTypes = new HashMap<>();

                            modules.forEach(knownModule->
                            {
                                TaskRecipe moduleRecipe = taskType.getBluePrints().stream()
                                        .flatMap(TaskBlueprint::recipeStream)
                                        .filter(recipe -> recipe.costStream()
                                                .map(CostData::getCost)
                                                .anyMatch(cost -> cost == knownModule))
                                        .findAny().orElse(null);

                                if (moduleRecipe == null) return;

                                Pair<TaskType, TaskRecipe> recipePair = new Pair<>(taskType, moduleRecipe);

                                // this is the individual module pane

                                ItemEffectData sizeData = knownModule.itemEffects().effectByName(ItemEffect.Size)
                                        .orElse(null);

                                ItemEffectData classData = knownModule.itemEffects().effectByName(ItemEffect.Class)
                                        .orElse(null);

                                String prefix = "";

                                if (sizeData != null && classData != null)
                                {
                                    prefix += ((int) sizeData.getDoubleValue()) + classData.getStringValue() + " ";
                                }

                                ItemEffectData modeData = knownModule.itemEffects().effectByName(ItemEffect.WeaponMode)
                                        .orElse(null);

                                if (modeData != null)
                                {
                                    prefix += modeData.getStringValue() + " ";
                                }

                                AtomicReference<String> suffix  = new AtomicReference<>("");

                                if (moduleRecipe.costStream().anyMatch(c -> c.getCost() == module))
                                {
                                    suffix.set(" (equipped)");
                                }

                                TitledPane modulePane = new TitledPane();
                                AtomicReference<String> errorMessage = new AtomicReference<>("");

                                // power plant
                                knownModule.itemEffects()
                                        .effectByName(ItemEffect.PowerCapacity)
                                        .filter(capacity -> capacity.getDoubleValue() < currentShip.getCurrentPowerDraw())
                                        .ifPresent(x -> errorMessage.set("power draw exceeds maximum power output"));

                                // thrusters
                                knownModule.itemEffects()
                                        .effectByName(ItemEffect.MaximumMass)
                                        .filter(maxMass -> maxMass.getDoubleValue() < currentShip.getCurrentHullMass())
                                        .ifPresent(x -> errorMessage.set("ship exceeds maximum thrust mass"));

                                // shield generators
                                knownModule.itemEffects()
                                        .effectByName(ItemEffect.ShieldGenMaximumMass)
                                        .filter(maxMass -> maxMass.getDoubleValue() < currentShip.getCurrentHullMass())
                                        .ifPresent(x -> errorMessage.set("hull exceeds maximum shield mass"));


                                HBox x = new HBox();
                                Label l =  new Label(prefix + moduleRecipe.toString() + suffix);
                                l.getStyleClass().addAll("inventory_label", "base_font");

                                Region s = new Region();
                                Button b = createTaskButton2(recipePair);
                                HBox.setHgrow(s, Priority.ALWAYS);
                                x.getChildren().add(l);

                                if (!errorMessage.get().isEmpty())
                                {
//                                    Label h = new Label("HEY");
//                                    x.getChildren().add(h);
                                    Region warnIcon = new Region();
                                    double sizeh = UIFunctions.Icons.alertIcon.getBaseWidth();
                                    double sizew = UIFunctions.Icons.alertIcon.getBaseHeight();

                                    warnIcon.setMinSize(sizew, sizeh);
                                    warnIcon.setPrefSize(sizew, sizeh);
                                    warnIcon.setMaxSize(sizew, sizeh);
                                    warnIcon.translateYProperty().set(2.5);
                                    warnIcon.translateXProperty().set(5);
                                    warnIcon.setShape(UIFunctions.Icons.alertIcon.getIconPath());
                                    warnIcon.setStyle("-fx-background-color: #ff2222;");

                                    //warnIcon.setPrefWidth(UIFunctions.Icons.alertIcon.getBaseWidth());
                                    //warnIcon.setPrefHeight(UIFunctions.Icons.alertIcon.getBaseHeight());
                                    x.getChildren().add(warnIcon);
                                    Tooltip tooltip = new Tooltip();
                                    tooltip.setText(errorMessage.get());
                                    Tooltip.install(warnIcon, tooltip);
                                }

                                x.getChildren().addAll(s, b);


                                modulePane.setGraphic(x);
                                //modulePane.setText(prefix + moduleRecipe.toString() + suffix);

                                modulePane.setExpanded(false);
                                modulePane.setAnimated(false);
                                modulePane.getStyleClass().addAll("module_item_pane", "base_font");

                                VBox gradeBox = new VBox();
                                gradeBox.getStyleClass().addAll("information_panel", "base_font");
                                modulePane.setContent(gradeBox);
                                x.minWidthProperty().bind(gradeBox.widthProperty().subtract(50));

                                modulePane.expandedProperty().addListener((_z, wasCollapsed, wasExpanded) ->
                                {
                                    if (wasExpanded && gradeBox.getChildren().isEmpty())
                                    {
                                        VBox h = createModuleControl(recipePair);
                                        h.prefWidthProperty().bind(sizePane.widthProperty());
                                        gradeBox.getChildren().add(h);
                                    }
                                });

                                boolean hasModType = Optional.ofNullable(knownModule.modificationType()).isPresent();

                                if (hasModType)
                                {
                                    types.computeIfAbsent(knownModule.modificationType(), (_k) -> new Accordion())
                                            .getPanes().add(modulePane);
                                }
                                else
                                {
                                    altTypes.computeIfAbsent(moduleRecipe.toString(), (_k) -> new Accordion())
                                            .getPanes().add(modulePane);
                                }
                            });


                            // todo: do adding to container here

                            types.forEach((key, value) ->
                            {
                                TitledPane catname = new TitledPane();
                                catname.setExpanded(false);
                                catname.setAnimated(false);
                                catname.setText(key.toString());
                                catname.setContent(value);
                                catname.getStyleClass().addAll("module_category_pane");
                                contentBox.getPanes().add(catname);
                            });

                            altTypes.forEach((key, value) ->
                            {
                                TitledPane catname = new TitledPane();
                                catname.setExpanded(false);
                                catname.setAnimated(false);
                                catname.setText(key);
                                catname.setContent(value);
                                catname.getStyleClass().addAll("module_category_pane");
                                contentBox.getPanes().add(catname);
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
        statPane.setExpanded(false);
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

        statBox.getChildren().add(effectTable);
        statPane.setContent(statBox);

        effectsContainer.getChildren().add(statPane);
    }

    private void renderSupplementalIcons(HBox moduleNameContainer)
    {

        ItemEffectData weaponMount = module.itemEffects().effectByName(ItemEffect.WeaponMode)
                .orElse(null);

        Integer size = module.itemEffects().effectByName(ItemEffect.Size)
                .map(ItemEffectData::getDoubleValue)
                .map(Double::intValue)
                .orElse(-1);

        String grade = module.itemEffects().effectByName(ItemEffect.Class)
                .map(ItemEffectData::getStringValue)
                .orElse("");

        if (size != -1)
        {
            Label gradeLabel = new Label(size + grade);
            gradeLabel.translateYProperty().set(.5);
            Label spacer = new Label(" ");
            gradeLabel.getStyleClass().addAll("module_grade_label", "base_font");
            moduleNameContainer.getChildren().add(gradeLabel);
            moduleNameContainer.getChildren().add(spacer);
        }


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

        //renderModificationInfo(moduleNameContainer, detailsContainer);


        HBox statContainer = new HBox();
        statContainer.getChildren().add(detailsContainer);
        statContainer.getStyleClass().add("general_panel");
        
        displayPane.setContent(statContainer);
        displayPane.setGraphic(moduleNameContainer);
        displayPane.setExpanded(false);
        displayPane.setAnimated(false);

        displayPane.expandedProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue)
            {
                displayPane.getParent().getParent().getParent().getChildrenUnmodifiable().stream()
                        .map(n -> ((TableRow) n))
                        .flatMap(p->p.getChildrenUnmodifiable().stream().filter(i->i instanceof TableCell))
                        .map(c-> ((TableCell) c))
                        .flatMap(p->p.getChildrenUnmodifiable().stream().filter(i->i instanceof TitledPane))
                        .map(c-> ((TitledPane) c))
                        .filter(c->c != displayPane)
                        .forEach(p->p.expandedProperty().setValue(false));
            }
        });

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

    public synchronized TitledPane getGraphic()
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
