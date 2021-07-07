package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class DominoGreen extends AbstractEngineer
{
    public DominoGreen()
    {
        super("Domino Green",
            400002,
            "The Jackrabbit",
            new StarSystem("Orishis",-31, -3.5625, 93.96875, 5068464399785L));

        addGroundGearModification(ModificationRecipe.Greater_Range);
        addGroundGearModification(ModificationRecipe.Stability);
        addGroundGearModification(ModificationRecipe.Enhanced_Tracking);
        addGroundGearModification(ModificationRecipe.Extra_Backpack_Capacity);
        addGroundGearModification(ModificationRecipe.Reduced_Tool_Battery_Consumption);
    }
}
