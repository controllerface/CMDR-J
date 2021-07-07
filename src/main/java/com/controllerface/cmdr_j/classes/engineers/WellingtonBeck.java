package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class WellingtonBeck extends AbstractEngineer
{
    // todo: need engineer ID
    public WellingtonBeck()
    {
        super("Wellington Beck",
            -1,
            "Beck Facility",
            new StarSystem("Jolapa",100.1875, -78, -41.34375, 2832832893634L));

        addGroundGearModification(ModificationRecipe.Greater_Range);
        addGroundGearModification(ModificationRecipe.Scope);
        addGroundGearModification(ModificationRecipe.Reduced_Tool_Battery_Consumption);
        addGroundGearModification(ModificationRecipe.Improved_Battery_Capacity);
        addGroundGearModification(ModificationRecipe.Extra_Backpack_Capacity);
    }
}
