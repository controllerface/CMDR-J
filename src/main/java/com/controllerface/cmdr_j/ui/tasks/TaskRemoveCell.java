package com.controllerface.cmdr_j.ui.tasks;

import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.ui.TaskDisplay;
import com.controllerface.cmdr_j.classes.tasks.TaskType;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableCell;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.util.Pair;

import java.util.function.BiConsumer;

/**
 * Created by Controllerface on 4/2/2018.
 */
public class TaskRemoveCell extends TableCell<TaskDisplay, Pair<TaskType, TaskRecipe>>
{
    private final HBox controls = new HBox();

    private final BiConsumer<Integer, Pair<TaskType, TaskRecipe>> blueprintUpdate;

    public TaskRemoveCell(BiConsumer<Integer, Pair<TaskType, TaskRecipe>> blueprintUpdate)
    {
        this.blueprintUpdate = blueprintUpdate;
    }

    @Override
    protected void updateItem(Pair<TaskType, TaskRecipe> item, boolean empty)
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

        // todo: this is probably what is messing up trades
        removeButton.setOnAction((e) -> blueprintUpdate.accept(-9999, item));

        Tooltip tooltip = new Tooltip("Remove " + item.getValue().getDisplayLabel() + " from Tracked Tasks");
        tooltip.getStyleClass().addAll("base_font");
        removeButton.setTooltip(tooltip);
        controls.getChildren().add(removeButton);

        controls.setAlignment(Pos.TOP_CENTER);

        setGraphic(controls);
    }
}
