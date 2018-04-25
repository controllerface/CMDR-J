package com.controllerface.edeps.data.procurements;

import com.controllerface.edeps.ProcurementCost;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Created by Stephen on 4/2/2018.
 */
public class ItemCostData
{
    private final ProcurementCost material;
    private final Function<ProcurementCost, Integer> checkInventory;
    private final AtomicInteger count = new AtomicInteger(0);

    public ItemCostData(ProcurementCost material, Function<ProcurementCost, Integer> checkInventory)
    {
        this.material = material;
        this.checkInventory = checkInventory;
    }

    public void setCount(int count)
    {
        this.count.set(count);
    }

    public int getHave()
    {
        return checkInventory.apply(material);
    }

    public int getNeed()
    {
        return count.get();
    }

    public void add(int amount)
    {
        this.count.addAndGet(amount);
    }

    public ProcurementCost getMaterial()
    {
        return material;
    }

    @Override
    public String toString()
    {
        return material.getLocalizedName();
    }

    public boolean matches(ProcurementCost material)
    {
        return material == this.material;
    }
}
