package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class RamTah extends AbstractEngineer
{
    public RamTah()
    {
        super("Ram Tah",
            300110,
            "Phoenix Base",
            new StarSystem("Meene ", 118.78125, -97.1875, -56.4375, 3790082132323L),
            new Pair<>(new Pair<>(ModificationType.Electronic_Countermeasures, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Point_Defense, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Heat_Sink_Launcher, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Chaff_Launcher, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Collector_Limpet_Controller, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Fuel_Transfer_Limpet, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Prospector_Limpet_Controller, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Hatch_Breaker_Limpet, null), ItemGrade.GRADE_3));
    }
}
