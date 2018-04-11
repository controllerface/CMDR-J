package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialCategory;

/**
 * Created by Stephen on 3/27/2018.
 */
public class MaterialCostData
{
    private final String category;
    private final int quantity;

    private final Material material;

    public MaterialCostData(Material material, int quantity)
    {
        this.material = material;
        this.category = MaterialCategory.findMatchingCategory(material).toString();
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return material + " : " + quantity;
    }

    public String getCategory()
    {
        return category;
    }

    public Material getMaterial()
    {
        return material;
    }

    public int getQuantity()
    {
        return quantity;
    }

}
