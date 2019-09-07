package com.controllerface.cmdr_j.classes.procurements;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Displayable;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
public class ItemCostData implements Displayable
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
        private final long max;

        private ClassifiedTrade(TradeClassification classification, ProcurementRecipe tradeRecipe, long max)
        {
            this.classification = classification;
            this.tradeRecipe = tradeRecipe;
            this.max = max;
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

        progressBar.setPadding(new Insets(8,6,0,6));

        locationContainer
                .setBackground(new Background(new BackgroundFill(Color
                        .rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));
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
        Platform.runLater(this::renderProgress);
    }

    public ProcurementCost getCost()
    {
        return cost;
    }

    public boolean matches(CostData costData)
    {
        return costData.getCost() == this.cost;
    }


    private Region generateIcon(ItemGrade grade)
    {
        final Region svgShape = new Region();
        SVGPath svg = grade.getIcon();
        svgShape.setShape(svg);

        double sizeh = 22;
        double sizew = 25;

        svgShape.setMinSize(sizew, sizeh);
        svgShape.setPrefSize(sizew, sizeh);
        svgShape.setMaxSize(sizew, sizeh);
        svgShape.setStyle("-fx-background-color: #b75200;");
        double originalWidth = svg.prefWidth(-1);
        double originalHeight = svg.prefHeight(originalWidth);

        double scaleX = sizew / originalWidth;
        double scaleY = sizeh / originalHeight;

        svg.setScaleX(scaleX);
        svg.setScaleY(scaleY);
        return svgShape;
    }



    private void renderTrades(double progress)
    {
        locationContainer.getChildren().clear();


        Label locationLabel = new Label("Relevant Locations");
        locationLabel.setTextFill(UIFunctions.Fonts.darkOrange);
        locationLabel.setFont(UIFunctions.Fonts.size2Font);

        Label locationInfo = new Label(cost.getLocationInformation());
        locationInfo.setFont(UIFunctions.Fonts.size1Font);
        locationInfo.alignmentProperty().set(Pos.CENTER_LEFT);

        locationContainer.getChildren().addAll(locationLabel, locationInfo);

        if (progress < 1.0 && cost instanceof Material)
        {
            Material costMaterial = ((Material) cost);
            Optional<ProcurementBlueprint> tradeBlueprint = costMaterial.getTradeBlueprint();

            if (tradeBlueprint.isPresent())
            {
                Separator separator = new Separator();
                separator.setPadding(new Insets(5,0,5,0));
                locationContainer.getChildren().add(separator);

                List<ClassifiedTrade> classifiedTrades = tradeBlueprint.get().recipeStream()
                        .sorted(UIFunctions.Sort.bestCostYieldRatio)
                        .map(recipe->
                        {
                            CostData tradeCost = recipe.costStream()
                                    .filter(costData -> costData.getQuantity() > 0).findAny()
                                    .orElse(null);

                            Integer committedCost = pendingTradeCost.apply(tradeCost.getCost());
                            int committed = (committedCost == null) ? 0 : committedCost;
                            int have = checkInventory.apply(tradeCost.getCost()) - committed;


                            boolean cannotAfford = recipe.costStream()
                                    .filter(costData -> costData.getQuantity() > 0)
                                    .anyMatch(costData -> checkInventory.apply(costData.getCost()) < costData.getQuantity());

                            boolean isCached = recipe.costStream()
                                    .filter(costData -> costData.getQuantity() > 0)
                                    .anyMatch(costData -> isInCache.test(costData.getCost()));

                            boolean overCommitted = !cannotAfford && recipe.costStream()
                                    .filter(costData -> costData.getQuantity() > 0)
                                    .anyMatch(costData -> committedCost != null &&
                                            (checkInventory.apply(costData.getCost()) - committed) < costData.getQuantity());

                            long max = IntStream.range(1, 100)
                                    .map(i -> i * tradeCost.getQuantity())
                                    .filter(i -> have >= i)
                                    .count();

                            TradeClassification classification;
                            if (cannotAfford) classification = TradeClassification.UNAFFORDABLE;
                            else if (isCached) classification = TradeClassification.CONFLICTING;
                            else if (overCommitted) classification = TradeClassification.COMMITTED;
                            else classification = TradeClassification.RECOMMENDED;

                            return new ClassifiedTrade(classification, recipe, max);
                        }).collect(Collectors.toList());


                Optional<ClassifiedTrade> bestTrade = classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.RECOMMENDED)
                        .sorted((a, b)->(int)(b.max - a.max))
                        .findFirst();

                if (bestTrade.isPresent())
                {
                    // move the best trade to the top of the list
                    classifiedTrades.remove(bestTrade.get());
                    classifiedTrades.add(0, bestTrade.get());
                }

                List<Button> recommendTrades = classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.RECOMMENDED)
                        .map(trade ->
                        {
                            CostData tradeCost = trade.tradeRecipe.costStream()
                                    .filter(costData -> costData.getQuantity() > 0).findAny()
                                    .orElse(null);

                            if (tradeCost == null) return null;

                            CostData tradeYield = trade.tradeRecipe.costStream()
                                    .filter(costData -> costData.getQuantity() <= 0).findAny()
                                    .orElse(null);

                            if (tradeYield == null) return null;


                            Optional<MaterialTradeType> tradeType =
                                    MaterialTradeType.findMatchingTradeType(((Material) tradeCost.getCost()));

                            if (tradeType.isPresent())
                            {
                                Region from = generateIcon(tradeCost.getCost().getGrade());
                                Region to = generateIcon(tradeYield.getCost().getGrade());

                                Label toLabel = new Label(" to ");
                                toLabel.setFont(UIFunctions.Fonts.size1Font);
                                HBox convBox = new HBox(from, toLabel, to);

                                ProcurementTask tradeTask = new ProcurementTask(tradeType.get(), trade.tradeRecipe);

                                VBox btnhldr = new VBox();
                                HBox btnlbl = new HBox();

                                Label desc = new Label();
                                desc.setFont(UIFunctions.Fonts.size1Font);
                                desc.alignmentProperty().setValue(Pos.CENTER_LEFT);

                                Integer committedCost = pendingTradeCost.apply(tradeCost.getCost());
                                int committed = (committedCost == null) ? 0 : committedCost;
                                int have = checkInventory.apply(tradeCost.getCost()) - committed;

                                String x = tradeCost.getQuantity()
                                        + " for "
                                        + Math.abs(tradeYield.getQuantity())
                                        + " :: "
                                        + trade.tradeRecipe.getShortLabel()
                                        + " (" + have + ")";

                                desc.setText(x);

                                long max = IntStream.range(1, 100)
                                        .map(i -> i * tradeCost.getQuantity())
                                        .filter(i -> have >= i)
                                        .count();

                                Label desc3 = new Label("  (" + String.format("%02d", max) + ")");
                                desc3.setFont(UIFunctions.Fonts.size1Font);
                                desc3.alignmentProperty().setValue(Pos.CENTER);

                                Region region1 = new Region();
                                HBox.setHgrow(region1, Priority.ALWAYS);
                                Region region2 = new Region();
                                HBox.setHgrow(region2, Priority.ALWAYS);

                                btnlbl.getChildren().add(desc);
                                btnlbl.getChildren().add(region1);
                                btnlbl.getChildren().add(convBox);
                                btnlbl.getChildren().add(desc3);
                                btnhldr.getChildren().add(btnlbl);

                                Button button = new Button();
                                button.setGraphic(btnhldr);
                                button.setOnMouseClicked((e)-> addTask.accept(tradeTask));
                                return button;
                            }
                            return null;
                        })
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());

                List<Label> insufficientTrades = classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.UNAFFORDABLE)
                        .map(trade ->
                        {
                            Label label = new Label(trade.tradeRecipe.getShortLabel());
                            label.setFont(UIFunctions.Fonts.size1Font);
                            label.setTextFill(UIFunctions.Fonts.negativeRed);
                            return label;
                        })
                        .collect(Collectors.toList());

                List<Label> avoidedTrades = classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.CONFLICTING)
                        .map(trade ->
                        {
                            Label label = new Label(trade.tradeRecipe.getShortLabel());
                            label.setFont(UIFunctions.Fonts.size1Font);
                            label.setTextFill(UIFunctions.Fonts.darkOrange);
                            return label;
                        })
                        .collect(Collectors.toList());

                List<Label> overCommittedTrades = classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.COMMITTED)
                        .map(trade ->
                        {
                            Label label = new Label(trade.tradeRecipe.getShortLabel());
                            label.setFont(UIFunctions.Fonts.size1Font);
                            label.setTextFill(UIFunctions.Fonts.darkYellow);
                            return label;
                        })
                        .collect(Collectors.toList());



                if (recommendTrades.isEmpty())
                {
                    recommendedTradesExpanded.set(false);
                    Label noTrades = new Label("No Available Trades");
                    noTrades.setTextFill(UIFunctions.Fonts.darkOrange);
                    noTrades.setFont(UIFunctions.Fonts.size2Font);
                    locationContainer.getChildren().add(noTrades);
                }
                else
                {
                    VBox tradeBox = new VBox();

                    Button topTrade = recommendTrades.remove(0);
                    Label topLabel = new Label("Top Trade");
                    topLabel.setTextFill(UIFunctions.Fonts.darkOrange);
                    topLabel.setFont(UIFunctions.Fonts.size2Font);
                    Separator sep = new Separator();
                    sep.setPadding(new Insets(5,0,5,0));
                    tradeBox.getChildren().add(sep);
                    topTrade.prefWidthProperty().bind(locationContainer.widthProperty());
                    locationContainer.getChildren().addAll(topLabel, topTrade, sep);

                    Label tradesLabel = new Label("Other Trades");
                    tradesLabel.setTextFill(UIFunctions.Fonts.darkOrange);
                    tradesLabel.setFont(UIFunctions.Fonts.size2Font);
                    locationContainer.getChildren().add(tradesLabel);


                    if (!recommendTrades.isEmpty())
                    {
                        Label tradeLabel = new Label("Available Trades");
                        tradeLabel.setFont(UIFunctions.Fonts.size1Font);
                        TitledPane tradePane = new TitledPane();
                        tradePane.setAnimated(false);
                        tradePane.setExpanded(recommendedTradesExpanded.get());
                        tradePane.setGraphic(tradeLabel);
                        tradePane.expandedProperty()
                                .addListener((observable, oldValue, newValue) -> recommendedTradesExpanded.set(newValue));

                        tradeBox.fillWidthProperty().setValue(true);

                        recommendTrades.stream()
                                .peek(trade->trade.prefWidthProperty().bind(tradeBox.widthProperty()))
                                .forEach(trade->tradeBox.getChildren().add(trade));

                        tradePane.setContent(tradeBox);
                        locationContainer.getChildren().add(tradePane);
                    }
                }

                if (avoidedTrades.isEmpty() && insufficientTrades.isEmpty() && overCommittedTrades.isEmpty())
                {
                    otherTradesExpanded.set(false);
                }
                else
                {
                    String labelText = "Unavailable Trades";
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
                progressBar.setStyle("-fx-accent: #ff7100");
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
        costLabel.paddingProperty().set(new Insets(2,0,2,0));

        renderProgress();

        hbox.getChildren().add(costLabel);

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

    public ProgressBar getProgressBar()
    {
        return progressBar;
    }
}
