package com.controllerface.edeps.ui.ship;

import com.controllerface.edeps.data.commander.ShipStatisticData;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;

/**
 * Created by Stephen on 5/7/2018.
 */
public class StatDisplayCell extends TableCell<ShipStatisticData, ShipStatisticData>
{
    @Override
    protected void updateItem(ShipStatisticData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null)
        {
            setGraphic(null);
            return;
        }
        if (!empty)
        {
            Label label = new Label(item.statDisplayValue());
            label.setFont(UIFunctions.Fonts.size3Font);
            setGraphic(label);
        }
    }
}