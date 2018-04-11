package com.controllerface.edeps;

import com.controllerface.edeps.data.MaterialCostData;
import com.controllerface.edeps.data.ModificationEffectData;

import java.util.stream.Stream;

/**
 * Created by Stephen on 4/10/2018.
 */
public interface ProcurementRecipe
{
    Stream<MaterialCostData> costStream();
    String getGrade();
    ModificationEffectData effects();
}
