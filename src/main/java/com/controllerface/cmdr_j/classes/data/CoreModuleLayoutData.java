package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.enums.equipment.modules.stats.ModuleSize;

/**
 * Represents a configuration of "core" modules for a Ship in elite dangerous. All ships have standard modules of
 * varying sizes that determine the largest size component that can have in each slot. An instance of this object
 * is used to store these sizes for reference, allowing a UI to present the user with a range of compatible modules
 * from an exhaustive list that may contain several modules, some of which are compatible and some of which are not.
 *
 * Created by Controllerface on 4/16/2018.
 */
public class CoreModuleLayoutData
{
    public final ModuleSize powerPlant;
    public final ModuleSize thrusters;
    public final ModuleSize frameShiftDrive;
    public final ModuleSize lifeSupport;
    public final ModuleSize powerDistributor;
    public final ModuleSize sensors;
    public final ModuleSize fuelTank;

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

    public static Builder builder() { return new Builder(); }

    public static class Builder
    {
        private ModuleSize powerPlant = null;
        private ModuleSize thrusters = null;
        private ModuleSize frameShiftDrive = null;
        private ModuleSize lifeSupport = null;
        private ModuleSize powerDistributor = null;
        private ModuleSize sensors = null;
        private ModuleSize fuelTank = null;


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
            if (powerPlant == null) throw new UnsupportedOperationException("powerPlant size must be set");
            if (thrusters == null) throw new UnsupportedOperationException("thrusters size must be set");
            if (frameShiftDrive == null) throw new UnsupportedOperationException("frameShiftDrive size must be set");
            if (lifeSupport == null) throw new UnsupportedOperationException("lifeSupport size must be set");
            if (powerDistributor == null) throw new UnsupportedOperationException("powerDistributor size must be set");
            if (sensors == null) throw new UnsupportedOperationException("sensors size must be set");
            if (fuelTank == null) throw new UnsupportedOperationException("fuelTank size must be set");

            return new CoreModuleLayoutData(this);
        }
    }
}
