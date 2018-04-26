package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
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
        Font boldFont = Font.font(existingFont.getFamily(), FontWeight.BOLD, existingFont.getSize() + (existingFont.getSize() / 4));
        nameLabel.setFont(boldFont);
        nameLabel.paddingProperty().set(new Insets(2,5,2,5));

        // ad the label to the display box
        vBox.getChildren().add(nameLabel);

        Separator separator = new Separator();
        separator.setPrefHeight(5);
        vBox.getChildren().add(separator);


        Accordion accordion = new Accordion();
        TitledPane titledPane = new TitledPane();
        titledPane.setAnimated(false);

        VBox vBox1 = new VBox();
        vBox1.setBackground(new Background(new BackgroundFill(Color.rgb(0xDD, 0xDD, 0xDD), CornerRadii.EMPTY, Insets.EMPTY)));


        // costs
        item.asPair().getValue().costStream()
                .map(c->
                {
                    boolean hasEnough = checkInventory.apply(c.getCost()) >= c.getQuantity() * item.getCount();
                    return UIFunctions.Convert.costToLabel.apply(hasEnough, c);
                })
                .forEach(label -> vBox1.getChildren().add(label));


        Separator separator2 = new Separator();
        separator2.setPrefHeight(10);
        vBox1.getChildren().add(separator2);


        // effects
        item.asPair().getValue().effects().pairStream()
                .map(UIFunctions.Convert.effectToLabel)
                .sorted(UIFunctions.Sort.byGoodness)
                .forEach(label -> vBox1.getChildren().add(label));





        titledPane.setContent(vBox1);
        titledPane.setText("Costs & Effects");
        accordion.getPanes().add(titledPane);
        vBox.getChildren().add(accordion);
        setGraphic(vBox);
    }
}
