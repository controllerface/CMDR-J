package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class ZacariahNemo extends AbstractEngineer
{
    public ZacariahNemo()
    {
        super("Zacariah Nemo",
            300050,
            "Nemo Cyber Party Base",
            new StarSystem("Yoru", 97.875, 64.125, -86.90625, 6131367744226L));

        addModification(ModificationType.Fragment_Cannon, ItemGrade.GRADE_5);
        addModification(ModificationType.Multi_Cannon, ItemGrade.GRADE_3);
        addModification(ModificationType.Plasma_Accelerator, ItemGrade.GRADE_2);

        addExperimental(ExperimentalType.Fragment_Cannon);
        addExperimental(ExperimentalType.Multi_Cannon);
        addExperimental(ExperimentalType.Plasma_Accelerator);
    }
}
