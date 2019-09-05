package com.controllerface.cmdr_j.classes.recipes.armour.explosive;

import com.controllerface.cmdr_j.classes.ItemEffectData;
import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.recipes.AbstractModificationRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.ItemGrade;

public class Armour_Explosive_3 extends AbstractModificationRecipe
{
    public Armour_Explosive_3()
    {
        super(Armour_Explosive_3.class.getSimpleName(), ItemGrade.GRADE_3,
                new ItemEffects
                        (
                                new ItemEffectData(ItemEffect.ExplosiveResistance, 36.4d),
                                new ItemEffectData(ItemEffect.KineticResistance, -10d),
                                new ItemEffectData(ItemEffect.ThermicResistance, -8d)
                        ),
                new CostData(Material.SALVAGEDALLOYS, 1),
                new CostData(Material.VANADIUM, 1));
    }
}
