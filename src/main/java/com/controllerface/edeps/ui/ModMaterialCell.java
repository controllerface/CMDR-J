package com.controllerface.edeps.ui;

import com.controllerface.edeps.data.ModMaterialItem;
import javafx.scene.control.ListCell;

/**
 * Created by Stephen on 4/2/2018.
 */
public class ModMaterialCell extends ListCell<ModMaterialItem>
{
    @Override
    protected void updateItem(ModMaterialItem item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null)
        {
            setGraphic(null);
            setText(null);
            return;
        }
        setText(item.toString());
    }
}
