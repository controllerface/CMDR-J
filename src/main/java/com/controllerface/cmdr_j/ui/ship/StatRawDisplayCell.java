package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.classes.commander.ShipStatisticData;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipCharacteristic;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;

/**
 * Created by Controllerface on 5/7/2018.
 */
public class StatRawDisplayCell extends TableCell<ShipStatisticData, ShipStatisticData>
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

        boolean shouldHighlight = item.shipCharacteristic == ShipCharacteristic.Shield_Strength
                || item.shipCharacteristic == ShipCharacteristic.Hull_Strength
                || item.shipCharacteristic == ShipCharacteristic.Armour_Explosive
                || item.shipCharacteristic == ShipCharacteristic.Armour_Kinetic
                || item.shipCharacteristic == ShipCharacteristic.Armour_Thermal
                || item.shipCharacteristic == ShipCharacteristic.Armour_Caustic;

        if (shouldHighlight)
        {
            hBox.getStyleClass().add("min_max_cell");
        }

        Label stat = new Label();
        if (item.shipCharacteristic == ShipCharacteristic.Shield_Recharge)
        {
            stat.setText("-");
            return;
        }

        String rawString = String.valueOf(item.statGroup.rawFloat);
        stat.setText(rawString);
        getStyleClass().addAll("base_font");
        stat.getStyleClass().addAll("calculated_stat");
        hBox.getChildren().add(stat);
    }
}