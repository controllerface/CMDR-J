package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.Map;
import java.util.function.BiConsumer;

public class SetUserShipNameEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEvent.setShipStat(gameState, event, ShipStat.Ship);
        // todo: these should be coerced to the normal name/ID stats
        JournalEvent.setShipStat(gameState, event, ShipStat.UserShipName);
        JournalEvent.setShipStat(gameState, event, ShipStat.UserShipId);
    }
}
