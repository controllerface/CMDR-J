package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class MarcoQwent extends AbstractEngineer
{
    public MarcoQwent()
    {
        super("Marco Qwent",
            300200,
            "Qwent Research Base",
            new StarSystem("Sirius", 6.25, -5.75, -1.28125, 121569805492L),
            new Pair<>(new Pair<>(ModificationType.Power_Plant, ExperimentalType.Power_Plant), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Power_Distributor, ExperimentalType.Power_Distributor), ItemGrade.GRADE_3));
    }
}
