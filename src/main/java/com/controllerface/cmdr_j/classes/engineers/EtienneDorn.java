package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
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
            new StarSystem("Los",-9509.34375, 19820.125, -886.3125, 11887629902418L),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Rail_Gun, ExperimentalType.Rail_Gun), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Power_Plant, ExperimentalType.Power_Plant), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Power_Distributor, ExperimentalType.Power_Distributor), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Plasma_Accelerator, ExperimentalType.Plasma_Accelerator), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Manifest_Scanner, null), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Life_Support, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Kill_Warrant_Scanner, null), ItemGrade.GRADE_2),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Wake_Scanner, null), ItemGrade.GRADE_4));
    }
}
