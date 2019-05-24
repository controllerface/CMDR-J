package com.controllerface.cmdr_j.ui.inventory;

import com.controllerface.cmdr_j.classes.commander.InventoryData;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.shape.SVGPath;

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

        HBox hBox = new HBox();

        if (item.getItem().getGrade().getIcon() == null)
        {
            String grade = item.getItem().getGrade().toString();
            Label label = new Label(grade);
            label.setPadding(new Insets(4,0,0,0));
            label.setFont(UIFunctions.Fonts.size2Font);
            hBox.getChildren().add(label);
        }
        else
        {
            SVGPath svg = item.getItem().getGrade().getIcon();

            final Region svgShape = UIFunctions.Convert.createMaterialIconRegion(svg, 28, 25);

            hBox.getChildren().add(svgShape);

            hBox.setPadding(new Insets(2,0,0,0));
        }

        hBox.setAlignment(Pos.TOP_CENTER);
        setGraphic(hBox);
    }
}
