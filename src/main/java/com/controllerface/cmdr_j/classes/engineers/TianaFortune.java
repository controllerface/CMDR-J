package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class TianaFortune extends AbstractEngineer
{
    public TianaFortune()
    {
        super("Tiana Fortune",
            300270,
            "Fortune's Loss",
            new StarSystem("Achenar", 67.5, 24.84375, -119.46875, 164098653L));

        addModification(ModificationType.Frame_Shift_Wake_Scanner, ItemGrade.GRADE_5);
        addModification(ModificationType.Kill_Warrant_Scanner, ItemGrade.GRADE_5);
        addModification(ModificationType.Manifest_Scanner, ItemGrade.GRADE_5);
        addModification(ModificationType.Collector_Limpet_Controller, ItemGrade.GRADE_5);
        addModification(ModificationType.Fuel_Transfer_Limpet, ItemGrade.GRADE_5);
        addModification(ModificationType.Hatch_Breaker_Limpet, ItemGrade.GRADE_5);
        addModification(ModificationType.Prospector_Limpet_Controller, ItemGrade.GRADE_5);
        addModification(ModificationType.Sensors, ItemGrade.GRADE_5);
        addModification(ModificationType.Frame_Shift_Drive_Interdictor, ItemGrade.GRADE_3);
        addModification(ModificationType.Detailed_Surface_Scanner, ItemGrade.GRADE_3);
    }
}
