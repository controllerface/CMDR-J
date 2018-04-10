package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.modifications.ModificationRecipe;
import com.controllerface.edeps.enums.modifications.ModificationType;
import javafx.util.Pair;

/**
 * Created by Stephen on 3/31/2018.
 */
public class ModTreeItem
{
    private final String text;
    private final Pair<ModificationType, ModificationRecipe> dataPair;

    public ModTreeItem(String text)
    {
        this.dataPair = null;
        this.text = text;
    }

    public ModTreeItem(ModificationType type, ModificationRecipe recipe)
    {
        this.dataPair = new Pair<>(type, recipe);
        this.text = recipe.toString();
    }

    public ModificationType getType()
    {
        return dataPair == null ? null : dataPair.getKey();
    }

    public ModificationRecipe getRecipe()
    {
        return dataPair == null ? null : dataPair.getValue();
    }

    public Pair<ModificationType, ModificationRecipe> asPair()
    {
        return dataPair;
    }

    @Override
    public String toString()
    {
        return text;
    }
}
