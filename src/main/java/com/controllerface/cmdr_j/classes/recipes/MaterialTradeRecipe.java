package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;

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

    private final Icon icon;

    public MaterialTradeRecipe(CostData price, CostData product)
    {
        this.price = price;
        this.product = product;

        icon = ((Material) product.cost).getIcon();
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

    public Map<String, Object> serializeRecipe()
    {
        Map<String, Object> recipeObject = new HashMap<>();
        Map<String, Object> costObject = new HashMap<>();
        Map<String, Object> yieldObject = new HashMap<>();

        Material priceMaterial = ((Material) price.cost);
        Material yieldMaterial = ((Material) product.cost);

        costObject.put("name", priceMaterial.name());
        costObject.put("count", price.quantity);

        yieldObject.put("name", yieldMaterial.name());
        yieldObject.put("count", product.quantity);

        recipeObject.put("price", costObject);
        recipeObject.put("yield", yieldObject);

        return recipeObject;
    }

    @SuppressWarnings("unchecked")
    public static MaterialTradeRecipe deserializeRecipe(Map<String, Object> recipeObject)
    {
        Map<String, Object> costObject = ((Map<String, Object>) recipeObject.get("price"));
        Map<String, Object> yieldObject = ((Map<String, Object>) recipeObject.get("yield"));

        Material priceMaterial = Material.valueOf((String) costObject.get("name"));
        Material yieldMaterial = Material.valueOf((String) yieldObject.get("name"));

        CostData price = new CostData(priceMaterial, ((int) costObject.get("count")));
        CostData yield = new CostData(yieldMaterial, ((int) yieldObject.get("count")));

        return new MaterialTradeRecipe(price, yield);
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
    public void setParentBlueprintName(String blueprintName)
    {

    }

    @Override
    public String getParentBlueprintName()
    {
        return "";
    }

    @Override
    public Icon getIcon()
    {
        return icon;
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
