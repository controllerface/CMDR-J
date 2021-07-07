package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class TianaFortune extends AbstractEngineer
{
    public TianaFortune()
    {
        super("Tiana Fortune", 300270, "Fortune's Loss",
            new StarSystem("Achenar", 67.5, 24.84375, -119.46875, 164098653L),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Wake_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Kill_Warrant_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Manifest_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Collector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Fuel_Transfer_Limpet, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Hatch_Breaker_Limpet, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Prospector_Limpet_Controller, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive_Interdictor, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_3));
    }
}
