package com.controllerface.cmdr_j.ui.inventory;

import com.controllerface.cmdr_j.classes.commander.InventoryData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;

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

        Label label = new Label();
        if (item.getItem().getGrade().getIcon() == null)
        {
            String grade = item.getItem().getGrade().toString();
            label.setText(grade);
            label.setPadding(new Insets(4,0,0,0));
        }
        else
        {
            Icon svg = item.getItem().getGrade().getIcon();
            String color = svg.getHexColorString();

            final Region svgShape = UIFunctions.Convert.createMaterialIconRegion(svg.getIconPath(),
                    svg.getBaseWidth(), svg.getBaseHeight(), color);
            label.setGraphic(svgShape);
            hBox.setPadding(new Insets(2,0,0,0));
        }

        label.setFont(UIFunctions.Fonts.size2Font);
        label.setTooltip(new Tooltip(item.getItem().getGrade().toString()));
        hBox.getChildren().add(label);
        hBox.setAlignment(Pos.TOP_CENTER);
        setGraphic(hBox);
    }
}
