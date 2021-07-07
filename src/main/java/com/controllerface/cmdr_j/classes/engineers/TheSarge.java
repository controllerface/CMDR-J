package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class TheSarge extends AbstractEngineer
{
    public TheSarge()
    {
        super("The Sarge",
            300040,
            "The Beach",
            new StarSystem("Beta-3 Tucani", 32.25, 23.875, -55.1875, 2827992680811L),
            new Pair<>(new Pair<>(ModificationType.Collector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Fuel_Transfer_Limpet, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Hatch_Breaker_Limpet, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Prospector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Cannon, ExperimentalType.Cannon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Rail_Gun, ExperimentalType.Rail_Gun), ItemGrade.GRADE_3));
    }
}
