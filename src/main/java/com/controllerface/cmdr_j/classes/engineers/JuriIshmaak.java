package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class JuriIshmaak extends AbstractEngineer
{
    public JuriIshmaak()
    {
        super("Juri Ishmaak",
            300250,
            "Pater's Memorial",
            new StarSystem("Giryak", 14.6875, 108.65625, 27.65625, 4481899074282L),
            new Pair<>(new Pair<>(ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Wake_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Kill_Warrant_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Manifest_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Missile_Rack, ExperimentalType.Missile_Rack), ItemGrade.GRADE_3));
    }
}
