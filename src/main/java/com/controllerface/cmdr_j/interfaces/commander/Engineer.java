package com.controllerface.cmdr_j.interfaces.commander;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.EnumMap;
import java.util.EnumSet;

public interface Engineer
{
    String getFacility();

    String getFullName();

    StarSystem getLocation();

    int getId();

    EnumMap<ModificationType, ItemGrade> getModifications();

    EnumSet<ExperimentalType> getExperimentals();

    EnumSet<ModificationRecipe> getGroundGearModifications();
}
