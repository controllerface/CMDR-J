package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
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
            new StarSystem("Luchtaine",-9523.3125, 19825.90625, -914.46875, 66038577537618L),
            new Pair<>(new Pair<>(ModificationType.Thrusters, ExperimentalType.Thrusters), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Pulse_Laser, ExperimentalType.Pulse_Laser), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Beam_Laser, ExperimentalType.Beam_Laser), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive, ExperimentalType.Frame_Shift_Drive), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Burst_Laser, ExperimentalType.Burst_Laser), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Drive_Interdictor, null), ItemGrade.GRADE_5));
    }
}
