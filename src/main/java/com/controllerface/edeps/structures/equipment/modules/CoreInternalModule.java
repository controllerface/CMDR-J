package com.controllerface.edeps.structures.equipment.modules;

import com.controllerface.edeps.ShipModule;

import java.util.Arrays;

/**
 * Created by Stephen on 4/25/2018.
 */
public enum CoreInternalModule implements ShipModule
{

    /**
     * Cargo Bay Door
     */
    //ModularCargoBayDoor(text),

    /**
     * Cockpits
     */

//    Vulture_Cockpit(text),
//    Python_Cockpit(text),
//    TypeX_Cockpit(text),


    /**
     * Ship Armor
     */

    dolphin_armour_grade1("Lightweight"),
    dolphin_armour_grade2("Reinforced"),
    dolphin_armour_grade3("Military Grade"),
    dolphin_armour_reactive("Reactive"),
    dolphin_armour_mirrored("Mirrored"),

    ferdelance_armour_grade1("Lightweight"),
    ferdelance_armour_grade2("Reinforced"),
    ferdelance_armour_grade3("Military Grade"),
    ferdelance_armour_mirrored("Mirrored"),
    ferdelance_armour_reactive("Reactive"),

    python_armour_grade1("Lightweight"),
    python_armour_grade2("Reinforced"),
    python_armour_grade3("Military Grade"),
    python_armour_reactive("Reactive"),
    python_armour_mirrored("Mirrored"),

    belugaliner_armour_grade3("Military Grade"),
    belugaliner_armour_grade1("Lightweight"),
    belugaliner_armour_grade2("Reinforced"),
    belugaliner_armour_reactive("Reactive"),
    belugaliner_armour_mirrored("Mirrored"),

    orca_armour_grade1("Lightweight"),
    orca_armour_grade2("Reinforced"),
    orca_armour_grade3("Military Grade"),
    orca_armour_reactive("Reactive"),
    orca_armour_mirrored("Mirrored"),

    asp_scout_armour_grade1("Lightweight"),
    asp_scout_armour_grade2("Reinforced"),
    asp_scout_armour_grade3("Military Grade"),
    asp_scout_armour_reactive("Reactive"),
    asp_scout_armour_mirrored("Mirrored"),

    asp_armour_grade1("Lightweight"),
    asp_armour_grade2("Reinforced"),
    asp_armour_grade3("Military Grade"),
    asp_armour_reactive("Reactive"),
    asp_armour_mirrored("Mirrored"),

    independant_trader_armour_grade1("Lightweight"),
    independant_trader_armour_grade2("Reinforced"),
    independant_trader_armour_grade3("Military Grade"),
    independant_trader_armour_reactive("Reactive"),
    independant_trader_armour_mirrored("Mirrored"),

    vulture_armour_grade1("Lightweight"),
    vulture_armour_grade2("Reinforced"),
    vulture_armour_grade3("Military Grade"),
    vulture_armour_reactive("Reactive"),
    vulture_armour_mirrored("Mirrored"),

    viper_armour_grade1("Lightweight"),
    viper_armour_grade2("Reinforced"),
    viper_armour_grade3("Military Grade"),
    viper_armour_reactive("Reactive"),
    viper_armour_mirrored("Mirrored"),

    diamondbackxl_armour_grade1("Lightweight"),
    diamondbackxl_armour_grade2("Reinforced"),
    diamondbackxl_armour_grade3("Military Grade"),
    diamondbackxl_armour_mirrored("Mirrored"),
    diamondbackxl_armour_reactive("Reactive"),

    adder_armour_grade1("Lightweight"),
    adder_armour_grade2("Reinforced"),
    adder_armour_grade3("Military Grade"),
    adder_armour_reactive("Reactive"),
    adder_armour_mirrored("Mirrored"),

