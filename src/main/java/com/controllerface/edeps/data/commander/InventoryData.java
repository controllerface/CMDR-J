package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.structures.costs.materials.MaterialSubCategory;

/**
 * Created by Controllerface on 3/27/2018.
 *
 * NOTE: Mutable state data object
 *
 */
public class InventoryData
{
    private int quantity;
    private final ProcurementCost material;
    private final int gradeOrdinal;
    private final int categoryOrdinal;

    InventoryData(ProcurementCost material, int quantity)
    {
        this.material = material;
        this.quantity = quantity;
        this.gradeOrdinal = material.getGrade().getNumericalValue();
        this.categoryOrdinal = MaterialSubCategory.findMatchingSubCategory(material)
                .map(MaterialSubCategory::getNumericalValue)
                .orElse(-1);
    }

    @Override
    public String toString()
    {
        return material + " : " + quantity;
    }

    public ProcurementCost getItem()
    {
        return material;
    }

    public int getGradeOrdinal()
    {
        return gradeOrdinal;
    }

    public int getCategoryOrdinal()
    {
        return categoryOrdinal;
    }

    public int getQuantity()
    {
        return quantity;
    }

    boolean adjustCount(int adjustment)
    {
        this.quantity += adjustment;
        return quantity >= 0;
    }
}
