package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Controllerface on 5/2/2018.
 */
public class ModifierData
{
    public final List<ModifiedStat> stats;

    public ModifierData()
    {
        stats = new ArrayList<>();
    }

    public ModifierData(ItemEffect effect, double value, double originalValue, boolean lessIsGood)
    {
        var x = new ModifiedStat(effect, value, originalValue, lessIsGood);
        stats = new ArrayList<>();
        stats.add(x);
    }

    public ModifiedStat shipStat()
    {
        return stats.get(0);
    }
}
