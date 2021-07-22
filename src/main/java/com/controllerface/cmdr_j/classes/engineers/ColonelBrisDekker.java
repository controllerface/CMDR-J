package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class ColonelBrisDekker extends AbstractEngineer
{
    public ColonelBrisDekker()
    {
        super("Colonel Bris Dekker",
            300140,
            "Dekker's Yard",
            new StarSystem("Sol", 0, 0, 0, 10477373803L));

        addModification(ModificationType.Frame_Shift_Drive_Interdictor, ItemGrade.GRADE_4);
        addModification(ModificationType.Frame_Shift_Drive, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Frame_Shift_Drive);
    }
}
