package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;

public class PlayerState
{
    private final Lock stateLock = new ReentrantLock();

    private final Map<Statistic, String> commanderStatistics = new ConcurrentHashMap<>();
    private final Map<Statistic, String> shipStatistics = new ConcurrentHashMap<>();

    /**
     * This is an event sink used when state changes must be communicated to listening clients
     */
    private final BiConsumer<String, String> globalUpdate;

    public PlayerState(BiConsumer<String, String> globalUpdate)
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

    public void setCommanderStat(Statistic statistic, String value)
    {
        // todo: port database access/update logic to this class
        executeWithLock(() ->
        {
            commanderStatistics.put(statistic, value);
            globalUpdate.accept(statistic.getName(), value);
        });
    }

    public String getCommanderStat(Statistic statistic)
    {
        return Optional.ofNullable(commanderStatistics.get(statistic))
            .orElse("[EMPTY]");
    }

    public void setShipStat(Statistic statistic, String value)
    {
        // todo: port database access/update logic to this class
        executeWithLock(() ->
        {
            shipStatistics.put(statistic, value);
            globalUpdate.accept(statistic.getName(), value);
        });
    }

    public void emitCurrentState(BiConsumer<String, String> directUpdate)
    {
        executeWithLock(() ->
        {
            // todo: as more state is tracked, this will need to be updated to make sure
            //  all important data is emitted during this call

            BiConsumer<Statistic, String> sendUpdate =
                (statistic, value) -> directUpdate.accept(statistic.getName(), value);

            commanderStatistics.forEach(sendUpdate);
            shipStatistics.forEach(sendUpdate);
        });
    }
}
