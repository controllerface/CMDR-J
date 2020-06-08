package com.controllerface.cmdr_j.ui.procurements;

import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.ProcurementTaskData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
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

        Icon ic = item.getIcon() == null
                ? UIFunctions.Icons.cargoIcon
                : item.getIcon();

        SVGPath iconPath = ic.getIconPath();

        final Region svgShape = new Region();
        svgShape.setShape(iconPath);

        double sizew = item.getIcon().getBaseWidth();
        double sizeh = item.getIcon().getBaseHeight();
        double topPad = 6;

        if (iconPath == UIFunctions.Icons.engineering)
        {
            topPad = 2;
        }

        svgShape.setMinSize(sizew, sizeh);
        svgShape.setPrefSize(sizew, sizeh);
        svgShape.setMaxSize(sizew, sizeh);

        svgShape.setStyle("-fx-background-color: " + UIFunctions.Icons.toHexString(ic.getColor()));

//        if (item.getGrade() == ItemGrade.Experimental)
//        {
//            svgShape.setStyle("-fx-background-color: #ffb000;");
//        }
//        else svgShape.setStyle("-fx-background-color: #b75200;");

        double originalWidth = iconPath.prefWidth(-1);
        double originalHeight = iconPath.prefHeight(originalWidth);

        double scaleX = sizew / originalWidth;
        double scaleY = sizeh / originalHeight;

        iconPath.setScaleX(scaleX);
        iconPath.setScaleY(scaleY);
        hBox.getChildren().add(svgShape);
        svgShape.translateYProperty().set(topPad);
        hBox.setAlignment(Pos.TOP_CENTER);

        setGraphic(hBox);
    }
}
