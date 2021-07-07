package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class OdenGeiger extends AbstractEngineer
{
    // todo: need engineer ID
    public OdenGeiger()
    {
        super("Oden Geiger",
            -1,
            "Ankh's Promise",
            new StarSystem("Candiaei",-113.5, 66.84375, -4.9375, 8879744226018L));

        addGroundGearModification(ModificationRecipe.Stability);
        addGroundGearModification(ModificationRecipe.Scope);
        addGroundGearModification(ModificationRecipe.Enhanced_Tracking);
        addGroundGearModification(ModificationRecipe.Improved_Battery_Capacity);
        addGroundGearModification(ModificationRecipe.Night_Vision);
    }
}
