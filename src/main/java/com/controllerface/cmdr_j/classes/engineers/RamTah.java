package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class RamTah extends AbstractEngineer
{
    public RamTah()
    {
        super("Ram Tah",
            300110,
            "Phoenix Base",
            new StarSystem("Meene ", 118.78125, -97.1875, -56.4375, 3790082132323L));

        addModification(ModificationType.Electronic_Countermeasures, ItemGrade.GRADE_5);
        addModification(ModificationType.Point_Defense, ItemGrade.GRADE_5);
        addModification(ModificationType.Heat_Sink_Launcher, ItemGrade.GRADE_5);
        addModification(ModificationType.Chaff_Launcher, ItemGrade.GRADE_5);
        addModification(ModificationType.Collector_Limpet_Controller, ItemGrade.GRADE_4);
        addModification(ModificationType.Fuel_Transfer_Limpet, ItemGrade.GRADE_4);
        addModification(ModificationType.Prospector_Limpet_Controller, ItemGrade.GRADE_4);
        addModification(ModificationType.Hatch_Breaker_Limpet, ItemGrade.GRADE_3);
    }
}
