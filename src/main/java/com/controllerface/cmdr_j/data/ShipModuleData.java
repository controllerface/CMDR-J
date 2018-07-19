package com.controllerface.cmdr_j.data;

import com.controllerface.cmdr_j.*;
import com.controllerface.cmdr_j.data.commander.Displayable;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.structures.engineers.Engineer;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;
import com.controllerface.cmdr_j.threads.UserTransaction;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/2/2018.
 */
public class ShipModuleData implements Displayable
{
    private final Statistic moduleName;
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
        this.moduleName = builder.moduleName;
        this.module = builder.module;
        this.modifiers = builder.modifiers;
        this.modificationBlueprint = builder.modificationBlueprint;
        this.experimentalEffectRecipe = builder.experimentalEffectRecipe;
        this.level = builder.level;
        this.quality = builder.quality;
        this.userTransactions = builder.userTransactions;
    }

    public Statistic getModuleName() { return moduleName; }
    public ShipModule getModule() { return module; }

    /**
     * Maps a {@code ProcurementBlueprint} object to a {@code Pair<ProcurementType, ProcurementRecipe>} object,
     * suitable for adding as a new task the the tracked task list.
     *
     * @param blueprint ProcurementBlueprint to map
     * @return a new Pair<ProcurementType, ProcurementRecipe>
     */
    private Stream<Pair<ProcurementType, ProcurementRecipe>> mapBlueprint(ProcurementBlueprint blueprint)
    {
        return blueprint.recipeStream().map(recipe -> new Pair<>(module.modificationType(), recipe));
    }


    private HBox createRecipeControl(Pair<ProcurementType, ProcurementRecipe> recipePair)
    {
        HBox container = new HBox();

        Button button = createTaskButton(recipePair);
        TitledPane infoPane = createInfoPane(recipePair);
        infoPane.prefWidthProperty().bind(container.widthProperty());
        container.getChildren().addAll(button, infoPane);
        return container;
    }

    private Button createTaskButton(Pair<ProcurementType, ProcurementRecipe> recipePair)
    {
        Button button = new Button();

        button.setStyle("-fx-base: #88ee88;");

        button.setText("+");
        button.setFont(UIFunctions.Fonts.size1Font);

        Tooltip tooltip = new Tooltip();
        tooltip.setFont(UIFunctions.Fonts.size1Font);
        tooltip.setText("Add " + recipePair.getValue().getDisplayLabel() + " to Tracked Tasks");
        button.setTooltip(tooltip);

        button.setOnAction(event -> userTransactions.add(new UserTransaction(1, recipePair)));

        return button;
    }

    private TitledPane createInfoPane(Pair<ProcurementType, ProcurementRecipe> recipePair)
    {
        TitledPane infoPane = new TitledPane();
        infoPane.setExpanded(false);
        infoPane.setAnimated(false);

        Label nameLabel = new Label(recipePair.getValue().getDisplayLabel());
        nameLabel.setFont(UIFunctions.Fonts.size1Font);
        infoPane.setGraphic(nameLabel);


        VBox costEffectContainer = new VBox();
        costEffectContainer.setBackground(new Background(new BackgroundFill(Color.rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));



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
                    next.setFont(UIFunctions.Fonts.size1Font);
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
                engineerLabel.setFont(UIFunctions.Fonts.size1Font);
                engineerLabel.setTextFill(UIFunctions.Fonts.darkOrange);
                costEffectContainer.getChildren().add(engineerLabel);
            }
        }

        infoPane.setContent(costEffectContainer);
        return infoPane;
    }

    private void renderModificationInfo(HBox moduleNameContainer, VBox detailsContainer)
    {
        if (modificationBlueprint != null)
        {
            // in some cases, a blueprint can temporarily be set with no modifiers. This state requires some extra
            // text to let the player know the data will be refreshed when they exit the outfitting menu
            boolean needsRefresh = modifiers.isEmpty();

            // generate the text and Label object, setting up the font/color, add the label to the name container
            String labelText = " :: G" + level + " " + modificationBlueprint.toString();
            if (needsRefresh) { labelText += " (*needs refresh*) "; }
            Label modificationLabel = new Label(labelText);
            modificationLabel.setFont(UIFunctions.Fonts.size3Font);
            modificationLabel.setTextFill(UIFunctions.Fonts.darkOrange);
            moduleNameContainer.getChildren().add(modificationLabel);

            // if we need a refresh, also add a tooltip to make it clearer what needs to be done to refresh the module
            if (needsRefresh)
            {
                Tooltip refreshNotice = new Tooltip("This module was retrieved from storage in outfitting\n" +
                        "Exit outfitting menu to refresh this module's information");

                refreshNotice.setFont(UIFunctions.Fonts.size2Font);
                modificationLabel.setTooltip(refreshNotice);
            }

            // this container shows the player a progress percentage for the modification
            HBox modProgressBox = new HBox();
            modProgressBox.setAlignment(Pos.CENTER_LEFT);

            // this is the static progress text
            Label modProgressLabel = new Label("Current Modification Progress: ");
            modProgressLabel.setFont(UIFunctions.Fonts.size2Font);
            modProgressLabel.setPadding(new Insets(0,0,5,0));

            // here we set up the progress percentage value
            Label modProgressValue = new Label();
            modProgressValue.setTextFill(UIFunctions.Fonts.darkOrange);
            modProgressValue.setFont(UIFunctions.Fonts.size2Font);
            modProgressValue.setPadding(new Insets(0,0,5,0));
            modProgressValue.setText((int)(quality * 100d) + "%");

            // now add the labels to the progress box
            modProgressBox.getChildren().add(modProgressLabel);
            modProgressBox.getChildren().add(modProgressValue);

            // finally add the progress indicator itself to the detail container
            detailsContainer.getChildren().add(modProgressBox);
        }

        if (experimentalEffectRecipe != null)
        {
            Label special = new Label(" :: " + experimentalEffectRecipe.getDisplayLabel());
            special.setFont(UIFunctions.Fonts.size3Font);
            special.setTextFill(UIFunctions.Fonts.darkYellow);
            moduleNameContainer.getChildren().add(special);
        }

        // WORKING AREA
        // write code here

        ProcurementType modificationType = module.modificationType();
        ProcurementType experimentalType = module.experimentalType();
        if (modificationType != null || experimentalType != null)
        {
            if (modificationType != null)
            {
                TitledPane modPane = new TitledPane();
                modPane.setText("Available Modifications");
                modPane.setTextFill(UIFunctions.Fonts.darkOrange);
                modPane.setFont(UIFunctions.Fonts.size2Font);
                modPane.setExpanded(false);
                modPane.setAnimated(false);
                VBox modBox = new VBox();

                modificationType.getBluePrints()
                        .stream()
                        .map(blueprint ->
                        {
                            TitledPane gradePane = new TitledPane();
                            gradePane.setText(blueprint.toString());
                            gradePane.setFont(UIFunctions.Fonts.size1Font);
                            gradePane.setExpanded(false);
                            gradePane.setAnimated(false);
                            VBox gradeBox = new VBox();

                            mapBlueprint(blueprint)
                                    .map(this::createRecipeControl)
                                    .peek(button ->
                                    {
                                        //button.setTextAlignment(TextAlignment.LEFT);
                                        button.prefWidthProperty().bind(modPane.widthProperty());
                                    })
                                    .forEach(b -> gradeBox.getChildren().add(b));
                            gradePane.setContent(gradeBox);
                            return gradePane;
                        })
                        .forEach(b -> modBox.getChildren().add(b));

                modPane.setContent(modBox);
                detailsContainer.getChildren().add(modPane);
            }

            if (experimentalType != null)
            {
                TitledPane expPane = new TitledPane();
                expPane.setText("Experimental Effects");
                expPane.setTextFill(UIFunctions.Fonts.darkYellow);
                expPane.setFont(UIFunctions.Fonts.size2Font);
                expPane.setExpanded(false);
                expPane.setAnimated(false);
                VBox expBox = new VBox();

                experimentalType.getBluePrints()
                        .stream()
                        .flatMap(this::mapBlueprint)
                        .map(this::createRecipeControl)
                        .peek(button ->
                        {
                            //button.setTextAlignment(TextAlignment.LEFT);
                            button.prefWidthProperty().bind(expPane.widthProperty());
                        })
                        .forEach(b -> expBox.getChildren().add(b));

                expPane.setContent(expBox);
                detailsContainer.getChildren().add(expPane);
            }
        }
    }

    private void renderEffectTable(VBox effectsContainer)
    {
        List<Pair<ItemEffect, Label>> effects = prepareEffectData();

        TableColumn<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>> nameColumn = new TableColumn<>();
        nameColumn.setCellValueFactory((param) -> new ReadOnlyObjectWrapper<>(param.getValue()));
        nameColumn.setCellFactory(UIFunctions.Data.moduleNameCellFactory);
        nameColumn.setText("Statistic");

        TableColumn<Pair<ItemEffect, Label>, Label> valueColumn = new TableColumn<>();
        valueColumn.prefWidthProperty().set(125);
        valueColumn.setCellFactory(UIFunctions.Data.moduleEffectValueFactory);
        valueColumn.setCellValueFactory((param) -> new ReadOnlyObjectWrapper<>(param.getValue().getValue()));
        valueColumn.setText("Value");

        TableColumn<Pair<ItemEffect, Label>, Label> unitColumn = new TableColumn<>();
        unitColumn.prefWidthProperty().set(75);
        unitColumn.setCellFactory(UIFunctions.Data.moduleEffectUnitFactory);
        unitColumn.setCellValueFactory(param ->
        {
            Label unit = new Label(param.getValue().getKey().getUnit());
            unit.setFont(UIFunctions.Fonts.size2Font);
            return new ReadOnlyObjectWrapper<>(unit);
        });
        unitColumn.setText("Unit");


        TitledPane statPane = new TitledPane();
        statPane.setExpanded(false);
        statPane.setAnimated(false);
        statPane.setText("Module Statistics");
        statPane.setFont(UIFunctions.Fonts.size2Font);

        VBox statBox = new VBox();
        statBox.fillWidthProperty().set(true);


        TableView<Pair<ItemEffect, Label>> effectTable = new TableView<>();

        effectTable.getColumns().add(nameColumn);
        effectTable.getColumns().add(valueColumn);
        effectTable.getColumns().add(unitColumn);

        nameColumn.prefWidthProperty()
                .bind(effectTable.prefWidthProperty()
                        .subtract(valueColumn.prefWidthProperty())
                        .subtract(unitColumn.prefWidthProperty())
                        .subtract(35d));

        effectTable.fixedCellSizeProperty().setValue(30);
        effectTable.setItems(FXCollections.observableArrayList(effects));
        effectTable.setPrefHeight((effects.size() * 30) + 34);

        effectTable.prefWidthProperty().bind(displayPane.widthProperty().subtract(30));

        statBox.getChildren().add(effectTable);
        statPane.setContent(statBox);

        effectsContainer.getChildren().add(statPane);
    }

    private void renderDisplayGraphic()
    {
        Label moduleLabel = new Label(module.displayText());
        moduleLabel.setFont(UIFunctions.Fonts.size3Font);

        HBox moduleNameContainer = new HBox();
        moduleNameContainer.getChildren().add(moduleLabel);

        VBox detailsContainer = new VBox();
        detailsContainer.setAlignment(Pos.CENTER_LEFT);

        renderModificationInfo(moduleNameContainer, detailsContainer);

        VBox effectsContainer = new VBox();
        effectsContainer.fillWidthProperty().setValue(true);
        detailsContainer.getChildren().add(effectsContainer);

        renderEffectTable(effectsContainer);

        HBox statContainer = new HBox();
        statContainer.setBackground(new Background(new BackgroundFill(Color.rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));
        statContainer.getChildren().add(detailsContainer);

        VBox moduleDataContainer = new VBox();
        moduleDataContainer.getChildren().add(moduleNameContainer);

        displayPane.setContent(statContainer);
        displayPane.setGraphic(moduleDataContainer);
        displayPane.setExpanded(false);
        displayPane.setAnimated(false);
    }

    private List<Pair<ItemEffect, Label>> prepareEffectData()
    {
        // base stats, filtered so any stats that have stored modifiers are skipped
        List<Pair<ItemEffect, Label>> effects = module.itemEffects().effectStream()
                .filter(p -> modifiers.stream().noneMatch(x -> x.getEffect().equals(p.getEffect())))
                .map(effectPair ->
                {
                    Label label =  new Label(effectPair.getValueString());
                    label.setFont(UIFunctions.Fonts.size2Font);
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
                    origVal.setFont(UIFunctions.Fonts.size1Font);
                    label.setFont(UIFunctions.Fonts.size2Font);
                    label.setTooltip(origVal);
                    boolean isLess = Double.compare(modifier.getValue(), modifier.getOriginalValue()) < 0;
                    boolean isGood = modifier.isLessIsGood() == isLess;
                    if (isGood) label.setTextFill(UIFunctions.Fonts.positiveBlue);
                    else label.setTextFill(UIFunctions.Fonts.negativeRed);
                    return new Pair<>(modifier.getEffect(), label);
                })
                .forEach(effects::add);

        effects.sort((a, b)-> a.getKey().compareTo(b.getKey()));
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
        return moduleName.hashCode();
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
        return other == this || other.getModuleName() == this.moduleName;
    }

    public static class Builder
    {
        private Statistic moduleName;
        private ShipModule module;
        private List<ModifierData> modifiers;
        private ModificationBlueprint modificationBlueprint;
        private ExperimentalRecipe experimentalEffectRecipe;
        private int level;
        private double quality;
        private BlockingQueue<UserTransaction> userTransactions;


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
