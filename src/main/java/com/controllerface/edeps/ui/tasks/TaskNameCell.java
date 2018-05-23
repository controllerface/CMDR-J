package com.controllerface.edeps.ui.tasks;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.util.Pair;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Created by Controllerface on 4/8/2018.
 */
public class TaskNameCell extends TableCell<ProcurementRecipeData, ProcurementRecipeData>
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
    private final Function<ProcurementCost, Integer> pendingTradeYield;

    public TaskNameCell(Function<ProcurementCost, Integer> checkInventory, Function<ProcurementCost, Integer> pendingTradeYield)
    {
        this.checkInventory = checkInventory;
        this.pendingTradeYield = pendingTradeYield;
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
//        if (!initialized.getAndSet(true))
//        {
            descriptionContainer.getChildren().clear();
            Accordion accordion = new Accordion();

            TitledPane titledPane = new TitledPane();
            titledPane.setAnimated(false);

            VBox costEffectContainer = new VBox();
            costEffectContainer.setBackground(new Background(new BackgroundFill(Color.rgb(0xDD, 0xDD, 0xDD), CornerRadii.EMPTY, Insets.EMPTY)));

            Separator separator = new Separator();
            separator.setPrefHeight(10);

            nameLabel.setPrefHeight(20);
            nameLabel.setFont(UIFunctions.Fonts.size2Font);
            nameLabel.paddingProperty().set(new Insets(2,5,2,5));


        // effects
        item.asPair().getValue().effects().effectStream()
                .map(UIFunctions.Convert.effectToLabel)
                .sorted(UIFunctions.Sort.byGoodness)
                .forEach(label -> costEffectContainer.getChildren().add(label));

        costEffectContainer.getChildren().add(separator);

        // costs
            item.asPair().getValue().costStream()
                    .map(c->
                    {
                        boolean isYield = c.getQuantity() < 0;
                        boolean hasEnough = isYield ||
                                checkInventory.apply(c.getCost()) >= c.getQuantity() * item.getCount();

                        String quantity = c.getQuantity() < 0
                                ? "+" + Math.abs(c.getQuantity()) * item.getCount()
                                : "-" + c.getQuantity() * item.getCount();

                        Label next = new Label(quantity + " " + c.getCost().getLocalizedName());
                        next.setFont(UIFunctions.Fonts.size1Font);
                        next.setTextFill(hasEnough ? UIFunctions.Fonts.neutralBlack : UIFunctions.Fonts.negativeRed);
                        return next;
                    })
                    .forEach(label -> costEffectContainer.getChildren().add(label));



            titledPane.setContent(costEffectContainer);
            updateProgressBar(item);

            // clicking the progress bar should expand the enclosing titled pane
            progressBar.setOnMouseClicked((e)->titledPane.setExpanded(!titledPane.isExpanded()));

            titledPane.setGraphic(new HBox(progressBar, nameLabel));
            ((HBox) titledPane.getGraphic()).setAlignment(Pos.CENTER);

            accordion.getPanes().add(titledPane);

            descriptionContainer.getChildren().add(accordion);
        //}

        nameLabel.setText(item.asPair().getValue().getDisplayLabel() + " :: " + item.asPair().getKey().toString());
        updateProgressBar(item);
    }

    private Pair<Double, Boolean> calculateProgress(ProcurementRecipeData procurementRecipeData)
    {
        AtomicBoolean usesTrade = new AtomicBoolean(false);

        // get the number of "rolls" required for this task
        int count = procurementRecipeData.getCount();

        AtomicInteger accumulatedTotal = new AtomicInteger(0);

        int missing = procurementRecipeData.asPair().getValue().costStream()
                .filter(c->c.getQuantity() > 0)
                .mapToInt(cost->
                {
                    int banked = checkInventory.apply(cost.getCost());

                    int calculatedCost = (cost.getQuantity() * count);

                    accumulatedTotal.addAndGet(calculatedCost);

                    int surplus = banked - calculatedCost;

                    // only check pending trades if we're in the red without them
                    if (surplus < 0)
                    {
                        Integer pendingYield = pendingTradeYield.apply(cost.getCost());
                        if (pendingYield != null && pendingYield > 0)
                        {
                            usesTrade.set(true);
                            surplus = banked + pendingYield - calculatedCost;
                        }
                    }

                    return surplus < 0
                            ? -1 * surplus
                            : 0;
                })
                .sum();

        if (count == lastCount && accumulatedTotal.get() == lastTotal && missing == lastMissing)
        {
            return new Pair<>(lastProgress, usesTrade.get());
        }

        lastCount = count;
        lastTotal = accumulatedTotal.get();
        lastMissing = missing;

        lastProgress = lastMissing > 0
                ? (double) (lastTotal - lastMissing) / (double)(lastTotal)
                : 1;

        return new Pair<>(lastProgress, usesTrade.get());
    }

    private void updateProgressBar(ProcurementRecipeData procurementRecipeData)
    {
        Pair<Double, Boolean> progressData = calculateProgress(procurementRecipeData);
        progressBar.setProgress(progressData.getKey());

        if (progressData.getValue())
        {
            progressBar.setStyle("-fx-accent: #b061ff");
        }
        else
        {
            if (progressBar.getProgress() >= 1.0)
            {
                progressBar.setStyle("-fx-accent: #00b3f7");
            }
            else progressBar.setStyle("-fx-accent: #ff0000 ");
        }
        progressBar.applyCss();
    }
}
