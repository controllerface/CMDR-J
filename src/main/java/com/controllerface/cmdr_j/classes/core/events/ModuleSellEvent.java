package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.Map;
import java.util.function.BiConsumer;

public class ModuleSellEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var sale = ((int) event.get("SellPrice"));
        gameState.adjustCreditBalance(sale);

        var slotKey = ((String) event.get("Slot"));
        var slot = JournalEvent.determineStatType(slotKey);

        gameState.emptyModuleSlot(slot);
        gameState.emitLoadoutEvent();
        gameState.emitCurrentMass();
        gameState.emitPowerStats();
        gameState.emitOffenseStats();
        gameState.emitDefenseStats();
    }
}
