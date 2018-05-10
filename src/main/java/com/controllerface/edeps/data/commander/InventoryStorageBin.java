package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;
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
    private final ObservableList<InventoryData> inventoryItems =
            FXCollections.synchronizedObservableList(FXCollections.observableArrayList());

    /**
     * Implementations of InventoryStorageBin must implement this method to provide callers with a means to check if
     * a given ProcurementCost item can be stored within that storage bin.
     *
     * @param item the ProcurementCost item to check for support
     * @return true if the InventoryStorageBin implementation supports the given ProcurementCost, false if it doesn't
     */
    protected abstract boolean check(ProcurementCost item);

    /**
     * Called by the abstract class upon creating to setup the storage bin. Typically, this will initialize all of
     * the supported ProcurementCost items for a given implementation with 0 counts.
     */
    public abstract void init();

    InventoryStorageBin()
    {
        init();
    }

    /**
     * Creates a Stream of all the supported inventory items for a given implementation of InventoryStorageBin. Note
     * that items with 0 counts will still be present in the stream.
     *
     * @return stream of all stored items in this InventoryStorageBin implementation
     */
    Stream<InventoryData> inventory()
    {
        return inventoryItems.stream();
    }


    ObservableList<InventoryData> observableInventory(){return inventoryItems;}

    /**
     * Empties out and re-initializes this InventoryStorageBin implementation's storage. Typically used when re-setting
     * the storage items from disk. usually, this will be followed by several called to addItem() with the updated
     * counts of all the items.
     */
    void clear()
    {
        inventoryItems.clear();
        init();
    }

    /**
     * Gets the count of a named ProcurementCost item stored within this InventoryStorageBin implementation. Note, if
     * the named ProcurementCost is not supported for this storage bin, -1 is returned
     *
     * @param item the ProcurementCost item to retrieve the count of
     * @return teh count of the named ProcurementCost item within this storage bin, or -1 if the item is not supported
     */
    int hasItem(ProcurementCost item)
    {
        if (check(item))
        {
            return inventory()
                    .filter(inventoryItem -> inventoryItem.getItem() == item)
                    .map(InventoryData::getQuantity)
                    .findFirst().orElse(0);
        }
        return -1;
    }

    /**
     * Adjusts the count of a given ProcurementCost item within this InventoryStorageBin implementation. Keep in mind
     * that this method is used to adjust the count both up and down (i.e. increment or decrement). In other words,
     * the count value can be negative to signal removal of an item, and will be positive to signal addition of one.
     *
     * Note that if the named ProcurementCost item is not supported, no action is taken.
     *
     * @param item the named ProcurementCost item to adjust the count of
     * @param count amount to adjust the current count by. can be negative
     */
    synchronized void addItem(ProcurementCost item, int count)
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
