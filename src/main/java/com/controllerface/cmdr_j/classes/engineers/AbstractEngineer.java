package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.interfaces.commander.Engineer;

import java.util.EnumMap;
import java.util.EnumSet;

public abstract class AbstractEngineer implements Engineer
{
    private final String fullName;
    private final int id;
    private final StarSystem location;
    private final String facility;
    private final EnumMap<ModificationType, ItemGrade> modifications = new EnumMap<>(ModificationType.class);
    private final EnumSet<ExperimentalType> experimentals = EnumSet.noneOf(ExperimentalType.class);
    private final EnumSet<ModificationRecipe> groundModifications = EnumSet.noneOf(ModificationRecipe.class);

    AbstractEngineer(String fullName,
                     int id,
                     String facility,
                     StarSystem location,
                     Pair<Pair<ModificationType, ExperimentalType>, ItemGrade>... tasks)
    {
        this.fullName = fullName;
        this.id = id;
        this.facility = facility;
        this.location = location;

        for (Pair<Pair<ModificationType, ExperimentalType>, ItemGrade> task : tasks)
        {
            ModificationType modificationType = task.getKey().getKey();
            ExperimentalType experimentalType = task.getKey().getValue();
            ItemGrade itemGrade = task.getValue();
            modifications.put(modificationType, itemGrade);
            if (experimentalType != null) experimentals.add(experimentalType);
        }
    }

    protected void addModification(ModificationType modificationType, ItemGrade itemGrade)
    {
        modifications.put(modificationType, itemGrade);
    }

    protected void addExperimental(ExperimentalType experimentalType)
    {
        experimentals.add(experimentalType);
    }

    protected void addGroundGearModification(ModificationRecipe modificationRecipe)
    {
        groundModifications.add(modificationRecipe);
    }

    @Override
    public String getFacility()
    {
        return facility;
    }

    @Override
    public String getFullName()
    {
        return fullName;
    }

    @Override
    public StarSystem getLocation()
    {
        return location;
    }

    @Override
    public int getId()
    {
        return id;
    }

    @Override
    public EnumMap<ModificationType, ItemGrade> getModifications()
    {
        return modifications;
    }

    @Override
    public EnumSet<ExperimentalType> getExperimentals()
    {
        return experimentals;
    }

    @Override
    public EnumSet<ModificationRecipe> getGroundGearModifications()
    {
        return groundModifications;
    }
}
