package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.classes.data.ShipStatisticData;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class StatDataCell extends TableCell<ShipStatisticData, String>
{
    @Override
    protected void updateItem(String item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }

        super.setText(item);
        getStyleClass().addAll("base_font");
    }
}
