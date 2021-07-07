package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class BillTurner extends AbstractEngineer
{
    public BillTurner()
    {
        super("Bill Turner",
            300010,
            "Turner Metallics Inc.",
            new StarSystem("Alioth", -33.65625, -20.65625, 72.46875 , 1109989017963L));

        addModification(ModificationType.Plasma_Accelerator, ItemGrade.GRADE_5);
        addModification(ModificationType.Sensors, ItemGrade.GRADE_5);
        addModification(ModificationType.Detailed_Surface_Scanner, ItemGrade.GRADE_5);
        addModification(ModificationType.Life_Support, ItemGrade.GRADE_3);
        addModification(ModificationType.Refinery, ItemGrade.GRADE_3);
        addModification(ModificationType.Auto_Field_Maintenence_Unit, ItemGrade.GRADE_3);
        addModification(ModificationType.Fuel_Scoop, ItemGrade.GRADE_3);
        addModification(ModificationType.Frame_Shift_Wake_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Kill_Warrant_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Manifest_Scanner, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Plasma_Accelerator);
    }
}
