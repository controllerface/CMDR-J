package com.controllerface.edeps;

import com.controllerface.edeps.data.CostData;
import com.controllerface.edeps.data.ItemEffectData;

import java.util.stream.Stream;

/**
 * Created by Stephen on 4/10/2018.
 */
public interface ProcurementRecipe
{
    Stream<CostData> costStream();
    String getLabel();
    ItemEffectData effects();
}
