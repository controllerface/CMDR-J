package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.classes.data.ShipStatisticData;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;

/**
 * Created by Controllerface on 5/7/2018.
 */
public class StatRatioDisplayCell extends TableCell<ShipStatisticData, ShipStatisticData>
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

        setAlignment(Pos.CENTER_RIGHT);

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        super.setGraphic(hBox);

        if (item.shipCharacteristic != ShipCharacteristic.Shield_Strength
                && item.shipCharacteristic != ShipCharacteristic.Hull_Strength)
        {
            hBox.getStyleClass().add("min_max_cell");
        }

        Label stat = new Label();
        if (item.shipCharacteristic == ShipCharacteristic.Shield_Recharge)
        {
            stat.setText("-");
            return;
        }


        double x = item.statGroup.diminishCap;

        String rawString = String.valueOf(x);
        stat.setText(rawString);
        getStyleClass().addAll("base_font");

        if (x == 0.0)
        {
            stat.getStyleClass().addAll("calculated_stat");
        }
        else if (x > 0)
        {
            stat.getStyleClass().addAll("positive_stat");
        }
        else
        {
            stat.getStyleClass().addAll("negative_stat");
        }

        hBox.getChildren().add(stat);

        if (item.statGroup.rawFloat > item.statGroup.floatStat)
        {
            String value = " (" + UIFunctions.Data.round(item.statGroup.rawFloat - item.statGroup.floatStat, 1) + ")";
            Label loss = new Label(value);
            loss.getStyleClass().addAll("diminished_stat");
            hBox.getChildren().add(loss);
        }
    }
}