package com.controllerface.cmdr_j.classes.procurements;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.MaterialTradeRecipe;
import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.enums.costs.special.AnyCost;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyType;
import com.controllerface.cmdr_j.enums.engineers.Engineer;
import com.controllerface.cmdr_j.ui.Displayable;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.application.Platform;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.util.Pair;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
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
public class ProcurementTaskData implements Displayable
{
    private final AtomicLong count;
    private final SimpleLongProperty countDisplay = new SimpleLongProperty();

    // main graphic node that contains the visible contents
    private final VBox descriptionContainer = new VBox();

    private final VBox costEffectContainer = new VBox();

    // objects with content that may change
    private final Label nameLabel = new Label();
    private final ProgressBar progressBar = new ProgressBar();

    private long lastCount = -1;
    private long lastTotal = -1;
    private long lastMissing = -1;
    private double lastProgress = -1;

    private final ProcurementType type;
    private final ProcurementRecipe recipe;

    private final AtomicBoolean initialRenderComplete = new AtomicBoolean(false);

    private final Function<ProcurementCost, Long> checkInventory;
    private final Function<ProcurementCost, Integer> pendingTradeYield;
    private final BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> inventoryUpdate;

    private final Supplier<StarSystem> getCurrentSystem;

    private final List<Engineer> engineers;

    private final HBox spinner;


