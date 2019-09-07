package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MRP_5E extends AbstractModulePackage
{
    public MRP_5E()
    {
        super("5E Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 32d),
                        new ItemEffectData(ItemEffect.Integrity, 385d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }
}
