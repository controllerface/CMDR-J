package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.classes.commander.ShipStatisticData;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;

/**
 * Created by Controllerface on 5/7/2018.
 */
public class OffenseDisplayCell extends TableCell<ShipStatisticData, ShipStatisticData>
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


        String rawString = String.valueOf(item.statGroup.rawFloat);
        String text = String.valueOf(item.statGroup.floatStat);
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER_LEFT);

        Label stat = new Label(text);
        getStyleClass().addAll("base_font");
        stat.getStyleClass().addAll("light_color_label");


        hBox.getChildren().add(stat);

        super.setGraphic(hBox);

    }
}