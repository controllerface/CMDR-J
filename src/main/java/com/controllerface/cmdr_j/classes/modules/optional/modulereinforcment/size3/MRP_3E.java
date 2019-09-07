package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MRP_3E extends AbstractModulePackage
{
    public MRP_3E()
    {
        super("3E Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 8d),
                        new ItemEffectData(ItemEffect.Integrity, 170d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }
}
