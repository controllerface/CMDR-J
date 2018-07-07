package com.controllerface.cmdr_j.ui.tasks;

import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.ProcurementType;
import com.controllerface.cmdr_j.data.procurements.ProcurementTaskData;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.util.Pair;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Created by Controllerface on 4/8/2018.
 */
public class TaskCountCell extends TableCell<ProcurementTaskData, ProcurementTaskData>
{
    private final Label countLabel = new Label();
    private final Button subtractButton = new Button("-");
    private final Button addButton = new Button("+");
    private final HBox buttonBox =  new HBox(subtractButton, countLabel, addButton);
    private final BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> inventoryUpdate;

    public TaskCountCell(BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> inventoryUpdate)
    {
        this.inventoryUpdate = inventoryUpdate;
    }

    @Override
    protected void updateItem(ProcurementTaskData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null) setGraphic(null);
        if (item != null && !empty)
        {
            // Plus
            Line line1 = new Line();
            line1.setStroke(Color.BLACK);
            line1.setStrokeWidth(3);
            line1.setStartX(-3);
            line1.setEndX(7);
            line1.setStartY(12);
            line1.setEndY(12);

            Line line2 = new Line();
            line2.setStroke(Color.BLACK);
            line2.setStrokeWidth(3);
            line2.setStartX(2);
            line2.setEndX(2);
            line2.setStartY(7);
            line2.setEndY(17);

            // Minus
            Line line3 = new Line();
            line3.setStroke(Color.BLACK);
            line3.setStrokeWidth(3);
            line3.setStartX(-3);
            line3.setEndX(7);
            line3.setStartY(12);
            line3.setEndY(12);

            Pane addGraphic  = new Pane(line1, line2);
            Pane subGraphic  = new Pane(line3);

            addGraphic.setPrefHeight(23);
            subGraphic.setPrefHeight(23);

            addButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            addButton.setAlignment(Pos.CENTER);
            subtractButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            subtractButton.setAlignment(Pos.CENTER);

            addButton.setGraphic(addGraphic);
            subtractButton.setGraphic(subGraphic);

            countLabel.setText(String.valueOf(item.getCount()));
            countLabel.setPrefWidth(54);
            countLabel.setMaxWidth(54);
            countLabel.setMinWidth(54);
            countLabel.setAlignment(Pos.CENTER);
            countLabel.setFont(UIFunctions.Fonts.size4Font);

            subtractButton.setOnAction((e) -> inventoryUpdate.accept(-1, item.asPair()));

            addButton.setOnAction((e) -> inventoryUpdate.accept(1, item.asPair()));

            setGraphic(buttonBox);
        }
    }
}
