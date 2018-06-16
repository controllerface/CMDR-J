package com.controllerface.edeps.data;

import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

/**
 * Created by Controllerface on 5/2/2018.
 */
public class ShipModuleData
{
    private final Statistic moduleName;
    private final ShipModule module;

    private final ModificationBlueprint modificationBlueprint;
    private final ExperimentalRecipe experimentalEffectRecipe;
    private final List<ModifierData> modifiers;
    private final int level;
    private final double quality;

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
            Label modProgressLabel = new Label("Modification Progress: ");
            modProgressLabel.setFont(UIFunctions.Fonts.size2Font);
            modProgressLabel.setPadding(new Insets(0,0,5,0));

            // here we set up the progress percentage value
            Label modProgressValue = new Label();
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
    }

    private void renderEffectTable(VBox effectsContainer)
    {
        List<Pair<ItemEffect, Label>> effects = prepareEffectData();

        TableColumn<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>> nameColumn = new TableColumn<>();
        nameColumn.setCellValueFactory((param) -> new ReadOnlyObjectWrapper<>(param.getValue()));
        nameColumn.setCellFactory(UIFunctions.Data.moduleNameCellFactory);
        nameColumn.setText("Module Statistics");

        TableColumn<Pair<ItemEffect, Label>, Label> valueColumn = new TableColumn<>();
        valueColumn.prefWidthProperty().set(125);
        valueColumn.setCellFactory(UIFunctions.Data.moduleEffectValueFactory);
        valueColumn.setCellValueFactory((param) -> new ReadOnlyObjectWrapper<>(param.getValue().getValue()));

        TableColumn<Pair<ItemEffect, Label>, Label> unitColumn = new TableColumn<>();
        unitColumn.prefWidthProperty().set(75);
        unitColumn.setCellFactory(UIFunctions.Data.moduleEffectUnitFactory);
        unitColumn.setCellValueFactory(param ->
        {
            Label unit = new Label(param.getValue().getKey().getUnit());
            unit.setFont(UIFunctions.Fonts.size2Font);
            return new ReadOnlyObjectWrapper<>(unit);
        });

        TableView<Pair<ItemEffect, Label>> effectTable = new TableView<>();

        effectTable.getColumns().add(nameColumn);
        effectTable.getColumns().add(valueColumn);
        effectTable.getColumns().add(unitColumn);

        nameColumn.prefWidthProperty()
                .bind(effectTable.prefWidthProperty()
                        .subtract(valueColumn.prefWidthProperty())
                        .subtract(unitColumn.prefWidthProperty())
                        .subtract(2d));

        effectTable.fixedCellSizeProperty().setValue(30);
        effectTable.setItems(FXCollections.observableArrayList(effects));
        effectTable.setPrefHeight((effects.size() * 30) + 28);

        effectTable.prefWidthProperty().bind(displayPane.widthProperty().subtract(25));
        effectsContainer.getChildren().add(effectTable);
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
        statContainer.setBackground(new Background(new BackgroundFill(Color.rgb(0xDD, 0xDD, 0xDD), CornerRadii.EMPTY, Insets.EMPTY)));
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

    public Statistic getModuleName()
    {
        return moduleName;
    }

    public ShipModule getModule()
    {
        return module;
    }

    /**
     * For the provided ItemEffect, returns the actual value this item has for that effect, if any.
     * If the module has modifications that override the stock value, this method will return the
     * modified value. If the provided effect is not present on this module, will return null.
     *
     * @param effect the ItemEffect to get the value of from this module
     * @return the actual applied value on this module for the given effect, or null if the effect is not present
     */
    public Double getEffectValue(ItemEffect effect)
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

        return modifiedValue == null
                ? stockValue
                : modifiedValue;
    }

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

        public ShipModuleData build()
        {
            if (modifiers == null) modifiers = new ArrayList<>();
            return new ShipModuleData(this);
        }
    }
}
