package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class ElviraMartuuk extends AbstractEngineer
{
    public ElviraMartuuk()
    {
        super("Elvira Martuuk", 300160, "Long Sight Base",
            new StarSystem("Khun", -171.59375, -56.96875, 19.96875, 3107241104074L));

        addModification(ModificationType.Frame_Shift_Drive, ItemGrade.GRADE_5);
        addModification(ModificationType.Shield_Generator, ItemGrade.GRADE_3);
        addModification(ModificationType.Thrusters, ItemGrade.GRADE_2);
        addModification(ModificationType.Shield_Cell_Bank, ItemGrade.GRADE_1);

        addExperimental(ExperimentalType.Frame_Shift_Drive);
        addExperimental(ExperimentalType.Shield_Generator);
        addExperimental(ExperimentalType.Thrusters);
        addExperimental(ExperimentalType.Shield_Cell_Bank);
    }
}
