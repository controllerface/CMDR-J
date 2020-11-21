package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.classes.commander.Statistic;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;

public class CommanderState
{
    private final Lock stateLock = new ReentrantLock();
    private final Map<Statistic, String> commanderStatistics = new ConcurrentHashMap<>();

    /**
     * This is an event sink used when state changes must be communicated to listening clients
     */
    private final BiConsumer<String, String> globalUpdate;

    public CommanderState(BiConsumer<String, String> globalUpdate)
    {
        this.globalUpdate = globalUpdate;
    }

    private void executeWithLock(Procedure procedure)
    {
        stateLock.lock();
        try
        {
            procedure.call();
        }
        finally
        {
            stateLock.unlock();
        }
    }

    public void setStat(Statistic statistic, String value)
    {
        // todo: port database access/update logic to this class
        executeWithLock(() ->
        {
            commanderStatistics.put(statistic, value);
            globalUpdate.accept(statistic.getName(), value);
        });
    }

    public void emitCurrentState(BiConsumer<String, String> directUpdate)
    {
        executeWithLock(() ->
        {
            // todo: as more state is tracked, this will need to be updated to make sure
            //  all important data is emitted during this call
            commanderStatistics.forEach((statistic, value) -> directUpdate.accept(statistic.getName(), value));
        });
    }
}
