package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class CarrierBankTransferEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var balance = ((Number) event.get("PlayerBalance")).longValue();
        gameState.setCommanderStat(CommanderStat.Credits, String.valueOf(balance));
    }
}
