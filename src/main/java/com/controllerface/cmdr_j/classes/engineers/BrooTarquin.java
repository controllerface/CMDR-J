package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class BrooTarquin extends AbstractEngineer
{
    public BrooTarquin()
    {
        super("Broo Tarquin",
            300030,
            "Broo's Legacy",
            new StarSystem("Muang", 17.03125, -3.46875, -172.78125, 4481966019282L));

        addModification(ModificationType.Burst_Laser, ItemGrade.GRADE_5);
        addModification(ModificationType.Pulse_Laser, ItemGrade.GRADE_5);
        addModification(ModificationType.Beam_Laser, ItemGrade.GRADE_5);

        addExperimental(ExperimentalType.Burst_Laser);
        addExperimental(ExperimentalType.Pulse_Laser);
        addExperimental(ExperimentalType.Beam_Laser);
    }
}
