package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.data.MaterialTradeRecipe;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.data.commander.InventoryData;
import com.controllerface.edeps.data.commander.ShipStatisticData;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import com.controllerface.edeps.structures.equipment.ItemGrade;
import com.controllerface.edeps.ui.commander.CommanderStatDataCell;
import com.controllerface.edeps.ui.costs.CostDataCell;
import com.controllerface.edeps.ui.costs.CostValueCell;
import com.controllerface.edeps.ui.ship.ModuleDisplayCell;
import com.controllerface.edeps.ui.ship.SlotNameCell;
import com.controllerface.edeps.ui.ship.StatDataCell;
import com.controllerface.edeps.ui.ship.StatDisplayCell;
import com.controllerface.edeps.ui.tasks.TaskNameCell;
import com.controllerface.edeps.ui.tasks.TaskCountCell;
import com.controllerface.edeps.ui.tasks.TaskRemoveCell;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Callback;
import javafx.util.Pair;

import java.nio.charset.StandardCharsets;
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
 * Created by Controllerface on 4/19/2018.
 */
public class UIFunctions
{
    public static final int scrollBarAllowance = 20;

    public static class Symbols
    {
        public static final String DEGREES = new String(new byte[]{(byte)0x00,(byte)0xb0}, StandardCharsets.UTF_16);
        public static final String INFINITY = new String(new byte[]{(byte)0x22,(byte)0x1e}, StandardCharsets.UTF_16);
    }

    public static class Fonts
    {
        public static final Color positiveBlue = Color.rgb(0x00, 0xb3, 0xf7);
        public static final Color negativeRed = Color.rgb(0xff, 0x00, 0x00);
        public static final Color neutralBlack = Color.rgb(0x00, 0x00, 0x00);
        //public static final Color standardOrange = Color.rgb(0xff, 0x71, 0x00);
        //public static final Color specialYellow = Color.rgb(0xff, 0xb0, 0x00);
        public static final Color darkOrange = Color.rgb(0xb7, 0x52, 0x00);
        public static final Color darkYellow = Color.rgb(0xb7, 0x7d, 0x00);

        static final Font baseFont = Font.getDefault();
        static final double size1 = baseFont.getSize() + (baseFont.getSize() / 5);
        static final double size2 = baseFont.getSize() + (baseFont.getSize() / 4);
        static final double size3 = baseFont.getSize() + (baseFont.getSize() / 3);
        static final double size4 = baseFont.getSize() + (baseFont.getSize() / 2);

