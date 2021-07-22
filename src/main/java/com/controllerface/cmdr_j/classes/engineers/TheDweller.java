package com.controllerface.cmdr_j.classes.engineers;

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
            new StarSystem("Wyrd", -11.625, -3.9375, 31.53125, 5031654888146L));

        addModification(ModificationType.Power_Distributor, ItemGrade.GRADE_5);
        addModification(ModificationType.Pulse_Laser, ItemGrade.GRADE_4);
        addModification(ModificationType.Burst_Laser, ItemGrade.GRADE_3);
        addModification(ModificationType.Beam_Laser, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Power_Distributor);
        addExperimental(ExperimentalType.Pulse_Laser);
        addExperimental(ExperimentalType.Burst_Laser);
        addExperimental(ExperimentalType.Beam_Laser);
    }
}
