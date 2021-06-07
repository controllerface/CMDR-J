package com.controllerface.cmdr_j.interfaces.tasks;

import java.util.stream.Stream;

/**
 * In the context of Elite: Dangerous, a "blueprint" represents some specific modification that can be performed on
 * a module, for example a weapon, to change its properties in some way. In most cases, such a blueprint will have
 * multiple "grades", each of which comprise individual "recipes" that can be used to craft each grade. In this way,
 * a blueprint comprises a type of category of tasks that will contain one or more recipes comprising each grade of
 * the task type.
 *
 * In this application, the blueprint concept is applied a bit more broadly, to cover the above described case which
 * deals specifically with module modifications but also to cover use cases such as experimental effects, synthesis
 * tasks, and material trades. This interface effectively describes the functionality required for all of these uses.
 * 
 * Created by Controllerface on 5/4/2018.
 */
public interface TaskBlueprint
{
    Stream<? extends TaskRecipe> recipeStream();
    void setParentType(TaskType type);
    TaskType getParentType();
}
