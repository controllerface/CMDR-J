package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class JuriIshmaak extends AbstractEngineer
{
    public JuriIshmaak()
    {
        super("Juri Ishmaak",
            300250,
            "Pater's Memorial",
            new StarSystem("Giryak", 14.6875, 108.65625, 27.65625, 4481899074282L));

        addModification(ModificationType.Mine_Launcher, ItemGrade.GRADE_5);
        addModification(ModificationType.Sensors, ItemGrade.GRADE_5);
        addModification(ModificationType.Detailed_Surface_Scanner, ItemGrade.GRADE_5);
        addModification(ModificationType.Torpedo_Pylon, ItemGrade.GRADE_3);
        addModification(ModificationType.Seeker_Missile_Rack, ItemGrade.GRADE_3);
        addModification(ModificationType.Frame_Shift_Wake_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Kill_Warrant_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Manifest_Scanner, ItemGrade.GRADE_3);
        addModification(ModificationType.Missile_Rack, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Mine_Launcher);
        addExperimental(ExperimentalType.Torpedo_Pylon);
        addExperimental(ExperimentalType.Seeker_Missile_Rack);
        addExperimental(ExperimentalType.Missile_Rack);
    }
}
