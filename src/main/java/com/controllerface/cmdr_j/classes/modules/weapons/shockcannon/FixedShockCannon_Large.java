package com.controllerface.cmdr_j.classes.modules.weapons.shockcannon;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FixedShockCannon_Large extends AbstractExperimentalModule
{
    public FixedShockCannon_Large()
    {
        super("Large Fixed Shock Cannon", 
            new ItemEffects(
                  new ItemEffectData(ItemEffect.human, 1.0),
                  new ItemEffectData(ItemEffect.DamageType, "Kinetic")
            ));
    }
}