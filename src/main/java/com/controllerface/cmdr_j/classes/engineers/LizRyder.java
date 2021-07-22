package com.controllerface.cmdr_j.classes.engineers;

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
            new StarSystem("Eurybia", 51.40625, -30.5, -54.40625, 1458309141194L));

        addModification(ModificationType.Seeker_Missile_Rack, ItemGrade.GRADE_5);
        addModification(ModificationType.Torpedo_Pylon, ItemGrade.GRADE_5);
        addModification(ModificationType.Missile_Rack, ItemGrade.GRADE_5);
        addModification(ModificationType.Mine_Launcher, ItemGrade.GRADE_3);
        addModification(ModificationType.Hull_Reinforcement_Package, ItemGrade.GRADE_1);
        addModification(ModificationType.Bulkheads, ItemGrade.GRADE_1);

        addExperimental(ExperimentalType.Seeker_Missile_Rack);
        addExperimental(ExperimentalType.Torpedo_Pylon);
        addExperimental(ExperimentalType.Missile_Rack);
        addExperimental(ExperimentalType.Mine_Launcher);
        addExperimental(ExperimentalType.Hull_Reinforcement_Package);
        addExperimental(ExperimentalType.Bulkheads);
    }
}
