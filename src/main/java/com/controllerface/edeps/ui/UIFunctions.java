package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.commander.InventoryData;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.commodities.CommodityCategory;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialCategory;
import com.controllerface.edeps.structures.costs.materials.MaterialType;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Callback;
import javafx.util.Pair;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * This class stores several stateless functions and utility objects that are used to build or modify the GUI. These
 * functions are stored here in an effort to keep the UI controller classes and various custom cell/display object
 * classes from getting too cluttered with support functions.
 *
 * This class in organized such that related functionality resides within inner static classes of a common name,
 * for example the Data subclass houses various cell and cell data functions used to define how various table cells
 * are created or displayed.
 *
 * Created by Stephen on 4/19/2018.
 */
class UIFunctions
{
    static final int scrollBarAllowance = 20;

    /**
     * Callback and Callback producing functions that control how various UI elements are created and displayed
     */
    static class Data
    {
        // simple string for material category name
        static final Callback<TableColumn.CellDataFeatures<InventoryData, String>, ObservableValue<String>>
                inventoryCategoryCellFactory =
                (inventoryData) ->
                {
                    ProcurementCost cost = inventoryData.getValue().getItem();
                    SimpleStringProperty categoryValue = null;
                    if (cost instanceof Material)
                    {
                        String category = MaterialCategory.findMatchingCategory(cost).toString();
                        categoryValue =  new SimpleStringProperty(category);
                    }
                    else if (cost instanceof Commodity)
                    {
                        String category = CommodityCategory.findMatchingCategory(cost).toString();
                        categoryValue =  new SimpleStringProperty(category);
                    }
                    return categoryValue;
                };

        // simple string for material grade
        static final Callback<TableColumn.CellDataFeatures<InventoryData, String>, ObservableValue<String>>
                inventoryGradeCellFactory =
                (inventoryData) ->
                {
                    String grade = inventoryData.getValue().getItem().getGrade().toString();
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
        static final Callback<TableColumn.CellDataFeatures<InventoryData, Label>, ObservableValue<Label>>
                inventoryQuantityCellFactory =
                (materialData) ->
                {
                    int quantity = materialData.getValue().getQuantity();
                    Label label = new Label(String.valueOf(quantity));
                    if (quantity == 0) label.setTextFill(Color.RED);
                    return new ReadOnlyObjectWrapper<>(label);
                };

    /*
     procurement List: Roll/Mod Blueprint
     */

        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProcurementRecipeData>, ObservableValue<ProcurementRecipeData>>
                modRollCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue());


        static final Function<BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer>,
            Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>>
        makeModRollCellFactory = (func) -> (modRecipe) -> new TaskCountCell(func);


        // simple string for blueprint/recipe name
        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProcurementRecipeData>, ObservableValue<ProcurementRecipeData>>
                modNameCellValueFactory = (modRecipe) ->new ReadOnlyObjectWrapper<>(modRecipe.getValue());


        static final Function<Function<ProcurementCost, Integer>,
                Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>>
                makeModNameCellFactory = (func) -> (modRecipe) -> new RecipeNameCell(func);

        // wrapper object for recipe pair object
        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, ObservableValue<Pair<ProcurementType, ProcurementRecipe>>>
                modControlCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair());

        static final Function<BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer>,
            Callback<TableColumn<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, TableCell<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>>>
        makeModControlCellFactory = (updateFunction) -> (modRecipe) -> new TaskRemoveCell(updateFunction);

    /*
     procurement List: Material Need/Have, Progress information
     */

        static final Callback<TableColumn.CellDataFeatures<ItemCostData, Number>, ObservableValue<Number>>
                costNeedCellFactory = (modMaterial) -> new SimpleIntegerProperty(modMaterial.getValue().getNeed());

        static final Callback<TableColumn.CellDataFeatures<ItemCostData, Number>, ObservableValue<Number>>
                costHaveCellFactory = (modMaterial) -> new SimpleIntegerProperty(modMaterial.getValue().getHave());

        static final Callback<TableColumn<ItemCostData, String>, TableCell<ItemCostData, String>>
                boldCostStringCellFactory = (param) -> new CostDataCell();

        static final Callback<TableColumn<ItemCostData, Number>, TableCell<ItemCostData, Number>>
                boldCostNumberCellFactory = (param) -> new CostValueCell();

        static final Callback<TableColumn<Pair<Statistic, String>, String>, TableCell<Pair<Statistic, String>, String>>
                boldStringNameCellFactory = (param) -> new StatDataCell();

        static final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
                costNameCellValueFactory = (modMaterial) -> new SimpleStringProperty(modMaterial.getValue().toString());

        static final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
                costTypeCellFactory = (modMaterial) ->
        {
            ProcurementCost cost = modMaterial.getValue().getCost();
            String type;
            if (cost instanceof Material)
            {
                type = MaterialType.findMatchingType(((Material) cost)).name();
                type = type.substring(0,1)
                        .concat(type.substring(1,type.length()).toLowerCase());
            }
            else if (cost instanceof Commodity) type = Commodity.class.getSimpleName();
            else type = "Unknown";
            return new SimpleStringProperty(type);
        };

