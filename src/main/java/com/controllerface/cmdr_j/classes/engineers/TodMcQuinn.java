package com.controllerface.cmdr_j.classes.engineers;

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
            new StarSystem("Wolf 397", 40, -10.40625, 79.21875, 3107576681170L));

        addModification(ModificationType.Multi_Cannon, ItemGrade.GRADE_5);
        addModification(ModificationType.Rail_Gun, ItemGrade.GRADE_5);
        addModification(ModificationType.Fragment_Cannon, ItemGrade.GRADE_3);
        addModification(ModificationType.Cannon, ItemGrade.GRADE_2);

        addExperimental(ExperimentalType.Multi_Cannon);
        addExperimental(ExperimentalType.Rail_Gun);
        addExperimental(ExperimentalType.Fragment_Cannon);
        addExperimental(ExperimentalType.Cannon);
    }
}
