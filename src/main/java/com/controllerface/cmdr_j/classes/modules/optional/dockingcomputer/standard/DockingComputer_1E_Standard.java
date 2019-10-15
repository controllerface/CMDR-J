package com.controllerface.cmdr_j.classes.modules.optional.dockingcomputer.standard;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.optional.dockingcomputer.AbstractDockingComputer;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class DockingComputer_1E_Standard extends AbstractDockingComputer
{
    public DockingComputer_1E_Standard()
    {
        super("Standard Docking Computer",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.Integrity, 10d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.39d),
                        new ItemEffectData(ItemEffect.BootTime, 3d)
                ));
    }

    @Override
    public long price()
    {
        return 4_500;
    }
}
