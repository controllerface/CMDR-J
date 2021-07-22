package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class MelBrandon extends AbstractEngineer
{
    public MelBrandon()
    {
        super("Mel Brandon",
            300280,
            "The Brig",
            new StarSystem("Luchtaine",-9523.3125, 19825.90625, -914.46875, 66038577537618L));

        addModification(ModificationType.Thrusters, ItemGrade.GRADE_5);
        addModification(ModificationType.Shield_Generator, ItemGrade.GRADE_5);
        addModification(ModificationType.Pulse_Laser, ItemGrade.GRADE_5);
        addModification(ModificationType.Beam_Laser, ItemGrade.GRADE_5);
        addModification(ModificationType.Shield_Booster, ItemGrade.GRADE_5);
        addModification(ModificationType.Shield_Cell_Bank, ItemGrade.GRADE_4);
        addModification(ModificationType.Frame_Shift_Drive, ItemGrade.GRADE_4);
        addModification(ModificationType.Burst_Laser, ItemGrade.GRADE_4);
        addModification(ModificationType.Frame_Shift_Drive_Interdictor, ItemGrade.GRADE_5);

        addExperimental(ExperimentalType.Thrusters);
        addExperimental(ExperimentalType.Shield_Generator);
        addExperimental(ExperimentalType.Pulse_Laser);
        addExperimental(ExperimentalType.Beam_Laser);
        addExperimental(ExperimentalType.Shield_Booster);
        addExperimental(ExperimentalType.Shield_Cell_Bank);
        addExperimental(ExperimentalType.Frame_Shift_Drive);
        addExperimental(ExperimentalType.Burst_Laser);
    }
}
