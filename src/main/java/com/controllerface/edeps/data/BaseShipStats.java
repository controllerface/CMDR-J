package com.controllerface.edeps.data;

import com.controllerface.edeps.structures.equipment.ships.ShipManufacturer;
import com.controllerface.edeps.structures.equipment.ships.ShipSize;

/**
 * Created by Stephen on 4/30/2018.
 */
public class BaseShipStats
{
    private final String displayName;
    private final ShipSize shipSize;
    private final ShipManufacturer manufacturer;
    private final int agility;
    private final int hullMass;
    private final int hullHardness;
    private final int speed;
    private final int maxSpeed;
    private final int boostSpeed;
    private final int maxBoostSpeed;
    private final int armorRating;
    private final int baseShield;
    private final int baseCost;
    private final int massLockFactor;
    private final int crewSeats;
    private final boolean slfCapable;

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
        this.baseShield = builder.baseShield;
        this.baseCost = builder.baseCost;
        this.massLockFactor = builder.massLockFactor;
        this.crewSeats = builder.crewSeats;
        this.slfCapable = builder.slfCapable;
    }


    public String getDisplayName()
    {
        return displayName;
    }

    public ShipSize getShipSize()
    {
        return shipSize;
    }

    public ShipManufacturer getManufacturer()
    {
        return manufacturer;
    }

    public int getAgility()
    {
        return agility;
    }

    public int getHullMass()
    {
        return hullMass;
    }

    public int getHullHardness()
    {
        return hullHardness;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getMaxSpeed()
    {
        return maxSpeed;
    }

    public int getBoostSpeed()
    {
        return boostSpeed;
    }

    public int getMaxBoostSpeed()
    {
        return maxBoostSpeed;
    }

    public int getArmorRating()
    {
        return armorRating;
    }

    public int getBaseShield()
    {
        return baseShield;
    }

    public int getBaseCost()
    {
        return baseCost;
    }

    public int getMassLockFactor()
    {
        return massLockFactor;
    }

    public int getCrewSeats()
    {
        return crewSeats;
    }

    public boolean isSlfCapable()
    {
        return slfCapable;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private String displayName;
        private ShipSize shipSize;
        private ShipManufacturer manufacturer;
        private Integer agility;
        private Integer hullMass;
        private Integer hullHardness;
        private Integer speed;
        private Integer maxSpeed;
        private Integer boostSpeed;
        private Integer maxBoostSpeed;
        private Integer armorRating;
        private Integer baseShield;
        private Integer baseCost;
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

        public Builder setAgility(int agility)
        {
            this.agility = agility;
            return this;
        }

        public Builder setHullMass(int hullMass)
        {
            this.hullMass = hullMass;
            return this;
        }

        public Builder setHullHardness(int hullHardness)
        {
            this.hullHardness = hullHardness;
            return this;
        }

        public Builder setSpeed(int speed)
        {
            this.speed = speed;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed)
        {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setBoostSpeed(int boostSpeed)
        {
            this.boostSpeed = boostSpeed;
            return this;
        }

        public Builder setMaxBoostSpeed(int maxBoostSpeed)
        {
            this.maxBoostSpeed = maxBoostSpeed;
            return this;
        }

        public Builder setArmorRating(int armorRating)
        {
            this.armorRating = armorRating;
            return this;
        }

        public Builder setBaseShield(int baseShield)
        {
            this.baseShield = baseShield;
            return this;
        }

        public Builder setBaseCost(int baseCost)
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
            if (baseShield == null) throw new UnsupportedOperationException("baseShield must be set");
            if (baseCost == null) throw new UnsupportedOperationException("baseCost must be set");
            if (massLockFactor == null) throw new UnsupportedOperationException("massLockFactor must be set");
            if (crewSeats == null) throw new UnsupportedOperationException("crewSeats must be set");

            return new BaseShipStats(this);
        }
    }
}
