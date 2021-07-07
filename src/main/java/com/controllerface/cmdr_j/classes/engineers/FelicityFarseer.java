package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class FelicityFarseer extends AbstractEngineer
{
    public FelicityFarseer()
    {
        super("Felicity Farseer", 300100, "Farseer Inc.",
            new StarSystem("Deciat", 122.625, -47.28125, -0.8125, 6681123623626L),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive, ExperimentalType.Frame_Shift_Drive), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Thrusters, ExperimentalType.Thrusters), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive_Interdictor, null), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Power_Plant, ExperimentalType.Power_Plant), ItemGrade.GRADE_1));
    }
}
