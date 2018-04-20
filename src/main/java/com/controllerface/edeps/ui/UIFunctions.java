package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.data.InventoryData;
import com.controllerface.edeps.data.ItemCostData;
import com.controllerface.edeps.data.ProcurementRecipeData;
import com.controllerface.edeps.data.storage.PlayerInventory;
import com.controllerface.edeps.enums.common.ItemEffect;
import com.controllerface.edeps.enums.costs.commodities.Commodity;
import com.controllerface.edeps.enums.costs.commodities.CommodityCategory;
import com.controllerface.edeps.enums.costs.materials.Material;
import com.controllerface.edeps.enums.costs.materials.MaterialCategory;
import com.controllerface.edeps.enums.costs.materials.MaterialType;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import javafx.util.Pair;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Stephen on 4/19/2018.
 */
class UIFunctions
{
    /**
     * Callback and Callback producing functions that control how various UI elements are created and displayed
     */
    static class Data
    {
        // simple string for material category name
        static final Callback<TableColumn.CellDataFeatures<InventoryData, String>, ObservableValue<String>>
                inventoryCategoryCellFactory =
                (materialData) ->
                {
                    ProcurementCost material = materialData.getValue().getItem();
                    SimpleStringProperty categoryValue = null;
                    if (material instanceof Material)
                    {
                        String category = MaterialCategory.findMatchingCategory(material).toString();
                        categoryValue =  new SimpleStringProperty(category);
                    }
                    else if (material instanceof Commodity)
                    {
                        String category = CommodityCategory.findMatchingCategory(material).toString();
                        categoryValue =  new SimpleStringProperty(category);
                    }
                    return categoryValue;
                };

        // simple string for material grade
        static final Callback<TableColumn.CellDataFeatures<InventoryData, String>, ObservableValue<String>>
                inventoryGradeCellFactory =
                (materialData) ->
                {
                    String grade = materialData.getValue().getItem().getGrade().toString();
                    return new SimpleStringProperty(grade);
                };

        // simple string for material name
        static final Callback<TableColumn.CellDataFeatures<InventoryData, String>, ObservableValue<String>>
                inventoryMaterialCellFactory =
                (materialData) ->
                {
                    String materialName = materialData.getValue().getItem().getLocalizedName();
                    return new SimpleStringProperty(materialName);
                };

        // simple integer for material count
        static final Callback<TableColumn.CellDataFeatures<InventoryData, Number>, ObservableValue<Number>>
                inventoryQuantityCellFactory =
                (materialData) ->
                {
                    int quantity = materialData.getValue().getQuantity();
                    return new SimpleIntegerProperty(quantity);
                };

    /*
     procurement List: Roll/Mod Blueprint
     */

        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProcurementRecipeData>, ObservableValue<ProcurementRecipeData>>
                modRollCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue());



        static final Function<BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer>,
            Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>>
        makeModRollCellFactory = (func) -> (modRecipe) -> new TaskCountCell(func);


        // simple integer for number of rolls
//        static final Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>
//                modRollCellFactory = (modRecipe) -> new TaskCountCell(procurementListUpdate);


        // simple string for blueprint/recipe name
        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProcurementRecipeData>, ObservableValue<ProcurementRecipeData>>
                modNameCellValueFactory = (modRecipe) ->new ReadOnlyObjectWrapper<>(modRecipe.getValue());




        static final Function<Function<ProcurementCost, Integer>,
                Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>>
                makeModNameCellFactory = (func) -> (modRecipe) -> new RecipeNameCell(func);




        // simple string for blueprint/recipe name
//        static final Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>
//                modNameCellFactory = (modRecipe) -> new RecipeNameCell(playerInventory::hasItem);

        // wrapper object for recipe pair object
        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, ObservableValue<Pair<ProcurementType, ProcurementRecipe>>>
                modControlCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair());


        static final Function<BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer>,
            Callback<TableColumn<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, TableCell<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>>>
        makeModControlCellFactory = (updateFunction) -> (modRecipe) -> new ModControlCell(updateFunction);

        // custom cell object creates display for the controls
