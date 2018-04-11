package com.controllerface.edeps.data;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import javafx.util.Pair;

/**
 * Created by Stephen on 3/31/2018.
 */
public class ProcTreeItem
{
    private final String text;
    private final Pair<ProcurementType, ProcurementRecipe> dataPair;

    public ProcTreeItem(String text)
    {
        this.dataPair = null;
        this.text = text;
    }

    public ProcTreeItem(ProcurementType type, ProcurementRecipe recipe)
    {
        this.dataPair = new Pair<>(type, recipe);
        this.text = recipe.toString();
    }

    public ProcurementType getType()
    {
        return dataPair == null ? null : dataPair.getKey();
    }

    public ProcurementRecipe getRecipe()
    {
        return dataPair == null ? null : dataPair.getValue();
    }

    @Override
    public String toString()
    {
        return text;
    }
}
