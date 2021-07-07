package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class LizRyder extends AbstractEngineer
{
    public LizRyder()
    {
        super("Liz Ryder",
            300080,
            "Demolition Unlimited",
            new StarSystem("Eurybia", 51.40625, -30.5, -54.40625, 1458309141194L),
            new Pair<>(new Pair<>(ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Missile_Rack, ExperimentalType.Missile_Rack), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Bulkheads, ExperimentalType.Bulkheads), ItemGrade.GRADE_1));
    }
}
