package com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.aphelion;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractUpgradeRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class TK_Aphelion_Grade_5 extends AbstractUpgradeRecipe
{
    public TK_Aphelion_Grade_5()
    {
        super("TK Aphelion - Grade 5",
            ItemGrade.GRADE_5,
            new ItemEffects(
                new ItemEffectData(ItemEffect.DamagePerSecond, 25.0d),
                new ItemEffectData(ItemEffect.Weapon_Mod_Slots, 4d)
            ),
            new CostData(Material.WEAPONSCHEMATIC, 15),
            new CostData(Material.IONISEDGAS, 15),
            new CostData(Material.MANUFACTURINGINSTRUCTIONS, 15),
            new CostData(Material.MICROELECTRODE, 35),
            new CostData(Material.OPTICALFIBRE, 35),
            new CostData(CreditCost.CREDIT_COST, 0));
    }
}