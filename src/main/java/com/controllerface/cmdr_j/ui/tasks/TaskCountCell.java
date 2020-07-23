package com.controllerface.cmdr_j.ui.tasks;

import com.controllerface.cmdr_j.classes.tasks.TaskData;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/8/2018.
 */
public class TaskCountCell extends TableCell<TaskData, TaskData>
{
    @Override
    protected void updateItem(TaskData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null) setGraphic(null);
        if (item != null && !empty)
        {
            setGraphic(item.getSpinner());
        }
    }
}
