package com.controllerface.cmdr_j.ui.tasks;

import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.ProcurementType;
import com.controllerface.cmdr_j.data.procurements.ProcurementTaskData;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableCell;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.util.Pair;

import java.util.function.BiFunction;

/**
 * Created by Controllerface on 4/2/2018.
 */
public class TaskRemoveCell extends TableCell<ProcurementTaskData, Pair<ProcurementType, ProcurementRecipe>>
{
    private final HBox controls = new HBox();

    private final BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer> blueprintUpdate;

    public TaskRemoveCell(BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer> blueprintUpdate)
    {
        this.blueprintUpdate = blueprintUpdate;
    }

    @Override
    protected void updateItem(Pair<ProcurementType, ProcurementRecipe> item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null || empty)
        {
            setGraphic(null);
            return;
        }

        controls.getChildren().clear();
        final Button removeButton = new Button("x");

        Line line = new Line();
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(3);

        line.setStartX(4);
        line.setStartY(7);
        line.setEndX(14);
        line.setEndY(17);

        Line line2 = new Line();
        line2.setStroke(Color.BLACK);
        line2.setStrokeWidth(3);

        line2.setStartX(14);
        line2.setStartY(7);
        line2.setEndX(4);
        line2.setEndY(17);

        Pane box  = new Pane(line, line2);

        removeButton.setGraphic(box);
        removeButton.setMaxWidth(33d);
        removeButton.setMinWidth(33d);
        removeButton.setMaxHeight(33d);
        removeButton.setMinHeight(33d);

        removeButton.setStyle("-fx-base: #ee8888;");

        removeButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);

        removeButton.setOnAction((e) ->
        {
            int val = blueprintUpdate.apply(0, item);
            while (val > 0) val = blueprintUpdate.apply( -val, item);
        });

        Tooltip tooltip = new Tooltip("Remove this Task");
        tooltip.setFont(UIFunctions.Fonts.size2Font);
        removeButton.setTooltip(tooltip);
        controls.getChildren().add(removeButton);

        controls.setAlignment(Pos.TOP_CENTER);

        setGraphic(controls);
    }
}
