package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class EtienneDorn extends AbstractEngineer
{
    public EtienneDorn()
    {
        super("Etienne Dorn",
            300290,
            "Kraken's Retreat",
            new StarSystem("Los",-9509.34375, 19820.125, -886.3125, 11887629902418L));

        addModification(ModificationType.Sensors, ItemGrade.GRADE_3);
        addModification(ModificationType.Rail_Gun, ItemGrade.GRADE_3);
        addModification(ModificationType.Power_Plant, ItemGrade.GRADE_3);
        addModification(ModificationType.Power_Distributor, ItemGrade.GRADE_4);
        addModification(ModificationType.Plasma_Accelerator, ItemGrade.GRADE_3);
        addModification(ModificationType.Manifest_Scanner, ItemGrade.GRADE_1);
        addModification(ModificationType.Life_Support, ItemGrade.GRADE_5);
        addModification(ModificationType.Kill_Warrant_Scanner, ItemGrade.GRADE_2);
        addModification(ModificationType.Frame_Shift_Wake_Scanner, ItemGrade.GRADE_4);

        addExperimental(ExperimentalType.Rail_Gun);
        addExperimental(ExperimentalType.Power_Plant);
        addExperimental(ExperimentalType.Power_Distributor);
        addExperimental(ExperimentalType.Plasma_Accelerator);
    }
}