    diamondback_armour_grade1("Lightweight"),
    diamondback_armour_grade2("Reinforced"),
    diamondback_armour_grade3("Military Grade"),
    diamondback_armour_reactive("Reactive"),
    diamondback_armour_mirrored("Mirrored"),

    viper_mkiv_armour_grade1("Lightweight"),
    viper_mkiv_armour_grade2("Reinforced"),
    viper_mkiv_armour_grade3("Military Grade"),
    viper_mkiv_armour_reactive("Reactive"),
    viper_mkiv_armour_mirrored("Mirrored"),

    anaconda_armour_grade1("Lightweight"),
    anaconda_armour_grade2("Reinforced"),
    anaconda_armour_grade3("Military Grade"),
    anaconda_armour_mirrored("Mirrored"),
    anaconda_armour_reactive("Reactive"),

    cobramkiii_armour_grade1("Lightweight"),
    cobramkiii_armour_grade2("Reinforced"),
    cobramkiii_armour_grade3("Military Grade"),
    cobramkiii_armour_reactive("Reactive"),
    cobramkiii_armour_mirrored("Mirrored"),

    type9_armour_grade1("Lightweight"),
    type9_armour_grade2("Reinforced"),
    type9_armour_grade3("Military Grade"),
    type9_armour_reactive("Reactive"),
    type9_armour_mirrored("Mirrored"),

    type7_armour_grade1("Lightweight"),
    type7_armour_grade2("Reinforced"),
    type7_armour_grade3("Military Grade"),
    type7_armour_reactive("Reactive"),
    type7_armour_mirrored("Mirrored"),

    cobramkiv_armour_grade1("Lightweight"),
    cobramkiv_armour_grade2("Reinforced"),
    cobramkiv_armour_grade3("Military Grade"),
    cobramkiv_armour_reactive("Reactive"),
    cobramkiv_armour_mirrored("Mirrored"),

    eagle_armour_grade1("Lightweight"),
    eagle_armour_grade2("Reinforced"),
    eagle_armour_grade3("Military Grade"),
    eagle_armour_reactive("Reactive"),
    eagle_armour_mirrored("Mirrored"),

    hauler_armour_grade1("Lightweight"),
    hauler_armour_grade2("Reinforced"),
    hauler_armour_grade3("Military Grade"),
    hauler_armour_reactive("Reactive"),
    hauler_armour_mirrored("Mirrored"),

    sidewinder_armour_grade1("Lightweight"),
    sidewinder_armour_grade2("Reinforced"),
    sidewinder_armour_grade3("Military Grade"),
    sidewinder_armour_reactive("Reactive"),
    sidewinder_armour_mirrored("Mirrored"),

    type6_armour_grade1("Lightweight"),
    type6_armour_grade2("Reinforced"),
    type6_armour_grade3("Military Grade"),
    type6_armour_reactive("Reactive"),
    type6_armour_mirrored("Mirrored"),

    empire_trader_armour_grade1("Lightweight"),
    empire_trader_armour_grade2("Reinforced"),
    empire_trader_armour_grade3("Military Grade"),
    empire_trader_armour_reactive("Reactive"),
    empire_trader_armour_mirrored("Mirrored"),

    federation_dropship_armour_grade1("Lightweight"),
    federation_dropship_armour_grade2("Reinforced"),
    federation_dropship_armour_grade3("Military Grade"),
    federation_dropship_armour_reactive("Reactive"),
    federation_dropship_armour_mirrored("Mirrored"),

    cutter_armour_grade1("Lightweight"),
    cutter_armour_grade2("Reinforced"),
    cutter_armour_grade3("Military Grade"),
    cutter_armour_mirrored("Mirrored"),
    cutter_armour_reactive("Reactive"),

    empire_eagle_armour_grade1("Lightweight"),
    empire_eagle_armour_grade2("Reinforced"),
    empire_eagle_armour_grade3("Military Grade"),
    empire_eagle_armour_reactive("Reactive"),
    empire_eagle_armour_mirrored("Mirrored"),

