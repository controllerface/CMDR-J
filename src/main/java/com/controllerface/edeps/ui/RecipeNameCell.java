package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.concurrent.atomic.AtomicReference;
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
        // todo: store the UI elements the first time they are created, and update instead of recreate each time

        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setGraphic(null);
            return;
        }
        VBox descriptionContainer = new VBox();

        // Recipe name in the recipe list
        Label nameLabel = new Label(item.asPair().getKey().toString() + " :: " + item.asPair().getValue().toString());

        nameLabel.setPrefHeight(20);
        // Make the font bold
        Font existingFont = nameLabel.getFont();
        Font boldFont = Font.font(existingFont.getFamily(), FontWeight.BOLD, existingFont.getSize() + (existingFont.getSize() / 4));
        nameLabel.setFont(boldFont);
        nameLabel.paddingProperty().set(new Insets(2,5,2,5));


        Accordion accordion = new Accordion();
        TitledPane titledPane = new TitledPane();
        titledPane.setAnimated(false);

        VBox costEffectContainer = new VBox();
        costEffectContainer.setBackground(new Background(new BackgroundFill(Color.rgb(0xDD, 0xDD, 0xDD), CornerRadii.EMPTY, Insets.EMPTY)));


        // costs
        item.asPair().getValue().costStream()
                .map(c->
                {
                    boolean hasEnough = checkInventory.apply(c.getCost()) >= c.getQuantity() * item.getCount();
                    return UIFunctions.Convert.costToLabel.apply(hasEnough, c);
                })
                .forEach(label -> costEffectContainer.getChildren().add(label));


        Separator separator2 = new Separator();
        separator2.setPrefHeight(10);
        costEffectContainer.getChildren().add(separator2);


        // effects
        item.asPair().getValue().effects().pairStream()
                .map(UIFunctions.Convert.effectToLabel)
                .sorted(UIFunctions.Sort.byGoodness)
                .forEach(label -> costEffectContainer.getChildren().add(label));

        titledPane.setContent(costEffectContainer);
        ProgressBar progressBar = createProgressBar(item);

        // clicking the progress bar should expand the enclosing titled pane
        progressBar.setOnMouseClicked((e)->titledPane.setExpanded(!titledPane.isExpanded()));

        titledPane.setGraphic(new HBox(progressBar, nameLabel));
        ((HBox) titledPane.getGraphic()).setAlignment(Pos.CENTER);

        accordion.getPanes().add(titledPane);

        descriptionContainer.getChildren().add(accordion);
        setGraphic(descriptionContainer);
    }

    private ProgressBar createProgressBar(ProcurementRecipeData procurementRecipeData)
    {
        int count = procurementRecipeData.getCount();

        int total = procurementRecipeData.asPair().getValue().costStream()
                .mapToInt(c -> c.getQuantity() * count)
                .sum();

        int missing = procurementRecipeData.asPair().getValue().costStream()
                .mapToInt(cost->
                {
                    int banked = checkInventory.apply(cost.getCost());
                    int surplus = banked - (cost.getQuantity() * count);
                    return surplus < 0
                            ? -1 * surplus
                            : 0;
                })
                .sum();

        double progress = missing > 0
                ? (double) total / (double)(total + missing)
                : 1;

        ProgressBar progressIndicator = new ProgressBar(progress);

        if (progress >= 1.0)
        {
            progressIndicator.setStyle("-fx-accent: #00b3f7");
        }
        else progressIndicator.setStyle("-fx-accent: #ff0000 ");

        progressIndicator.applyCss();
        return progressIndicator;
    }
}
