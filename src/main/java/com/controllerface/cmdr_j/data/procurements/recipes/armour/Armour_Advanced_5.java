package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_Advanced_5 extends AbstractModifcationRecipe
{
    public Armour_Advanced_5()
    {
        super(Armour_Advanced_5.class.getSimpleName(), ItemGrade.GRADE_5,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 21d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -5d),
                                new ItemEffectData(ItemEffect.KineticResistance, 18d),
                                new ItemEffectData(ItemEffect.Mass, -55d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 15d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.MILITARYGRADEALLOYS, 1),
                new CostData(Material.TIN, 1));
    }
}
