package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class OdenGeiger extends AbstractEngineer
{
    public OdenGeiger()
    {
        super("Oden Geiger",
            400008,
            "Ankh's Promise",
            new StarSystem("Candiaei",-113.5, 66.84375, -4.9375, 8879744226018L));

        addGroundGearModification(ModificationRecipe.Stability);
        addGroundGearModification(ModificationRecipe.Scope);
        addGroundGearModification(ModificationRecipe.Enhanced_Tracking);
        addGroundGearModification(ModificationRecipe.Improved_Battery_Capacity);
        addGroundGearModification(ModificationRecipe.Night_Vision);
    }
}
