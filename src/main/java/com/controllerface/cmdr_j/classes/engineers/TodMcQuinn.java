package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class TodMcQuinn extends AbstractEngineer
{
    public TodMcQuinn()
    {
        super("Tod 'The Blaster' McQuinn",
            300260,
            "Trophy Camp",
            new StarSystem("Wolf 397", 40, -10.40625, 79.21875, 3107576681170L),
            new Pair<>(new Pair<>(ModificationType.Multi_Cannon, ExperimentalType.Multi_Cannon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Rail_Gun, ExperimentalType.Rail_Gun), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Fragment_Cannon, ExperimentalType.Fragment_Cannon), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Cannon, ExperimentalType.Cannon), ItemGrade.GRADE_2));
    }
}
