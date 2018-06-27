package com.controllerface.edeps.ui.costs;

import com.controllerface.edeps.data.commander.Displayable;
import com.controllerface.edeps.data.procurements.ItemCostData;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class CostDataCell extends TableCell<Displayable, Displayable>
{
    @Override
    protected void updateItem(Displayable item, boolean empty)
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