    typex_armour_grade1("Lightweight"),
    typex_armour_grade2("Reinforced"),
    typex_armour_grade3("Military Grade"),
    typex_armour_reactive("Reactive"),
    typex_armour_mirrored("Mirrored"),

    federation_corvette_armour_grade1("Lightweight"),
    federation_corvette_armour_grade2("Reinforced"),
    federation_corvette_armour_grade3("Military Grade"),
    federation_corvette_armour_mirrored("Mirrored"),
    federation_corvette_armour_reactive("Reactive"),

    empire_courier_armour_grade1("Lightweight"),
    empire_courier_armour_grade2("Reinforced"),
    empire_courier_armour_grade3("Military Grade"),
    empire_courier_armour_reactive("Reactive"),
    empire_courier_armour_mirrored("Mirrored"),

    federation_gunship_armour_grade1("Lightweight"),
    federation_gunship_armour_grade2("Reinforced"),
    federation_gunship_armour_grade3("Military Grade"),
    federation_gunship_armour_reactive("Reactive"),
    federation_gunship_armour_mirrored("Mirrored"),

    type9_military_armour_grade1("Lightweight"),
    type9_military_armour_grade2("Reinforced"),
    type9_military_armour_grade3("Military Grade"),
    type9_military_armour_reactive("Reactive"),
    type9_military_armour_mirrored("Mirrored"),

    federation_dropship_mkii_armour_grade1("Lightweight"),
    federation_dropship_mkii_armour_grade2("Reinforced"),
    federation_dropship_mkii_armour_grade3("Military Grade"),
    federation_dropship_mkii_armour_reactive("Reactive"),
    federation_dropship_mkii_armour_mirrored("Mirrored"),


    /**
     * Power Plants
     */

    int_powerplant_size2_class1("2E Standard"),
    int_powerplant_size2_class2("2D Standard"),
    int_powerplant_size2_class3("2C Standard"),
    int_powerplant_size2_class4("2B Standard"),
    int_powerplant_size2_class5("2A Standard"),

    int_powerplant_size3_class1("3E Standard"),
    int_powerplant_size3_class2("3D Standard"),
    int_powerplant_size3_class3("3C Standard"),
    int_powerplant_size3_class4("3B Standard"),
    int_powerplant_size3_class5("3A Standard"),

    int_powerplant_size4_class1("4E Standard"),
    int_powerplant_size4_class2("4D Standard"),
    int_powerplant_size4_class3("4C Standard"),
    int_powerplant_size4_class4("4B Standard"),
    int_powerplant_size4_class5("4A Standard"),

    int_powerplant_size5_class1("5E Standard"),
    int_powerplant_size5_class2("5D Standard"),
    int_powerplant_size5_class3("5C Standard"),
    int_powerplant_size5_class4("5B Standard"),
    int_powerplant_size5_class5("5A Standard"),

    int_powerplant_size6_class1("6E Standard"),
    int_powerplant_size6_class2("6D Standard"),
    int_powerplant_size6_class3("6C Standard"),
    int_powerplant_size6_class4("6B Standard"),
    int_powerplant_size6_class5("6A Standard"),

    int_powerplant_size7_class1("7E Standard"),
    int_powerplant_size7_class2("7D Standard"),
    int_powerplant_size7_class3("7C Standard"),
    int_powerplant_size7_class4("7B Standard"),
    int_powerplant_size7_class5("7A Standard"),

    int_powerplant_size8_class1("8E Standard"),
    int_powerplant_size8_class2("8D Standard"),
    int_powerplant_size8_class3("8C Standard"),
    int_powerplant_size8_class4("8B Standard"),
    int_powerplant_size8_class5("8A Standard"),


    /**
     * Thrusters
     */

    int_engine_size2_class1("2E Standard"),
    int_engine_size2_class2("2D Standard"),
    int_engine_size2_class3("2C Standard"),
    int_engine_size2_class4("2B Standard"),
    int_engine_size2_class5("2A Standard"),

