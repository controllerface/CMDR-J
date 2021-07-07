package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class JudeNevarro extends AbstractEngineer
{
    public JudeNevarro()
    {
        super("Jude Navarro",
            400001,
            "Marshall's Drift",
            new StarSystem("Aurai",0.9375, 46.28125, -47.8125, 7268024067513L));

        addGroundGearModification(ModificationRecipe.Reload_Speed);
        addGroundGearModification(ModificationRecipe.Magazine_Size);
        addGroundGearModification(ModificationRecipe.Extra_Ammo_Capacity);
        addGroundGearModification(ModificationRecipe.Damage_Resistance);
        addGroundGearModification(ModificationRecipe.Added_Melee_Damage);
    }
}
