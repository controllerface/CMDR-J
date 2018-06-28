package com.controllerface.cmdr_j.ui.tasks;

import com.controllerface.cmdr_j.data.procurements.ProcurementTaskData;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/8/2018.
 */
public class TaskDataCell extends TableCell<ProcurementTaskData, ProcurementTaskData>
{
    @Override
    protected void updateItem(ProcurementTaskData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            super.setText(null);
            super.setGraphic(null);
            return;
        }

        item.prepareGraphic();
        setGraphic(item.getGraphic());
    }
}
