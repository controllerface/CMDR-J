package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class Baltanos extends AbstractEngineer
{
    public Baltanos()
    {
        super("Baltanos",
            400010,
            "The Divine Apparatus",
            new StarSystem("Desiro",-9520.3125, 19808.75, -909.5, 3721329101171L));

        addGroundGearModification(ModificationRecipe.Noise_Suppressor);
        addGroundGearModification(ModificationRecipe.Faster_Handling);
        addGroundGearModification(ModificationRecipe.Improved_Hip_Fire_Accuracy_Takada);
        addGroundGearModification(ModificationRecipe.Improved_Hip_Fire_Accuracy_Manticore);
        addGroundGearModification(ModificationRecipe.Improved_Hip_Fire_Accuracy_Kinematic);

        addGroundGearModification(ModificationRecipe.Combat_Movement_Speed);
        addGroundGearModification(ModificationRecipe.suit_improvedjumpassist);
        addGroundGearModification(ModificationRecipe.suit_increasedo2capacity);
        addGroundGearModification(ModificationRecipe.Increased_Sprint_Duration);
    }
}