    int_engine_size3_class1("3E Standard"),
    int_engine_size3_class2("3D Standard"),
    int_engine_size3_class3("3C Standard"),
    int_engine_size3_class4("3B Standard"),
    int_engine_size3_class5("3A Standard"),

    int_engine_size4_class1("4E Standard"),
    int_engine_size4_class2("4D Standard"),
    int_engine_size4_class3("4C Standard"),
    int_engine_size4_class4("4B Standard"),
    int_engine_size4_class5("4A Standard"),

    int_engine_size5_class1("5E Standard"),
    int_engine_size5_class2("5D Standard"),
    int_engine_size5_class3("5C Standard"),
    int_engine_size5_class4("5B Standard"),
    int_engine_size5_class5("5A Standard"),

    int_engine_size6_class1("6E Standard"),
    int_engine_size6_class2("6D Standard"),
    int_engine_size6_class3("6C Standard"),
    int_engine_size6_class4("6B Standard"),
    int_engine_size6_class5("6A Standard"),

    int_engine_size7_class1("7E Standard"),
    int_engine_size7_class2("7D Standard"),
    int_engine_size7_class3("7C Standard"),
    int_engine_size7_class4("7B Standard"),
    int_engine_size7_class5("7A Standard"),

    int_engine_size8_class1("8E Standard"),
    int_engine_size8_class2("8D Standard"),
    int_engine_size8_class3("8C Standard"),
    int_engine_size8_class4("8B Standard"),
    int_engine_size8_class5("8A Standard"),


    /**
     * Frame Shift Drives
     */

    int_hyperdrive_size2_class1("2E Standard"),
    int_hyperdrive_size2_class2("2D Standard"),
    int_hyperdrive_size2_class3("2C Standard"),
    int_hyperdrive_size2_class4("2B Standard"),
    int_hyperdrive_size2_class5("2A Standard"),

    int_hyperdrive_size3_class1("3E Standard"),
    int_hyperdrive_size3_class2("3D Standard"),
    int_hyperdrive_size3_class3("3C Standard"),
    int_hyperdrive_size3_class4("3B Standard"),
    int_hyperdrive_size3_class5("3A Standard"),

    int_hyperdrive_size4_class1("4E Standard"),
    int_hyperdrive_size4_class2("4D Standard"),
    int_hyperdrive_size4_class3("4C Standard"),
    int_hyperdrive_size4_class4("4B Standard"),
    int_hyperdrive_size4_class5("4A Standard"),

    int_hyperdrive_size5_class1("5E Standard"),
    int_hyperdrive_size5_class2("5D Standard"),
    int_hyperdrive_size5_class3("5C Standard"),
    int_hyperdrive_size5_class4("5B Standard"),
    int_hyperdrive_size5_class5("5A Standard"),

    int_hyperdrive_size6_class1("6E Standard"),
    int_hyperdrive_size6_class2("6D Standard"),
    int_hyperdrive_size6_class3("6C Standard"),
    int_hyperdrive_size6_class4("6B Standard"),
    int_hyperdrive_size6_class5("6A Standard"),

    int_hyperdrive_size7_class1("7E Standard"),
    int_hyperdrive_size7_class2("7D Standard"),
    int_hyperdrive_size7_class3("7C Standard"),
    int_hyperdrive_size7_class4("7B Standard"),
    int_hyperdrive_size7_class5("7A Standard"),

    int_hyperdrive_size8_class1("8E Standard"),
    int_hyperdrive_size8_class2("8D Standard"),
    int_hyperdrive_size8_class3("8C Standard"),
    int_hyperdrive_size8_class4("8B Standard"),
    int_hyperdrive_size8_class5("8A Standard"),


    /**
     * Life-Support Systems
     */

    int_lifesupport_size1_class1("1E Standard"),
    int_lifesupport_size1_class2("1D Standard"),
    int_lifesupport_size1_class3("1C Standard"),
    int_lifesupport_size1_class4("1B Standard"),
    int_lifesupport_size1_class5("1A Standard"),

