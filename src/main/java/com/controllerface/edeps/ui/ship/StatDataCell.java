package com.controllerface.edeps.ui.ship;

import com.controllerface.edeps.data.commander.ShipStatisticData;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class StatDataCell extends TableCell<ShipStatisticData, String>
{
    private static double baseFontSize = -1;
    private static String baseFontFamily = null;

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
            synchronized (this)
            {
                if (baseFontSize == -1 && baseFontFamily == null)
                {
                    baseFontSize = getFont().getSize();
                    baseFontSize += baseFontSize / 4;
                    baseFontFamily = getFont().getFamily();
                }
            }
            setFont(UIFunctions.Fonts.size2Font);
        }
    }
}
