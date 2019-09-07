package com.controllerface.cmdr_j.classes.recipes.armour.thermic;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_Thermic_4 extends AbstractModificationRecipe
{
    public Armour_Thermic_4()
    {
        super(Armour_Thermic_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, -14d),
                                new ItemEffectData(ItemEffect.KineticResistance, -12d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 33d)
                        ),
                new CostData(Material.GALVANISINGALLOYS, 1),
                new CostData(Material.HEATVANES, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
