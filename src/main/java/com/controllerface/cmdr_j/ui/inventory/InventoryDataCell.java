package com.controllerface.cmdr_j.ui.inventory;

import com.controllerface.cmdr_j.data.commander.InventoryData;
import javafx.scene.control.TableCell;

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