    int_lifesupport_size2_class1("2E Standard"),
    int_lifesupport_size2_class2("2D Standard"),
    int_lifesupport_size2_class3("2C Standard"),
    int_lifesupport_size2_class4("2B Standard"),
    int_lifesupport_size2_class5("2A Standard"),

    int_lifesupport_size3_class1("3E Standard"),
    int_lifesupport_size3_class2("3D Standard"),
    int_lifesupport_size3_class3("3C Standard"),
    int_lifesupport_size3_class4("3B Standard"),
    int_lifesupport_size3_class5("3A Standard"),

    int_lifesupport_size4_class1("4E Standard"),
    int_lifesupport_size4_class2("4D Standard"),
    int_lifesupport_size4_class3("4C Standard"),
    int_lifesupport_size4_class4("4B Standard"),
    int_lifesupport_size4_class5("4A Standard"),

    int_lifesupport_size5_class1("5E Standard"),
    int_lifesupport_size5_class2("5D Standard"),
    int_lifesupport_size5_class3("5C Standard"),
    int_lifesupport_size5_class4("5B Standard"),
    int_lifesupport_size5_class5("5A Standard"),

    int_lifesupport_size6_class1("6E Standard"),
    int_lifesupport_size6_class2("6D Standard"),
    int_lifesupport_size6_class3("6C Standard"),
    int_lifesupport_size6_class4("6B Standard"),
    int_lifesupport_size6_class5("6A Standard"),

    int_lifesupport_size7_class1("7E Standard"),
    int_lifesupport_size7_class2("7D Standard"),
    int_lifesupport_size7_class3("7C Standard"),
    int_lifesupport_size7_class4("7B Standard"),
    int_lifesupport_size7_class5("7A Standard"),

    int_lifesupport_size8_class1("8E Standard"),
    int_lifesupport_size8_class2("8D Standard"),
    int_lifesupport_size8_class3("8C Standard"),
    int_lifesupport_size8_class4("8B Standard"),
    int_lifesupport_size8_class5("8A Standard"),


    /**
     * Power Distributors
     */

    int_powerdistributor_size1_class1("1E Standard"),
    int_powerdistributor_size1_class2("1D Standard"),
    int_powerdistributor_size1_class3("1C Standard"),
    int_powerdistributor_size1_class4("1B Standard"),
    int_powerdistributor_size1_class5("1A Standard"),

    int_powerdistributor_size2_class1("2E Standard"),
    int_powerdistributor_size2_class2("2D Standard"),
    int_powerdistributor_size2_class3("2C Standard"),
    int_powerdistributor_size2_class4("2B Standard"),
    int_powerdistributor_size2_class5("2A Standard"),

    int_powerdistributor_size3_class1("3E Standard"),
    int_powerdistributor_size3_class2("3D Standard"),
    int_powerdistributor_size3_class3("3C Standard"),
    int_powerdistributor_size3_class4("3B Standard"),
    int_powerdistributor_size3_class5("3A Standard"),

    int_powerdistributor_size4_class1("4E Standard"),
    int_powerdistributor_size4_class2("4D Standard"),
    int_powerdistributor_size4_class3("4C Standard"),
    int_powerdistributor_size4_class4("4B Standard"),
    int_powerdistributor_size4_class5("4A Standard"),

    int_powerdistributor_size5_class1("5E Standard"),
    int_powerdistributor_size5_class2("5D Standard"),
    int_powerdistributor_size5_class3("5C Standard"),
    int_powerdistributor_size5_class4("5B Standard"),
    int_powerdistributor_size5_class5("5A Standard"),

    int_powerdistributor_size6_class1("6E Standard"),
    int_powerdistributor_size6_class2("6D Standard"),
    int_powerdistributor_size6_class3("6C Standard"),
    int_powerdistributor_size6_class4("6B Standard"),
    int_powerdistributor_size6_class5("6A Standard"),

