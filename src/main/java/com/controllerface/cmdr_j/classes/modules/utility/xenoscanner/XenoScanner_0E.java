package com.controllerface.cmdr_j.classes.modules.utility.xenoscanner;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class XenoScanner_0E extends AbstractExperimentalModule
{
    public XenoScanner_0E()
    {
        super("Xeno Scanner",
                new ItemEffects(
                        new ItemEffectData(ItemEffect.experimental, 1.0),
                        new ItemEffectData(ItemEffect.Size, 0.0),
                        new ItemEffectData(ItemEffect.Class, "E"),
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 56d),
                        new ItemEffectData(ItemEffect.PowerDraw, 0.2d),
                        new ItemEffectData(ItemEffect.BootTime, 2d),
                        new ItemEffectData(ItemEffect.Range, 500d),
                        new ItemEffectData(ItemEffect.MaxAngle, 23d),
                        new ItemEffectData(ItemEffect.ScannerTimeToScan, 10d)
                ));
    }

    @Override
    public long price()
    {
        return 365_698;
    }
}
