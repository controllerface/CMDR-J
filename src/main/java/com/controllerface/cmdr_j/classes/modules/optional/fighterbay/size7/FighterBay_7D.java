package com.controllerface.cmdr_j.classes.modules.optional.fighterbay.size7;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fighterbay.AbstractFighterBay;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FighterBay_7D extends AbstractFighterBay
{
    public FighterBay_7D()
    {
        super("7D Fighter Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 7.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 60d),
                        new ItemEffectData(ItemEffect.Integrity, 120d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 15d)
                ));
    }

    @Override
    public long price()
    {
        return 2_369_330;
    }
}
