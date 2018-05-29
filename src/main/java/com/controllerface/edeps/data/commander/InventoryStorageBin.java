package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * An abstract storage bin object, used to keep track of a single category of items. Implementations will contain
 * the logic for checking if an item is appropriate for the container and initializing the storage object with 0
 * counts of all the items of the matching type.
 *
 * NOTE: Mutable state data object
 *
 * Created by Controllerface on 3/20/2018.
 */
public abstract class InventoryStorageBin
{
    /**
     * This is the actual backing list of the inventory object. Note that the list is a concurrent variant
     * (CopyOnWriteArrayList) yet access to the list is still synchronized. This is intentional as mutations to the
     * inventory (additions/subtractions) must not collide and must be done in-order. However once the mutations are
     * done, synchronization of the UI must occur only on the UI thread. As mutations CAN occur in rapid succession
     * (especially at startup) the backing list MUST allow at least one read and oen write to occur simultaneously.
     */
    private final List<InventoryData> inventory = new CopyOnWriteArrayList<>();

    /**
     * This is the "observable" list that is used by JavaFX to automatically control what items are visible in the UI.
     * It is extremely important to ensure updates to this list occur ONLY from the JavaFX UI thread.
     */
    private final ObservableList<InventoryData> observableInventory = FXCollections.observableArrayList();

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

    public void associateTableView(TableView<InventoryData> tableView)
    {
        tableView.setItems(observableInventory);
        observableInventory.addListener((ListChangeListener<InventoryData>) c -> tableView.refresh());
    }

    /**
     * Empties out and re-initializes this InventoryStorageBin implementation's storage. Typically used when re-setting
     * the storage items from disk. usually, this will be followed by several called to addItem() with the updated
     * counts of all the items.
     */
    void clear()
    {
        synchronized (inventory)
        {
            inventory.clear();
            synchronizeUI();
        }
        init();
    }

    /**
     * Gets the count of a named ProcurementCost item stored within this InventoryStorageBin implementation. Note, if
     * the named ProcurementCost is not supported for this storage bin, -1 is returned
     *
     * @param item the ProcurementCost item to retrieve the count of
     * @return the count of the named ProcurementCost item within this storage bin, or -1 if the item is not supported
     */
    int hasItem(ProcurementCost item)
    {
        if (check(item))
        {
            synchronized (inventory)
            {
                return inventory.stream()
                        .filter(inventoryItem -> inventoryItem.getItem() == item)
                        .map(InventoryData::getQuantity)
                        .findFirst().orElse(0);
            }
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
            synchronized (inventory)
            {
                inventory.stream()
                        .filter(inventoryItem -> inventoryItem.getItem() == item)
                        .findFirst().map(inventoryItem -> inventoryItem.adjustCount(count))
                        .orElseGet((() -> inventory.add(new InventoryData(item, count))));

                synchronizeUI();
            }
        }
    }

    /**
     * Synchronizes the observable inventory items with the internal items list. This is done separately so any
     * calculations related to inventory adjustment can performed up front and then reflected in the UI on the JavaFX
     * UI thread.
     *
     * Note that this method is always called from INSIDE a block that is synchronized on the ACTUAL inventory list,
     * ensuring that calls to THIS method (which is synchronized on the observable UI list) are queued in the same
     * order. This is intentional, and leverages the documented behavior of the {@linkplain Platform#runLater(Runnable)}
     * method, specifically the fact that "The Runnables are executed in the order they are posted".
     *
     * Synchronization on the observable list may seem superfluous, but is necessary to ensure that mutations to the
     * observed UI elements happen in exactly the same order as the mutations to the actual inventory list.
     */
    private void synchronizeUI()
    {
        Platform.runLater(()->
        {
            synchronized (observableInventory)
            {
                observableInventory.clear();
                observableInventory.addAll(inventory);
            }
        });
    }
}
