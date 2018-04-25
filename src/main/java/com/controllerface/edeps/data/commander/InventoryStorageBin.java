package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * An abstract storage bin object, used to keep track of a single category of items. Implementations will contain
 * the logic for checking if an item is appropriate for the container and initializing the storage object with 0
 * counts of all the items of the matching type.
 *
 * NOTE: Mutable state data object
 *
 * Created by Stephen on 3/20/2018.
 */
public abstract class InventoryStorageBin
{
    private final List<InventoryData> inventoryItems = new ArrayList<>();

    protected abstract boolean check(ProcurementCost material);

    public abstract void init();

    InventoryStorageBin()
    {
        init();
    }

    public Stream<InventoryData> inventory()
    {
        return inventoryItems.stream();
    }

    public void clear()
    {
        inventoryItems.clear();
        init();
    }

    public int hasItem(ProcurementCost material)
    {
        if (check(material))
        {
            return inventory()
                    .filter(inventoryItem -> inventoryItem.getItem() == material)
                    .map(InventoryData::getQuantity)
                    .findFirst().orElse(0);
        }
        return -1;
    }

    public void addItem(ProcurementCost item, int count)
    {
        if (check(item))
        {
            inventory()
                    .filter(inventoryItem -> inventoryItem.getItem() == item)
                    .findFirst().map(inventoryItem -> inventoryItem.adjustCount(count))
                    .orElseGet((() -> inventoryItems.add(new InventoryData(item, count))));
        }
    }
}
