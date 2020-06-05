package com.controllerface.cmdr_j.ui.procurements;

import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.ProcurementTaskData;
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
public class TaskTypeCell extends TableCell<ProcurementTaskData, ProcurementRecipe>
{
    @Override
    protected void updateItem(ProcurementRecipe item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }

        HBox hBox = new HBox();
        SVGPath icon = item.getIcon() == null
                ? UIFunctions.Icons.cargo
                : item.getIcon().getIconPath();

        final Region svgShape = new Region();
        svgShape.setShape(icon);

        double sizew = item.getIcon().getBaseWidth();
        double sizeh = item.getIcon().getBaseHeight();
        double topPad = 2;

        svgShape.setMinSize(sizew, sizeh);
        svgShape.setPrefSize(sizew, sizeh);
        svgShape.setMaxSize(sizew, sizeh);

        if (item.getGrade() == ItemGrade.Experimental)
        {
            svgShape.setStyle("-fx-background-color: #ffb000;");
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
