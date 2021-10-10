package com.controllerface.cmdr_j.classes.modules.optional.fighterbay.size6;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.optional.fighterbay.AbstractFighterBay;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class FighterBay_6D extends AbstractFighterBay
{
    public FighterBay_6D()
    {
        super("6D Fighter Hangar",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Size, 6.0),
                        new ItemEffectData(ItemEffect.Class, "D"),
                        new ItemEffectData(ItemEffect.Mass, 40d),
                        new ItemEffectData(ItemEffect.Integrity, 80d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.35d),
                        new ItemEffectData(ItemEffect.BootTime, 5d),
                        new ItemEffectData(ItemEffect.NumBuggySlots, 2d),
                        new ItemEffectData(ItemEffect.AmmoClipSize, 8d)
                ));
    }

    @Override
    public long price()
    {
        return 1_869_350;
    }
}
