package com.controllerface.cmdr_j.enums.equipment.modules.stats;

/**
 * Created by Controllerface on 4/16/2018.
 */
public enum ModuleSize
{
    SIZE_1(1),
    SIZE_2(2),
    SIZE_3(3),
    SIZE_4(4),
    SIZE_5(5),
    SIZE_6(6),
    SIZE_7(7),
    SIZE_8(8),

    SIZE_2_MILITARY(2),
    SIZE_3_MILITARY(3),
    SIZE_4_MILITARY(4),
    SIZE_5_MILITARY(5),

    ;

    public final int intValue;

    ModuleSize(int intValue)
    {
        this.intValue = intValue;
    }
}
