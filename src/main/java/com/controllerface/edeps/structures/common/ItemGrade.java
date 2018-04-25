package com.controllerface.edeps.structures.common;

/**
 * An enumeration of all the crafting material grades in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum ItemGrade
{
    /*
    Material Grades
     */
    GRADE_1,
    GRADE_2,
    GRADE_3,
    GRADE_4,
    GRADE_5,

    /*
    Cargo Types
     */
    Space,   // standard commodities and salvage
    Rare,    // rare commodities, from specific star ports
    Mining,  // attainable by mining only
    Planet,  // only available at planetary ports
    POI,     // must be found at planetary POI
    Mission, // mission reward exclusive
    Faction; // power play specific items

    @Override
    public String toString()
    {
        return super.toString().replace("GRADE_", "");
    }
}
