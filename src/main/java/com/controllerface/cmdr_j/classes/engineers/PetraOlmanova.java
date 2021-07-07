package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.Pair;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class PetraOlmanova extends AbstractEngineer
{
    public PetraOlmanova()
    {
        super("Petra Olmanova", 300130, "Sanctuary",
            new StarSystem("Asura",-9550.28125, 19816.1875, -916.65625, 12274907287851L),
            new Pair<>(new Pair<>(ModificationType.Hull_Reinforcement_Package, ExperimentalType.Hull_Reinforcement_Package), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Bulkheads, ExperimentalType.Bulkheads), ItemGrade.GRADE_5),
            new Pair<>(new Pair<>(ModificationType.Heat_Sink_Launcher, null), ItemGrade.GRADE_4),
            new Pair<>(new Pair<>(ModificationType.Seeker_Missile_Rack, ExperimentalType.Seeker_Missile_Rack), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Missile_Rack, ExperimentalType.Missile_Rack), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Chaff_Launcher, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Point_Defense, null), ItemGrade.GRADE_3),
            new Pair<>(new Pair<>(ModificationType.Auto_Field_Maintenence_Unit, null), ItemGrade.GRADE_2),
            new Pair<>(new Pair<>(ModificationType.Mine_Launcher, ExperimentalType.Mine_Launcher), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Torpedo_Pylon, ExperimentalType.Torpedo_Pylon), ItemGrade.GRADE_1),
            new Pair<>(new Pair<>(ModificationType.Electronic_Countermeasures, null), ItemGrade.GRADE_1));
    }
}
