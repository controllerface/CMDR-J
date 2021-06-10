package com.controllerface.cmdr_j.classes.recipes.personal.suit;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class AddedMeleeDamage extends AbstractModificationRecipe
{
    public AddedMeleeDamage()
    {
        super(AddedMeleeDamage.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Weapon_Melee_Damage_Multiplier, 150d),
                    new ItemEffectData(ItemEffect.Fists_Melee_Damage_Multiplier, 150d)
                ),
            new CostData(Material.COMBATTRAININGMATERIAL, 10),
            new CostData(Material.COMBATANTPERFORMANCE, 10),
            new CostData(Material.EPINEPHRINE, 10),
            new CostData(Material.MICROTHRUSTERS, 15),
            new CostData(CreditCost.CREDIT_COST, 500_000));
    }
}
