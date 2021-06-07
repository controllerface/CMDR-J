package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public class MaterialTradeRecipe implements TaskRecipe
{
    private final CostData price;
    private final CostData product;
    private final String name;
    private final String label;
    private final String shortLabel;

    public MaterialTradeRecipe(CostData price, CostData product)
    {
        this.price = price;
        this.product = product;

        name = price.cost.getLocalizedName();
        label = generateDisplayLabel(price, product);
        shortLabel = price.cost.getLocalizedName();
    }

    private static String generateDisplayLabel(CostData price, CostData product)
    {
        String priceCost = price.quantity + " " + price.cost.getLocalizedName();
        String yieldCost = Math.abs(product.quantity) + " " + product.cost.getLocalizedName();
        return priceCost + " for " + yieldCost;
    }

    @Override
    public Stream<CostData> costStream()
    {
        return Stream.of(price, product);
    }

    @Override
    public String getShortLabel()
    {
        return shortLabel;
    }

    @Override
    public String getDisplayLabel()
    {
        return label;
    }

    @Override
    public ItemEffects effects()
    {
        return ItemEffects.EMPTY;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public ItemGrade getGrade()
    {
        return ItemGrade.MaterialTrade;
    }

    @Override
    public void setParentBlueprintName(TaskBlueprint blueprintName)
    {

    }

    @Override
    public TaskBlueprint getParentBlueprint()
    {
        return null;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof MaterialTradeRecipe)
        {
            MaterialTradeRecipe other = ((MaterialTradeRecipe) obj);
            return (other.price.cost == this.price.cost
                    && other.product.cost == this.product.cost
                    && other.price.quantity == this.price.quantity
                    && other.product.quantity == this.product.quantity);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, label);
    }
}
