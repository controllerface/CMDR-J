package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.equipment.modules.ModuleSize;

/**
 * Created by Stephen on 4/16/2018.
 */
public class CoreModuleLayoutData
{
    private final ModuleSize powerPlant;
    private final ModuleSize thrusters;
    private final ModuleSize frameShiftDrive;
    private final ModuleSize lifeSupport;
    private final ModuleSize powerDistributor;
    private final ModuleSize sensors;
    private final ModuleSize fuelTank;

    private CoreModuleLayoutData(Builder builder)
    {
        this.powerPlant = builder.powerPlant;
        this.thrusters = builder.thrusters;
        this.frameShiftDrive = builder.frameShiftDrive;
        this.lifeSupport = builder.lifeSupport;
        this.powerDistributor = builder.powerDistributor;
        this.sensors = builder.sensors;
        this.fuelTank = builder.fuelTank;
    }

    public ModuleSize getPowerPlant()
    {
        return powerPlant;
    }

    public ModuleSize getThrusters()
    {
        return thrusters;
    }

    public ModuleSize getFrameShiftDrive()
    {
        return frameShiftDrive;
    }

    public ModuleSize getLifeSupport()
    {
        return lifeSupport;
    }

    public ModuleSize getPowerDistributor()
    {
        return powerDistributor;
    }

    public ModuleSize getSensors()
    {
        return sensors;
    }

    public ModuleSize getFuelTank()
    {
        return fuelTank;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private ModuleSize powerPlant = ModuleSize.SIZE_0;
        private ModuleSize thrusters = ModuleSize.SIZE_0;
        private ModuleSize frameShiftDrive = ModuleSize.SIZE_0;
        private ModuleSize lifeSupport = ModuleSize.SIZE_0;
        private ModuleSize powerDistributor = ModuleSize.SIZE_0;
        private ModuleSize sensors = ModuleSize.SIZE_0;
        private ModuleSize fuelTank = ModuleSize.SIZE_0;


        public Builder setPowerPlant(ModuleSize size)
        {
            powerPlant = size;
            return this;
        }

        public Builder setThrusters(ModuleSize size)
        {
            thrusters = size;
            return this;
        }

        public Builder setFrameShiftDrive(ModuleSize size)
        {
            frameShiftDrive = size;
            return this;
        }

        public Builder setLifeSupport(ModuleSize size)
        {
            lifeSupport = size;
            return this;
        }

        public Builder setPowerDistributor(ModuleSize size)
        {
            powerDistributor = size;
            return this;
        }

        public Builder setSensors(ModuleSize size)
        {
            sensors = size;
            return this;
        }

        public Builder setFuelTank(ModuleSize size)
        {
            fuelTank = size;
            return this;
        }

        public CoreModuleLayoutData build()
        {
            return new CoreModuleLayoutData(this);
        }
    }
}
