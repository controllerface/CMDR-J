package com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.size2;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class MRP_2D extends AbstractModulePackage
{
    public MRP_2D()
    {
        super("2D Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 2.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 2d),
                        new ItemEffectData(ItemEffect.Integrity, 105d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
                ));
    }

    @Override
    public long price()
    {
        return 36_000;
    }
}
