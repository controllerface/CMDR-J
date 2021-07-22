package com.controllerface.cmdr_j.enums.equipment.suits;


import java.util.Optional;

public enum SuitType
{
    tacticalsuit_class1,
    tacticalsuit_class2,
    tacticalsuit_class3,
    tacticalsuit_class4,
    tacticalsuit_class5;

    public static Optional<SuitType> findSuit(String suitName)
    {
        try
        {
            var foundSuit = valueOf(suitName.toLowerCase());
            return Optional.of(foundSuit);
        }
        catch (Exception e)
        {
            return Optional.empty();
        }
    }
}
