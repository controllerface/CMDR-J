package com.controllerface.cmdr_j.enums.craftable.upgrades;


import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum UpgradeCategory
{
    Suits(EnumSet.of(UpgradeType.Suits)),

    Weapons(EnumSet.of(UpgradeType.Kinetic_Weapons,
        UpgradeType.Laser_Weapons,
        UpgradeType.Plasma_Weapons));

    private final EnumSet<UpgradeType> modificationTypes;

    UpgradeCategory(EnumSet<UpgradeType> modificationTypes)
    {
        this.modificationTypes = modificationTypes;
    }

    public Stream<UpgradeType> typeStream()
    {
        return modificationTypes.stream();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }
}
