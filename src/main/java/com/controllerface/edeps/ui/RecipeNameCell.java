package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.ProcurementRecipeData;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TableCell;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.function.Function;

/**
 * Created by Stephen on 4/8/2018.
 */
public class RecipeNameCell extends TableCell<ProcurementRecipeData, ProcurementRecipeData>
{
    private final Function<ProcurementCost, Integer> checkInventory;

    public RecipeNameCell(Function<ProcurementCost, Integer> checkInventory)
    {
        this.checkInventory = checkInventory;
    }


    @Override
    protected void updateItem(ProcurementRecipeData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setGraphic(null);
            return;
        }
        VBox vBox = new VBox();

        // Recipe name in the recipe list
        Label nameLabel = new Label(item.asPair().getKey().toString() + " :: " + item.asPair().getValue().toString());

        // Make the font bold
        Font existingFont = nameLabel.getFont();
        Font boldFont = Font.font(existingFont.getFamily(), FontWeight.BOLD, existingFont.getSize());
        nameLabel.setFont(boldFont);

        // ad the label to the display box
        vBox.getChildren().add(nameLabel);

        Separator separator = new Separator();
        separator.setPrefHeight(5);
        vBox.getChildren().add(separator);


        item.asPair().getValue().effects().pairStream()
                .map(UIFunctions.Convert.effectToLabel)
                .sorted(UIFunctions.Sort.byGoodness)
                .forEach(label -> vBox.getChildren().add(label));

        Separator separator2 = new Separator();
        separator2.setPrefHeight(10);
        vBox.getChildren().add(separator2);

        item.asPair().getValue().costStream()
                .map(c->
                {
                    Label next = new Label(c.getQuantity() + "x " + c.getCost().getLocalizedName());
                    boolean hasEnough = checkInventory.apply(c.getCost()) >= c.getQuantity() * item.getCount();
                    next.setTextFill(hasEnough ? Color.BLUE : Color.RED);
                    return next;
                })
                .forEach(label -> vBox.getChildren().add(label));

        setGraphic(vBox);
    }
}
