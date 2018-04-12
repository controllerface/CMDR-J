package com.controllerface.edeps.enums.common;

/**
 * An enumeration of all the crafting material grades in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum ItemGrade
{
    GRADE_1,
    GRADE_2,
    GRADE_3,
    GRADE_4,
    GRADE_5,
    Space, // rare
    Rare, // mission reward
    Mining, // mission reward
    Planet, // surface markets only
    POI, // surface collection only
    Mission,
    Faction; // power play only

    @Override
    public String toString()
    {
        return super.toString().replace("GRADE_", "");
    }
}
