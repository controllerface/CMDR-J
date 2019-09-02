package com.controllerface.cmdr_j.classes.procurements.recipes.armour.advanced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Armour_Advanced_4 extends AbstractModificationRecipe
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
