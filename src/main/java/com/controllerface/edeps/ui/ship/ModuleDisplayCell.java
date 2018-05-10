package com.controllerface.edeps.ui.ship;

import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
            VBox modBox = new VBox();
            ModificationBlueprint m = item.getModificationBlueprint();
            ExperimentalRecipe e = item.getExperimentalEffectName();

            HBox nameBox = new HBox();

            String t = item.getModule().displayText();
//                    + (m == null ? "" : " :: " + m.toString() + " :: Grade " + item.getLevel())
//                    + (e == null ? "" : " :: " + e.getDisplayLabel());

            Label module = new Label(t);
            module.setFont(UIFunctions.Fonts.size3Font);

            nameBox.getChildren().add(module);
            modBox.getChildren().add(nameBox);

            if (m != null)
            {
                //Label modification = new Label(" :: " + m.toString() + " :: Grade " + item.getLevel() + " :: " + item.getQuality());
                Label modification = new Label(" :: " + m.toString());
                modification.setFont(UIFunctions.Fonts.size3Font);
                modification.setTextFill(UIFunctions.Fonts.standardOrange);
                nameBox.getChildren().add(modification);

                //modBox.getChildren().add(modification);
            }

            if (e != null)
            {
                Label special = new Label(" :: " + e.getDisplayLabel());
                special.setFont(UIFunctions.Fonts.size3Font);
                special.setTextFill(UIFunctions.Fonts.specialYellow);
                nameBox.getChildren().add(special);

                //modBox.getChildren().add(special);
            }

//            item.getModifiers().stream()
//                    .map(modifier ->
//                    {
//                        String vals = modifier.getValue() + " (" + modifier.getOriginalValue() + ")";
//                        Label label = new Label(modifier.getEffect().name() + " :: " + vals);
//                        boolean isLess = Double.compare(modifier.getValue(), modifier.getOriginalValue()) < 0;
//                        boolean isGood = modifier.isLessIsGood() == isLess;
//                        if (isGood) label.setTextFill(UIFunctions.Fonts.positiveBlue);
//                        else label.setTextFill(UIFunctions.Fonts.negativeRed);
//                        return label;
//                    })
//                    .peek(label -> label.setFont(UIFunctions.Fonts.size3Font))
//                    .forEach(label -> modBox.getChildren().add(label));

            setGraphic(modBox);
        }
    }
}
