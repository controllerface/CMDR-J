package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
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
            new StarSystem("Yoru", 97.875, 64.125, -86.90625, 6131367744226L),
            new Pair<>(new Pair<>(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator), ItemGrade.GRADE_2));
    }
}
