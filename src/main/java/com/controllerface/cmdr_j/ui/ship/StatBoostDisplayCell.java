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
public class StatBoostDisplayCell extends TableCell<ShipStatisticData, ShipStatisticData>
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

        String suffix = "";

        boolean shouldHighlight = item.shipCharacteristic == ShipCharacteristic.Hull_Strength
                || item.shipCharacteristic == ShipCharacteristic.Shield_Strength
                || item.shipCharacteristic == ShipCharacteristic.Shield_Explosive
                || item.shipCharacteristic == ShipCharacteristic.Shield_Kinetic
                || item.shipCharacteristic == ShipCharacteristic.Shield_Thermal;

        if (item.statGroup.boostMultiplier != 0.0)
        {

            String rawString = " (" + item.statGroup.boostMultiplier + ")";
            Label stat = new Label(rawString);
            stat.alignmentProperty().set(Pos.CENTER_LEFT);
            getStyleClass().addAll("base_font");

            if (item.statGroup.boostMultiplier == 1.0d)
            {
                stat.getStyleClass().addAll("light_color_label");
            }
            else if (item.statGroup.boostMultiplier < 1.0d)
            {
                stat.getStyleClass().addAll("positive_stat");
            }
            else
            {
                stat.getStyleClass().addAll("negative_stat");
            }

            hBox.getChildren().add(stat);

            Region region1 = new Region();
            HBox.setHgrow(region1, Priority.ALWAYS);
            hBox.getChildren().add(region1);

            suffix = "%";
        }

        String rawString = String.valueOf(UIFunctions.Data.round(item.statGroup.boostValue, 1));
        Label stat = new Label(rawString + suffix);
        if (shouldHighlight)
        {
            hBox.getStyleClass().add("min_max_cell");
        }
        getStyleClass().addAll("base_font");
        stat.getStyleClass().addAll("light_color_label");

        hBox.getChildren().add(stat);

        super.setGraphic(hBox);
    }
}