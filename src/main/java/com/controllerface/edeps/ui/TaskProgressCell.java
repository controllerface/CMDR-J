package com.controllerface.edeps.ui;

import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableCell;

/**
 * Created by Stephen on 4/2/2018.
 */
public class TaskProgressCell extends TableCell<ProcurementRecipeData, ProgressIndicator>
{
    @Override
    protected void updateItem(ProgressIndicator item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null) setGraphic(null);
        if (!empty && item != null)
        {
            item.setPrefHeight(40);
            item.setMinHeight(40);
            item.setMaxHeight(40);

            setGraphic(item);
        }
    }
}
