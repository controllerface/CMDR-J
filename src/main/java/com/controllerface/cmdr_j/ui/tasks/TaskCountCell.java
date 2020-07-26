package com.controllerface.cmdr_j.ui.tasks;

import com.controllerface.cmdr_j.classes.tasks.TaskDisplay;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/8/2018.
 */
public class TaskCountCell extends TableCell<TaskDisplay, TaskDisplay>
{
    @Override
    protected void updateItem(TaskDisplay item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null) setGraphic(null);
        if (item != null && !empty)
        {
            setGraphic(item.getSpinner());
        }
    }
}
