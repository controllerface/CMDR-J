package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class SeleneJean extends AbstractEngineer
{
    public SeleneJean()
    {
        super("Selene Jean",
            300210,
            "Prospector's Rest",
            new StarSystem("Kuk", -21.28125, -16.3125, 69.09375, 24859942069665L));

        addModification(ModificationType.Hull_Reinforcement_Package, ItemGrade.GRADE_5);
        addModification(ModificationType.Bulkheads, ItemGrade.GRADE_5);

        addExperimental(ExperimentalType.Hull_Reinforcement_Package);
        addExperimental(ExperimentalType.Bulkheads);
    }
}
