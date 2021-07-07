package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class UmaLaszlo extends AbstractEngineer
{
    // todo: need engineer ID
    public UmaLaszlo()
    {
        super("Uma Laszlo",
            -1,
            "Laszlo's Resolve",
            new StarSystem("Xuane",93.875, -32.53125, -9.25, 16065190962585L));

        addGroundGearModification(ModificationRecipe.Reload_Speed);
        addGroundGearModification(ModificationRecipe.Stowed_Reloading);
        addGroundGearModification(ModificationRecipe.Head_Shot_Damage);
        addGroundGearModification(ModificationRecipe.Damage_Resistance);
        addGroundGearModification(ModificationRecipe.Faster_Shield_Regen);
    }
}
