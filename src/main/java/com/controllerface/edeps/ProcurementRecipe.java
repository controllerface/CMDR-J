package com.controllerface.edeps;

import com.controllerface.edeps.data.MaterialInventoryData;
import com.controllerface.edeps.data.ModificationEffectData;

import java.util.stream.Stream;

/**
 * Created by Stephen on 4/10/2018.
 */
public interface ProcurementRecipe
{
    Stream<MaterialInventoryData> costStream();
    String getGrade();
    ModificationEffectData effects();
}
