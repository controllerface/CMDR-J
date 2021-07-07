package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class TerraVelasquez extends AbstractEngineer
{
    // todo: need engineer ID
    public TerraVelasquez()
    {
        super("Terra Velasquez",
            -1,
            "Rascal's Choice",
            new StarSystem("Shou Xing",-16.28125, 94.375, -44.53125, 3721329101171L));

        addGroundGearModification(ModificationRecipe.Improved_Hip_Fire_Accuracy);
        addGroundGearModification(ModificationRecipe.Noise_Suppressor);
        addGroundGearModification(ModificationRecipe.Increased_Sprint_Duration);
        addGroundGearModification(ModificationRecipe.Combat_Movement_Speed);
        addGroundGearModification(ModificationRecipe.suit_increasedo2capacity);
    }
}
