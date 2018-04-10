package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.materials.Material;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/**
 * Created by Stephen on 4/2/2018.
 */
public class ModMaterialItem
{
    private final Material material;
    private final Function<Material, Integer> checkInventory;
    private final AtomicInteger count = new AtomicInteger(0);

    public ModMaterialItem(Material material, Function<Material, Integer> checkInventory)
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

    public Material getMaterial()
    {
        return material;
    }

    @Override
    public String toString()
    {
        return material.getLocalizedName();
    }

    public boolean matches(Material material)
    {
        return material == this.material;
    }
}
