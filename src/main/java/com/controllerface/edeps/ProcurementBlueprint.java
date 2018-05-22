package com.controllerface.edeps;

import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/4/2018.
 */
public interface ProcurementBlueprint
{
    Stream<ProcurementRecipe> recipeStream();
}
