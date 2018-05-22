package com.controllerface.edeps.ui.ship;

import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class SlotNameCell extends TableCell<ShipModuleData, String>
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
            setAlignment(Pos.TOP_RIGHT);
            paddingProperty().set(new Insets(8,5,0,0));
        }
    }
}
