package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class PetraOlmanova extends AbstractEngineer
{
    public PetraOlmanova()
    {
        super("Petra Olmanova",
            300130,
            "Sanctuary",
            new StarSystem("Asura",-9550.28125, 19816.1875, -916.65625, 12274907287851L));

        addModification(ModificationType.Hull_Reinforcement_Package, ItemGrade.GRADE_5);
        addModification(ModificationType.Bulkheads, ItemGrade.GRADE_5);
        addModification(ModificationType.Heat_Sink_Launcher, ItemGrade.GRADE_4);
        addModification(ModificationType.Seeker_Missile_Rack, ItemGrade.GRADE_3);
        addModification(ModificationType.Missile_Rack, ItemGrade.GRADE_3);
        addModification(ModificationType.Chaff_Launcher, ItemGrade.GRADE_3);
        addModification(ModificationType.Point_Defense, ItemGrade.GRADE_3);
        addModification(ModificationType.Auto_Field_Maintenence_Unit, ItemGrade.GRADE_2);
        addModification(ModificationType.Mine_Launcher, ItemGrade.GRADE_1);
        addModification(ModificationType.Torpedo_Pylon, ItemGrade.GRADE_1);
        addModification(ModificationType.Electronic_Countermeasures, ItemGrade.GRADE_1);

        addExperimental(ExperimentalType.Hull_Reinforcement_Package);
        addExperimental(ExperimentalType.Bulkheads);
        addExperimental(ExperimentalType.Seeker_Missile_Rack);
        addExperimental(ExperimentalType.Missile_Rack);
        addExperimental(ExperimentalType.Mine_Launcher);
        addExperimental(ExperimentalType.Torpedo_Pylon);
    }
}
