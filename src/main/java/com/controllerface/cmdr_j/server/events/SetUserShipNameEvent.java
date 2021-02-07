package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.server.JournalEventEX;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class SetUserShipNameEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEventEX.setShipStat(gameState, event, ShipStat.Ship);
        // todo: these should be coerced to the normal name/ID stats
        JournalEventEX.setShipStat(gameState, event, ShipStat.UserShipName);
        JournalEventEX.setShipStat(gameState, event, ShipStat.UserShipId);
    }
}
