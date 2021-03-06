package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.explosive;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Explosive_4 extends AbstractModificationRecipe
{
    public HullReinforcement_Explosive_4()
    {
        super(HullReinforcement_Explosive_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 33d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition_Percent, 12d),
                                new ItemEffectData(ItemEffect.KineticResistance, -8d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -8d)
                        ),
                new CostData(Material.GALVANISINGALLOYS, 1),
                new CostData(Material.MERCURY, 1),
                new CostData(Material.TUNGSTEN, 1));
    }
}
