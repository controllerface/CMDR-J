package com.controllerface.cmdr_j.classes.recipes.personal.weapons;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class MagazineSize extends AbstractModificationRecipe
{
    public MagazineSize()
    {
        super(MagazineSize.class.getSimpleName(), ItemGrade.MicroMaterial,
            new ItemEffects
                (
                    new ItemEffectData(ItemEffect.Improved_Weapon_Magazine, "enabled")
                ),
            new CostData(Material.WEAPONTESTDATA, 10),
            new CostData(Material.SECURITYEXPENSES, 5),
            new CostData(Material.WEAPONCOMPONENT, 5),
            new CostData(Material.TUNGSTENCARBIDE, 5),
            new CostData(Material.METALCOIL, 10),
            new CostData(CreditCost.CREDIT_COST, 750_000));
    }
}
