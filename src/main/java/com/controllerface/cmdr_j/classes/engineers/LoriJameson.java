package com.controllerface.cmdr_j.classes.engineers;

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
            new StarSystem("Shinrarta Dezhra", 55.71875, 27.15625, 17.59375, 3932277478106L));

        addModification(ModificationType.Sensors, ItemGrade.GRADE_5);
        addModification(ModificationType.Detailed_Surface_Scanner, ItemGrade.GRADE_5);
        addModification(ModificationType.Refinery, ItemGrade.GRADE_4);
        addModification(ModificationType.Fuel_Scoop, ItemGrade.GRADE_4);
        addModification(ModificationType.Auto_Field_Maintenence_Unit, ItemGrade.GRADE_4);
        addModification(ModificationType.Life_Support, ItemGrade.GRADE_4);
        addModification(ModificationType.Frame_Shift_Wake_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Kill_Warrant_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Manifest_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Shield_Cell_Bank, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Shield_Cell_Bank);
    }
}
