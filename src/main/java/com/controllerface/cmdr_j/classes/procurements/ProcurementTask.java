package com.controllerface.cmdr_j.classes.procurements;

/**
 * Data storage object used in the "procurement tree" to hold the type and individual recipe of a possible item that
 * a player can craft. This object is used for both leaf and non-leaf nodes in the tree, with non-leaf nodes using a
 * supplied string as the text to display, and leaf nodes requiring the actual type and recipe values, which are used
 * to supply the display text.
 *
 * Created by Controllerface on 3/31/2018.
 */
public class ProcurementTask
{
    private final String text;
    private final ProcurementType type;
    private final ProcurementRecipe recipe;
    private final ProcurementBlueprint blueprint;

    public ProcurementTask(String text)
    {
        this.text = text;
        this.type = null;
        this.recipe = null;
        this.blueprint = null;
    }

    public ProcurementTask(ProcurementType type, String text)
    {
        this.text = text;
        this.type = type;
        this.recipe = null;
        this.blueprint = null;
    }

    public ProcurementTask(ProcurementType type, ProcurementRecipe recipe)
    {
        this.text = recipe.toString();
        this.type = type;
        this.recipe = recipe;
        this.blueprint = null;
    }

    public ProcurementTask(ProcurementType type, ProcurementBlueprint blueprint)
    {
        this.text = blueprint.toString();
        this.type = type;
        this.recipe = null;
        this.blueprint = blueprint;
    }

    public ProcurementType getType()
    {
        return type;
    }

    public ProcurementRecipe getRecipe()
    {
        return recipe;
    }

    public ProcurementBlueprint getBlueprint()
    {
        return blueprint;
    }

    @Override
    public String toString()
    {
        return text;
    }
}
