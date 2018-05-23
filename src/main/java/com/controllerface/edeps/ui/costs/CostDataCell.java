package com.controllerface.edeps.ui.costs;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.data.procurements.ProcurementTaskData;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialTradeType;
import com.controllerface.edeps.structures.costs.materials.MaterialType;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Controllerface on 4/26/2018.
 */
public class CostDataCell extends TableCell<ItemCostData, ItemCostData>
{
    private static double baseFontSize = -1;
    private static String baseFontFamily = null;
    private final Function<ProcurementCost, Integer> checkInventory;
    private final Predicate<ProcurementCost> isInCache;
    private final Function<ProcurementCost, Integer> pendingTradeYield;
    private final Consumer<ProcurementTaskData> addtask;

    private static final Comparator<ProcurementRecipe> bestCostYieldRatio =
            (a, b)->
            {
                int aCost = a.costStream().filter(c -> c.getQuantity() > 0)
                        .mapToInt(CostData::getQuantity).sum();

                int bCost = b.costStream().filter(c -> c.getQuantity() > 0)
                        .mapToInt(CostData::getQuantity).sum();

                int aYield = a.costStream().filter(c -> c.getQuantity() < 0)
                        .mapToInt(CostData::getQuantity)
                        .map(Math::abs)
                        .sum();

                int bYield = b.costStream().filter(c -> c.getQuantity() < 0)
                        .mapToInt(CostData::getQuantity)
                        .map(Math::abs)
                        .sum();

                if (aCost == bCost) return bYield - aYield;

                return aCost - bCost;
            };

    public CostDataCell(Consumer<ProcurementTaskData> addtask,
                        Function<ProcurementCost, Integer> checkInventory,
                        Predicate<ProcurementCost> isInCache,
                        Function<ProcurementCost, Integer> pendingTradeYield)
    {
        this.addtask = addtask;
        this.checkInventory = checkInventory;
        this.isInCache = isInCache;
        this.pendingTradeYield = pendingTradeYield;
    }

