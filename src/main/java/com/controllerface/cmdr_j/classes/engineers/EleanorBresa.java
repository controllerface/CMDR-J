package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class EleanorBresa extends AbstractEngineer
{
    public EleanorBresa()
    {
        super("Eleanor Bresa",
            400011,
            "Bresa Modifications",
            new StarSystem("Desy", -9534.21875, 19792.375, -912.21875, 38001031029322L));

        addGroundGearModification(ModificationRecipe.Added_Melee_Damage);
        addGroundGearModification(ModificationRecipe.Damage_Resistance);
        addGroundGearModification(ModificationRecipe.Extra_Ammo_Capacity);
        addGroundGearModification(ModificationRecipe.Faster_Shield_Regen);

        addGroundGearModification(ModificationRecipe.Magazine_Size);
        addGroundGearModification(ModificationRecipe.Reload_Speed);
        addGroundGearModification(ModificationRecipe.Stowed_Reloading);
    }
}
