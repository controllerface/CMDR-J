package com.controllerface.cmdr_j.data.procurements;

import com.controllerface.cmdr_j.ProcurementCost;

/**
 * Stores the fixed cost of some procurement task. Objects of this type are intended to represent a specific item and
 * a count of that item, which would be required to craft some specific item. Note that most craftable items have
 * multiple cost requirements, and instance of this object would represent type type and count of ONE of these
 * requirements.
 *
 * NOTE: Immutable static data object
 *
 * Created by Controllerface on 3/27/2018.
 */
public class CostData
{
    private final int quantity;
    private final ProcurementCost cost;

    public CostData(ProcurementCost cost, int quantity)
    {
        this.cost = cost;
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return cost + " : " + quantity;
    }

    public ProcurementCost getCost()
    {
        return cost;
    }

    public int getQuantity()
    {
        return quantity;
    }
}