    int_powerdistributor_size7_class1("7E Standard"),
    int_powerdistributor_size7_class2("7D Standard"),
    int_powerdistributor_size7_class3("7C Standard"),
    int_powerdistributor_size7_class4("7B Standard"),
    int_powerdistributor_size7_class5("7A Standard"),

    int_powerdistributor_size8_class1("8E Standard"),
    int_powerdistributor_size8_class2("8D Standard"),
    int_powerdistributor_size8_class3("8C Standard"),
    int_powerdistributor_size8_class4("8B Standard"),
    int_powerdistributor_size8_class5("8A Standard"),


    /**
     * Sensors
     */

    int_sensors_size1_class1("1E Standard"),
    int_sensors_size1_class2("1D Standard"),
    int_sensors_size1_class3("1C Standard"),
    int_sensors_size1_class4("1B Standard"),
    int_sensors_size1_class5("1A Standard"),

    int_sensors_size2_class1("2E Standard"),
    int_sensors_size2_class2("2D Standard"),
    int_sensors_size2_class3("2C Standard"),
    int_sensors_size2_class4("2B Standard"),
    int_sensors_size2_class5("2A Standard"),

    int_sensors_size3_class1("3E Standard"),
    int_sensors_size3_class2("3D Standard"),
    int_sensors_size3_class3("3C Standard"),
    int_sensors_size3_class4("3B Standard"),
    int_sensors_size3_class5("3A Standard"),

    int_sensors_size4_class1("4E Standard"),
    int_sensors_size4_class2("4D Standard"),
    int_sensors_size4_class3("4C Standard"),
    int_sensors_size4_class4("4B Standard"),
    int_sensors_size4_class5("4A Standard"),

    int_sensors_size5_class1("5E Standard"),
    int_sensors_size5_class2("5D Standard"),
    int_sensors_size5_class3("5C Standard"),
    int_sensors_size5_class4("5B Standard"),
    int_sensors_size5_class5("5A Standard"),

    int_sensors_size6_class1("6E Standard"),
    int_sensors_size6_class2("6D Standard"),
    int_sensors_size6_class3("6C Standard"),
    int_sensors_size6_class4("6B Standard"),
    int_sensors_size6_class5("6A Standard"),

    int_sensors_size7_class1("7E Standard"),
    int_sensors_size7_class2("7D Standard"),
    int_sensors_size7_class3("7C Standard"),
    int_sensors_size7_class4("7B Standard"),
    int_sensors_size7_class5("7A Standard"),

    int_sensors_size8_class1("8E Standard"),
    int_sensors_size8_class2("8D Standard"),
    int_sensors_size8_class3("8C Standard"),
    int_sensors_size8_class4("8B Standard"),
    int_sensors_size8_class5("8A Standard"),


    /**
     * Fuel Tanks
     */

    int_fueltank_size1_class3("1C Standard"),
    int_fueltank_size2_class3("2C Standard"),
    int_fueltank_size3_class3("3C Standard"),
    int_fueltank_size4_class3("4C Standard"),
    int_fueltank_size5_class3("5C Standard"),
    int_fueltank_size6_class3("6C Standard"),
    int_fueltank_size7_class3("7C Standard"),
    int_fueltank_size8_class3("8C Standard"),

    ;

    private final String text;

    CoreInternalModule(String text)
    {
        this.text = text;
    }

    @Override
    public String displayText()
    {
        return text;
    }

    public static ShipModule findModule(String moduleName) throws Exception
    {
        final Exception exception;
        try
        {
            return valueOf(moduleName);
        }
        catch (Exception e)
        {
            exception = e;
            if (moduleName == null || moduleName.isEmpty()) throw e;
        }

        return Arrays.stream(CoreInternalModule.values())
                .filter(v->v.name().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst().orElseThrow(()->exception);
    }
}
