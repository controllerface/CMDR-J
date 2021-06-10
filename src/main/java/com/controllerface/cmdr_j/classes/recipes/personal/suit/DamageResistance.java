package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class DamageResistance extends AbstractModificationRecipe
{
    public DamageResistance()
    {
        super(DamageResistance.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Explosive_Damage_Resistance, 10d),
                    new ItemEffectData(ItemEffect.Plasma_Damage_Resistance, 10d),
                    new ItemEffectData(ItemEffect.Thermic_Damage_Resistance, 10d),
                    new ItemEffectData(ItemEffect.Kinetic_Damage_Resistance, 10d)
                ),
            new CostData(Material.WEAPONINVENTORY, 10),
            new CostData(Material.BALLISTICDATA, 10),
            new CostData(Material.TITANIUMPLATING, 5),
            new CostData(Material.CARBONFIBREPLATING, 5),
            new CostData(Material.EPOXYADHESIVE, 15),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
