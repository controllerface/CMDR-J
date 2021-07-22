package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class KitFowler extends AbstractEngineer
{
    public KitFowler()
    {
        super("Kit Fowler",
            400004,
            "The Last Call",
            new StarSystem("Capoya",-60.65625, -45.0625, 82.4375, 2827975936355L));

        addGroundGearModification(ModificationRecipe.Stowed_Reloading);
        addGroundGearModification(ModificationRecipe.Magazine_Size);
        addGroundGearModification(ModificationRecipe.Added_Melee_Damage);
        addGroundGearModification(ModificationRecipe.Faster_Shield_Regen);
        addGroundGearModification(ModificationRecipe.Extra_Ammo_Capacity);
    }
}