    private ProcurementTaskData(Builder builder)
    {
        this.count = new AtomicLong(builder.count);
        countDisplay.set(this.count.get());
        this.type = builder.type;
        this.recipe = builder.recipe;
        this.checkInventory = builder.checkInventory;
        this.pendingTradeYield = builder.pendingTradeYield;
        this.inventoryUpdate = builder.inventoryUpdate;
        this.getCurrentSystem = builder.getCurrentSystem;
        this.engineers = Engineer.findSupportedEngineers(type, recipe.getGrade());

        //progressBar.setPadding(new Insets(8,6,0,6));

        costEffectContainer
                .setBackground(new Background(new BackgroundFill(Color
                        .rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));

        this.spinner = makeSpinner();
    }

    @Override
    public String toString()
    {
        return type.toString() + " : " + recipe.toString() + "\n" +
                recipe.costStream()
                        .map(c-> " - " + c.getCost().getLocalizedName())
                        .collect(Collectors.joining("\n"));
    }


    private HBox makeSpinner()
    {
        Label countLabel = new Label();

        Button subtractButton = new Button("-");
        Button addButton = new Button("+");

        // Plus
        Line line1 = new Line();
        line1.setStroke(Color.BLACK);
        line1.setStrokeWidth(3);
        line1.setStartX(-3);
        line1.setEndX(7);
        line1.setStartY(12);
        line1.setEndY(12);

        Line line2 = new Line();
        line2.setStroke(Color.BLACK);
        line2.setStrokeWidth(3);
        line2.setStartX(2);
        line2.setEndX(2);
        line2.setStartY(7);
        line2.setEndY(17);

        // Minus
        Line line3 = new Line();
        line3.setStroke(Color.BLACK);
        line3.setStrokeWidth(3);
        line3.setStartX(-3);
        line3.setEndX(7);
        line3.setStartY(12);
        line3.setEndY(12);

        Pane addGraphic  = new Pane(line1, line2);
        Pane subGraphic  = new Pane(line3);

        addGraphic.setPrefHeight(23);
        subGraphic.setPrefHeight(23);

        addButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        addButton.setAlignment(Pos.CENTER);
        subtractButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        subtractButton.setAlignment(Pos.CENTER);

        addButton.setGraphic(addGraphic);
        subtractButton.setGraphic(subGraphic);

        countLabel.textProperty().bind(countDisplay.asString());
        countLabel.setPrefWidth(54);
        countLabel.setMaxWidth(54);
        countLabel.setMinWidth(54);
        countLabel.setAlignment(Pos.CENTER);
        countLabel.setFont(UIFunctions.Style.size4Font);

        subtractButton.setOnAction((e) -> inventoryUpdate.accept(-1, asPair()));
        addButton.setOnAction((e) -> inventoryUpdate.accept(1, asPair()));

        return new HBox(subtractButton, countLabel, addButton);
    }

    public Node getSpinner()
    {
        return spinner;
    }

    public Pair<ProcurementType, ProcurementRecipe> asPair()
    {
        return new Pair<>(type, recipe);
    }

    public boolean isTrade()
    {
        return recipe instanceof MaterialTradeRecipe;
    }

    public long getCount()
    {
        return count.get();
    }

    public void setCount(long amount)
    {
        count.set(amount);
        Platform.runLater(this::renderProgress);
    }

    public boolean matches(Pair<ProcurementType, ProcurementRecipe> pair)
    {
        if (pair.getKey() instanceof MaterialTradeType)
        {
            boolean bothTrades = type instanceof MaterialTradeType;
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

        if (pair.getKey() instanceof TechnologyType)
        {
            // todo: handle tech broker unlock
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
        nameLabel.setFont(UIFunctions.Style.size2Font);
        nameLabel.paddingProperty().set(new Insets(2, 0, 2, 0));

        titledPane.setContent(costEffectContainer);

        renderEffects();
        HBox nameContainer = new HBox();
        nameContainer.getChildren().add(nameLabel);
        titledPane.setGraphic(nameContainer);
        ((HBox) titledPane.getGraphic()).setAlignment(Pos.CENTER);

        descriptionContainer.getChildren().add(titledPane);

        nameLabel.setText(recipePair.getKey().toString() + " :: " + recipePair.getValue().getDisplayLabel());
        nameLabel.setTextFill(UIFunctions.Style.neutralBlack);
        renderProgress();
    }

    private Pair<Double, Boolean> calculateProgress(ProcurementTaskData procurementTaskData)
    {
        AtomicBoolean usesTrade = new AtomicBoolean(false);

        // get the number of "rolls" required for this task
        long count = procurementTaskData.getCount();

        AtomicLong accumulatedTotal = new AtomicLong(0);

        long missing = procurementTaskData.asPair().getValue().costStream()
                .filter(c->c.getQuantity() > 0)
                .mapToLong(cost->
                {
                    long banked = checkInventory.apply(cost.getCost());

                    long calculatedCost = (cost.getQuantity() * count);

                    accumulatedTotal.addAndGet(calculatedCost);

                    long surplus = banked - calculatedCost;

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
        countDisplay.set(count.get());

        Pair<Double, Boolean> progressData = calculateProgress(this);

        boolean anyTrades = pendingTradeYield.apply(AnyCost.ANY_COST) > 0;

        boolean usesTrade = progressData.getValue();
        boolean hasEnough = progressData.getKey() >= 1.0;
        progressBar.setProgress(progressData.getKey());

        if (usesTrade)
        {
            if (hasEnough) { progressBar.setStyle("-fx-accent: #ff7100"); }
            else progressBar.setStyle("-fx-accent: #ffaaaa");
        }
        else
        {
            if (hasEnough) { progressBar.setStyle("-fx-accent: #00b3f7"); }
            else progressBar.setStyle("-fx-accent: #ff0000 ");
        }
        progressBar.applyCss();

        renderEffects();
    }

    private void renderEffects()
    {
        costEffectContainer.getChildren().clear();


        // effects
        recipe.effects().effectStream()
                .map(UIFunctions.Convert.effectToLabel)
                .sorted(UIFunctions.Sort.byGoodness)
                .forEach(label -> costEffectContainer.getChildren().add(label));

        if (recipe.effects() != ItemEffects.EMPTY)
        {
            Separator separator = new Separator();
            separator.setPrefHeight(10);
            costEffectContainer.getChildren().add(separator);
        }


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
                    next.setFont(UIFunctions.Style.size1Font);
                    next.setTextFill(hasEnough ? UIFunctions.Style.neutralBlack : UIFunctions.Style.negativeRed);
                    return next;
                })
                .forEach(label -> costEffectContainer.getChildren().add(label));


        if (!engineers.isEmpty())
        {
            Separator separator2 = new Separator();
            separator2.setPrefHeight(10);
            costEffectContainer.getChildren().add(separator2);

            for (Engineer engineer : engineers)
            {
                StarSystem currentSystem = getCurrentSystem.get();
                double distance = currentSystem==null ? 0.0 : currentSystem.distanceBetween(engineer.getLocation());
                Label engineerLabel = new Label(engineer.getFullName() + " :: "
                        + engineer.getLocation().getSystemName() + " (" + distance + " Ly)");
                Tooltip locationTip = new Tooltip(engineer.getFullName() + " is " + distance +
                        " light years from your current location ("+(currentSystem==null?"nowhere":currentSystem.getSystemName())+")");
                locationTip.setFont(UIFunctions.Style.size1Font);
                engineerLabel.setTooltip(locationTip);
                engineerLabel.setFont(UIFunctions.Style.size1Font);
                engineerLabel.setTextFill(UIFunctions.Style.darkOrange);
                costEffectContainer.getChildren().add(engineerLabel);
            }

        }

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

    public ProgressBar getProgressBar()
    {
        return progressBar;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) return true;
        if (obj instanceof ProcurementTaskData)
        {
            ProcurementTaskData other = ((ProcurementTaskData) obj);
            boolean item = recipe.equals(other.recipe);
            boolean count = this.count.get() == other.count.get();
            return item && count;
        }
        else return false;
    }

    public static class Builder
    {

        private final int count;
        private ProcurementType type;
        private ProcurementRecipe recipe;
        private Function<ProcurementCost, Long> checkInventory;
        private Function<ProcurementCost, Integer> pendingTradeYield;
        private BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> inventoryUpdate;
        private Supplier<StarSystem> getCurrentSystem;

        public Builder(int count)
        {
            this.count = count;
        }

        public Builder setType(ProcurementType type)
        {
            this.type = type;
            return this;
        }

        public Builder setRecipe(ProcurementRecipe recipe)
        {
            this.recipe = recipe;
            return this;
        }

//        public Builder setCount(int count)
//        {
//            this.count = count;
//            return this;
//        }

        public Builder setCheckInventory(Function<ProcurementCost, Long> checkInventory)
        {
            this.checkInventory = checkInventory;
            return this;
        }

        public Builder setPendingTradeYield(Function<ProcurementCost, Integer> pendingTradeYield)
        {
            this.pendingTradeYield = pendingTradeYield;
            return this;
        }

        public Builder setInventoryUpdate(BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> inventoryUpdate)
        {
            this.inventoryUpdate = inventoryUpdate;
            return this;
        }

        public Builder setGetCurrentSystem(Supplier<StarSystem> getCurrentSystem)
        {
            this.getCurrentSystem = getCurrentSystem;
            return this;
        }

        public ProcurementTaskData createProcurementTaskData()
        {
            return new ProcurementTaskData(this);
        }
    }
}
