package com.controllerface.cmdr_j.classes.modules.modulereinforcment.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MRP_1D extends AbstractModulePackage
{
    public MRP_1D()
    {
        super("1D Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1d),
                        new ItemEffectData(ItemEffect.Integrity, 70d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
                ));
    }
}
