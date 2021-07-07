package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class TheDweller extends AbstractEngineer
{
    public TheDweller()
    {
        super("The Dweller",
            300180,
            "Black Hide",
            new StarSystem("Wyrd", -11.625, -3.9375, 31.53125, 5031654888146L),
            new Pair<>(new Pair<>(ModificationType.Power_Distributor, ExperimentalType.Power_Distributor), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser), ItemGrade.GRADE_3));
    }
}
