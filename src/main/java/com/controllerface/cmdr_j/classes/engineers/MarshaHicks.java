package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class MarshaHicks extends AbstractEngineer
{
    public MarshaHicks()
    {
        super("Marsha Hicks",
            300150,
            "The Watchtower",
            new StarSystem("Tir",-9532.9375, 19799.125, -923.4375, 48996147307082L));

        addModification(ModificationType.Collector_Limpet_Controller, ItemGrade.GRADE_5);
        addModification(ModificationType.Fuel_Scoop, ItemGrade.GRADE_5);
        addModification(ModificationType.Multi_Cannon, ItemGrade.GRADE_5);
        addModification(ModificationType.Prospector_Limpet_Controller, ItemGrade.GRADE_4);
        addModification(ModificationType.Refinery, ItemGrade.GRADE_4);
        addModification(ModificationType.Cannon, ItemGrade.GRADE_3);
        addModification(ModificationType.Fragment_Cannon, ItemGrade.GRADE_3);
        addModification(ModificationType.Fuel_Transfer_Limpet, ItemGrade.GRADE_1);
        addModification(ModificationType.Hatch_Breaker_Limpet, ItemGrade.GRADE_1);

        addExperimental(ExperimentalType.Multi_Cannon);
        addExperimental(ExperimentalType.Cannon);
        addExperimental(ExperimentalType.Fragment_Cannon);
    }
}
