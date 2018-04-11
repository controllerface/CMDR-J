package com.controllerface.edeps.data.storage;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.InventoryData;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * An abstract storage bin object, used to keep track of items of a single category if items. Implementations will
 * contain the logic for checking if an item is appropriate for the container and initializing the storage object
 * with 0 counts of all the items of the matching type.
 *
 * Created by Stephen on 3/20/2018.
 */
public abstract class InventoryStorageBin
{
    private final List<InventoryData> items = new ArrayList<>();

    protected abstract boolean check(ProcurementCost material);

    public abstract void init();

    InventoryStorageBin()
    {
        init();
    }

    public Stream<InventoryData> inventory()
    {
        return items.stream();
    }

    public void clear()
    {
        items.clear();
        init();
    }

    public int hasItem(ProcurementCost material)
    {
        if (check(material))
        {
            return items.stream().filter(d->d.getItem() == material)
                    .map(InventoryData::getQuantity)
                    .findFirst().orElse(0);
        }
        return -1;
    }

    public boolean addItem(ProcurementCost item, int count)
    {
        return check(item) && items.stream()
                .filter(m->m.getItem()==item)
                .findFirst().map(m -> m.adjustCount(count))
                .orElseGet((()-> items.add(new InventoryData(item, count))));

    }
}
