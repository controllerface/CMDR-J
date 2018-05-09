package com.controllerface.edeps.ui.tasks;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.TableCell;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.util.Pair;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;

/**
 * Created by Stephen on 4/2/2018.
 */
public class TaskRemoveCell extends TableCell<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>
{
    private final HBox controls = new HBox();

    private AtomicBoolean initialized = new AtomicBoolean(false);

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
            initialized.set(false);
            setGraphic(null);
            return;
        }

        if (!initialized.getAndSet(true))
        {
            controls.getChildren().clear();
            final Button removeButton = new Button("x");

            Line line = new Line();
            line.setStroke(Color.BLACK);
            line.setStrokeWidth(3);
            line.setStartX(-3);
            line.setEndX(7);
            line.setStartY(1);
            line.setEndY(11);

            Line line2 = new Line();
            line2.setStroke(Color.BLACK);
            line2.setStrokeWidth(3);
            line2.setStartX(-3);
            line2.setEndX(7);
            line2.setStartY(11);
            line2.setEndY(1);

            Pane box  = new Pane(line, line2);

            removeButton.setGraphic(box);
            removeButton.setMaxWidth(20d);
            removeButton.setMinWidth(20d);
            removeButton.setMaxHeight(20d);
            removeButton.setMinHeight(20d);
            removeButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);

            removeButton.setOnAction((e) ->
            {
                int val = blueprintUpdate.apply(0, item);
                while (val > 0) val = blueprintUpdate.apply( -val, item);
            });

            removeButton.setTooltip(new Tooltip("Remove this recipe"));
            controls.getChildren().add(removeButton);

            setGraphic(controls);
        }
    }
}