//        static final Callback<TableColumn<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, TableCell<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>>
//                modControlCellFactory = (modRecipe) -> new ModControlCell(procurementListUpdate);

    /*
     procurement List: Material Need/Have, Progress information
     */

        // simple integer for the need count
        static final Callback<TableColumn.CellDataFeatures<ItemCostData, Number>, ObservableValue<Number>>
                materialNeedCellFactory = (modMaterial) -> new SimpleIntegerProperty(modMaterial.getValue().getNeed());

        // simple integer for the have count
        static final Callback<TableColumn.CellDataFeatures<ItemCostData, Number>, ObservableValue<Number>>
                materialHaveCellFactory = (modMaterial) -> new SimpleIntegerProperty(modMaterial.getValue().getHave());

        // simple string for the material name
        static final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
                materialNameCellFactory = (modMaterial) -> new SimpleStringProperty(modMaterial.getValue().toString());

        static final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
                materialTypeCellFactory = (modMaterial) ->
        {
            ProcurementCost cost = modMaterial.getValue().getMaterial();
            String type;
            if (cost instanceof Material) type = MaterialType.findMatchingType(((Material) cost)).name().toLowerCase();
            else if (cost instanceof Commodity) type = "commodity";
            else type = "Unknown";
            return new SimpleStringProperty(type);
        };

        // custom cell object creates display for the progress indicator
        static final Callback<TableColumn<ItemCostData, ProgressIndicator>, TableCell<ItemCostData, ProgressIndicator>>
                materialProgressCellFactory = (modMaterial) -> new MaterialProgressCell();

        // wrapper object for progress indicator object
        static final Callback<TableColumn.CellDataFeatures<ItemCostData, ProgressIndicator>, ObservableValue<ProgressIndicator>>
                matProgressCellValueFactory = (modMaterial) ->
        {
            double progress = ((double) modMaterial.getValue().getHave()) / ((double) modMaterial.getValue().getNeed());

            ProgressIndicator progressIndicator = new ProgressIndicator(progress);

            if (progress >= 1.0)
            {
                progressIndicator.setStyle("-fx-progress-color: #6677ff ");
            }
            else progressIndicator.setStyle("-fx-progress-color: #ee5555 ");

            return new ReadOnlyObjectWrapper<>(progressIndicator);
        };


        // custom cell object creates display for the progress indicator
        static final Callback<TableColumn<ProcurementRecipeData, ProgressIndicator>, TableCell<ProcurementRecipeData, ProgressIndicator>>
                recipeProgressCellFactory = (modRecipeItem) -> new TaskProgressCell();





        static final Function<PlayerInventory,
            Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProgressIndicator>, ObservableValue<ProgressIndicator>>>
        makeRecipeProgressCellValuefactory = (playerInventory) -> (modRecipe) ->
        {
            ProcurementRecipeData procurementRecipeData = modRecipe.getValue();

            int count = procurementRecipeData.getCount();

            int total = procurementRecipeData.asPair().getValue().costStream()
                    .mapToInt(c -> c.getQuantity() * count)
                    .sum();

            int missing = procurementRecipeData.asPair().getValue().costStream()
                    .mapToInt(cost->
                    {
                        int banked = playerInventory.hasItem(cost.getCost());
                        int surplus = banked - (cost.getQuantity() * count);
                        return surplus < 0
                                ? -1 * surplus
                                : 0;
                    })
                    .sum();

            double progress = missing > 0
                    ? (double) total / (double)(total + missing)
                    : 1;

            ProgressIndicator progressIndicator = new ProgressIndicator(progress);

            if (progress >= 1.0)
            {
                progressIndicator.setStyle("-fx-progress-color: #6677ff ");
            }
            else progressIndicator.setStyle("-fx-progress-color: #ee5555 ");

            return new ReadOnlyObjectWrapper<>(progressIndicator);
        };





        // wrapper object for progress indicator object
//        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProgressIndicator>, ObservableValue<ProgressIndicator>>
//                recipeProgressCellValueFactory = (modRecipe) ->
//        {
//            ProcurementRecipeData procurementRecipeData = modRecipe.getValue();
//
//            int count = procurementRecipeData.getCount();
//
//            int total = procurementRecipeData.asPair().getValue().costStream()
//                    .mapToInt(c -> c.getQuantity() * count)
//                    .sum();
//
//            int missing = procurementRecipeData.asPair().getValue().costStream()
//                    .mapToInt(cost->
//                    {
//                        int banked = playerInventory.hasItem(cost.getCost());
//                        int surplus = banked - (cost.getQuantity() * count);
//                        return surplus < 0
//                                ? -1 * surplus
//                                : 0;
//                    })
//                    .sum();
//
//            double progress = missing > 0
//                    ? (double) total / (double)(total + missing)
//                    : 1;
//
//            ProgressIndicator progressIndicator = new ProgressIndicator(progress);
//
//            if (progress >= 1.0)
//            {
//                progressIndicator.setStyle("-fx-progress-color: #6677ff ");
//            }
//            else progressIndicator.setStyle("-fx-progress-color: #ee5555 ");
//
//            return new ReadOnlyObjectWrapper<>(progressIndicator);
//        };

    }

    /**
     * Mapping functions used to produce UI elements from other data objects
     */
    static class Convert
    {
        static Function<Pair<ItemEffect, Double>, Label> effectToLabel = (pair) ->
        {
            boolean moreIsGood = pair.getKey().isMoreGood();
            boolean valueIsPositive = pair.getValue() >= 0;
            boolean markGood = moreIsGood == valueIsPositive;
            String buf = pair.getKey().toString()
                    + ((valueIsPositive ? " +" : " ")
                    + pair.getValue());
            buf = buf.replace(".0","");
            if (buf.contains("-") || buf.contains("+")) buf += "%";
            buf = buf.replace("+0%","");
            Label nextLabel = new Label(buf);
            nextLabel.setTextFill(markGood ? Color.BLUE : Color.RED);
            return nextLabel;
        };
    }

    /**
     * Comparators, used when sorting data sets in various ways
     */
    static class Sort
    {
        // sort Label objects by "good/bad status" where blue is good and red is bad. Good comes before bad
        static final Comparator<Label> byGoodness = (a, b) -> a.getTextFill() == b.getTextFill()
                ? 0
                : a.getTextFill() == Color.BLUE
                        ? -1
                        : 1;

        // sort InventoryData objects alphabetically, by category
        static final Comparator<InventoryData> costByCategory = Comparator.comparing(InventoryData::getCategory);

        // sort InventoryData objects numerically by grade, lowest to highest
        static final Comparator<InventoryData> materialByGrade =
                (a, b) -> a.getItem().getGrade().toString().compareTo(b.getItem().getGrade().toString());

        // sort InventoryData objects numerically by count, highest to lowest
        static final Comparator<InventoryData> cargoByCount =
                (a, b) -> b.getQuantity() - a.getQuantity();

        // sort ProgressIndicator objects by numerical progress, lowest to highest
        static final Comparator<ProgressIndicator> indicatorByProgress =
                (a, b) -> a.getProgress() == b.getProgress()
                        ? 0
                        : a.getProgress() > b.getProgress()
                                ? 1
                                : -1;
    }
}
