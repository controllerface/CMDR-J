package com.controllerface.cmdr_j.classes.procurements.recipes.shieldbooster.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Kinetic_4 extends AbstractModificationRecipe
{
    public ShieldBooster_Kinetic_4()
    {
        super(ShieldBooster_Kinetic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -4d),
                                new ItemEffectData(ItemEffect.KineticResistance, 22d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -4d)
                        ),
                new CostData(Material.GALVANISINGALLOYS, 1),
                new CostData(Material.REFINEDFOCUSCRYSTALS, 1),
                new CostData(Material.SHIELDDENSITYREPORTS, 1));
    }
}
