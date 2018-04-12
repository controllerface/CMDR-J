package com.controllerface.edeps.data;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.enums.costs.materials.MaterialCategory;

/**
 * Created by Stephen on 3/27/2018.
 */
public class InventoryData
{
    private final String category;
    private int quantity;

    private final ProcurementCost material;

    public InventoryData(ProcurementCost material, int quantity)
    {
        this.material = material;

        // todo: stop needing category here, do a runtime lookup instead
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

    public ProcurementCost getItem()
    {
        return material;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public boolean adjustCount(int adjustment)
    {
        this.quantity += adjustment;
        return quantity >= 0;
    }
}
