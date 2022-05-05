package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class WellingtonBeck extends AbstractEngineer
{
    public WellingtonBeck()
    {
        super("Wellington Beck",
            400005,
            "Beck Facility",
            new StarSystem("Jolapa",100.1875, -78, -41.34375, 2832832893634L));

        addGroundGearModification(ModificationRecipe.Greater_Range_Kinematic);
        addGroundGearModification(ModificationRecipe.Greater_Range_Manticore);
        addGroundGearModification(ModificationRecipe.Greater_Range_Takada);
        addGroundGearModification(ModificationRecipe.Scope);
        addGroundGearModification(ModificationRecipe.Reduced_Tool_Battery_Consumption);
        addGroundGearModification(ModificationRecipe.Improved_Battery_Capacity);
        addGroundGearModification(ModificationRecipe.suit_backpackcapacity);
    }
}
