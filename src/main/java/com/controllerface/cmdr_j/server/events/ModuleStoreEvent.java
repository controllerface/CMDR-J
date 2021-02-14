package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.JournalEventEX;

import java.util.Map;
import java.util.function.BiConsumer;

public class ModuleStoreEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var slotKey = ((String) event.get("Slot"));
        var slot = JournalEventEX.determineStatType(slotKey);

        gameState.emptyModuleSlot(slot);
        gameState.emitLoadoutEvent();
        gameState.emitCurrentMass();
        gameState.emitPowerStats();
        gameState.emitOffenseStats();
        gameState.emitDefenseStats();
    }
}