        //public static final Font size0Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, baseFont.getSize());
        public static final Font size1Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, size1);
        public static final Font size2Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, size2);
        public static final Font size3Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, size3);
        public static final Font size4Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, size4);
    }

    /**
     * Callback and Callback producing functions that control how various UI elements are created and displayed
     */
    public static class Data
    {
        static final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
                costNeedCellFactory = (modMaterial) ->
        {
            int left = 0;
            int need = modMaterial.getValue().getNeed();
            int have = modMaterial.getValue().getHave();
            boolean ok = need <= have;
            if (!ok)
            {
                left = need - have;
            }

            return new SimpleStringProperty(String.valueOf(left));
        };


        /**
         * Standard mathematical range mapping function. Accepts a number within a given range and maps it to a
         * corresponding value in a different range.
         *
         * @param input the numerical value to map from the input range to the output range
         * @param inputMin low end of the input range, the s parameter should be greater than or equal to this value
         * @param inputMax high end of the input range, the s parameter should be less than or equal to this value
         * @param outputMin low end of the output range, the return value will be greater than or equal to this value
         * @param outputMax high end of the output range, the return value will be less than or equal to this value
         * @return the result of applying the mapping function on the inputValue from the input range to the output range
         */
        public static double mapRange(double input, double inputMin, double inputMax, double outputMin, double outputMax)
        {
            return outputMin + ((input - inputMin) * (outputMax - outputMin)) / (inputMax - inputMin);
        }
    }

    /**
     * Mapping functions used to produce UI elements from other data objects
     */
    public static class Convert
    {
        // Creates a Label object from a Pair<ItemEffect, Double>. The provided pair represents the effect that some
        // modification or experimental effect would have on whatever item it is applied to, and the magnitude of that
        // effect. If the magnitude is a positive number, it would be added to the base value of any modified item, and
        // likewise, a negative value would become a subtraction from any base value.
        public static Function<ItemEffectData, Label> effectToLabel = (pair) ->
        {
            Label nextLabel = new Label();

            // todo: in the future this will be done with CSS
            nextLabel.setFont(Fonts.size1Font);

            // get the "more is good" flag for this effect
            boolean moreIsGood = pair.getEffect().isMoreGood();

            boolean isNumerical = pair.isNumerical();

            if (isNumerical)
            {
                // set a flag to capture whether the value is negative or positive
                boolean valueIsPositive = pair.getDoubleValue() >= 0;

                // now set a flag marking this effect as "good" or "bad". This is used primarily to add a corresponding
                // color to the UI indicating good/bad status. For example, "bad" effects are often displayed in red
                boolean isGood = moreIsGood == valueIsPositive;

                // we want positive changes to have a plus sign (+) in their text. Negative values have a minus sign (-)
                // prefix by default, so we only need to explicitly do this for positive numbers

                String text = pair.getEffect().toString()
                        + (valueIsPositive ? " +" : " ")
                        + String.valueOf(pair.getDoubleValue()) ;

                // some effects have a zero value, such effects are generally "binary" on/off values, so we can just remove
                // the trailing "point zero" suffix
                text = text.replace(".0","");

                // todo: clean this up, there's extra checks here
                // to make the text match the in game values, add a percent sign (%)
                if (text.contains("-") || text.contains("+")) text += "%";
                text = text.replace("+0%","");

                // now create the label object using the text we just created
                //nextLabel = new Label(text);

                nextLabel.setText(text);


                // text fill is a separate value, set it to the "good" or "bad" font as appropriate
                nextLabel.setTextFill(isGood ? Fonts.positiveBlue : Fonts.negativeRed);
            }
            else
            {
                nextLabel.setText(pair.getEffect().toString() + " " + pair.getStringValue());
            }

            return nextLabel;
        };
    }

    /**
     * Comparators, used when sorting data sets in various ways
     */
    public static class Sort
    {
        // sort Label objects by "good/bad status" where blue is good and red is bad. Good comes before bad
        public static final Comparator<Label> byGoodness = (a, b) -> a.getTextFill() == b.getTextFill()
                ? 0
                : a.getTextFill() == Color.BLUE
                        ? -1
                        : 1;

        // sort InventoryData objects alphabetically, by category
        static final Comparator<InventoryData> itemByCategory =
                Comparator.comparingInt(a -> a.getCategory().getNumericalValue());

        // sort InventoryData objects numerically by grade, lowest to highest
        static final Comparator<InventoryData> itemByGrade =
                Comparator.comparingInt(a -> a.getItem().getGrade().getNumericalValue());

        // sort InventoryData objects numerically by count, highest to lowest
        static final Comparator<InventoryData> itemByCount =
                Comparator.comparingInt(InventoryData::getQuantity).reversed();

        // used for Label objects that are actually just string representations of Integer values. Will sort them
        // numerically lowest to highest
        static final Comparator<Label> quantityByNumericValue =
                Comparator.comparingInt(a -> Integer.parseInt(a.getText()));

        // sorts procurement tasks by name, and ensure trade tasks always come after all other task types
        static final Comparator<ProcurementRecipeData> tasksByName =
                (a, b)->
                {
                    if (a.isTrade() != b.isTrade())
                    {
                        return a.isTrade() ? 1 : -1;
                    }

                    String as = a.asPair().getKey().toString() + a.asPair().getValue().toString();
                    String bs = b.asPair().getKey().toString() + b.asPair().getValue().toString();
                    return as.compareTo(bs);
                };

        // sorts procurement tasks by grade, and ensure trade tasks always come after all other task types
        static final Comparator<ProcurementRecipeData> taskByGrade =
                (a, b) ->
                {
                    if (a.isTrade() != b.isTrade())
                    {
                        return a.isTrade() ? 1 : -1;
                    }

                    return ItemGrade.compare(a.asPair().getValue().getGrade(), b.asPair().getValue().getGrade());
                };

        // trade costs sorted by absolute need, with highest need always sorted first
        static final Comparator<ItemCostData> costsByNeed =
                (a, b)->
                {
                    int aNeed = a.getNeed();
                    int bNeed = b.getNeed();
                    int aHave = a.getHave();
                    int bHave = b.getHave();
                    boolean aok = aHave >= aNeed;
                    boolean bok = bHave >= bNeed;

                    int r2;

                    if (aok && bok) r2 = 0;
                    else if (aok || bok) r2 = aok ? 1 : -1;
                    else
                    {
                        int aDiff = Math.abs(aNeed - aHave);
                        int bDiff = Math.abs(bNeed - bHave);
                        r2 = bDiff - aDiff;
                    }

                    return r2;
                };

        // trade task by best cost/yield ratio
        public static final Comparator<ProcurementRecipe> bestCostYieldRatio =
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
    }
}
