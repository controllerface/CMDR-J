package com.controllerface.edeps;

import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.ItemEffectData;
import com.controllerface.edeps.structures.equipment.ItemGrade;

import java.util.stream.Stream;

/**
 * Created by Stephen on 4/10/2018.
 */
public interface ProcurementRecipe
{
    Stream<CostData> costStream();
    String getLabel();
    ItemEffectData effects();
    String getName();
    ItemGrade getGrade();
}
