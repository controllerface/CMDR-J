package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Pair;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

/**
 * Created by Stephen on 4/8/2018.
 */
public class TaskCountCell extends TableCell<ProcurementRecipeData, ProcurementRecipeData>
{
    private final Label countLabel = new Label();
    private final Button subtractButton = new Button("-");
    private final Button addButton = new Button("+");
    private final HBox buttonBox =  new HBox(subtractButton, countLabel, addButton);
    private static final AtomicReference<Font> baseFont = new AtomicReference<>(null);

    private final BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer> inventoryUpdate;

    public TaskCountCell(BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer> inventoryUpdate)
    {
        this.inventoryUpdate = inventoryUpdate;
    }

    @Override
    protected void updateItem(ProcurementRecipeData item, boolean empty)
    {
        super.updateItem(item, empty);

        if (!empty)
        {
            synchronized (baseFont)
            {
                if (baseFont.get() == null)
                {
                    Font b = Font.font(countLabel.getFont().getFamily(),
                            FontWeight.BOLD,
                            countLabel.getFont().getSize() + countLabel.getFont().getSize() / 2);
                    baseFont.set(b);
                }
            }


            // Plus
            Line line1 = new Line();
            line1.setStroke(Color.BLACK);
            line1.setStrokeWidth(3);
            line1.setStartX(-3);
            line1.setEndX(7);
            line1.setStartY(6);
            line1.setEndY(6);

            Line line2 = new Line();
            line2.setStroke(Color.BLACK);
            line2.setStrokeWidth(3);
            line2.setStartX(2);
            line2.setEndX(2);
            line2.setStartY(1);
            line2.setEndY(11);

            // Minus
            Line line3 = new Line();
            line3.setStroke(Color.BLACK);
            line3.setStrokeWidth(3);
            line3.setStartX(-3);
            line3.setEndX(7);
            line3.setStartY(6);
            line3.setEndY(6);

            Pane addGraphic  = new Pane(line1, line2);
            Pane subGraphic  = new Pane(line3);

            addButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            subtractButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            addButton.setGraphic(addGraphic);
            subtractButton.setGraphic(subGraphic);

            countLabel.setText(String.valueOf(item.getCount()));
            countLabel.setPrefWidth(54);
            countLabel.setMaxWidth(54);
            countLabel.setMinWidth(54);
            countLabel.setAlignment(Pos.CENTER);
            countLabel.setFont(baseFont.get());


            addButton.setMaxWidth(20);
            addButton.setMinWidth(20);
            subtractButton.setMaxWidth(20);
            subtractButton.setMinWidth(20);

            addButton.setMaxHeight(20);
            addButton.setMinHeight(20);
            subtractButton.setMaxHeight(20);
            subtractButton.setMinHeight(20);

            subtractButton.setOnAction((e) -> inventoryUpdate.apply(-1, item.asPair()));

            addButton.setOnAction((e) -> inventoryUpdate.apply(1, item.asPair()));

            setGraphic(buttonBox);
        }

        if (item==null) setGraphic(null);
    }
}
