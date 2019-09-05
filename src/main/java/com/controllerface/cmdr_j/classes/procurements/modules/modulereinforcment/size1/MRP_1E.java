package com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size1;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MRP_1E extends AbstractModulePackage
{
    public MRP_1E()
    {
        super("1E Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 77d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 30d)
                ));
    }
}
