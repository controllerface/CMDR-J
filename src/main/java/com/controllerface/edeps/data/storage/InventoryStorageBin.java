package com.controllerface.edeps.data.storage;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.InventoryData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * An abstract storage bin object, used to keep track of materials of a single type. Implementations will contain the
 * logic for checking if a material is appropriate for the container and initializing the storage object with 0 counts
 * of all the materials of the material type.
 *
 * Created by Stephen on 3/20/2018.
 */
public abstract class InventoryStorageBin
{
    private final List<InventoryData> materials = new ArrayList<>();

    public abstract boolean check(ProcurementCost material);

    public abstract void init();

    public InventoryStorageBin()
    {
        init();
    }

    public Stream<InventoryData> inventory()
    {
        return materials.stream();
    }

    public void clear()
    {
        materials.clear();
        init();
    }

    public int hasItem(ProcurementCost material)
    {
        if (check(material))
        {
            return materials.stream().filter(d->d.getItem() == material)
                    .map(InventoryData::getQuantity)
                    .findFirst().orElse(0);
        }
        return -1;
    }

    public boolean addItem(ProcurementCost item, int count)
    {
        return check(item) && materials.stream()
                .filter(m->m.getItem()==item)
                .findFirst().map(m -> m.adjustCount(count))
                .orElseGet((()-> materials.add(new InventoryData(item, count))));

    }
}
