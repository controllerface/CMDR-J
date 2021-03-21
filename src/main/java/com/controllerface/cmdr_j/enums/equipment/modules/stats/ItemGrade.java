package com.controllerface.cmdr_j.enums.equipment.modules.stats;

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

    VERY_COMMON(1, 300, "Very Common"
    ),

    COMMON     (2, 250, "Common"
    ),

    STANDARD   (3, 200, "Standard"
    ),

    RARE       (4, 150, "Rare"
    ),

    VERY_RARE  (5, 100, "Very Rare"
    ),

    /*
    Used for Engineer experimental effects
     */
    Experimental(6, "Experimental"),

    /*
    Used for items unlocked via Tech Brokers
     */
    TechnologyBroker(7, "Tech Broker"),

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

    /* currently unused */
    Mining(1, "Asteroid Mining", "Asteroid and Planetary Ring Mining"),
    RareCommodity(4, "Rare Commodity", "Exclusive to Specific Star Port Markets"),
    // only available as mission rewards
    Mission(5, "Mission Reward", "Mission Rewards"),
    // only available at planetary ports
    Planet(6, "Planetary Port", "Planetary Port Commodity Markets"),
    // must be found at planetary POI
    POI(7, "Planetary POI", "Planetary Points of Interest"),
    Thargoid(8, "Thargoid Salvage", "Thargoid Combat/Planetary Sites"),
    Guardian(9, "Guardian Salvage", "Ancient Ruins"),
    /* end unused */

    Drone(0, "Limpet Drone", "Star Port Restock Services"),
    Metals(2, "Commodity", "Star Port Commodity Markets"),
    Minerals(2, "Commodity", "Star Port Commodity Markets"),
    Chemicals(2, "Commodity", "Star Port Commodity Markets"),
    Foods(2, "Commodity", "Star Port Commodity Markets"),
    Textiles(2, "Commodity", "Star Port Commodity Markets"),
    IndustrialMaterials(2, "Commodity", "Star Port Commodity Markets"),
    Medicines(2, "Commodity", "Star Port Commodity Markets"),
    LegalDrugs(2, "Commodity", "Star Port Commodity Markets"),
    Machinery(2, "Commodity", "Star Port Commodity Markets"),
    Technology(2, "Commodity", "Star Port Commodity Markets"),
    Weapons(2, "Commodity", "Star Port Commodity Markets"),
    ConsumerItems(2, "Commodity", "Star Port Commodity Markets"),
    Slavery(2, "Commodity", "Star Port Commodity Markets"),
    Waste(2, "Commodity", "Star Port Commodity Markets"),
    Salvage(3, "Salvage", "Combat Wreckage/Unidentified Signal Sources"),
    Faction(10, "Faction Item", "Power Play Faction Contact"),

    // special case types used in tasks
    MaterialTrade(0, -1, "Trade"),
    Credits(0,-1,"CR"),
    Any(0,-1,"Any"),

    ;

    private final int numericalValue;
    private final int maximumQuantity;
    private final String text;
    private final String locationDescription;

    ItemGrade(int numericalValue, String text)
    {
        this(numericalValue, -1, text, "");
    }

    ItemGrade(int numericalValue, int maximumQuantity, String text)
    {
        this(numericalValue, maximumQuantity, text, "");
    }


    ItemGrade(int numericalValue, String text, String locationDescription)
    {
        this(numericalValue, -1, text, locationDescription);
    }


    ItemGrade(int numericalValue, int maximumQuantity, String text, String locationDescription)
    {
        this.numericalValue = numericalValue;
        this.maximumQuantity = maximumQuantity;
        this.text = text;
        this.locationDescription = locationDescription;
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

    public static int compare(ItemGrade a, ItemGrade b)
    {
        return Integer.compare(a.numericalValue, b.numericalValue);
    }
}
