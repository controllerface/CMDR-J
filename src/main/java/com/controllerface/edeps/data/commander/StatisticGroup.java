package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;

/**
 * Created by Stephen on 6/25/2018.
 */
public abstract class StatisticGroup implements Displayable
{
    public enum Type
    {
        BASE,
        OFFENSE,
        DEFENSE,
        MOVEMENT
    }

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

    StatisticGroup()
    {
        init();
        //synchronize();
    }
}
