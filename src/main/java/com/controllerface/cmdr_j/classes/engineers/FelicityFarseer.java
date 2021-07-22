package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class FelicityFarseer extends AbstractEngineer
{
    public FelicityFarseer()
    {
        super("Felicity Farseer",
            300100,
            "Farseer Inc.",
            new StarSystem("Deciat", 122.625, -47.28125, -0.8125, 6681123623626L));

        addModification(ModificationType.Frame_Shift_Drive, ItemGrade.GRADE_5);
        addModification(ModificationType.Thrusters, ItemGrade.GRADE_3);
        addModification(ModificationType.Sensors, ItemGrade.GRADE_3);
        addModification(ModificationType.Detailed_Surface_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Shield_Booster, ItemGrade.GRADE_1);
        addModification(ModificationType.Frame_Shift_Drive_Interdictor, ItemGrade.GRADE_1);
        addModification(ModificationType.Power_Plant, ItemGrade.GRADE_1);

        addExperimental(ExperimentalType.Frame_Shift_Drive);
        addExperimental(ExperimentalType.Thrusters);
        addExperimental(ExperimentalType.Shield_Booster);
        addExperimental(ExperimentalType.Power_Plant);
    }
}
