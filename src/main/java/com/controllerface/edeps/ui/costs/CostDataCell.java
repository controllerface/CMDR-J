package com.controllerface.edeps.ui.costs;

import com.controllerface.edeps.data.procurements.ItemCostData;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class CostDataCell extends TableCell<ItemCostData, ItemCostData>
{
    @Override
    protected void updateItem(ItemCostData item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            super.setText(null);
            super.setGraphic(null);
            return;
        }

        item.prepareGraphic();
        setGraphic(item.getGraphic());
    }
}
