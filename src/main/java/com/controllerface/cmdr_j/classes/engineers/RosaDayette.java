package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class RosaDayette extends AbstractEngineer
{
    public RosaDayette()
    {
        super("Rosa Dayette",
            400012,
            "Rosa's Shop",
            new StarSystem("Kojeara",-9513.09375, 19814.28125, -908.84375, 3721329101171L));

        addGroundGearModification(ModificationRecipe.Greater_Range_Takada);
        addGroundGearModification(ModificationRecipe.Greater_Range_Manticore);
        addGroundGearModification(ModificationRecipe.Greater_Range_Kinematic);
        addGroundGearModification(ModificationRecipe.Scope);
        addGroundGearModification(ModificationRecipe.Stability);

        addGroundGearModification(ModificationRecipe.Enhanced_Tracking);
        addGroundGearModification(ModificationRecipe.suit_backpackcapacity);
        addGroundGearModification(ModificationRecipe.Improved_Battery_Capacity);
        addGroundGearModification(ModificationRecipe.Reduced_Tool_Battery_Consumption);
    }
}
