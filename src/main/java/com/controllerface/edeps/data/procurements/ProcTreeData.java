package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.Immutable;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import javafx.util.Pair;

/**
 * Created by Stephen on 3/31/2018.
 */
@Immutable
public class ProcTreeData
{
    private final String text;
    private final Pair<ProcurementType, ProcurementRecipe> dataPair;

    public ProcTreeData(String text)
    {
        this.dataPair = null;
        this.text = text;
    }

    public ProcTreeData(ProcurementType type, ProcurementRecipe recipe)
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
