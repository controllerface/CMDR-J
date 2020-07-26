package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.classes.data.ShipStatisticData;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;

/**
 * Created by Controllerface on 5/7/2018.
 */
public class StatDisplayCell extends TableCell<ShipStatisticData, ShipStatisticData>
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


        String rawString = item.rawStatDisplayValue();
        String text = item.statDisplayValue();
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER_RIGHT);

        Label stat = new Label(text);
        getStyleClass().addAll("base_font");

        boolean isDiminsihed  = false;

        if (item.shipCharacteristic == ShipCharacteristic.Shield_Strength
                || item.shipCharacteristic == ShipCharacteristic.Hull_Strength)
        {
            stat.getStyleClass().addAll("positive_stat");
        }
        else if (rawString.isEmpty())
        {
            stat.getStyleClass().addAll("light_color_label");
        }
        else
        {
            if (item.floatStat < 0)
            {
                stat.getStyleClass().addAll("negative_stat");
            }

            else if (text.equals(rawString))
            {
                stat.getStyleClass().addAll("positive_stat");
            }
            else
            {
                isDiminsihed = true;
                stat.getStyleClass().addAll("diminished_stat");
            }
        }

//        if (isDiminsihed)
//        {
//            String value = "(" + UIFunctions.Data.round(item.rawFloat - item.floatStat, 1) + ") ";
//            Label loss = new Label(value);
//            loss.getStyleClass().addAll("negative_stat");
//            hBox.getChildren().add(loss);
//        }

        hBox.getChildren().add(stat);

        super.setGraphic(hBox);

    }
}