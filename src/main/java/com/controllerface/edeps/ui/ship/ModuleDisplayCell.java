package com.controllerface.edeps.ui.ship;

import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import javafx.util.Pair;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephen on 5/7/2018.
 */
public class ModuleDisplayCell extends TableCell<ShipModuleData, ShipModuleData>
{
    @Override
    protected void updateItem(ShipModuleData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item ==null) setGraphic(null);
        else if (!empty)
        {
            TitledPane pane = new TitledPane();
            VBox modBox = new VBox();
            ModificationBlueprint m = item.getModificationBlueprint();
            ExperimentalRecipe e = item.getExperimentalEffectName();

            HBox nameBox = new HBox();

            String t = item.getModule().displayText();

            Label module = new Label(t);
            module.setFont(UIFunctions.Fonts.size3Font);

            nameBox.getChildren().add(module);
            modBox.getChildren().add(nameBox);

            if (m != null)
            {
                Label modification = new Label(" :: G" + item.getLevel() + " " + m.toString());
                modification.setFont(UIFunctions.Fonts.size3Font);
                modification.setTextFill(UIFunctions.Fonts.darkOrange);
                nameBox.getChildren().add(modification);
            }

            if (e != null)
            {
                Label special = new Label(" :: " + e.getDisplayLabel());
                special.setFont(UIFunctions.Fonts.size3Font);
                special.setTextFill(UIFunctions.Fonts.darkYellow);
                nameBox.getChildren().add(special);
            }

            HBox statContainer = new HBox();
            VBox statBox = new VBox();
            statBox.setAlignment(Pos.CENTER_LEFT);
            statContainer.setBackground(new Background(new BackgroundFill(Color.rgb(0xDD, 0xDD, 0xDD), CornerRadii.EMPTY, Insets.EMPTY)));

            if (m != null)
            {
                HBox modProgressBox = new HBox();
                modProgressBox.setAlignment(Pos.CENTER_LEFT);
                Label progLabel = new Label("Modification Progress: ");
                progLabel.setFont(UIFunctions.Fonts.size2Font);
                progLabel.setPadding(new Insets(0,0,5,0));

                modProgressBox.getChildren().add(progLabel);

                Label complete = new Label();
                complete.setFont(UIFunctions.Fonts.size2Font);
                complete.setPadding(new Insets(0,0,5,0));
                modProgressBox.getChildren().add(complete);

                if (item.getQuality() == 1)
                {
                    complete.setText("Complete");
                }
                else
                {
                    complete.setText((int)(item.getQuality() * 100d) + "%");
                }
                statBox.getChildren().add(modProgressBox);
            }


            TableView<Pair<ItemEffect, Label>> effectTable = new TableView<>();
            TableColumn<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>> nameColumn = new TableColumn<>();
            TableColumn<Pair<ItemEffect, Label>, Label> valueColumn = new TableColumn<>();
            TableColumn<Pair<ItemEffect, Label>, Label> unitColumn = new TableColumn<>();

            valueColumn.setCellFactory(new Callback<TableColumn<Pair<ItemEffect, Label>, Label>, TableCell<Pair<ItemEffect, Label>, Label>>()
            {
                @Override
                public TableCell<Pair<ItemEffect, Label>, Label> call(TableColumn<Pair<ItemEffect, Label>, Label> param)
                {
                    return new TableCell<Pair<ItemEffect, Label>, Label>()
                    {
                        @Override
                        protected void updateItem(Label item, boolean empty)
                        {
                            super.updateItem(item, empty);
                            if (item == null || empty) setGraphic(null);
                            else
                            {
                                setAlignment(Pos.CENTER_RIGHT);
                                item.setPadding(new Insets(0,5,0,0));
                                setGraphic(item);
                            }

                        }
                    };
                }
            });

            unitColumn.setCellFactory(new Callback<TableColumn<Pair<ItemEffect, Label>, Label>, TableCell<Pair<ItemEffect, Label>, Label>>()
            {
                @Override
                public TableCell<Pair<ItemEffect, Label>, Label> call(TableColumn<Pair<ItemEffect, Label>, Label> param)
                {
                    return new TableCell<Pair<ItemEffect, Label>, Label>()
                    {
                        @Override
                        protected void updateItem(Label item, boolean empty)
                        {
                            super.updateItem(item, empty);
                            if (item == null || empty) setGraphic(null);
                            else
                            {
                                setAlignment(Pos.CENTER_LEFT);
                                setGraphic(item);
                            }

                        }
                    };
                }
            });

            valueColumn.setCellValueFactory((param) -> new ReadOnlyObjectWrapper<>(param.getValue().getValue()));
            unitColumn.setCellValueFactory(param ->
            {
                Label unit = new Label(param.getValue().getKey().getUnit());
                unit.setFont(UIFunctions.Fonts.size2Font);
                return new ReadOnlyObjectWrapper<>(unit);
            });

            nameColumn.setCellValueFactory((param) -> new ReadOnlyObjectWrapper<>(param.getValue()));
            nameColumn.setCellFactory(new Callback<TableColumn<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>>, TableCell<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>>>()
            {
                @Override
                public TableCell<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>> call(TableColumn<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>> param)
                {
                    return new TableCell<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>>()
                    {
                        @Override
                        protected void updateItem(Pair<ItemEffect, Label> item, boolean empty)
                        {
                            super.updateItem(item, empty);
                            if (item == null || empty)
                            {
                                setGraphic(null);
                                return;
                            }
                            Label name = new Label(item.getKey().toString());
                            name.setFont(UIFunctions.Fonts.size2Font);
                            name.setPadding(new Insets(0,0,0,5));
                            setGraphic(name);
                        }
                    };
                }
            });

            List<Pair<ItemEffect, Label>> effects = new ArrayList<>();

            // base stats, filtered so any stats that have stored modifiers are skipped
            item.getModule().itemEffects().effectStream()
                    .filter(p->item.getModifiers().stream()
                            .noneMatch(x->x.getEffect().equals(p.getEffect())))
                    .map(effectPair ->
                    {
                        Label label =  new Label(effectPair.getValueString());
                        label.setFont(UIFunctions.Fonts.size2Font);
                        return new Pair<>(effectPair.getEffect(),label);
                    })
                    .forEach(effects::add);

            // modified stats
            item.getModifiers().stream()
                    .map(modifier ->
                    {
                        String vals = String.valueOf(modifier.getValue());
                                //+ " (" + modifier.getOriginalValue() + ")";
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

            effects.sort((a,b)-> a.getKey().compareTo(b.getKey()));

            effectTable.getColumns().add(nameColumn);
            effectTable.getColumns().add(valueColumn);
            effectTable.getColumns().add(unitColumn);




            nameColumn.setText("Module Statistics");

            nameColumn.prefWidthProperty()
                    .bind(effectTable.prefWidthProperty()
                            .subtract(valueColumn.prefWidthProperty())
                            .subtract(unitColumn.prefWidthProperty())
                            .subtract(2d));

            valueColumn.prefWidthProperty().set(125);
            unitColumn.prefWidthProperty().set(75);


            effectTable.fixedCellSizeProperty().setValue(30);

            effectTable.prefWidthProperty().bind(pane.widthProperty().subtract(25));

            effectTable.setItems(FXCollections.observableArrayList(effects));

            effectTable.setPrefHeight((effects.size() * 30) + 28);

            VBox tbox = new VBox();
            tbox.getChildren().add(effectTable);
            tbox.fillWidthProperty().setValue(true);

            statBox.getChildren().add(tbox);

            statContainer.getChildren().add(statBox);
            pane.setContent(statContainer);
            pane.setGraphic(modBox);
            pane.setExpanded(false);
            pane.setAnimated(false);
            setGraphic(pane);
        }
    }
}
