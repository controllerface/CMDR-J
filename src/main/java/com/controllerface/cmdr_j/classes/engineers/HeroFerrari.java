package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;

@SuppressWarnings("unchecked")
public class HeroFerrari extends AbstractEngineer
{
    public HeroFerrari()
    {
        super("Hero Ferrari",
            400003,
            "Nevermore Terrace",
            new StarSystem("Siris",131.0625, -11.25, -73.59375, 7269634614689L));

        addGroundGearModification(ModificationRecipe.Faster_Handling);
        addGroundGearModification(ModificationRecipe.Noise_Suppressor);
        addGroundGearModification(ModificationRecipe.Increased_Sprint_Duration);
        addGroundGearModification(ModificationRecipe.Improved_Jump_Assist);
        addGroundGearModification(ModificationRecipe.suit_increasedo2capacity);
    }
}
