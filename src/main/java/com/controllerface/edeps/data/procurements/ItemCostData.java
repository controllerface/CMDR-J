package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.ProcurementBlueprint;
import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialTradeType;
import com.controllerface.edeps.structures.costs.materials.MaterialType;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Represents a single item type and count of that type, required to craft some specific craftable item. Objects of
 * this type are intended to represent a variable cost, typically in cases where the base item itself has some variable
 * count. As such, the internal count number is adjustable to reflect the fact that the desired number of a given item
 * has changed. For example, say crafting an ammo refill costs 2 sulphur, and the user has selected a task to craft 10
 * of these refills. The cost member would be set to "sulphur" and the count would be set to 20 (2 sulphur, x 10
 * refills). Then if the user decides they need 20 of these refills, they would use some UI control to increase the
 * count to 20, which in turn would call setNeed(20) to update this object with the new count.
 *
 * Created by Controllerface on 4/2/2018.
 */
public class ItemCostData
{
    private final ProcurementCost cost;
    private final AtomicInteger count = new AtomicInteger(0);

    private final Function<ProcurementCost, Integer> checkInventory;
    private final Predicate<ProcurementCost> isInCache;
    private final Function<ProcurementCost, Integer> pendingTradeYield;
    private final Function<ProcurementCost, Integer> pendingTradeCost;
    private final Consumer<ProcurementTask> addTask;

    private final VBox descriptionContainer = new VBox();
    private final VBox locationContainer = new VBox();
    private final ProgressBar progressBar = new ProgressBar();

    private final AtomicBoolean initialRenderComplete = new AtomicBoolean(false);

    private final AtomicBoolean recommendedTradesExpanded = new AtomicBoolean(false);
    private final AtomicBoolean otherTradesExpanded = new AtomicBoolean(false);

    private enum TradeClassification
    {
        UNAFFORDABLE,
        CONFLICTING,
        COMMITTED,
        RECOMMENDED
    }

    private static class ClassifiedTrade
    {
        private final TradeClassification classification;
        private final ProcurementRecipe tradeRecipe;

        private ClassifiedTrade(TradeClassification classification, ProcurementRecipe tradeRecipe)
        {
            this.classification = classification;
            this.tradeRecipe = tradeRecipe;
        }
    }


    public ItemCostData(ProcurementCost cost,
                        Function<ProcurementCost, Integer> checkInventory,
                        Predicate<ProcurementCost> isInCache,
                        Function<ProcurementCost, Integer> pendingTradeYield,
                        Function<ProcurementCost, Integer> pendingTradeCost,
                        Consumer<ProcurementTask> addTask)
    {
        this.cost = cost;
        this.checkInventory = checkInventory;
        this.isInCache = isInCache;
        this.pendingTradeYield = pendingTradeYield;
        this.pendingTradeCost = pendingTradeCost;
        this.addTask = addTask;

        locationContainer
                .setBackground(new Background(new BackgroundFill(Color
                        .rgb(0xDD, 0xDD, 0xDD), CornerRadii.EMPTY, Insets.EMPTY)));
    }

    @Override
    public String toString()
    {
        return cost.getLocalizedName();
    }

    public int getHave()
    {
        return checkInventory.apply(cost);
    }

    public int getNeed()
    {
        return count.get();
    }

    public void setNeed(int count)
    {
        this.count.set(count);
        renderProgress();
    }

    public ProcurementCost getCost()
    {
        return cost;
    }

    public boolean matches(CostData costData)
    {
        return costData.getCost() == this.cost;
    }

