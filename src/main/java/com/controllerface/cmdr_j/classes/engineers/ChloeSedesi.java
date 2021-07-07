package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class ChloeSedesi extends AbstractEngineer
{
    public ChloeSedesi()
    {
        super("Chloe Sedesi",
            300300,
            "Conder's Dock",
            new StarSystem("Shenve",351.96875, -711.09375, -373.46875, 594676730147L));

        addModification(ModificationType.Thrusters, ItemGrade.GRADE_5);
        addModification(ModificationType.Frame_Shift_Drive, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Thrusters);
        addExperimental(ExperimentalType.Frame_Shift_Drive);
    }
}
