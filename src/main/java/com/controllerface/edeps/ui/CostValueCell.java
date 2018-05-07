package com.controllerface.edeps.ui;

import com.controllerface.edeps.data.procurements.ItemCostData;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Created by Stephen on 4/26/2018.
 */
public class CostValueCell extends TableCell<ItemCostData, String>
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

            setAlignment(Pos.TOP_CENTER);
            setPadding(new Insets(8,0,0,0));

            Font baseFont = Font.font(baseFontFamily, FontWeight.BOLD, baseFontSize);
            setFont(baseFont);
        }
    }
}
