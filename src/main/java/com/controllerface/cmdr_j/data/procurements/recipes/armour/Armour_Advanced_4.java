package com.controllerface.cmdr_j.data.procurements.recipes.armour;

import com.controllerface.cmdr_j.data.ItemEffectData;
import com.controllerface.cmdr_j.data.ItemEffects;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.recipes.AbstractModifcationRecipe;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.equipment.ItemEffect;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

public class Armour_Advanced_4 extends AbstractModifcationRecipe
{
    public Armour_Advanced_4()
    {
        super(Armour_Advanced_4.class.getSimpleName(), ItemGrade.GRADE_4,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 16.8d),
                                new ItemEffectData(ItemEffect.DefenceModifierHealthMultiplier, -4d),
                                new ItemEffectData(ItemEffect.KineticResistance, 14.4d),
                                new ItemEffectData(ItemEffect.Mass, -45d),
                                new ItemEffectData(ItemEffect.ThermicResistance, 12d)
                        ),
                new CostData(Material.CONDUCTIVECERAMICS, 1),
                new CostData(Material.GERMANIUM, 1),
                new CostData(Material.FEDPROPRIETARYCOMPOSITES, 1));
    }
}
