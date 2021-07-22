package com.controllerface.cmdr_j.classes.engineers;

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
            new StarSystem("Arque", 66.5, 61.125, 38.0625, 113573366131L));

        addModification(ModificationType.Thrusters, ItemGrade.GRADE_5);
        addModification(ModificationType.Frame_Shift_Drive, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Thrusters);
        addExperimental(ExperimentalType.Frame_Shift_Drive);
    }
}
