package com.controllerface.cmdr_j.ui.inventory;

import com.controllerface.cmdr_j.data.commander.InventoryData;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;

/**
 * Created by Controllerface on 5/10/2018.
 */
public class InventoryGradeCell extends TableCell<InventoryData, InventoryData>
{
    @Override
    protected void updateItem(InventoryData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }

        String grade = item.getItem().getGrade().toString();
        HBox hBox = new HBox();
        Label label = new Label(grade);
        label.setFont(UIFunctions.Fonts.size2Font);
        hBox.getChildren().add(label);
        setGraphic(hBox);
    }
}
