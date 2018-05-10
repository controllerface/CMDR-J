package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.ProcurementCost;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Represents a single item type and count of that type, required to craft some specific craftable item. Objects of
 * this type are intended to represent a variable cost, typically in cases where the base item itself has some variable
 * count. As such, the internal count number is adjustable to reflect the fact that the desired number of a given item
 * has changed. For example, say crafting an ammo refill costs 2 sulphur, and the user has selected a task to craft 10
 * of these refills. The cost member would be set to "sulphur" and the count would be set to 20 (2 sulphur, x 10
 * refills). Then if the user decides they need 20 of these refills, they would use some UI control to increase the
 * count to 20, which in turn would call setCount(20) to update this object with the new count.
 *
 * Created by Stephen on 4/2/2018.
 */
public class ItemCostData
{
    private final ProcurementCost cost;
    private final Function<ProcurementCost, Integer> checkInventory;
    private final AtomicInteger count = new AtomicInteger(0);

    public ItemCostData(ProcurementCost cost, Function<ProcurementCost, Integer> checkInventory)
    {
        this.cost = cost;
        this.checkInventory = checkInventory;
    }

    public void setCount(int count)
    {
        this.count.set(count);
    }

    public int getCount()
    {
        return count.get();
    }

    public int getHave()
    {
        return checkInventory.apply(cost);
    }

    public int getNeed()
    {
        return count.get();
    }

    public void add(int amount)
    {
        this.count.addAndGet(amount);
    }

    public ProcurementCost getCost()
    {
        return cost;
    }

    @Override
    public String toString()
    {
        return cost.getLocalizedName();
    }

    public boolean matches(ProcurementCost material)
    {
        return material == this.cost;
    }

    public boolean matches(CostData costData)
    {
        return costData.getCost() == this.cost;
    }
}
