package com.controllerface.cmdr_j.classes.engineers;

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
            new StarSystem("Laksak", -21.53125, 116.03125, -6.3125, 4305444669811L));

        addModification(ModificationType.Shield_Generator, ItemGrade.GRADE_5);
        addModification(ModificationType.Sensors, ItemGrade.GRADE_5);
        addModification(ModificationType.Detailed_Surface_Scanner, ItemGrade.GRADE_5);
        addModification(ModificationType.Shield_Booster, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Shield_Generator);
        addExperimental(ExperimentalType.Shield_Booster);
    }
}