        // custom cell object creates display for the progress indicator
        static final Callback<TableColumn<ItemCostData, ProgressIndicator>, TableCell<ItemCostData, ProgressIndicator>>
                costProgressCellFactory = (modMaterial) -> new CostProgressCell();

        // wrapper object for progress indicator object
        static final Callback<TableColumn.CellDataFeatures<ItemCostData, ProgressIndicator>, ObservableValue<ProgressIndicator>>
                costProgressCellValueFactory = (modMaterial) ->
        {
            double progress = ((double) modMaterial.getValue().getHave()) / ((double) modMaterial.getValue().getNeed());

            ProgressIndicator progressIndicator = new ProgressIndicator(progress);

            if (progress >= 1.0)
            {
                progressIndicator.setStyle("-fx-progress-color: #00b3f7 ");
            }
            else progressIndicator.setStyle("-fx-progress-color: #ff0000 ");

            return new ReadOnlyObjectWrapper<>(progressIndicator);
        };
    }

    static class Fonts
    {
        static final Color positiveBlue = Color.rgb(0x00, 0xb3, 0xf7);
        static final Color negativeRed = Color.rgb(0xff, 0x00, 0x00);
        static final Color neutralBlack = Color.rgb(0x00, 0x00, 0x00);
    }

    /**
     * Mapping functions used to produce UI elements from other data objects
     */
    static class Convert
    {
        // Creates a Label object from a Pair<ItemEffect, Double>. The provided pair represents the effect that some
        // modification or experimental effect would have on whatever item it is applied to, and the magnitude of that
        // effect. If the magnitude is a positive number, it would be added to the base value of any modified item, and
        // likewise, a negative value would become a subtraction from any base value.
        static Function<Pair<ItemEffect, Double>, Label> effectToLabel = (pair) ->
        {
            // get the "more is good" flag for this effect
            boolean moreIsGood = pair.getKey().isMoreGood();

            // set a flag to capture whether the value is negative or positive
            boolean valueIsPositive = pair.getValue() >= 0;

            // now set a flag marking this effect as "good" or "bad". This is used primarily to add a corresponding
            // color to the UI indicating good/bad status. For example, "bad" effects are often displayed in red
            boolean isGood = moreIsGood == valueIsPositive;

            // we want positive changes to have a plus sign (+) in their text. Negative values have a minus sign (-)
            // prefix by default, so we only need to explicitly do this for positive numbers
            String text = pair.getKey().toString()
                    + ((valueIsPositive ? " +" : " ")
                    + pair.getValue());

            // some effects have a zero value, such effects are generally "binary" on/off values, so we can just remove
            // the trailing "point zero" suffix
            text = text.replace(".0","");

            // todo: clean this up, there's extra checks here
            // to make the text match the in game values, add a percent sign (%)
            if (text.contains("-") || text.contains("+")) text += "%";
            text = text.replace("+0%","");

            // now create the label object using the text we just created
            Label nextLabel = new Label(text);

            // here we grab the default font object and adjust it to look a little better. We grab the existing font
            // just in case it is changed by some CSS or other "skinning" that may be done in the future. This way, if
            // the default font changes, these adjustments are made to it, and not some hard-coded font.
            Font eFont = nextLabel.getFont();

            // just make a copy of the default font, but make it bold and increase the size by 20%, then set it as the
            // label object's font
            // todo: in the future this will be done with CSS
            Font b = Font.font(eFont.getFamily(), FontWeight.BOLD, eFont.getSize() + (eFont.getSize() / 5));
            nextLabel.setFont(b);

            // text fill is a separate value, set it to the "good" or "bad" font as appropriate
            nextLabel.setTextFill(isGood ? Fonts.positiveBlue : Fonts.negativeRed);

            return nextLabel;
        };


        static BiFunction<Boolean, CostData, Label> costToLabel = (hasEnough, cost) ->
        {
            Label next = new Label(cost.getQuantity() + "x " + cost.getCost().getLocalizedName());
            Font eFont = next.getFont();
            Font b = Font.font(eFont.getFamily(), FontWeight.BOLD, eFont.getSize() + (eFont.getSize() / 5));
            next.setFont(b);
            next.setTextFill(hasEnough ? Fonts.neutralBlack : Fonts.negativeRed);
            return next;
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
        static final Comparator<InventoryData> costByCategory =
                Comparator.comparing(InventoryData::getCategory);

        // sort InventoryData objects numerically by grade, lowest to highest
        static final Comparator<InventoryData> materialByGrade =
                Comparator.comparing(a -> a.getItem().getGrade().toString());

        // sort InventoryData objects numerically by count, highest to lowest
        static final Comparator<InventoryData> cargoByCount =
                (a, b) -> b.getQuantity() - a.getQuantity();

        // used for Label objects that are actually just string representations of Integer values. Will sort them
        // numerically lowest to highest
        static final Comparator<Label> quantityByNumericValue =
                Comparator.comparingInt(a -> Integer.parseInt(a.getText()));

        // sort ProgressIndicator objects by numerical progress, lowest to highest
        static final Comparator<ProgressIndicator> indicatorByProgress =
                (a, b) -> a.getProgress() == b.getProgress()
                        ? 0
                        : a.getProgress() > b.getProgress()
                                ? 1
                                : -1;
    }
}
