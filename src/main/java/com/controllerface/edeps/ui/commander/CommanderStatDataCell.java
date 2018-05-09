package com.controllerface.edeps.ui.commander;

import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.scene.control.TableCell;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Pair;

/**
 * Created by Stephen on 4/26/2018.
 */
public class CommanderStatDataCell extends TableCell<Pair<Statistic, String>, String>
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
