package com.controllerface.edeps.ui;

import com.controllerface.edeps.data.ModMaterialItem;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableCell;

/**
 * Created by Stephen on 4/2/2018.
 */
public class MaterialProgressCell extends TableCell<ModMaterialItem, ProgressIndicator>
{
    @Override
    protected void updateItem(ProgressIndicator item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null) setGraphic(null);
        if (!empty && item != null)
        {
            setGraphic(item);
        }
    }
}
