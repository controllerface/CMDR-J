package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class YardenBond extends AbstractEngineer
{
    public YardenBond()
    {
        super("Yarden Bond",
            400009,
            "Salamander Bank",
            new StarSystem("Bayan",-19.96875, -90.46875, 117.625, 670686455169L));

        // todo: quieter footsteps
        addGroundGearModification(ModificationRecipe.Audio_Masking);
        addGroundGearModification(ModificationRecipe.Combat_Movement_Speed);
        addGroundGearModification(ModificationRecipe.Faster_Handling);
        addGroundGearModification(ModificationRecipe.Improved_Jump_Assist);
        addGroundGearModification(ModificationRecipe.Improved_Hip_Fire_Accuracy_Kinematic);
        addGroundGearModification(ModificationRecipe.Improved_Hip_Fire_Accuracy_Manticore);
        addGroundGearModification(ModificationRecipe.Improved_Hip_Fire_Accuracy_Takada);
    }
}
