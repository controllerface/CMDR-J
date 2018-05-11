package com.controllerface.edeps.ui.ship;

import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.concurrent.atomic.AtomicBoolean;

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

                //StackPane progPane = new StackPane();
                //ProgressBar progressBar = new ProgressBar(item.getQuality());
                //progressBar.setStyle("-fx-accent: #ff7100");

                modProgressBox.getChildren().add(progLabel);

                Label complete = new Label();
                complete.setFont(UIFunctions.Fonts.size2Font);
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
                statBox.getChildren().add(new Separator());
            }

            item.getModule().itemEffects().pairStream()
                    .filter(p->item.getModifiers().stream()
                            .noneMatch(x->x.getEffect().equals(p.getKey())))
                    .map(effectPair ->
                    {
                        String value = effectPair.getKey().name() + " :: " + effectPair.getValue();
                        return new Label(value);
                    })
                    .peek(label -> label.setFont(UIFunctions.Fonts.size2Font))
                    .forEach(label -> statBox.getChildren().add(label));

            item.getModifiers().stream()
                    .map(modifier ->
                    {
                        String vals = modifier.getValue() + " (" + modifier.getOriginalValue() + ")";
                        Label label = new Label(modifier.getEffect().name() + " :: " + vals);
                        boolean isLess = Double.compare(modifier.getValue(), modifier.getOriginalValue()) < 0;
                        boolean isGood = modifier.isLessIsGood() == isLess;
                        if (isGood) label.setTextFill(UIFunctions.Fonts.positiveBlue);
                        else label.setTextFill(UIFunctions.Fonts.negativeRed);
                        return label;
                    })
                    .peek(label -> label.setFont(UIFunctions.Fonts.size2Font))
                    .forEach(label -> statBox.getChildren().add(label));

            statContainer.getChildren().add(statBox);
            pane.setContent(statContainer);
            pane.setGraphic(modBox);
            pane.setExpanded(false);
            pane.setAnimated(false);
            setGraphic(pane);
        }
    }
}