    private void renderTrades(double progress)
    {
        locationContainer.getChildren().clear();
        Label locationLabel = new Label(cost.getGrade() + "\n" + cost.getLocationInformation());
        locationLabel.setFont(UIFunctions.Fonts.size1Font);
        locationLabel.alignmentProperty().set(Pos.CENTER_LEFT);
        locationContainer.getChildren().add(locationLabel);

        if (progress < 1.0 && cost instanceof Material)
        {
            Material costMaterial = ((Material) cost);
            Optional<ProcurementBlueprint> tradeBlueprint = costMaterial.getTradeBlueprint();

            if (tradeBlueprint.isPresent())
            {
                List<Button> recommendTrades = new ArrayList<>();
                List<Label> avoidedTrades = new ArrayList<>();
                List<Label> insufficientTrades = new ArrayList<>();
                List<Label> overCommittedTrades = new ArrayList<>();

                Separator separator = new Separator();
                separator.setPadding(new Insets(5,0,0,0));
                locationContainer.getChildren().add(separator);

                List<ClassifiedTrade> classifiedTrades = tradeBlueprint.get().recipeStream()
                        .sorted(UIFunctions.Sort.bestCostYieldRatio)
                        .map(recipe->
                        {
                            boolean cannotAfford = recipe.costStream()
                                    .filter(costData -> costData.getQuantity() > 0)
                                    .anyMatch(costData -> checkInventory.apply(costData.getCost()) < costData.getQuantity());

                            boolean isCached = recipe.costStream()
                                    .filter(costData -> costData.getQuantity() > 0)
                                    .anyMatch(costData -> isInCache.test(costData.getCost()));

                            boolean overCommitted = !cannotAfford && recipe.costStream()
                                    .filter(costData -> costData.getQuantity() > 0)
                                    .anyMatch(costData ->
                                    {
                                        Integer committedCost = pendingTradeCost.apply(costData.getCost());
                                        if (committedCost == null) return false;
                                        return (checkInventory.apply(costData.getCost()) - committedCost) < costData.getQuantity();
                                    });

                            TradeClassification classification;
                            if (cannotAfford) classification = TradeClassification.UNAFFORDABLE;
                            else if (isCached) classification = TradeClassification.CONFLICTING;
                            else if (overCommitted) classification = TradeClassification.COMMITTED;
                            else classification = TradeClassification.RECOMMENDED;

                            return new ClassifiedTrade(classification, recipe);
                        }).collect(Collectors.toList());


                classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.RECOMMENDED)
                        .map(trade ->
                        {
                            CostData tradeCost = trade.tradeRecipe.costStream()
                                    .filter(costData -> costData.getQuantity()>0).findAny()
                                    .orElse(null);

                            // todo: report error
                            if (tradeCost == null) return null;

                            Optional<MaterialTradeType> tradeType =
                                    MaterialTradeType.findMatchingTradeType(((Material) tradeCost.getCost()));

                            if (tradeType.isPresent())
                            {
                                ProcurementTask tradeTask = new ProcurementTask(tradeType.get(), trade.tradeRecipe);
                                Button button = new Button(trade.tradeRecipe.getDisplayLabel());
                                button.setFont(UIFunctions.Fonts.size1Font);
                                button.alignmentProperty().setValue(Pos.CENTER_LEFT);
                                button.setOnMouseClicked((e)-> addTask.accept(tradeTask));
                                return button;
                            }
                            return null;
                        })
                        .filter(Objects::nonNull)
                        .forEach(recommendTrades::add);

                classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.UNAFFORDABLE)
                        .map(trade ->
                        {
                            Label label = new Label(trade.tradeRecipe.getDisplayLabel());
                            label.setFont(UIFunctions.Fonts.size1Font);
                            label.setTextFill(UIFunctions.Fonts.negativeRed);
                            return label;
                        })
                        .forEach(insufficientTrades::add);

                classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.CONFLICTING)
                        .map(trade ->
                        {
                            Label label = new Label(trade.tradeRecipe.getDisplayLabel());
                            label.setFont(UIFunctions.Fonts.size1Font);
                            label.setTextFill(UIFunctions.Fonts.darkOrange);
                            return label;
                        })
                        .forEach(avoidedTrades::add);

                classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.COMMITTED)
                        .map(trade ->
                        {
                            Label label = new Label(trade.tradeRecipe.getDisplayLabel());
                            label.setFont(UIFunctions.Fonts.size1Font);
                            label.setTextFill(UIFunctions.Fonts.darkYellow);
                            return label;
                        })
                        .forEach(overCommittedTrades::add);


                if (recommendTrades.isEmpty())
                {
                    recommendedTradesExpanded.set(false);
                    Label noTrades = new Label("No Recommended Trades");
                    noTrades.setFont(UIFunctions.Fonts.size1Font);
                    locationContainer.getChildren().add(noTrades);
                }
                else
                {
                    Label tradeLabel = new Label("Recommended Trades");
                    tradeLabel.setFont(UIFunctions.Fonts.size1Font);
                    TitledPane tradePane = new TitledPane();
                    Tooltip tooltip = new Tooltip("Recommended trades, ranked by best cost/yield ratio");
                    tooltip.setFont(UIFunctions.Fonts.size1Font);
                    tradeLabel.setTooltip(tooltip);
                    tradePane.setAnimated(false);
                    tradePane.setExpanded(recommendedTradesExpanded.get());
                    tradePane.setGraphic(tradeLabel);
                    tradePane.expandedProperty()
                            .addListener((observable, oldValue, newValue) -> recommendedTradesExpanded.set(newValue));
                    VBox vBox = new VBox();
                    vBox.fillWidthProperty().setValue(true);
                    recommendTrades.stream()
                            .peek(trade->trade.prefWidthProperty().bind(vBox.widthProperty()))
                            .forEach(trade->vBox.getChildren().add(trade));
                    tradePane.setContent(vBox);
                    locationContainer.getChildren().add(tradePane);
                }

                if (avoidedTrades.isEmpty() && insufficientTrades.isEmpty() && overCommittedTrades.isEmpty())
                {
                    otherTradesExpanded.set(false);
                }
                else
                {
                    String labelText = recommendTrades.isEmpty() ? "Possible Trades" : "Other Trades";
                    Label tradeLabel = new Label(labelText);
                    tradeLabel.setFont(UIFunctions.Fonts.size1Font);
                    TitledPane tradePane = new TitledPane();
                    Tooltip tooltip = new Tooltip("Trades which are not optimal or for witch you\n have insufficient materials to complete the trade");
                    tooltip.setFont(UIFunctions.Fonts.size1Font);
                    tradeLabel.setTooltip(tooltip);
                    tradePane.setAnimated(false);
                    tradePane.setExpanded(otherTradesExpanded.get());
                    tradePane.setGraphic(tradeLabel);
                    tradePane.expandedProperty()
                            .addListener((observable, oldValue, newValue) -> otherTradesExpanded.set(newValue));
                    VBox vBox = new VBox();
                    if (!overCommittedTrades.isEmpty())
                    {
                        Label committedLabel = new Label("Committed to Other Trades");
                        committedLabel.setFont(UIFunctions.Fonts.size1Font);
                        vBox.getChildren().add(committedLabel);
                        overCommittedTrades.forEach(trade -> vBox.getChildren().add(trade));
                    }
                    if (!avoidedTrades.isEmpty())
                    {
                        Label avoidLabel = new Label("Conflicts with Ongoing Tasks");
                        avoidLabel.setFont(UIFunctions.Fonts.size1Font);
                        vBox.getChildren().add(avoidLabel);
                        avoidedTrades.forEach(trade -> vBox.getChildren().add(trade));
                    }
                    if (!insufficientTrades.isEmpty())
                    {
                        Label insufficientLabel = new Label("Insufficient Materials");
                        insufficientLabel.setFont(UIFunctions.Fonts.size1Font);
                        vBox.getChildren().add(insufficientLabel);
                        insufficientTrades.forEach(trade->vBox.getChildren().add(trade));
                    }

                    tradePane.setContent(vBox);
                    locationContainer.getChildren().add(tradePane);
                }
            }
        }
    }

    private void renderProgress()
    {
        double progress = ((double) getHave()) / ((double) getNeed());

        progressBar.setProgress(progress);

        if (progress >= 1.0)
        {
            progressBar.setStyle("-fx-accent: #00b3f7");
        }
        else
        {
            Integer pending = pendingTradeYield.apply(cost);
            double adjustedProgress = progress;

            if (pending != null)
            {
                adjustedProgress = ((double) getHave() + pending) / ((double) getNeed());
            }
            progressBar.setProgress(adjustedProgress);

            if (adjustedProgress >= 1.0)
            {
                progressBar.setStyle("-fx-accent: #d9b3ff");
            }
            else
            {
                if (pending == null) progressBar.setStyle("-fx-accent: #ff0000");
                else progressBar.setStyle("-fx-accent: #ffaaaa");

            }
        }

        renderTrades(progress);
    }

    private void render()
    {
        descriptionContainer.setAlignment(Pos.CENTER);

        TitledPane titledPane = new TitledPane();
        titledPane.setAnimated(false);
        titledPane.setExpanded(false);

        HBox hbox = new HBox();

        String type;
        if (cost instanceof Material)
        {
            Optional<MaterialType> matchingType = MaterialType.findMatchingType(((Material) cost));

            if (matchingType.isPresent())
            {
                type = matchingType.get().toString();
                type = type.substring(0,1).concat(type.substring(1, type.length()).toLowerCase());
            }
            else type = "(Unknown Material) " + cost;
        }

        else if (cost instanceof Commodity) type = Commodity.class.getSimpleName();
        else type = "Unknown";

        Label costLabel = new Label(type + " :: "  + cost.getLocalizedName()) ;
        costLabel.setPrefHeight(20);
        costLabel.setFont(UIFunctions.Fonts.size2Font);
        costLabel.paddingProperty().set(new Insets(2,5,2,5));

        renderProgress();

        progressBar.setOnMouseClicked((e)->titledPane.setExpanded(!titledPane.isExpanded()));
        hbox.getChildren().addAll(progressBar, costLabel);

        HBox labelBox = new HBox();
        labelBox.alignmentProperty().set(Pos.CENTER);


        titledPane.setContent(locationContainer);
        titledPane.alignmentProperty().set(Pos.CENTER_LEFT);

        titledPane.setGraphic(hbox);
        hbox.setAlignment(Pos.CENTER);

        descriptionContainer.getChildren().add(titledPane);
    }

    public void prepareGraphic()
    {
        if (!initialRenderComplete.getAndSet(true))
        {
            render();
        }
        // because the progress of the cost data depends on external factors, we always need to make sure
        // it is updated whenever the containing table is refreshed
        else renderProgress();
    }

    public Node getGraphic()
    {
        return descriptionContainer;
    }
}
