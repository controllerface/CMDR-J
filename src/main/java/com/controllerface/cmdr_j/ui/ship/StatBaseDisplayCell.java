package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.classes.commander.ShipStatisticData;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;

/**
 * Created by Controllerface on 5/7/2018.
 */
public class StatBaseDisplayCell extends TableCell<ShipStatisticData, ShipStatisticData>
{
    @Override
    protected void updateItem(ShipStatisticData item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }

        if (item.statGroup == null
                || item.statGroup.baseValue == null
                || item.statGroup.baseMultiplier == null)
        {
            System.out.println("Null stat, bailing");
            return;
        }

        setAlignment(Pos.CENTER_RIGHT);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);

        boolean isPercentage = item.statGroup.baseMultiplier != 0.0;

        String suffix = isPercentage ? "%" : "";

        String rawString = String.valueOf(item.statGroup.baseValue);
        Label stat = new Label(rawString + suffix);
        getStyleClass().addAll("base_font");
        stat.getStyleClass().addAll("light_color_label");
        hBox.getChildren().add(stat);

        if (isPercentage)
        {
            Region region1 = new Region();
            HBox.setHgrow(region1, Priority.ALWAYS);
            hBox.getChildren().add(region1);

            String rawString2 = "(" + item.statGroup.baseMultiplier + ") ";
            Label stat2 = new Label(rawString2);
            stat2.alignmentProperty().set(Pos.CENTER_LEFT);
            getStyleClass().addAll("base_font");

            if (item.statGroup.baseMultiplier == 1.0d)
            {
                stat2.getStyleClass().addAll("light_color_label");
            }
            else if (item.statGroup.baseMultiplier < 1.0d)
            {
                stat2.getStyleClass().addAll("positive_stat");
            }
            else
            {
                stat2.getStyleClass().addAll("negative_stat");
            }

            hBox.getChildren().add(stat2);
        }

        if (item.shipCharacteristic == ShipCharacteristic.Hull_Strength)
        {
            hBox.getStyleClass().add("min_max_cell");
        }

        super.setGraphic(hBox);
    }
}