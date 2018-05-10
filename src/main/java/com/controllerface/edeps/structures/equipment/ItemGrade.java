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
    GRADE_1(1, "Grade 1"),
    GRADE_2(2, "Grade 2"),
    GRADE_3(3, "Grade 3"),
    GRADE_4(4, "Grade 4"),
    GRADE_5(5, "Grade 5"),

    VERY_COMMON(1, "Very Common"),
    COMMON(2, "Common"),
    STANDARD(3, "Standard"),
    RARE(4, "Rare"),
    VERY_RARE(5, "Very Rare"),

    /*
    Used for Engineer experimental effects
     */
    Experimental(6, "Experimental"),

    /*
    Used for items unlocked via Tech Brokers
     */
    Technology(7, "Tech Broker"),

    /*
    Synthesis Grades
     */
    SYNTHESIS_BASIC(1, "Basic"),
    SYNTHESIS_STANDARD(2, "Standard"),
    SYNTHESIS_PREMIUM(3, "Premium"),

    /*
    Cargo Types. These are used mainly for differentiating where certain items are found, and making sorting of items
    in the inventory tab easier
     */

    Space(1, "Space"),   // standard commodities and salvage
    Planet(2, "Planet"),  // only available at planetary ports
    Mining(3, "Mining"),  // attainable by mining only
    Mission(4, "Mission"), // mission reward exclusive
    POI(5, "Planet POI"),     // must be found at planetary POI
    Rare(6, "Rare"),    // rare commodities, from specific star ports
    Faction(7, "Faction"), // power play specific items

    ;

    private final String text;
    private final int numericalValue;

    ItemGrade(int numericalValue, String text)
    {
        this.numericalValue = numericalValue;
        this.text = text;
    }

    @Override
    public String toString()
    {
        return text;
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
