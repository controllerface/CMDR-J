package com.controllerface.cmdr_j.classes.modules.modulereinforcment.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MRP_5D extends AbstractModulePackage
{
    public MRP_5D()
    {
        super("5D Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 16d),
                        new ItemEffectData(ItemEffect.Integrity, 350d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
                ));
    }
}
