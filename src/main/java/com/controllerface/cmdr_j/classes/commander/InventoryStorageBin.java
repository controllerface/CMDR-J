package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.classes.tasks.Task;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * An abstract storage bin object, used to keep track of a single category of items. Implementations will contain
 * the logic for checking if an item is appropriate for the container and initializing the storage object with 0
 * counts of all the items of the matching type.
 *
 * NOTE: Mutable state data object
 *
 * Created by Controllerface on 3/20/2018.
 */
abstract class InventoryStorageBin
{
    /**
     * This is the actual backing list of the inventory object. Note that the list is a concurrent variant
     * (CopyOnWriteArrayList) yet access to the list is still synchronized. This is intentional as mutations to the
     * inventory (additions/subtractions) must not collide and must be done in-order. However once the mutations are
     * done, synchronization of the UI must occur only on the UI thread. As mutations CAN occur in rapid succession
     * (especially at startup) the backing list MUST allow at least one read and oen write to occur simultaneously.
     */
    private final List<InventoryDisplay> inventory = new CopyOnWriteArrayList<>();

    /**
     * This is the "observable" list that is used by JavaFX to automatically control what items are visible in the UI.
     * It is extremely important to ensure updates to this list occur ONLY from the JavaFX UI thread.
     */
    private final ObservableList<InventoryDisplay> observableInventory = FXCollections.observableArrayList();

    /**
     * Implementations of InventoryStorageBin must implement this method to provide callers with a means to check if
     * a given TaskCost item can be stored within that storage bin.
     *
     * @param item the TaskCost item to check for support
     * @return true if the InventoryStorageBin implementation supports the given TaskCost, false if it doesn't
     */
    protected abstract boolean check(TaskCost item);

    /**
     * A CheckBox UI element that controls the UI synchronization process. This is initialized to a non-null instance
     * and defaulted to "unchecked" as a defensive measure to ensure that, in the absence of this being set to an
     * actual user facing checkbox, the observable items will have some default behavior. In this case, the default
     * behavior will be to hide zero quantity elements from the observable view. Care should be taken not to set this
     * value to null.
     */
    private CheckBox showZeroQuantities = new CheckBox();


    private final Function<TaskCost, Integer> pendingTradeCost;
    private final Consumer<Task> addTask;





    /**
     * Called by the abstract class upon creating to setup the storage bin. Typically, this will initialize all of
     * the supported TaskCost items for a given implementation with 0 counts.
     */
    public abstract void init();

    InventoryStorageBin(Function<TaskCost, Integer> pendingTradeCost,
                        Consumer<Task> addTask)
    {
        this.pendingTradeCost = pendingTradeCost;
        this.addTask = addTask;
        showZeroQuantities.setSelected(false);
        init();
        synchronize();
    }

    void associateTableView(TableView<InventoryDisplay> tableView, CheckBox showZeroQuantities)
    {
        if (showZeroQuantities != null)
        {
            this.showZeroQuantities = showZeroQuantities;
            this.showZeroQuantities.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> synchronize());
        }

        tableView.setItems(observableInventory);
        observableInventory.addListener((ListChangeListener<InventoryDisplay>) c -> tableView.refresh());
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
            init();
            synchronize();
        }
    }

    /**
     * Gets the count of a named TaskCost item stored within this InventoryStorageBin implementation. Note, if
     * the named TaskCost is not supported for this storage bin, -1 is returned
     *
     * @param item the TaskCost item to retrieve the count of
     * @return the count of the named TaskCost item within this storage bin, or -1 if the item is not supported
     */
    long amountOf(TaskCost item)
    {
        if (check(item))
        {
            synchronized (inventory)
            {
                return inventory.stream()
                        .filter(inventoryItem -> inventoryItem.getItem() == item)
                        .map(InventoryDisplay::getQuantity)
                        .findFirst().orElse(0L);
            }
        }
        return -1L;
    }

    /**
     * Adjusts the count of a given TaskCost item within this InventoryStorageBin implementation. Keep in mind
     * that this method is used to adjust the count both up and down (i.e. increment or decrement). In other words,
     * the count value can be negative to signal removal of an item, and will be positive to signal addition of one.
     *
     * Note that if the named TaskCost item is not supported, no action is taken.
     *
     * @param item the named TaskCost item to adjust the count of
     * @param count amount to adjust the current count by. can be negative
     */
    synchronized void addItem(TaskCost item, long count)
    {
        if (check(item))
        {
            synchronized (inventory)
            {
                inventory.stream()
                        .filter(inventoryItem -> inventoryItem.getItem() == item)
                        .findFirst().map(inventoryItem -> inventoryItem.adjustCount(count))
                        .orElseGet((() -> inventory.add(new InventoryDisplay(item, count, this::amountOf, pendingTradeCost, addTask))));

                synchronize();
            }
        }
    }

    /**
     * Intended for use only by sub-classes, to initialize an item count to zero. Used during initial construction and
     * when resetting the internal storage. This method bypasses sync and check() methods for efficiency, as reloading
     * the entire set of items would incur a lot of needless sync overhead. For that reason it is very important that
     * it is NEVER exposed externally as it would be impossible to tightly control its use.
     *
     * @param item the item to initialize
     */
    void initializeItem(TaskCost item)
    {
        inventory.add(new InventoryDisplay(item, 0, this::amountOf, pendingTradeCost, addTask));
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
    private void synchronize()
    {
        Platform.runLater(()->
        {
            synchronized (observableInventory)
            {
                observableInventory.clear();
                if (showZeroQuantities.isSelected()) observableInventory.addAll(inventory);
                else
                {
                    List<InventoryDisplay> nonZeroItems = inventory.stream()
                            .filter(item -> item.getQuantity() > 0)
                            .collect(Collectors.toList());

                    observableInventory.addAll(nonZeroItems);
                }
            }
        });
    }
}
