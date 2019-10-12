package com.controllerface.cmdr_j.enums.equipment.modules.stats;

import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

/**
 * An enumeration of items grades in Elite: Dangerous. Some grade values may be used for multiple purposes
 *
 * Created by Controllerface on 3/20/2018.
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

    VERY_COMMON(1, 300, "Very Common",
            new Icon(UIFunctions.Icons.materialGrade1, 28, 25, UIFunctions.Style.standardOrange)),

    COMMON     (2, 250, "Common",
            new Icon(UIFunctions.Icons.materialGrade2, 28, 25, UIFunctions.Style.standardOrange)),

    STANDARD   (3, 200, "Standard",
            new Icon(UIFunctions.Icons.materialGrade3, 28, 25, UIFunctions.Style.standardOrange)),

    RARE       (4, 150, "Rare",
            new Icon(UIFunctions.Icons.materialGrade4, 28,  25, UIFunctions.Style.standardOrange)),

    VERY_RARE  (5, 100, "Very Rare",
            new Icon(UIFunctions.Icons.materialGrade5, 28, 25, UIFunctions.Style.standardOrange)),

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

    Drone(0, "Limpet Drone", "Star Port Restock Services",
            new Icon(UIFunctions.Icons.limpet, 25, 25) ),   // standard commodities and salvage

    Mining(1, "Asteroid Mining", "Asteroid and Planetary Ring Mining",
            new Icon(UIFunctions.Icons.mining, 25, 25)),  // attainable by mining only

    Space(2, "Commodity", "Star Port Commodity Markets",
            new Icon(UIFunctions.Icons.cargo,25,25)),   // standard commodities and salvage

    Salvage(3, "Salvage", "Combat Wreckage/Unidentified Signal Sources",
            new Icon(UIFunctions.Icons.cargo, 25, 25, UIFunctions.Style.darkOrange)), // salvage

    RareCommodity(4, "Rare Commodity", "Exclusive to Specific Star Port Markets",
            new Icon(UIFunctions.Icons.cargo, 25, 25, UIFunctions.Style.specialYellow)),    // rare commodities, from specific star ports

    Mission(5, "Mission Reward", "Mission Rewards",
            new Icon(UIFunctions.Icons.mission,25,25)), // mission reward exclusive

    Planet(6, "Planetary Port", "Planetary Port Commodity Markets",
            new Icon(UIFunctions.Icons.planetaryPort,25,25)),  // only available at planetary ports

    POI(7, "Planetary POI", "Planetary Points of Interest",
            new Icon(UIFunctions.Icons.horizon, 25, 25)),     // must be found at planetary POI

    Thargoid(8, "Thargoid Salvage", "Thargoid Combat/Planetary Sites",
            new Icon(UIFunctions.Icons.aegis, 25, 25, UIFunctions.Style.thargoidGreen)),   // salvage

    Guardian(9, "Guardian Salvage", "Ancient Ruins",
            new Icon(UIFunctions.Icons.guardian,25,25, UIFunctions.Style.hotBlue)),   // salvage

    Faction(10, "Faction Item", "Power Play Faction Contact",
            new Icon(UIFunctions.Icons.powerplay, 25, 25)), // power play specific items

    MaterialTrade(0, -1, "Trade"),

    Credits(0,-1,"Credits", UIFunctions.Icons.creditsIcon),

    Any(0,-1,"Any"),

    ;

    private final int numericalValue;
    private final int maximumQuantity;
    private final String text;
    private final String locationDescription;
    private final Icon icon;

    ItemGrade(int numericalValue, String text)
    {
        this(numericalValue, -1, text, "", null);
    }

    ItemGrade(int numericalValue, int maximumQuantity, String text)
    {
        this(numericalValue, maximumQuantity, text, "", null);
    }

    ItemGrade(int numericalValue, int maximumQuantity, String text, Icon icon)
    {
        this(numericalValue, maximumQuantity, text, "", icon);
    }

    ItemGrade(int numericalValue, String text, String locationDescription)
    {
        this(numericalValue, -1, text, locationDescription, null);
    }

    ItemGrade(int numericalValue, String text, String locationDescription, Icon icon)
    {
        this(numericalValue, -1, text, locationDescription, icon);
    }

    ItemGrade(int numericalValue, int maximumQuantity, String text, String locationDescription, Icon icon)
    {
        this.numericalValue = numericalValue;
        this.maximumQuantity = maximumQuantity;
        this.text = text;
        this.locationDescription = locationDescription;
        this.icon = icon == null ? UIFunctions.Icons.cargoIcon : icon;
    }

    @Override
    public String toString()
    {
        return text;
    }

    public String getLocationDescription()
    {
        return locationDescription;
    }

    public int getNumericalValue()
    {
        return numericalValue;
    }

    public int getMaximumQuantity()
    {
        return maximumQuantity;
    }

    public Icon getIcon()
    {
        return icon;
    }

    public static int compare(ItemGrade a, ItemGrade b)
    {
        return Integer.compare(a.numericalValue, b.numericalValue);
    }
}
