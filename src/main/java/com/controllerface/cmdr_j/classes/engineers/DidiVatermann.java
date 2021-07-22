package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class DidiVatermann extends AbstractEngineer
{
    public DidiVatermann()
    {
        super("Didi Vatermann",
            300000,
            "Vatermann LLC",
            new StarSystem("Leesti", 72.75, 68.25, 48.75, 3932277478114L));

        addModification(ModificationType.Shield_Booster, ItemGrade.GRADE_5);
        addModification(ModificationType.Shield_Generator, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Shield_Booster);
        addExperimental(ExperimentalType.Shield_Generator);
    }
}
