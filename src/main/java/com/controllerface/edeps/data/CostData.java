package com.controllerface.edeps.data;

import com.controllerface.edeps.ProcurementCost;

/**
 * Created by Stephen on 3/27/2018.
 */
public class CostData
{
    private final int quantity;

    private final ProcurementCost material;

    public CostData(ProcurementCost material, int quantity)
    {
        this.material = material;
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return material + " : " + quantity;
    }

    public ProcurementCost getCost()
    {
        return material;
    }

    public int getQuantity()
    {
        return quantity;
    }

}
