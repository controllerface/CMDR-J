package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class ProfessorPalin extends AbstractEngineer
{
    public ProfessorPalin()
    {
        super("Professor Palin",
            300220,
            "Abel Laboratory",
            new StarSystem("Arque", 66.5, 61.125, 38.0625, 113573366131L),
            new Pair<>(new Pair<>(ModificationType.Thrusters, ExperimentalType.Thrusters), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive, ExperimentalType.Frame_Shift_Drive), ItemGrade.GRADE_3));
    }
}
