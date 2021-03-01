package com.controllerface.cmdr_j.classes.recipes.techunlocks;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;

public class Guardian_Gauss_Cannon_Fixed_Medium extends AbstractTechnologyRecipe
{
    public Guardian_Gauss_Cannon_Fixed_Medium()
    {
        super("Medium Guardian Gauss Cannon [Fixed]",
            new ItemEffects(
                    new ItemEffectData(ItemEffect.tech_unlock, 0.0)
            ),
            new CostData(Material.GUARDIAN_WEAPONBLUEPRINT, 1),
            new CostData(Material.GUARDIAN_POWERCELL, 18),
            new CostData(Material.GUARDIAN_TECHCOMPONENT, 20),
            new CostData(Material.MANGANESE, 15),
            new CostData(Commodity.MAGNETICEMITTERCOIL, 6));
    }
}