package com.controllerface.cmdr_j.classes.engineers;

import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

@SuppressWarnings("unchecked")
public class HeraTani extends AbstractEngineer
{
    public HeraTani()
    {
        super("Hera Tani",
            300090,
            "The Jet's Hole",
            new StarSystem("Kuwemaki", 134.65625, -7.8125, -226.90625, 1733321102034L));

        addModification(ModificationType.Power_Plant, ItemGrade.GRADE_5);
        addModification(ModificationType.Detailed_Surface_Scanner, ItemGrade.GRADE_5);
        addModification(ModificationType.Sensors, ItemGrade.GRADE_3);
        addModification(ModificationType.Power_Distributor, ItemGrade.GRADE_3);

        addExperimental(ExperimentalType.Power_Plant);
        addExperimental(ExperimentalType.Power_Distributor);
    }
}
