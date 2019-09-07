package com.controllerface.cmdr_j.classes.recipes.armour.advanced;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

public class Armour_Advanced_5 extends AbstractModificationRecipe
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
