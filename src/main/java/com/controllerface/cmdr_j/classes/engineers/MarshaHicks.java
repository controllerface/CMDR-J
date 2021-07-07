package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class MarshaHicks extends AbstractEngineer
{
    public MarshaHicks()
    {
        super("Marsha Hicks",
            300150,
            "The Watchtower",
            new StarSystem("Tir",-9532.9375, 19799.125, -923.4375, 48996147307082L),
            new Pair<>(new Pair<>(ModificationType.Collector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Fuel_Scoop, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Prospector_Limpet_Controller, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Refinery, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Cannon, ExperimentalType.Cannon), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Fuel_Transfer_Limpet, null), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Hatch_Breaker_Limpet, null), ItemGrade.GRADE_1));
    }
}
