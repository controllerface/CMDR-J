package com.controllerface.cmdr_j.utilities;

import java.io.File;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import static java.lang.Math.*;
import static java.lang.Math.toDegrees;

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

    /**
     * When rendering galactic points on a galaxy model, the center of the model is actually
     * Sagittarius A*, not Sol. However, all galactic coordinates are specified relative to SOL.
     * These offsets can be applied to any galactic co-ordinates to translate them from offset
     * to Sol to an offset from Sagittarius A*. I.e., the following offsets are the inverse of
     * the coordinates of Sagittarius A*.
     */
    public static final double GALAXY_OFFSET_X = -25.21875;
    public static final double GALAXY_OFFSET_Y = -25899.96875;
    public static final double GALAXY_OFFSET_Z = 20.90625;

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

    public static class Math
    {
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
         * Haversine function: hav(θ) = sin ^ 2 (θ/2)
         *
         * @param radAngle input angle in radians
         * @return haversine distance of the input angle
         */
        public static double haversine(double radAngle)
        {
            return sin(radAngle / 2) * sin(radAngle / 2);
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
        public static double calculateBearingAngle(double locationLatitude,
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
            if (bearing < 0 )
            {
                bearing += 360;
            }
            return round(bearing, 2);
        }

        /**
         * Calculates a distance between two latitude/longitude pairs, taking into account the radius of the planet and
         * the observer's altitude. Waypoints are currently assumed to be on the planet's surface for the purpose of
         * distance calculations. Due to irregularities in planet topology, the distances may be slightly off depending
         * on the planet. For use as a general guide though, the values and relative positions in the map should be
         * correct. The unit of measurement for this function is meters.
         *
         * This method uses the old trigonometric Haversine function to determine the "Great circle distance" between
         * two latitude and longitude points on the planet.
         *
         * @param targetLongitude target longitude
         * @param targetLatitude target latitude
         * @param originLatitude origin latitude
         * @param originLongitude origin longitude
         * @param originAltitude origin altitude
         * @param planetRadius radius of the planet
         * @return the approximate distance between the two points in meters
         */
        public static double calculateSurfaceDistance(double targetLongitude,
                                                      double targetLatitude,
                                                      double originLatitude,
                                                      double originLongitude,
                                                      double originAltitude,
                                                      double planetRadius)
        {
            double latDistance = toRadians(targetLatitude - originLatitude);
            double lonDistance = toRadians(targetLongitude - originLongitude);

            double a = haversine(latDistance)
                + cos(toRadians(originLatitude))
                * cos(toRadians(targetLatitude))
                * haversine(lonDistance);

            double c = 2 * atan2(sqrt(a), sqrt(1 - a));

            double adjustedDistance = planetRadius * c;

            return sqrt(pow(adjustedDistance, 2) + pow(originAltitude, 2));
        }

        /**
         * Calculates the absolute distance between two three-dimensional points in space.
         * There are no inherent units assumed, it is the responsibility of the calling code
         * to interpret the units of returned value and implicitly, to ensure both points are
         * in the same scale.
         *
         * @param x1 destination X position
         * @param y1 destination Y position
         * @param z1 destination z position
         * @param x2 origin X position
         * @param y2 origin Y position
         * @param z2 origin z position
         * @return the absolute distance between two three-dimensional points
         */
        public static double calculate3dDistance(double x1, double y1, double z1,
                                                 double x2, double y2, double z2)
        {
            // AB = |√((x2−x1)^2+(y2−y1)^2+(z2−z1)^2)|

            double xDiff = x1 - x2;
            double yDiff = y1 - y2;
            double zDiff = z1 - z2;

            double xSq = java.lang.Math.pow((xDiff), 2);
            double ySq = java.lang.Math.pow((yDiff), 2);
            double zSq = java.lang.Math.pow((zDiff), 2);

            double sum = xSq + ySq + zSq;

            return round(java.lang.Math.abs(java.lang.Math.sqrt(sum)), 2);
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

    }
}
