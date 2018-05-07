package com.controllerface.edeps.structures.equipment;

/**
 * An enumeration of items grades in Elite: Dangerous. Some grade values may be used for multiple purposes
 *
 * Created by Stephen on 3/20/2018.
 */
public enum ItemGrade
{
    /*
    Generic Grades, used for materials and engineering modifications
     */
    GRADE_1(1),
    GRADE_2(2),
    GRADE_3(3),
    GRADE_4(4),
    GRADE_5(5),

    /*
    Synthesis Grades
     */
    BASIC(1),
    STANDARD(2),
    PREMIUM(3),


    /*
    Cargo Types. These are used mainly for differentiating where certain items are found, and making sorting of items
    in the inventory tab easier
     */

    Space(0),   // standard commodities and salvage
    Planet(1),  // only available at planetary ports
    Mining(2),  // attainable by mining only
    Mission(3), // mission reward exclusive
    POI(4),     // must be found at planetary POI
    Rare(5),    // rare commodities, from specific star ports
    Faction(100), // power play specific items

    /*
    Used for Engineer experimental effects
     */
    Experimental(101),

    /*
    Used for items unlocked via Tech Brokers
     */
    Technology(102),

    ;

    private final int numericalValue;

    ItemGrade(int numericalValue)
    {
        this.numericalValue = numericalValue;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("GRADE_", "");
    }

    public int getNumericalValue()
    {
        return numericalValue;
    }

    public static int compare(ItemGrade a, ItemGrade b)
    {
        return Integer.compare(a.numericalValue, b.numericalValue);
    }
}
