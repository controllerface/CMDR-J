package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class YiShen extends AbstractEngineer
{
    public YiShen()
    {
        super("Yi Shen",
            400009,
            "Eidolon Hold",
            new StarSystem("Einheriar",-9557.8125, 19801.5625, -880.1875, 670686455169L));

        addGroundGearModification(ModificationRecipe.Quieter_Footsteps);
        addGroundGearModification(ModificationRecipe.weapon_suppression_unpressurised);
        addGroundGearModification(ModificationRecipe.Head_Shot_Damage_Takada);
        addGroundGearModification(ModificationRecipe.Head_Shot_Damage_Manticore);
        addGroundGearModification(ModificationRecipe.Head_Shot_Damage_Kinematic);
        addGroundGearModification(ModificationRecipe.Night_Vision);
    }
}
