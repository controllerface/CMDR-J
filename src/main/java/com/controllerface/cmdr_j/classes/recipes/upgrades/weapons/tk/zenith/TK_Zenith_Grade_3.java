package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.zenith;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class TK_Zenith_Grade_3 extends AbstractUpgradeRecipe
{
    public TK_Zenith_Grade_3()
    {
        super("TK Zenith - Grade 3",
            ItemGrade.GRADE_3,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 16.53d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 2d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 5),
            new CostData(Material.IONISEDGAS, 5),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 5),
            new CostData(Material.MICROELECTRODE, 15),
            new CostData(Material.OPTICALFIBRE, 15),
            new CostData(CreditCost.CREDIT_COST, 0));
    }
}