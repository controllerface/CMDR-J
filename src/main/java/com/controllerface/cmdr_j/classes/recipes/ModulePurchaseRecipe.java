package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.CostData;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.special.AnyCost;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public class ModulePurchaseRecipe implements ProcurementRecipe
{
    private final CostData price;
    private final CostData product;
    private final String name;
    private final String label;
    private final String shortLabel;

    private final Icon icon;

    public ModulePurchaseRecipe(long price, ShipModule product)
    {
        CostData x = new CostData(CreditCost.CREDIT_COST, price);
        CostData y = new CostData(product, -1);

        this.price = x;
        this.product = y;

        icon = product.icons().get(0);
        name = product.displayText();
        label = generateDisplayLabel(this.price, this.product);
        shortLabel = product.displayText();
    }

    private static String generateDisplayLabel(CostData price, CostData product)
    {
        String priceCost = price.getQuantity() + " " + price.getCost().getLocalizedName();
        String yieldCost = Math.abs(product.getQuantity()) + " " + product.getCost().getLocalizedName();
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

//    public Map<String, Object> serializeRecipe()
//    {
//        Map<String, Object> recipeObject = new HashMap<>();
//        Map<String, Object> costObject = new HashMap<>();
//        Map<String, Object> yieldObject = new HashMap<>();
//
//        Material priceMaterial = ((Material) price.getCost());
//        Material yieldMaterial = ((Material) product.getCost());
//
//        costObject.put("name", priceMaterial.name());
//        costObject.put("count", price.getQuantity());
//
//        yieldObject.put("name", yieldMaterial.name());
//        yieldObject.put("count", product.getQuantity());
//
//        recipeObject.put("price", costObject);
//        recipeObject.put("yield", yieldObject);
//
//        return recipeObject;
//    }

//    @SuppressWarnings("unchecked")
//    public static ModulePurchaseRecipe deserializeRecipe(Map<String, Object> recipeObject)
//    {
//        Map<String, Object> costObject = ((Map<String, Object>) recipeObject.get("price"));
//        Map<String, Object> yieldObject = ((Map<String, Object>) recipeObject.get("yield"));
//
//        Material priceMaterial = Material.valueOf((String) costObject.get("name"));
//        Material yieldMaterial = Material.valueOf((String) yieldObject.get("name"));
//
//        CostData price = new CostData(priceMaterial, ((int) costObject.get("count")));
//        CostData yield = new CostData(yieldMaterial, ((int) yieldObject.get("count")));
//
//        return new ModulePurchaseRecipe(price, yield);
//    }

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
    public String toString()
    {
        return getName();
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
        if (obj instanceof ModulePurchaseRecipe)
        {
            ModulePurchaseRecipe other = ((ModulePurchaseRecipe) obj);
            return (other.price.getCost() == this.price.getCost()
                    && other.product.getCost() == this.product.getCost()
                    && other.price.getQuantity() == this.price.getQuantity()
                    && other.product.getQuantity() == this.product.getQuantity());
        }
        return false;
    }
}
