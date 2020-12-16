package com.controllerface.cmdr_j.ui;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.tasks.Task;
import com.controllerface.cmdr_j.classes.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialType;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Displayable;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.SVGPath;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
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
public class ItemCostDisplay implements Displayable
{
    private final TaskCost cost;
    private final AtomicLong count = new AtomicLong(0);

    private final Function<TaskCost, Long> checkInventory;
    private final Predicate<TaskCost> isInCache;
    private final Function<TaskCost, Set<String>> getCachedLabels;
    private final Function<TaskCost, Integer> pendingTradeYield;
    private final Function<TaskCost, Integer> pendingTradeCost;
    private final Consumer<Task> addTask;

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
        private final TaskRecipe tradeRecipe;
        private final long max;

        private ClassifiedTrade(TradeClassification classification, TaskRecipe tradeRecipe, long max)
        {
            this.classification = classification;
            this.tradeRecipe = tradeRecipe;
            this.max = max;
        }
    }


    public ItemCostDisplay(TaskCost cost,
                           Function<TaskCost, Long> checkInventory,
                           Predicate<TaskCost> isInCache,
                           Function<TaskCost, Set<String>> getCachedLabels,
                           Function<TaskCost, Integer> pendingTradeYield,
                           Function<TaskCost, Integer> pendingTradeCost,
                           Consumer<Task> addTask)
    {
        this.cost = cost;
        this.checkInventory = checkInventory;
        this.isInCache = isInCache;
        this.getCachedLabels = getCachedLabels;
        this.pendingTradeYield = pendingTradeYield;
        this.pendingTradeCost = pendingTradeCost;
        this.addTask = addTask;

        progressBar.setPadding(new Insets(5,6,0,0));

        locationContainer.getStyleClass().addAll("information_panel");
    }

    @Override
    public String toString()
    {
        return cost.getLocalizedName();
    }

    public long getHave()
    {
        return checkInventory.apply(cost);
    }

    public long getNeed()
    {
        return count.get();
    }

    public void setNeed(long count)
    {
        this.count.set(count);
        Platform.runLater(this::renderProgress);
    }

    public TaskCost getCost()
    {
        return cost;
    }

    public boolean matches(CostData costData)
    {
        return costData.cost == this.cost;
    }


    private Region generateIcon(ItemGrade grade)
    {
        final Region svgShape = new Region();
        SVGPath svg = grade.getIcon().getIconPath();
        svgShape.setShape(svg);

        double sizeh = grade.getIcon().getBaseHeight();
        double sizew = grade.getIcon().getBaseWidth();

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

        Set<String> cachedLabels = getCachedLabels.apply(cost);

        if (cachedLabels != null)
        {
            Label commitLabel = new Label("Committed Tasks");
            //commitLabel.setTextFill(UIFunctions.Style.darkOrange);
            commitLabel.getStyleClass().addAll("inventory_label", "base_font");

            Label commitInfo = new Label(String.join("\n", cachedLabels));
            commitInfo.getStyleClass().addAll("light_color_label", "base_font");
            commitInfo.alignmentProperty().set(Pos.CENTER_LEFT);

            Separator separator1 = new Separator();
            separator1.setPadding(new Insets(5,0,5,0));

            locationContainer.getChildren().addAll(commitLabel, commitInfo, separator1);
        }

        Label locationLabel = new Label("Relevant Locations");
        //locationLabel.setTextFill(UIFunctions.Style.darkOrange);
        locationLabel.getStyleClass().addAll("inventory_label", "base_font");

        Label locationInfo = new Label(cost.getLocationInformation());
        locationInfo.getStyleClass().addAll("light_color_label", "base_font");
        locationInfo.alignmentProperty().set(Pos.CENTER_LEFT);

        locationContainer.getChildren().addAll(locationLabel, locationInfo);

        if (progress < 1.0 && cost instanceof Material)
        {
            Material costMaterial = ((Material) cost);
            Optional<TaskBlueprint> tradeBlueprint = costMaterial.getTradeBlueprint();

            if (tradeBlueprint.isPresent())
            {
                Separator tradeSeparator = new Separator();
                tradeSeparator.setPadding(new Insets(5,0,5,0));
                locationContainer.getChildren().add(tradeSeparator);

                List<ClassifiedTrade> classifiedTrades = tradeBlueprint.get().recipeStream()
                        .sorted(UIFunctions.Sort.bestCostYieldRatio)
                        .map(recipe->
                        {
                            CostData tradeCost = recipe.costStream()
                                    .filter(costData -> costData.quantity > 0).findAny()
                                    .orElse(null);

                            Integer committedCost = pendingTradeCost.apply(tradeCost.cost);
                            int committed = (committedCost == null) ? 0 : committedCost;
                            long have = checkInventory.apply(tradeCost.cost) - committed;


                            boolean cannotAfford = recipe.costStream()
                                    .filter(costData -> costData.quantity > 0)
                                    .anyMatch(costData -> checkInventory.apply(costData.cost) < costData.quantity);

                            boolean isCached = recipe.costStream()
                                    .filter(costData -> costData.quantity > 0)
                                    .anyMatch(costData -> isInCache.test(costData.cost));

                            boolean overCommitted = !cannotAfford && recipe.costStream()
                                    .filter(costData -> costData.quantity > 0)
                                    .anyMatch(costData -> committedCost != null &&
                                            (checkInventory.apply(costData.cost) - committed) < costData.quantity);

                            long max = IntStream.range(1, 100)
                                    .mapToLong(i -> i * tradeCost.quantity)
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
                        .min((a, b) -> (int) (b.max - a.max));

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
                                    .filter(costData -> costData.quantity > 0).findAny()
                                    .orElse(null);

                            if (tradeCost == null) return null;

                            CostData tradeYield = trade.tradeRecipe.costStream()
                                    .filter(costData -> costData.quantity <= 0).findAny()
                                    .orElse(null);

                            if (tradeYield == null) return null;


                            Optional<MaterialTradeType> tradeType =
                                    MaterialTradeType.findMatchingTradeType(((Material) tradeCost.cost));

                            if (tradeType.isPresent())
                            {
                                Region from = generateIcon(tradeCost.cost.getGrade());
                                Region to = generateIcon(tradeYield.cost.getGrade());

                                Label toLabel = new Label(" to ");
                                toLabel.getStyleClass().addAll("inventory_label", "base_font");
                                HBox convBox = new HBox(from, toLabel, to);

                                Task tradeTask = new Task(tradeType.get(), trade.tradeRecipe);

                                VBox btnhldr = new VBox();
                                HBox btnlbl = new HBox();

                                Label desc = new Label();
                                desc.getStyleClass().addAll("inventory_label", "base_font");
                                desc.alignmentProperty().setValue(Pos.CENTER_LEFT);

                                Integer committedCost = pendingTradeCost.apply(tradeCost.cost);
                                int committed = (committedCost == null) ? 0 : committedCost;
                                long have = checkInventory.apply(tradeCost.cost) - committed;

                                String x = tradeCost.quantity
                                        + " for "
                                        + Math.abs(tradeYield.quantity)
                                        + " :: "
                                        + trade.tradeRecipe.getShortLabel()
                                        + " (" + have + ")";

                                desc.setText(x);

                                long max = IntStream.range(1, 100)
                                        .mapToLong(i -> i * tradeCost.quantity)
                                        .filter(i -> have >= i)
                                        .count();

                                Label desc3 = new Label("  (" + String.format("%02d", max) + ")");
                                desc3.getStyleClass().addAll("inventory_label", "base_font");
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
                                button.getStyleClass().addAll("material_trade_button");
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
                            label.getStyleClass().addAll("base_font");
                            label.setTextFill(UIFunctions.Style.negativeRed);
                            return label;
                        })
                        .collect(Collectors.toList());

                List<Label> avoidedTrades = classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.CONFLICTING)
                        .map(trade ->
                        {
                            Label label = new Label(trade.tradeRecipe.getShortLabel());
                            label.getStyleClass().addAll("base_font");
                            label.setTextFill(UIFunctions.Style.darkOrange);
                            return label;
                        })
                        .collect(Collectors.toList());

                List<Label> overCommittedTrades = classifiedTrades.stream()
                        .filter(trade -> trade.classification == TradeClassification.COMMITTED)
                        .map(trade ->
                        {
                            Label label = new Label(trade.tradeRecipe.getShortLabel());
                            label.getStyleClass().addAll("base_font");
                            label.setTextFill(UIFunctions.Style.specialYellow);
                            return label;
                        })
                        .collect(Collectors.toList());



                if (recommendTrades.isEmpty())
                {
                    recommendedTradesExpanded.set(false);
                    Label noTrades = new Label("No Available Trades");
                    noTrades.setTextFill(UIFunctions.Style.darkOrange);
                    noTrades.getStyleClass().addAll("base_font");
                    locationContainer.getChildren().add(noTrades);
                }
                else
                {
                    VBox tradeBox = new VBox();

                    Button topTrade = recommendTrades.remove(0);
                    Label topLabel = new Label("Top Trade");
                    topLabel.setTextFill(UIFunctions.Style.darkOrange);
                    topLabel.getStyleClass().addAll("base_font");
                    //Separator sep = new Separator();
                    //sep.setPadding(new Insets(5,0,-5,0));
                    //tradeBox.getChildren().add(sep);
                    topTrade.prefWidthProperty().bind(locationContainer.widthProperty());
                    topTrade.getStyleClass().addAll("material_trade_button");

                    locationContainer.getChildren().addAll(topLabel, topTrade);//, sep);

                    Label tradesLabel = new Label("Other Trades");
                    //tradesLabel.setTextFill(UIFunctions.Style.darkOrange);
                    tradesLabel.getStyleClass().addAll("information_label", "base_font");
                    locationContainer.getChildren().add(tradesLabel);


                    if (!recommendTrades.isEmpty())
                    {
                        Label tradeLabel = new Label("Available Trades");
                        tradeLabel.getStyleClass().addAll("inventory_label", "base_font");
                        TitledPane tradePane = new TitledPane();
                        tradePane.getStyleClass().addAll("information_panel", "base_font");
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
                    tradeLabel.getStyleClass().addAll("inventory_label", "base_font");
                    TitledPane tradePane = new TitledPane();
                    tradePane.getStyleClass().addAll("information_panel","base_font");
                    Tooltip tooltip = new Tooltip("Trades which are not optimal or for which you\n have insufficient materials to complete the trade");
                    tooltip.getStyleClass().addAll("base_font");
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
                        committedLabel.getStyleClass().addAll("light_color_label", "base_font");
                        vBox.getChildren().add(committedLabel);
                        overCommittedTrades.forEach(trade -> vBox.getChildren().add(trade));
                    }
                    if (!avoidedTrades.isEmpty())
                    {
                        Label avoidLabel = new Label("Conflicts with Ongoing Tasks");
                        avoidLabel.getStyleClass().addAll("light_color_label", "base_font");
                        vBox.getChildren().add(avoidLabel);
                        avoidedTrades.forEach(trade -> vBox.getChildren().add(trade));
                    }
                    if (!insufficientTrades.isEmpty())
                    {
                        Label insufficientLabel = new Label("Insufficient Materials");
                        insufficientLabel.getStyleClass().addAll("light_color_label", "base_font");
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
        descriptionContainer.setAlignment(Pos.TOP_CENTER);

        TitledPane titledPane = new TitledPane();
        titledPane.getStyleClass().addAll("general_panel", "base_font");
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
                type = type.substring(0,1).concat(type.substring(1).toLowerCase());
            }
            else type = "(Unknown Material) " + cost;
        }

        else if (cost instanceof Commodity) type = Commodity.class.getSimpleName();
        else if (cost instanceof CreditCost) type = "Currency";
        else type = "Unknown";

        Label costLabel = new Label(type + " :: "  + cost.getLocalizedName()) ;
        costLabel.setPrefHeight(20);
        costLabel.getStyleClass().addAll("inventory_label", "base_font");
        costLabel.paddingProperty().set(new Insets(2,0,2,0));

        renderProgress();

        hbox.getChildren().add(costLabel);

        HBox labelBox = new HBox();
        labelBox.alignmentProperty().set(Pos.TOP_CENTER);


        titledPane.setContent(locationContainer);
        titledPane.alignmentProperty().set(Pos.CENTER_LEFT);

        titledPane.setGraphic(hbox);
        hbox.setAlignment(Pos.TOP_CENTER);

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