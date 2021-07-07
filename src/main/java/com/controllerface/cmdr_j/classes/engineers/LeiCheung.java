package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class LeiCheung extends AbstractEngineer
{
    public LeiCheung()
    {
        super("Lei Cheung",
            300120,
            "Trader's Rest",
            new StarSystem("Laksak", -21.53125, 116.03125, -6.3125, 4305444669811L),
            new Pair<>(new Pair<>(ModificationType.Shield_Generator, ExperimentalType.Shield_Generator), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Shield_Booster, ExperimentalType.Shield_Booster), ItemGrade.GRADE_3));
    }
}
