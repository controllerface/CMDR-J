package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.data.MaterialTradeRecipe;
import com.controllerface.edeps.structures.costs.materials.MaterialTradeType;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Separator;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.util.Pair;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Represents a single "recipe" also referred to as a "procurement task" or just "task", that the user has selected for
 * completion. A user selects these tasks from the "procurement tree" adding them to a type of "to-do" list. Entries in
 * this list themselves have a count, representing completion of the same task multiple times. As such, the count value
 * of this object is mutable, to allow for a given instance of this recipe to be requested multiple times, and allows
 * any constituent costs of the recipe itself to be calculated bu multiplying their individual costs by the total count
 * of the desired task/recipe.
 *
 * Created by Controllerface on 4/2/2018.
 */
public class ProcurementTaskData
{
    // main graphic node that contains the visible contents
    private final VBox descriptionContainer = new VBox();

    private final VBox costEffectContainer = new VBox();

    // objects with content that may change
    private final Label nameLabel = new Label();
    private final ProgressBar progressBar = new ProgressBar();

    private int lastCount = -1;
    private int lastTotal = -1;
    private int lastMissing = -1;
    private double lastProgress = -1;

    private final ProcurementType type;
    private final ProcurementRecipe recipe;
    private final AtomicInteger count;

    private final AtomicBoolean initialRenderComplete = new AtomicBoolean(false);

    private final Function<ProcurementCost, Integer> checkInventory;
    private final Function<ProcurementCost, Integer> pendingTradeYield;

    public ProcurementTaskData(ProcurementType type,
                               ProcurementRecipe recipe,
                               int count,
                               Function<ProcurementCost, Integer> checkInventory,
                               Function<ProcurementCost, Integer> pendingTradeYield)
    {
        this.type = type;
        this.recipe = recipe;
        this.count = new AtomicInteger(count);
        this.checkInventory = checkInventory;
        this.pendingTradeYield = pendingTradeYield;

        costEffectContainer
                .setBackground(new Background(new BackgroundFill(Color
                        .rgb(0xDD, 0xDD, 0xDD), CornerRadii.EMPTY, Insets.EMPTY)));
    }

    @Override
    public String toString()
    {
        return type.toString() + " : " + recipe.toString() + "\n" +
                recipe.costStream()
                        .map(c-> " - " + c.getCost().getLocalizedName())
                        .collect(Collectors.joining("\n"));
    }

    public Pair<ProcurementType, ProcurementRecipe> asPair()
    {
        return new Pair<>(type, recipe);
    }

    public boolean isTrade()
    {
        return recipe instanceof MaterialTradeRecipe;
    }

    public int getCount()
    {
        return count.get();
    }

    public void setCount(int amount)
    {
        count.set(amount);
        renderProgress();
    }

    public boolean matches(Pair<ProcurementType, ProcurementRecipe> pair)
    {
        if (pair.getKey() instanceof MaterialTradeType)
        {
            boolean bothTrades = type instanceof  MaterialTradeType;
            if (!bothTrades) return false;

            boolean typeMatch = type == pair.getKey();
            if (!typeMatch) return false;

            Set<ProcurementCost> theseCosts = recipe.costStream()
                    .map(CostData::getCost)
                    .collect(Collectors.toSet());

            Set<ProcurementCost> thoseCosts = pair.getValue().costStream()
                    .map(CostData::getCost)
                    .collect(Collectors.toSet());

            return theseCosts.equals(thoseCosts);
        }

        return recipe == pair.getValue() && type == pair.getKey();
    }

    private void render()
    {
        Pair<ProcurementType, ProcurementRecipe> recipePair = asPair();

        descriptionContainer.getChildren().clear();

        TitledPane titledPane = new TitledPane();
        titledPane.setAnimated(false);
        titledPane.setExpanded(false);

        nameLabel.setPrefHeight(20);
        nameLabel.setFont(UIFunctions.Fonts.size2Font);
        nameLabel.paddingProperty().set(new Insets(2, 5, 2, 5));

        titledPane.setContent(costEffectContainer);

        renderEffects();

        // clicking the progress bar should expand the enclosing titled pane
        progressBar.setOnMouseClicked((e)->titledPane.setExpanded(!titledPane.isExpanded()));

        titledPane.setGraphic(new HBox(progressBar, nameLabel));
        ((HBox) titledPane.getGraphic()).setAlignment(Pos.CENTER);

        descriptionContainer.getChildren().add(titledPane);

        nameLabel.setText(recipePair.getKey().toString() + " :: " + recipePair.getValue().getDisplayLabel());
        if (recipePair.getKey() instanceof MaterialTradeType)
        {
            nameLabel.setTextFill(UIFunctions.Fonts.darkOrange);
        }
        else nameLabel.setTextFill(UIFunctions.Fonts.neutralBlack);
        renderProgress();
    }

    private Pair<Double, Boolean> calculateProgress(ProcurementTaskData procurementTaskData)
    {
        AtomicBoolean usesTrade = new AtomicBoolean(false);

        // get the number of "rolls" required for this task
        int count = procurementTaskData.getCount();

        AtomicInteger accumulatedTotal = new AtomicInteger(0);

        int missing = procurementTaskData.asPair().getValue().costStream()
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

    private void renderProgress()
    {
        Pair<Double, Boolean> progressData = calculateProgress(this);
        progressBar.setProgress(progressData.getKey());

        if (progressData.getValue())
        {
            if (progressBar.getProgress() >= 1.0)
            {
                progressBar.setStyle("-fx-accent: #d9b3ff");
            }
            else progressBar.setStyle("-fx-accent: #ffaaaa");
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

        renderEffects();
    }

    private void renderEffects()
    {
        costEffectContainer.getChildren().clear();

        Separator separator = new Separator();
        separator.setPrefHeight(10);

        // effects
        recipe.effects().effectStream()
                .map(UIFunctions.Convert.effectToLabel)
                .sorted(UIFunctions.Sort.byGoodness)
                .forEach(label -> costEffectContainer.getChildren().add(label));

        costEffectContainer.getChildren().add(separator);

        // costs
        recipe.costStream()
                .map(c->
                {
                    boolean isYield = c.getQuantity() < 0;
                    boolean hasEnough = isYield ||
                            checkInventory.apply(c.getCost()) >= c.getQuantity() * getCount();

                    String quantity = c.getQuantity() < 0
                            ? "+" + Math.abs(c.getQuantity()) * getCount()
                            : "-" + c.getQuantity() * getCount();

                    Label next = new Label(quantity + " " + c.getCost().getLocalizedName());
                    next.setFont(UIFunctions.Fonts.size1Font);
                    next.setTextFill(hasEnough ? UIFunctions.Fonts.neutralBlack : UIFunctions.Fonts.negativeRed);
                    return next;
                })
                .forEach(label -> costEffectContainer.getChildren().add(label));

    }

    public void prepareGraphic()
    {
        if (!initialRenderComplete.getAndSet(true))
        {
            render();
        }
        else renderProgress();
    }

    public Node getGraphic()
    {
        return descriptionContainer;
    }
}
