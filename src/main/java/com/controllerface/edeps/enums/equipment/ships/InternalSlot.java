package com.controllerface.edeps.enums.equipment.ships;

import com.controllerface.edeps.Statistic;

/**
 * Created by Stephen on 4/18/2018.
 */
public enum InternalSlot implements Statistic
{
    ShipCockpit,
    CargoHatch,
    LargeHardpoint1,
    LargeHardpoint2,
    LargeHardpoint3,
    MediumHardpoint1,
    MediumHardpoint2,
    TinyHardpoint1,
    TinyHardpoint2,
    TinyHardpoint3,
    TinyHardpoint4,
    PaintJob,
    Decal1,
    Decal2,
    Decal3,
    ShipName0,
    ShipName1,
    Armour,
    PowerPlant,
    MainEngines,
    FrameShiftDrive,
    LifeSupport,
    PowerDistributor,
    Radar,
    FuelTank,
    Slot01_Size6,
    Slot01_Size5,
    Slot02_Size6,
    Slot02_Size4,
    Slot02_Size5,
    Slot03_Size6,
    Slot03_Size2,
    Slot03_Size3,
    Slot04_Size3,
    Slot04_Size5,
    Slot05_Size3,
    Slot05_Size5,
    Slot05_Size1,
    Slot06_Size2,
    Slot06_Size4,
    Slot06_Size1,
    Slot07_Size3,
    Slot07_Size2,
    Slot08_Size3,
    Slot09_Size2,
    Military01,
    PlanetaryApproachSuite,
    ShipKitSpoiler,
    ShipKitWings,
    ShipKitTail,
    WeaponColour,
    EngineColour,
    VesselVoice,

    ;

    @Override
    public String getKey()
    {
        return name();
    }

    @Override
    public String getText()
    {
        return name();
    }
}
