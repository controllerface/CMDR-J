package com.controllerface.cmdr_j.classes.tasks;

/**
 * Data storage object used in the "task tree" to hold the type and individual recipe of a possible item that
 * a player can craft. This object is used for both leaf and non-leaf nodes in the tree, with non-leaf nodes using a
 * supplied string as the text to display, and leaf nodes requiring the actual type and recipe values, which are used
 * to supply the display text.
 *
 * Created by Controllerface on 3/31/2018.
 */
public class Task
{
    private final String text;
    private final TaskType type;
    private final TaskRecipe recipe;
    private final TaskBlueprint blueprint;

    public Task(String text)
    {
        this.text = text;
        this.type = null;
        this.recipe = null;
        this.blueprint = null;
    }

    public Task(TaskType type, String text)
    {
        this.text = text;
        this.type = type;
        this.recipe = null;
        this.blueprint = null;
    }

    public Task(TaskType type, TaskRecipe recipe)
    {
        this.text = recipe.toString();
        this.type = type;
        this.recipe = recipe;
        this.blueprint = null;
    }

    public Task(TaskType type, TaskBlueprint blueprint)
    {
        this.text = blueprint.toString();
        this.type = type;
        this.recipe = null;
        this.blueprint = blueprint;
    }

    public TaskType getType()
    {
        return type;
    }

    public TaskRecipe getRecipe()
    {
        return recipe;
    }

    public TaskBlueprint getBlueprint()
    {
        return blueprint;
    }

    @Override
    public String toString()
    {
        return text;
    }
}
