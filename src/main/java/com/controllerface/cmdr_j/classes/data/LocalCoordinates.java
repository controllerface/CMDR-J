package com.controllerface.cmdr_j.classes.data;

import java.util.HashMap;
import java.util.Map;

public class LocalCoordinates
{
    public final boolean nearPlanet;
    public final double latitude;
    public final double longitude;
    public final double altitude;
    public final double heading;
    public final double radius;
    public final double xOffset;
    public final double yOffset;
    public LocalCoordinates(boolean nearPlanet,
                            double latitude,
                            double longitude,
                            double altitude,
                            double heading,
                            double radius, double xOffset, double yOffset)
    {
        this.nearPlanet = nearPlanet;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.heading = heading;
        this.radius = radius;
        this.xOffset = xOffset;
        this.yOffset = yOffset;
    }

    public Map<String, Object> toMap()
    {
        var dataMap = new HashMap<String, Object>();
        dataMap.put("nearPlanet", nearPlanet);
        dataMap.put("latitude", latitude);
        dataMap.put("longitude", longitude);
        dataMap.put("altitude", altitude);
        dataMap.put("heading", heading);
        dataMap.put("radius", radius);
        dataMap.put("xOffset", xOffset);
        dataMap.put("yOffset", yOffset);
        return dataMap;
    }

    public static class Builder
    {

        private boolean nearPlanet;
        private double latitude;
        private double longitude;
        private double altitude;
        private double heading;
        private double radius;

        private double xOffset;
        private double yOffset;

        public Builder setNearPlanet(boolean nearPlanet)
        {
            this.nearPlanet = nearPlanet;
            return this;
        }

        public Builder setLatitude(double latitude)
        {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(double longitude)
        {
            this.longitude = longitude;
            return this;
        }

        public Builder setAltitude(double altitude)
        {
            this.altitude = altitude;
            return this;
        }

        public Builder setHeading(double heading)
        {
            this.heading = heading;
            return this;
        }

        public Builder setRadius(double radius)
        {
            this.radius = radius;
            return this;
        }

        public Builder setxOffset(double xOffset)
        {
            this.xOffset = xOffset;
            return this;
        }

        public Builder setyOffset(double yOffset)
        {
            this.yOffset = yOffset;
            return this;
        }

        public LocalCoordinates build()
        {
            return new LocalCoordinates(nearPlanet, latitude, longitude, altitude, heading, radius, xOffset, yOffset);
        }
    }
}
