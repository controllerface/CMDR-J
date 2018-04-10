package com.controllerface.edeps.enums.materials;

/**
 * An enumeration of all the crafting material grades in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum MaterialGrade
{
    GRADE_1,
    GRADE_2,
    GRADE_3,
    GRADE_4,
    GRADE_5;

    @Override
    public String toString()
    {
        return super.toString().replace("GRADE_", "");
    }
}
