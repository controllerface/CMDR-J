package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipManufacturer;
import com.controllerface.cmdr_j.enums.equipment.ships.shipdata.ShipSize;

/**
 * Created by Controllerface on 4/30/2018.
 */
public class BaseShipStats
{
    public final String displayName;
    public final ShipSize shipSize;
    public final ShipManufacturer manufacturer;
    public final double agility;
    public final double hullMass;
    public final double hullHardness;
    public final double speed;
    public final double maxSpeed;
    public final double boostSpeed;
    public final double maxBoostSpeed;
    public final double armorRating;
    public final double shield;
    public final double baseCost;
    public final int massLockFactor;
    public final int crewSeats;
    public final boolean slfCapable;

    private BaseShipStats(Builder builder)
    {
        this.displayName = builder.displayName;
        this.shipSize = builder.shipSize;
        this.manufacturer = builder.manufacturer;
        this.agility = builder.agility;
        this.hullMass = builder.hullMass;
        this.hullHardness = builder.hullHardness;
        this.speed = builder.speed;
        this.maxSpeed = builder.maxSpeed;
        this.boostSpeed = builder.boostSpeed;
        this.maxBoostSpeed = builder.maxBoostSpeed;
        this.armorRating = builder.armorRating;
        this.shield = builder.shield;
        this.baseCost = builder.baseCost;
        this.massLockFactor = builder.massLockFactor;
        this.crewSeats = builder.crewSeats;
        this.slfCapable = builder.slfCapable;
    }

    public static Builder builder() { return new Builder(); }

    public static class Builder
    {
        private String displayName;
        private ShipSize shipSize;
        private ShipManufacturer manufacturer;
        private Double agility;
        private Double hullMass;
        private Double hullHardness;
        private Double speed;
        private Double maxSpeed;
        private Double boostSpeed;
        private Double maxBoostSpeed;
        private Double armorRating;
        private Double shield;
        private Double baseCost;
        private Integer massLockFactor;
        private Integer crewSeats;
        private boolean slfCapable;

        public Builder setDisplayName(String displayName)
        {
            this.displayName = displayName;
            return this;
        }

        public Builder setShipSize(ShipSize shipSize)
        {
            this.shipSize = shipSize;
            return this;
        }

        public Builder setManufacturer(ShipManufacturer manufacturer)
        {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder setAgility(double agility)
        {
            this.agility = agility;
            return this;
        }

        public Builder setHullMass(double hullMass)
        {
            this.hullMass = hullMass;
            return this;
        }

        public Builder setHullHardness(double hullHardness)
        {
            this.hullHardness = hullHardness;
            return this;
        }

        public Builder setSpeed(double speed)
        {
            this.speed = speed;
            return this;
        }

        public Builder setMaxSpeed(double maxSpeed)
        {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setBoostSpeed(double boostSpeed)
        {
            this.boostSpeed = boostSpeed;
            return this;
        }

        public Builder setMaxBoostSpeed(double maxBoostSpeed)
        {
            this.maxBoostSpeed = maxBoostSpeed;
            return this;
        }

        public Builder setArmorRating(double armorRating)
        {
            this.armorRating = armorRating;
            return this;
        }

        public Builder setShield(double shield)
        {
            this.shield = shield;
            return this;
        }

        public Builder setBaseCost(double baseCost)
        {
            this.baseCost = baseCost;
            return this;
        }

        public Builder setMassLockFactor(int massLockFactor)
        {
            this.massLockFactor = massLockFactor;
            return this;
        }

        public Builder setCrewSeats(int crewSeats)
        {
            this.crewSeats = crewSeats;
            return this;
        }

        public Builder setSlfCapable(boolean slfCapable)
        {
            this.slfCapable = slfCapable;
            return this;
        }

        public BaseShipStats build()
        {
            if (displayName == null) throw new UnsupportedOperationException("displayName must be set");
            if (shipSize == null) throw new UnsupportedOperationException("shipSize must be set");
            if (manufacturer == null) throw new UnsupportedOperationException("manufacturer must be set");
            if (agility == null) throw new UnsupportedOperationException("agility must be set");
            if (hullMass == null) throw new UnsupportedOperationException("hullMass must be set");
            if (hullHardness == null) throw new UnsupportedOperationException("hullHardness must be set");
            if (speed == null) throw new UnsupportedOperationException("speed must be set");
            if (maxSpeed == null) throw new UnsupportedOperationException("maxSpeed must be set");
            if (boostSpeed == null) throw new UnsupportedOperationException("boostSpeed must be set");
            if (maxBoostSpeed == null) throw new UnsupportedOperationException("maxBoostSpeed must be set");
            if (armorRating == null) throw new UnsupportedOperationException("armorRating must be set");
            if (shield == null) throw new UnsupportedOperationException("shield must be set");
            if (baseCost == null) throw new UnsupportedOperationException("baseCost must be set");
            if (massLockFactor == null) throw new UnsupportedOperationException("massLockFactor must be set");
            if (crewSeats == null) throw new UnsupportedOperationException("crewSeats must be set");

            return new BaseShipStats(this);
        }
    }
}
