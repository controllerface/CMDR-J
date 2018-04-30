package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.Immutable;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import javafx.util.Pair;

/**
 * Data storage object used in the "procurement tree" to hold the type and individual recipe of a possible item that
 * a player can craft. This object is used for both leaf and non-leaf nodes in the tree, with non-leaf nodes using a
 * supplied string as the text to display, and leaf nodes requiring the actual type and recipe values, which are used
 * to supply the display text.
 *
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
