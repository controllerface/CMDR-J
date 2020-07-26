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
public class ResistanceDisplayCell extends TableCell<ShipStatisticData, ShipStatisticData>
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

        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER_LEFT);

        Label stat = new Label();
        hBox.getChildren().add(stat);
        super.setGraphic(hBox);

        if (item.shipCharacteristic == ShipCharacteristic.Shield_Recharge)
        {
            stat.setText("-");
            return;
        }

        String text = String.valueOf(item.statGroup.floatStat);
        stat.setText(text);
        getStyleClass().addAll("base_font");

        String rawString = String.valueOf(item.statGroup.rawFloat);
        if (item.shipCharacteristic == ShipCharacteristic.Shield_Strength
                || item.shipCharacteristic == ShipCharacteristic.Hull_Strength)
        {
            stat.getStyleClass().addAll("positive_stat");
        }
        else
        {
            stat.setText(stat.getText() + "%");
            if (rawString.isEmpty())
            {
                stat.getStyleClass().addAll("light_color_label");
            }
            else
            {
                if (item.statGroup.floatStat < 0)
                {
                    stat.getStyleClass().addAll("negative_stat");
                }

                else if (text.equals(rawString))
                {
                    stat.getStyleClass().addAll("positive_stat");
                }
                else
                {
                    stat.getStyleClass().addAll("diminished_stat");
                }
            }
        }

    }
}