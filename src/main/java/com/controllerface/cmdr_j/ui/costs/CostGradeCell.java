package com.controllerface.cmdr_j.ui.costs;

import com.controllerface.cmdr_j.classes.procurements.ItemCostData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.shape.SVGPath;

/**
 * Created by Stephen on 7/6/2018.
 */
public class CostGradeCell extends TableCell<ItemCostData, ItemGrade>
{
    @Override
    protected void updateItem(ItemGrade item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }

        HBox hBox = new HBox();
        SVGPath icon = item.getIcon() == null ?  UIFunctions.Icons.cargo : item.getIcon();

        final Region svgShape = new Region();
        svgShape.setShape(icon);

        double sizew = 28;
        double sizeh = item.getIcon() == null ? sizew : 26;

        double topPad = item.getIcon() == null ? 2 : 4;


        svgShape.setMinSize(sizew, sizeh);
        svgShape.setPrefSize(sizew, sizeh);
        svgShape.setMaxSize(sizew, sizeh);

        if (item.getIcon() == null)
        {
            svgShape.setStyle("-fx-background-color: black;");
        }
        else svgShape.setStyle("-fx-background-color: #b75200;");

        double originalWidth = icon.prefWidth(-1);
        double originalHeight = icon.prefHeight(originalWidth);

        double scaleX = sizew / originalWidth;
        double scaleY = sizeh / originalHeight;

        icon.setScaleX(scaleX);
        icon.setScaleY(scaleY);
        hBox.getChildren().add(svgShape);
        hBox.setPadding(new Insets(topPad,0,0,0));
        hBox.setAlignment(Pos.TOP_CENTER);

        setGraphic(hBox);
    }
}
