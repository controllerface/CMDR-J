package com.controllerface.cmdr_j.classes.procurements.modules.fighterbay.size7;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.fighterbay.AbstractFighterBay;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FighterBay_7E extends AbstractFighterBay
{
    public FighterBay_7E()
    {
        super("7E Fighter Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 60d),
                        new ItemEffectData(ItemEffect.Integrity, 120d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 15d)
                ));
    }
}
