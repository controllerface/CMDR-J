package com.controllerface.cmdr_j.enums.equipment.ships.moduleslots;

import com.controllerface.cmdr_j.classes.commander.Statistic;

/**
 * Created by Controllerface on 4/18/2018.
 */
public enum CosmeticSlot implements Statistic
{
    PaintJob("Paint Job"),
    Decal1("Decal 1"),
    Decal2("Decal 2"),
    Decal3("Decal 3"),
    ShipName0("Name Plate 1"),
    ShipName1("Name Plate 2"),
    ShipKitSpoiler("Spoiler"),
    ShipKitWings("Wings"),
    ShipKitBumper("Nose"),
    ShipKitTail("Tail"),
    WeaponColour("Weapon Effect"),
    EngineColour("Engine Effect"),
    VesselVoice("COVAS Voice"),

    ;

    private final String text;

    CosmeticSlot(String text)
    {
        this.text = text;
    }

    @Override
    public String getKey()
    {
        return name();
    }

    @Override
    public String getText()
    {
        return text;
    }

    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public String format(Object raw)
    {
        return raw.toString();
    }
}
