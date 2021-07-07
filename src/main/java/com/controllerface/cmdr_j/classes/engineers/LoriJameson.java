package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class LoriJameson extends AbstractEngineer
{
    public LoriJameson()
    {
        super("Lori Jameson",
            300230,
            "Jameson Base",
            new StarSystem("Shinrarta Dezhra", 55.71875, 27.15625, 17.59375, 3932277478106L),
            new Pair<>(new Pair<>(ModificationType.Sensors, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Detailed_Surface_Scanner, null), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Refinery, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Fuel_Scoop, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Auto_Field_Maintenence_Unit, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Life_Support, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Frame_Shift_Wake_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Kill_Warrant_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Manifest_Scanner, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Shield_Cell_Bank, ExperimentalType.Shield_Cell_Bank), ItemGrade.GRADE_3));
    }
}
