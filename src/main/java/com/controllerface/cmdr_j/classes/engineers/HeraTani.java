package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class HeraTani extends AbstractEngineer
{
    public HeraTani()
    {
        super("Hera Tani",
            300090,
            "The Jet's Hole",
            new StarSystem("Kuwemaki", 134.65625, -7.8125, -226.90625, 1733321102034L),
            new Pair<>(new Pair<>(ModificationType.Power_Plant, ExperimentalType.Power_Plant), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Power_Distributor, ExperimentalType.Power_Distributor), ItemGrade.GRADE_3));
    }
}
