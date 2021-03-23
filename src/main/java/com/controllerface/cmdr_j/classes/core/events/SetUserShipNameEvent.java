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

        // coerce these non-standard values to the expected ones before setting
        event.put(ShipStat.Ship_Name.getKey(), event.get(ShipStat.UserShipName.getKey()));
        event.put(ShipStat.Ship_Ident.getKey(), event.get(ShipStat.UserShipId.getKey()));

        JournalEvent.setShipStat(gameState, event, ShipStat.Ship_Name);
        JournalEvent.setShipStat(gameState, event, ShipStat.Ship_Ident);
    }
}
