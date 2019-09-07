package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size4;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MRP_4D extends AbstractModulePackage
{
    public MRP_4D()
    {
        super("4D Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.Integrity, 235d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
                ));
    }
}