    @Override
    protected void updateItem(ItemCostData item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            super.setText(null);
            super.setGraphic(null);
        }
        else
        {
            VBox descriptionContainer = new VBox();
            descriptionContainer.setAlignment(Pos.CENTER);

            TitledPane titledPane = new TitledPane();
            titledPane.setAnimated(false);
            titledPane.setExpanded(false);

            HBox hbox = new HBox();

            ProcurementCost cost = item.getCost();
            String type;
            if (cost instanceof Material)
            {
                type = MaterialType.findMatchingType(((Material) cost)).name();
                type = type.substring(0,1)
                        .concat(type.substring(1,type.length()).toLowerCase());
            }
            else if (cost instanceof Commodity) type = Commodity.class.getSimpleName();
            else type = "Unknown";


            synchronized (this)
            {
                if (baseFontSize == -1 && baseFontFamily == null)
                {
                    baseFontSize = getFont().getSize();
                    baseFontSize += baseFontSize / 4;
                    baseFontFamily = getFont().getFamily();
                }
            }

            Label costLabel = new Label(type + " :: "  + cost.getLocalizedName()) ;
            costLabel.setPrefHeight(20);
            costLabel.setFont(UIFunctions.Fonts.size2Font);
            costLabel.paddingProperty().set(new Insets(2,5,2,5));
            double progress = ((double) item.getHave()) / ((double) item.getNeed());

            ProgressBar progressBar = new ProgressBar(progress);

            progressBar.setOnMouseClicked((e)->titledPane.setExpanded(!titledPane.isExpanded()));

            if (progress >= 1.0)
            {
                progressBar.setStyle("-fx-accent: #00b3f7");
            }
            else
            {
                Integer pending = pendingTradeYield.apply(cost);
                if (pending != null)
                {
                    double adjustedProgress = ((double) item.getHave() + pending) / ((double) item.getNeed());
                    progressBar.setProgress(adjustedProgress);
                    progressBar.setStyle("-fx-accent: #b061ff");
                }
                else progressBar.setStyle("-fx-accent: #ff0000");
            }

            hbox.getChildren().addAll(progressBar, costLabel);

            HBox labelBox = new HBox();
            labelBox.alignmentProperty().set(Pos.CENTER);
            VBox locationContainer = new VBox();

            Label locationLabel = new Label(item.getCost().getLocationInformation());
            locationLabel.setFont(UIFunctions.Fonts.size1Font);
            locationLabel.alignmentProperty().set(Pos.CENTER_LEFT);
            locationContainer.getChildren().add(locationLabel);
            titledPane.setGraphic(labelBox);
            titledPane.setContent(locationContainer);
            titledPane.alignmentProperty().set(Pos.CENTER_LEFT);

            titledPane.setGraphic(hbox);
            hbox.setAlignment(Pos.CENTER);

            descriptionContainer.getChildren().add(titledPane);

            if (progress < 1.0 && item.getCost() instanceof Material)
            {
                Material costMaterial = ((Material) item.getCost());
                if (costMaterial.getBlueprint().recipeStream().count() > 0)
                {
                    List<Button> recommendTrades = new ArrayList<>();
                    List<Label> avoidedTrades = new ArrayList<>();
                    List<Label> insufficientTrades = new ArrayList<>();

                    Separator separator = new Separator();
                    separator.setPadding(new Insets(5,0,0,0));
                    locationContainer.getChildren().add(separator);

                    ((Material) item.getCost())
                            .getBlueprint().recipeStream()
                            .sorted(bestCostYieldRatio)
                            .forEach(recipe->
                            {
                                Label label = new Label(recipe.getDisplayLabel());

                                boolean cannotAfford = recipe.costStream()
                                        .filter(costData -> costData.getQuantity()>0)
                                        .anyMatch(costData -> checkInventory.apply(costData.getCost()) < costData.getQuantity());

                                boolean isCached = recipe.costStream()
                                        .filter(costData -> costData.getQuantity()>0)
                                        .anyMatch(costData -> isInCache.test(costData.getCost()));

                                label.setFont(UIFunctions.Fonts.size1Font);

                                if (isCached)
                                {
                                    label.setTextFill(UIFunctions.Fonts.darkOrange);
                                    avoidedTrades.add(label);
                                }
                                else if (cannotAfford)
                                {
                                    label.setTextFill(UIFunctions.Fonts.negativeRed);
                                    insufficientTrades.add(label);
                                }
                                else
                                {
                                    CostData tradeCost = recipe.costStream()
                                            .filter(costData -> costData.getQuantity()>0).findAny()
                                            .orElse(null);

                                    // todo: report error
                                    if (tradeCost == null) return;

                                    ProcurementTaskData tradeTask = new ProcurementTaskData(MaterialTradeType
                                            .findMatchingType(((Material) tradeCost.getCost())), recipe);
                                    Button button = new Button(recipe.getDisplayLabel());
                                    button.setFont(UIFunctions.Fonts.size1Font);
                                    button.alignmentProperty().setValue(Pos.CENTER_LEFT);
                                    button.setOnMouseClicked((e)->
                                    {
                                        addtask.accept(tradeTask);
                                    });
                                    recommendTrades.add(button);
                                }
                            });

                    if (recommendTrades.isEmpty())
                    {
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
                        tradePane.setExpanded(false);
                        tradePane.setGraphic(tradeLabel);
                        VBox vBox = new VBox();
                        vBox.fillWidthProperty().setValue(true);
                        recommendTrades.stream()
                                .peek(trade->trade.prefWidthProperty().bind(vBox.widthProperty()))
                                .forEach(trade->vBox.getChildren().add(trade));
                        tradePane.setContent(vBox);
                        locationContainer.getChildren().add(tradePane);
                    }

                    if (!avoidedTrades.isEmpty() || !insufficientTrades.isEmpty())
                    {
                        String labelText = recommendTrades.isEmpty() ? "Possible Trades" : "Other Trades";
                        Label tradeLabel = new Label(labelText);
                        tradeLabel.setFont(UIFunctions.Fonts.size1Font);
                        TitledPane tradePane = new TitledPane();
                        Tooltip tooltip = new Tooltip("Trades which are not optimal or for witch you\n have insufficient materials to complete the trade");
                        tooltip.setFont(UIFunctions.Fonts.size1Font);
                        tradeLabel.setTooltip(tooltip);
                        tradePane.setAnimated(false);
                        tradePane.setExpanded(false);
                        tradePane.setGraphic(tradeLabel);
                        VBox vBox = new VBox();
                        if (!avoidedTrades.isEmpty())
                        {
                            Label avoidLabel = new Label("Conflicts with Ongoing Tasks");
                            avoidLabel.setFont(UIFunctions.Fonts.size1Font);
                            vBox.getChildren().add(avoidLabel);
                            avoidedTrades.stream().forEach(trade -> vBox.getChildren().add(trade));
                        }
                        if (!insufficientTrades.isEmpty())
                        {
                            Label insufficientLabel = new Label("Insufficient Materials");
                            insufficientLabel.setFont(UIFunctions.Fonts.size1Font);
                            vBox.getChildren().add(insufficientLabel);
                            insufficientTrades.stream().forEach(trade->vBox.getChildren().add(trade));
                        }

                        tradePane.setContent(vBox);
                        locationContainer.getChildren().add(tradePane);
                    }
                }
            }

            setGraphic(descriptionContainer);
        }
    }
}
