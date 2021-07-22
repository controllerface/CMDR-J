package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class TheSarge extends AbstractEngineer
{
    public TheSarge()
    {
        super("The Sarge",
            300040,
            "The Beach",
            new StarSystem("Beta-3 Tucani", 32.25, 23.875, -55.1875, 2827992680811L));

        addModification(ModificationType.Collector_Limpet_Controller, ItemGrade.GRADE_5);
        addModification(ModificationType.Fuel_Transfer_Limpet, ItemGrade.GRADE_5);
        addModification(ModificationType.Hatch_Breaker_Limpet, ItemGrade.GRADE_5);
        addModification(ModificationType.Prospector_Limpet_Controller, ItemGrade.GRADE_5);
        addModification(ModificationType.Cannon, ItemGrade.GRADE_5);
        addModification(ModificationType.Rail_Gun, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Cannon);
        addExperimental(ExperimentalType.Rail_Gun);
    }
}
