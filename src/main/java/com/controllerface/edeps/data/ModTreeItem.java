package com.controllerface.edeps.data;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import javafx.util.Pair;

/**
 * Created by Stephen on 3/31/2018.
 */
public class ModTreeItem
{
    private final String text;
    private final Pair<ProcurementType, ProcurementRecipe> dataPair;

    public ModTreeItem(String text)
    {
        this.dataPair = null;
        this.text = text;
    }

    public ModTreeItem(ProcurementType type, ProcurementRecipe recipe)
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

    public Pair<ProcurementType, ProcurementRecipe> asPair()
    {
        return dataPair;
    }

    @Override
    public String toString()
    {
        return text;
    }
}
