package com.controllerface.edeps.ui;

import com.controllerface.edeps.Statistic;
import javafx.scene.control.TableCell;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Pair;

/**
 * Created by Stephen on 4/26/2018.
 */
public class RecipeStatDataCell extends TableCell<Pair<Statistic, String>, String>
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

            Font baseFont = Font.font(baseFontFamily, FontWeight.BOLD, baseFontSize);
            setFont(baseFont);
        }
    }
}
