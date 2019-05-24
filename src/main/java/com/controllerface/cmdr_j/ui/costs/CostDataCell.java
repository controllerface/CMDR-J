package com.controllerface.cmdr_j.ui.costs;

import com.controllerface.cmdr_j.ui.Displayable;
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
