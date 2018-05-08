package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Created by Stephen on 4/8/2018.
 */
public class RecipeNameCell extends TableCell<ProcurementRecipeData, ProcurementRecipeData>
{
    // main graphic node that contains the visible contents
    private final VBox descriptionContainer = new VBox();

    // objects with content that may change
    private final Label nameLabel = new Label();
    private final ProgressBar progressBar = new ProgressBar();

    private int lastCount = -1;
    private int lastTotal = -1;
    private int lastMissing = -1;
    private double lastProgress = -1;

    private AtomicBoolean initialized = new AtomicBoolean(false);
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
            initialized.set(false);
            lastCount = -1;
            lastTotal = -1;
            lastMissing = -1;
            lastProgress = -1;
            setGraphic(null);
            return;
        }
        createOrUpdate(item);
        setGraphic(descriptionContainer);
    }

    private void createOrUpdate(ProcurementRecipeData item)
    {
        if (!initialized.getAndSet(true))
        {
            descriptionContainer.getChildren().clear();
            Accordion accordion = new Accordion();
            TitledPane titledPane = new TitledPane();
            VBox costEffectContainer = new VBox();
            Separator separator = new Separator();

            nameLabel.setText(item.asPair().getKey().toString() + " :: " + item.asPair().getValue().getDisplayLabel());
            nameLabel.setPrefHeight(20);
            nameLabel.setFont(UIFunctions.Fonts.size2Font);
            nameLabel.paddingProperty().set(new Insets(2,5,2,5));
            titledPane.setAnimated(false);
            costEffectContainer.setBackground(new Background(new BackgroundFill(Color.rgb(0xDD, 0xDD, 0xDD), CornerRadii.EMPTY, Insets.EMPTY)));
            separator.setPrefHeight(10);
            costEffectContainer.getChildren().add(separator);

            // costs
            item.asPair().getValue().costStream()
                    .map(c->
                    {
                        boolean hasEnough = checkInventory.apply(c.getCost()) >= c.getQuantity() * item.getCount();
                        return UIFunctions.Convert.costToLabel.apply(hasEnough, c);
                    })
                    .forEach(label -> costEffectContainer.getChildren().add(label));

            // effects
            item.asPair().getValue().effects().pairStream()
                    .map(UIFunctions.Convert.effectToLabel)
                    .sorted(UIFunctions.Sort.byGoodness)
                    .forEach(label -> costEffectContainer.getChildren().add(label));

            titledPane.setContent(costEffectContainer);
            updateProgressBar(item);

            // clicking the progress bar should expand the enclosing titled pane
            progressBar.setOnMouseClicked((e)->titledPane.setExpanded(!titledPane.isExpanded()));

            titledPane.setGraphic(new HBox(progressBar, nameLabel));
            ((HBox) titledPane.getGraphic()).setAlignment(Pos.CENTER);

            accordion.getPanes().add(titledPane);

            descriptionContainer.getChildren().add(accordion);
        }
        else
        {
            nameLabel.setText(item.asPair().getKey().toString() + " :: " + item.asPair().getValue().getDisplayLabel());
            updateProgressBar(item);
        }
    }

    private double calculateProgress(ProcurementRecipeData procurementRecipeData)
    {
        // get the number of "rolls" required for this task
        int count = procurementRecipeData.getCount();

        AtomicInteger accumulatedTotal = new AtomicInteger(0);

        int missing = procurementRecipeData.asPair().getValue().costStream()
                .mapToInt(cost->
                {
                    int banked = checkInventory.apply(cost.getCost());
                    int calculatedCost = (cost.getQuantity() * count);
                    accumulatedTotal.addAndGet(calculatedCost);
                    int surplus = banked - calculatedCost;
                    return surplus < 0
                            ? -1 * surplus
                            : 0;
                })
                .sum();

        if (count == lastCount && accumulatedTotal.get() == lastTotal && missing == lastMissing)
        {
            return lastProgress;
        }

        lastCount = count;
        lastTotal = accumulatedTotal.get();
        lastMissing = missing;

        lastProgress = lastMissing > 0
                ? (double) (lastTotal - lastMissing) / (double)(lastTotal)
                : 1;

        return lastProgress;
    }

    private void updateProgressBar(ProcurementRecipeData procurementRecipeData)
    {
        progressBar.setProgress(calculateProgress(procurementRecipeData));
        if (progressBar.getProgress() >= 1.0)
        {
            progressBar.setStyle("-fx-accent: #00b3f7");
        }
        else progressBar.setStyle("-fx-accent: #ff0000 ");

        progressBar.applyCss();
    }
}
