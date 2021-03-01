package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_FSD_Booster extends AbstractTechnologyRecipe
{
    public Guardian_FSD_Booster()
    {
        super("Guardian FSD Booster", 
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_MODULEBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCELL, 21),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 21),
            new CostData(Material.FOCUSCRYSTALS, 24),
            new CostData(Commodity.HNSHOCKMOUNT, 8));
    }
}