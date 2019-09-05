package com.controllerface.cmdr_j.classes.modules.fighterbay.size5;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.fighterbay.AbstractFighterBay;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;

public class FighterBay_5E extends AbstractFighterBay
{
    public FighterBay_5E()
    {
        super("5E Fighter Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 20d),
                        new ItemEffectData(ItemEffect.Integrity, 60d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.25d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 1d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 6d)
                ));
    }
}
