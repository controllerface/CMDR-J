package com.controllerface.cmdr_j.ui.inventory;

import com.controllerface.cmdr_j.data.commander.InventoryData;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.shape.FillRule;
import javafx.scene.shape.Path;
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
            final Region svgShape = new Region();
            SVGPath svg = item.getItem().getGrade().getIcon();
            svgShape.setShape(svg);

            double sizeh = 25;
            double sizew = 28;

            svgShape.setMinSize(sizew, sizeh);
            svgShape.setPrefSize(sizew, sizeh);
            svgShape.setMaxSize(sizew, sizeh);
            svgShape.setStyle("-fx-background-color: #b75200;");
            double originalWidth = svg.prefWidth(-1);
            double originalHeight = svg.prefHeight(originalWidth);

            double scaleX = sizew / originalWidth;
            double scaleY = sizeh / originalHeight;

            svg.setScaleX(scaleX);
            svg.setScaleY(scaleY);
            hBox.getChildren().add(svgShape);

            hBox.setPadding(new Insets(2,0,0,0));
        }

        hBox.setAlignment(Pos.TOP_CENTER);
        setGraphic(hBox);
    }
}
