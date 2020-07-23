package com.controllerface.cmdr_j.ui;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.commander.InventoryData;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.tasks.ItemCostData;
import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.classes.tasks.TaskData;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import javafx.util.Callback;
import javafx.util.Pair;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;

import static java.lang.Math.*;

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

    public static class Style
    {
        public static final Color neutralWhite = Color.rgb(0xee, 0xee, 0xee);
        public static final Color positiveBlue = Color.rgb(0x00, 0xb3, 0xf7);
        public static final Color negativeRed = Color.rgb(0xff, 0x00, 0x00);
        public static final Color neutralBlack = Color.rgb(0x00, 0x00, 0x00);
        public static final Color standardOrange = Color.rgb(0xff, 0x71, 0x00);
        public static final Color thargoidGreen = Color.rgb(0x02,0x5B,0x30);
        public static final Color specialYellow = Color.rgb(0xff, 0xb0, 0x00);
        public static final Color darkOrange = Color.rgb(0xff, 0x71, 0x00);//Color.rgb(0xb7, 0x52, 0x00);
        public static final Color darkerOrange = darkOrange.darker().darker();
        public static final Color darkestOrange = darkerOrange.darker().darker().darker().darker();
        public static final Color darkYellow = Color.rgb(0xb7, 0x7d, 0x00);
        public static final Color darkRed = Color.rgb(0xb7, 0x00, 0x00);
        public static final Color hotBlue = Color.rgb(0x00, 0x77, 0xcc);
    }

    public static class Icons
    {
        private static String format(double val)
        {
            String in = Integer.toHexString((int) Math.round(val * 255));
            return in.length() == 1 ? "0" + in : in;
        }

        public static String toHexString(Color value)
        {
            return "#" + (format(value.getRed()) + format(value.getGreen()) + format(value.getBlue()) + format(value.getOpacity()))
                    .toUpperCase();
        }

        private static String readIcon(String icon)
        {
            try(Scanner scanner = new Scanner(Icons.class.getResourceAsStream(icon)))
            {
                return scanner.useDelimiter("\\Z").next();
            }
        }

        public static final SVGPath alert = new SVGPath();

        public static final SVGPath credits = new SVGPath();

        public static final SVGPath cargo = new SVGPath();
        public static final SVGPath salvage = new SVGPath();
        public static final SVGPath materialGrade1 = new SVGPath();
        public static final SVGPath materialGrade2 = new SVGPath();
        public static final SVGPath materialGrade3 = new SVGPath();
        public static final SVGPath materialGrade4 = new SVGPath();
        public static final SVGPath materialGrade5 = new SVGPath();
        public static final SVGPath guardian = new SVGPath();
        public static final SVGPath thargoid = new SVGPath();

        public static final SVGPath manufacturedTrade = new SVGPath();
        public static final SVGPath rawTrade = new SVGPath();
        public static final SVGPath dataTrade = new SVGPath();

        public static final SVGPath synthesisBasic = new SVGPath();
        public static final SVGPath synthesisStandard = new SVGPath();
        public static final SVGPath synthesisPremium = new SVGPath();
        public static final SVGPath engineering = new SVGPath();
        public static final SVGPath techBroker = new SVGPath();
        public static final SVGPath aegis = new SVGPath();
        public static final SVGPath planetaryPort = new SVGPath();
        public static final SVGPath horizon = new SVGPath();
        public static final SVGPath marker = new SVGPath();
        public static final SVGPath mining = new SVGPath();
        public static final SVGPath mission = new SVGPath();
        public static final SVGPath powerplay = new SVGPath();
        public static final SVGPath limpet = new SVGPath();

        public static final SVGPath thermal = new SVGPath();
        public static final SVGPath kinetic = new SVGPath();
        public static final SVGPath explosive = new SVGPath();
        public static final SVGPath thermo_kinetic = new SVGPath();
        public static final SVGPath absolute = new SVGPath();
        public static final SVGPath caustic = new SVGPath();

        public static final SVGPath fixed = new SVGPath();
        public static final SVGPath gimbal = new SVGPath();
        public static final SVGPath turret = new SVGPath();

        static
        {
            alert.setContent(readIcon("/alert.obj"));
            fixed.setContent(readIcon("/fixed_mount.obj"));
            gimbal.setContent(readIcon("/gimbal_mount.obj"));
            turret.setContent(readIcon("/turret_mount.obj"));
            thermo_kinetic.setContent(readIcon("/thermo_kinetic.obj"));
            absolute.setContent(readIcon("/absolute.obj"));
            caustic.setContent(readIcon("/caustic.obj"));
            explosive.setContent(readIcon("/explosive.obj"));
            kinetic.setContent(readIcon("/kinetic.obj"));
            thermal.setContent(readIcon("/thermal.obj"));
            credits.setContent(readIcon("/credits.obj"));
            limpet.setContent(readIcon("/limpet.obj"));
            powerplay.setContent(readIcon("/powerplay.obj"));
            salvage.setContent(readIcon("/salvage.obj"));
            mission.setContent(readIcon("/mission.obj"));
            mining.setContent(readIcon("/mining.obj"));
            marker.setContent(readIcon("/marker.obj"));
            horizon.setContent(readIcon("/horizon.obj"));
            planetaryPort.setContent(readIcon("/planetary_port.obj"));
            guardian.setContent(readIcon("/guardian.obj"));
            thargoid.setContent(readIcon("/thargoid.obj"));
            manufacturedTrade.setContent(readIcon("/manufacturedTrade.obj"));
            rawTrade.setContent(readIcon("/rawTrade.obj"));
            dataTrade.setContent(readIcon("/dataTrade.obj"));
            synthesisBasic.setContent(readIcon("/synthesis_1.obj"));
            synthesisStandard.setContent(readIcon("/synthesis_2.obj"));
            synthesisPremium.setContent(readIcon("/synthesis_3.obj"));
            engineering.setContent(readIcon("/engineering.obj"));
            aegis.setContent(readIcon("/aegis.obj"));
            techBroker.setContent(readIcon("/techBroker.obj"));
            cargo.setContent(readIcon("/cargo.obj"));
            materialGrade1.setContent(readIcon("/materialGrade1.obj"));
            materialGrade2.setContent(readIcon("/materialGrade2.obj"));
            materialGrade3.setContent(readIcon("/materialGrade3.obj"));
            materialGrade4.setContent(readIcon("/materialGrade4.obj"));
            materialGrade5.setContent(readIcon("/materialGrade5.obj"));
        }

        public static Icon alertIcon = new Icon(alert, 18, 20);

        public static Icon thermalIcon = new Icon(thermal, 25, 25);
        public static Icon kineticIcon = new Icon(kinetic, 25, 25);
        public static Icon explosiveIcon = new Icon(explosive, 25, 25);
        public static Icon thermoKineticIcon = new Icon(thermo_kinetic, 25, 25);
        public static Icon absoluteicon = new Icon(absolute, 25, 25);
        public static Icon causticIcon = new Icon(caustic, 25, 25);

        public static Icon guardianIcon = new Icon(guardian, 31, 25, Style.hotBlue);
        public static Icon aegisIcon = new Icon(aegis, 31, 25, Style.darkRed);
        public static Icon axIcon = new Icon(aegis, 31, 25, Style.thargoidGreen);


        public static Icon fixedIcon = new Icon(fixed, 20, 20);
        public static Icon gimbalIcon = new Icon(gimbal, 20, 20);
        public static Icon turretIcon = new Icon(turret, 20, 15);

        public static Icon cargoIcon = new Icon(cargo, 25, 25);
        public static Icon creditsIcon = new Icon(credits, 30, 30);
        public static Icon mfdTradeIcon = new Icon(manufacturedTrade, 25, 30);
        public static Icon rawTradeIcon = new Icon(rawTrade, 25, 30);
        public static Icon dataTradeIcon = new Icon(dataTrade, 25, 30);

        public static Icon modificationIcon =
                new Icon(UIFunctions.Icons.engineering, 25, 30, Style.standardOrange);

        public static Icon experimentalIcon =
                new Icon(UIFunctions.Icons.engineering, 25, 30, Style.specialYellow);


    }

    /**
     * Callback and Callback producing functions that control how various UI elements are created and displayed
     */
    public static class Data
    {
        static final Callback<TableColumn<TaskData, ProgressBar>, TableCell<TaskData, ProgressBar>>
                taskProgressCellFactory = (param -> new TableCell<TaskData, ProgressBar>()
            {
                @Override
                public void updateItem(ProgressBar item, boolean empty)
                {
                    super.updateItem(item, empty);
                    setGraphic(item);
                    setAlignment(Pos.TOP_CENTER);
                }
            });

        static final Callback<TableColumn<ItemCostData, ProgressBar>, TableCell<ItemCostData, ProgressBar>>
                costProgressCellFactory = (param -> new TableCell<ItemCostData, ProgressBar>()
        {
            @Override
            public void updateItem(ProgressBar item, boolean empty)
            {
                super.updateItem(item, empty);
                setGraphic(item);
                setAlignment(Pos.TOP_CENTER);
            }
        });

        static final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
                costNeedCellFactory = (modMaterial) ->
        {
            String suffix = "";
            long left = 0;
            long need = modMaterial.getValue().getNeed();
            long have = modMaterial.getValue().getHave();
            boolean ok = need <= have;
            if (!ok)
            {
                left = need - have;
            }

            if (left > 999_999_999)
            {
                String buffer = Long.toString(left);
                buffer = buffer.substring(buffer.length()-9).substring(0,2);
                suffix="."+buffer+"B";
                left = left / 1_000_000_000;
            }

            String quantity = String.format("%,2d%n", left).trim() + suffix;
            return new SimpleStringProperty(quantity);
        };

        public static final Callback<TableColumn<Pair<ItemEffect, Label>, Label>, TableCell<Pair<ItemEffect, Label>, Label>>
                moduleEffectValueFactory = (param) -> new TableCell<Pair<ItemEffect, Label>, Label>()
        {
            @Override
            protected void updateItem(Label item, boolean empty)
            {
                super.updateItem(item, empty);
                if (item == null || empty) setGraphic(null);
                else
                {
                    setAlignment(Pos.CENTER_RIGHT);
                    item.setPadding(new Insets(0,5,0,0));
                    setGraphic(item);
                }
            }
        };

        public static final Callback<TableColumn<Pair<ItemEffect, Label>, Label>, TableCell<Pair<ItemEffect, Label>, Label>>
                moduleEffectUnitFactory = (param) -> new TableCell<Pair<ItemEffect, Label>, Label>()
        {
            @Override
            protected void updateItem(Label item, boolean empty)
            {
                super.updateItem(item, empty);
                if (item == null || empty) setGraphic(null);
                else
                {
                    setAlignment(Pos.CENTER_LEFT);
                    item.getStyleClass().add("general_stat_label");
                    setGraphic(item);
                }
            }
        };


        public static final Callback<TableColumn<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>>, TableCell<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>>>
                moduleNameCellFactory = (param) -> new TableCell<Pair<ItemEffect, Label>, Pair<ItemEffect, Label>>()
        {
            @Override
            protected void updateItem(Pair<ItemEffect, Label> item, boolean empty)
            {
                super.updateItem(item, empty);
                if (item == null || empty)
                {
                    setGraphic(null);
                    return;
                }
                Label name = new Label(item.getKey().toString());

                ItemEffect.EffectType effectType = item.getKey().effectType;
                String colorClass;
                switch (effectType)
                {
                    case MODIFICATION:
                        colorClass = "modification_stat_label";
                        break;

                    case EXPERIMENTAL:
                        colorClass = "experimental_stat_label";
                        break; //modification_stat_label

                    case ANTI_XENO:
                        colorClass = "anti_xeno_stat_label";
                        break;

                    case GUARDIAN:
                        colorClass = "guardian_stat_label";
                        break;

                    case STANDARD:
                    default:
                        colorClass = "general_stat_label";
                        break;
                }


                name.getStyleClass().addAll(colorClass, "base_font");
                name.setPadding(new Insets(0,0,0,5));
                setGraphic(name);
            }
        };



        /**
         * Standard mathematical range mapping function. Accepts a number within a given range and maps it to a
         * corresponding value in a different range.
         *
         * @param input the numerical value to map from the input range to the output range
         * @param inputMin low end of the input range, the input parameter should be greater than or equal to this value
         * @param inputMax high end of the input range, the input parameter should be less than or equal to this value
         * @param outputMin low end of the output range, the return value will be greater than or equal to this value
         * @param outputMax high end of the output range, the return value will be less than or equal to this value
         * @return the result of applying the mapping function on the inputValue from the input range to the output range
         */
        public static double mapRange(double input, double inputMin, double inputMax, double outputMin, double outputMax)
        {
            return outputMin + ((input - inputMin) * (outputMax - outputMin)) / (inputMax - inputMin);
        }

        /**
         * Rounding function for double values. Uses an intermediate BigDecimal object to round (not truncate)
         *
         * @param value double value to round
         * @param precision number of digits to round to
         * @return the input value, rounded tot he desired precision
         */
        public static double round(double value, int precision)
        {
            if (precision < 0) return value;
            BigDecimal decimal = new BigDecimal(value);
            decimal = decimal.setScale(precision, RoundingMode.HALF_UP);
            return decimal.doubleValue();
        }

        /**
         * Finds the bearing, in degrees, that an observer at a given set of coordinates should travel in order to move
         * toward a point at a different set of co-ordinates. Coordinates are given as latitude/longitude pairs
         * representing the current location and the destination. The returned bearing value is converted to the angle
         * range between 0 and 360 (as opposed to between -180 and 180) and is rounded to 2 decimal places.
         *
         * NOTE: uses static import of {@linkplain java.lang.Math}
         *
         * @param locationLatitude latitude of the current location
         * @param locationLongitude longitude of the current location
         * @param destinationLatitude latitude of the destination
         * @param destinationLongitude longitude of the destination
         * @return bearing angle from the current location that will lead to the destination
         */
        static double calculateBearingAngle(double locationLatitude,
                                            double locationLongitude,
                                            double destinationLatitude,
                                            double destinationLongitude)
        {
            double phiStart = toRadians(locationLatitude);
            double phiEnd = toRadians(destinationLatitude);
            double delta = toRadians(destinationLongitude - locationLongitude);

            double ordinate = (sin(delta) * cos(phiEnd));
            double abscissa = (cos(phiStart) * sin(phiEnd) - sin(phiStart) * cos(phiEnd) * cos(delta));
            double theta = atan2(ordinate, abscissa);

            double bearing = toDegrees(theta);
            if (bearing < 0 ) { bearing += 360; }
            return round(bearing, 2);
        }
    }

    /**
     * Mapping functions used to produce UI elements from other data objects
     */
    public static class Convert
    {
        public static Region createMaterialIconRegion(SVGPath svg, double width, double height, String color)
        {
            final Region svgShape = new Region();
            svgShape.setShape(svg);

            svgShape.setMinSize(width, height);
            svgShape.setPrefSize(width, height);
            svgShape.setMaxSize(width, height);
            svgShape.setStyle("-fx-background-color: " + color + ";");
            double originalWidth = svg.prefWidth(-1);
            double originalHeight = svg.prefHeight(originalWidth);

            double scaleX = width / originalWidth;
            double scaleY = height / originalHeight;

            svg.setScaleX(scaleX);
            svg.setScaleY(scaleY);
            return svgShape;
        }

        // Creates a Label object from a Pair<ItemEffect, Double>. The provided pair represents the effect that some
        // modification or experimental effect would have on whatever item it is applied to, and the magnitude of that
        // effect. If the magnitude is a positive number, it would be added to the base value of any modified item, and
        // likewise, a negative value would become a subtraction from any base value.
        public static Function<ItemEffectData, Label> effectToLabel = (pair) ->
        {
            Label nextLabel = new Label();

            nextLabel.getStyleClass().addAll("base_font");

            // get the "more is good" flag for this effect
            boolean moreIsGood = pair.getEffect().moreIsGood;

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
                        +  pair.getDoubleValue();;//pair.getDoubleValue();

                // some effects have a zero value, such effects are generally "binary" on/off values, so we can just remove
                // the trailing "point zero" suffix
                text = text.replace(".0","");

                // todo: clean this up, there's extra checks here
                // to make the text match the in game values, add a percent sign (%)
                if (text.contains("-") || text.contains("+")) text += "%";
                text = text.replace("+0%","");

                // now create the label object using the text we just created
                nextLabel.setText(text);

                // text fill is a separate value, set it to the "good" or "bad" font as appropriate
                nextLabel.setTextFill(isGood ? Style.positiveBlue : Style.negativeRed);
            }
            else
            {
                nextLabel.setText(pair.getEffect().toString() + " " + pair.getStringValue());
            }

            return nextLabel;
        };




        public static Function<ItemEffectData, Pair<String, Object>> moduleEffectToLabel = (effectData) ->
        {
            if (effectData.isNumerical())
            {
                if (effectData.getDoubleValue() == Double.MAX_VALUE)
                {
                    return new Pair<>(effectData.getEffect().toString(), UIFunctions.Symbols.INFINITY);
                }
                else
                {
                    return new Pair<>(effectData.getEffect().toString(),
                            UIFunctions.Data.round(effectData.getDoubleValue(), 2));
                }

            }
            else
            {
                return new Pair<>(effectData.getEffect().toString(), effectData.getStringValue());
            }
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

        // sort InventoryData objects by category ordinal
        static final Comparator<InventoryData> itemByCategory =
                Comparator.comparingInt(InventoryData::getCategoryOrdinal);

        // sort InventoryData objects by grade, lowest to highest
        static final Comparator<InventoryData> itemByGrade =
                Comparator.comparingInt(InventoryData::getGradeOrdinal);

        // sort InventoryData objects numerically by count, highest to lowest
        static final Comparator<InventoryData> itemByCount =
                Comparator.comparingLong(InventoryData::getQuantity).reversed();

        // used for Label objects that are actually just string representations of Integer values. Will sort them
        // numerically lowest to highest
        static final Comparator<Label> quantityByNumericValue =
                Comparator.comparingInt(a -> {
                    try
                    {
                        return Integer.parseInt(a.getText().trim());
                    }
                    catch (Exception e)
                    {
                        int slashIndex = a.getText().indexOf("/");
                        String stripped = a.getText().substring(0, slashIndex).trim();
                        return Integer.parseInt(stripped);
                    }
                });

        static final Comparator<ProgressBar> progressByValue =
                Comparator.comparingDouble(ProgressIndicator::getProgress);

        // sorts tasks by name, and ensure trade tasks always come after all other task types
        static final Comparator<TaskData> tasksByName =
                (a, b)->
                {
                    if (a.isTrade() != b.isTrade())
                    {
                        return a.isTrade() ? 1 : -1;
                    }

                    String as = a.asPair().getKey().getName() + a.asPair().getValue().getName();
                    String bs = b.asPair().getKey().getName() + b.asPair().getValue().getName();
                    return as.compareTo(bs);
                };

        // sorts tasks by grade, and ensure trade tasks always come after all other task types
        static final Comparator<TaskData> taskByGrade =
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
                (a, b) ->
                {
                    long aNeed = a.getNeed();
                    long bNeed = b.getNeed();
                    long aHave = a.getHave();
                    long bHave = b.getHave();
                    boolean aok = aHave >= aNeed;
                    boolean bok = bHave >= bNeed;

                    long r2;

                    if (aok && bok) r2 = 0;
                    else if (aok || bok) r2 = aok ? 1 : -1;
                    else
                    {
                        long aDiff = abs(aNeed - aHave);
                        long bDiff = abs(bNeed - bHave);
                        r2 = bDiff - aDiff;
                    }

                    // todo: un-obfuscate this
                    return r2 == 0 ? 0 : r2 < 0 ? -1 : 1;
                };

        // trade task by best cost/yield ratio
        public static final Comparator<TaskRecipe> bestCostYieldRatio =
                (a, b)->
                {
                    long aCost = a.costStream().filter(c -> c.getQuantity() > 0)
                            .mapToLong(CostData::getQuantity).sum();

                    long bCost = b.costStream().filter(c -> c.getQuantity() > 0)
                            .mapToLong(CostData::getQuantity).sum();

                    long aYield = a.costStream().filter(c -> c.getQuantity() < 0)
                            .mapToLong(CostData::getQuantity)
                            .map(Math::abs)
                            .sum();

                    long bYield = b.costStream().filter(c -> c.getQuantity() < 0)
                            .mapToLong(CostData::getQuantity)
                            .map(Math::abs)
                            .sum();

                    // todo: un-obfuscate this
                    long x = bYield - aYield;
                    if (aCost == bCost)
                        return x == 0 ? 0 : x < 0 ? -1 : 1;
                    long y = aCost - bCost;
                    return y < 0 ? -1 : 1;
                };
    }
}
