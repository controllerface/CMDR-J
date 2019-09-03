package com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.size3;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.hullreinforcement.AbstractHullPackage;
import com.controllerface.cmdr_j.classes.procurements.modules.modulereinforcment.AbstractModulePackage;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class MRP_3D extends AbstractModulePackage
{
    public MRP_3D()
    {
        super("3D Module Reinforcement Package",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 4d),
                        new ItemEffectData(ItemEffect.Integrity, 155d),
                        new ItemEffectData(ItemEffect.ModuleDefenceAbsorption, 60d)
                ));
    }
}
