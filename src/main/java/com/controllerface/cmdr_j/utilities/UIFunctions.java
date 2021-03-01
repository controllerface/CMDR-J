package com.controllerface.cmdr_j.utilities;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

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
    public static final String DATA_FOLDER = System.getProperty("user.home") + File.separator + "CMDR_J";

    public static class Symbols
    {
        public static final String DEGREES = "&deg;";
        public static final String INFINITY = "&infin;";
    }

    public static class Format
    {
        public static String secondsToTimeString(long seconds)
        {
            var duration = Duration.ofSeconds(seconds).toString();
            var timeString = duration.replace("PT","")
                .replace("H", " H ")
                .replace("M", " M ")
                .replace("S", " S").trim();

            var hourMarker = timeString.indexOf(" H ");
            if (hourMarker != -1)
            {
                var hours = Long.parseLong(timeString.substring(0, hourMarker));
                if (hours >= 24)
                {
                    var days = TimeUnit.HOURS.toDays(hours);
                    var newHours = hours - (days * 24);
                    timeString = timeString.replace(hours + " H ", newHours + " H ");
                    timeString = days + " D " + timeString;
                }
            }
            return timeString;
        }
    }

    /**
     * Callback and Callback producing functions that control how various UI elements are created and displayed
     */
    public static class Data
    {
        public static final Predicate<File> destroyDirectory =
            (targetDirectory) -> Optional.ofNullable(targetDirectory)
                .map(File::listFiles)
                .map(directoryContents -> Arrays.stream(directoryContents)
                    .map(file -> file.isDirectory()
                        ? UIFunctions.Data.destroyDirectory.test(file)
                        : file.delete())
                    .reduce((previousResults, nextResult) -> previousResults && nextResult)
                    .map(contentRemovalResults -> contentRemovalResults && targetDirectory.delete())
                    .orElse(targetDirectory.delete()))
                .orElse(false);

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
    }
}
