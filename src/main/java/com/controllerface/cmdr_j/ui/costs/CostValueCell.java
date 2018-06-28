package com.controllerface.cmdr_j.ui.costs;

import com.controllerface.cmdr_j.data.procurements.ItemCostData;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class CostValueCell extends TableCell<ItemCostData, String>
{
    @Override
    protected void updateItem(String item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            super.setText(null);
            super.setGraphic(null);
        }
        else
        {
            super.setText(item);
            setAlignment(Pos.TOP_CENTER);
            setPadding(new Insets(8,0,0,0));
            setFont(UIFunctions.Fonts.size2Font);
        }
    }
}
