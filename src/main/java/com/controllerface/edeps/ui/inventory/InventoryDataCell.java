package com.controllerface.edeps.ui.inventory;

import com.controllerface.edeps.data.commander.InventoryData;
import javafx.scene.control.*;

/**
 * Created by Controllerface on 5/10/2018.
 */
public class InventoryDataCell extends TableCell<InventoryData, InventoryData>
{
    @Override
    protected void updateItem(InventoryData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }

        item.prepareGraphic();
        setGraphic(item.getGraphic());
    }
}
