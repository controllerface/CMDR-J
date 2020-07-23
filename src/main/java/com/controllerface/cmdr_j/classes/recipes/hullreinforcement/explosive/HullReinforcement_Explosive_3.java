package com.controllerface.cmdr_j.classes.recipes.hullreinforcement.explosive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class HullReinforcement_Explosive_3 extends AbstractModificationRecipe
{
    public HullReinforcement_Explosive_3()
    {
        super(HullReinforcement_Explosive_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 25.4d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthAddition, 9d),
                                new ItemEffectData(ItemEffect.KineticResistance, -6d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -6d)
                        ),
                new CostData(Material.SALVAGEDALLOYS, 1),
                new CostData(Material.VANADIUM, 1),
                new CostData(Material.ZIRCONIUM, 1));
    }
}
