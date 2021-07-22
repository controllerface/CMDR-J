package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class UmaLaszlo extends AbstractEngineer
{
    public UmaLaszlo()
    {
        super("Uma Laszlo",
            400007,
            "Laszlo's Resolve",
            new StarSystem("Xuane",93.875, -32.53125, -9.25, 16065190962585L));

        addGroundGearModification(ModificationRecipe.Reload_Speed);
        addGroundGearModification(ModificationRecipe.Stowed_Reloading);
        addGroundGearModification(ModificationRecipe.Head_Shot_Damage_Kinematic);
        addGroundGearModification(ModificationRecipe.Head_Shot_Damage_Manticore);
        addGroundGearModification(ModificationRecipe.Head_Shot_Damage_Takada);
        addGroundGearModification(ModificationRecipe.Damage_Resistance);
        addGroundGearModification(ModificationRecipe.Faster_Shield_Regen);
    }
}
