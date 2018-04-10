package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialCategory;

/**
 * Created by Stephen on 3/27/2018.
 */
public class MaterialInventoryData
{
    private final String category;
    private final int quantity;

    private final Material material;

    public MaterialInventoryData(Material material, int quantity)
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







//    public String findMatchingCategory()
//    {
//        return category.get();
//    }
//
//    public void setCategory(String category)
//    {
//        this.category.set(category);
//    }
//
//    public String getGrade()
//    {
//        return grade.get();
//    }
//
//    public void setGrade(String grade)
//    {
//        this.grade.set(grade);
//    }
//
//    public String getMaterial()
//    {
//        return material.get();
//    }
//
//    public Material getMaterial()
//    {
//        return _material;
//    }
//
//    public void setMaterial(String material)
//    {
//        this.material.set(material);
//    }
//
//    public int getQuantity()
//    {
//        return quantity.get();
//    }
//
//    public void setQuantity(int quantity)
//    {
//        this.quantity.set(quantity);
//    }
}
