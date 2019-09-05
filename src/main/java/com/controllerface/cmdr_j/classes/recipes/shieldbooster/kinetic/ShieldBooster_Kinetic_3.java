package com.controllerface.cmdr_j.classes.recipes.shieldbooster.kinetic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class ShieldBooster_Kinetic_3 extends AbstractModificationRecipe
{
    public ShieldBooster_Kinetic_3()
    {
        super(ShieldBooster_Kinetic_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -3d),
                                new ItemEffectData(ItemEffect.KineticResistance, 17d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -3d)
                        ),
                new CostData(Material.FOCUSCRYSTALS, 1),
                new CostData(Material.HYBRIDCAPACITORS, 1),
                new CostData(Material.SALVAGEDALLOYS, 1));
    }
}
