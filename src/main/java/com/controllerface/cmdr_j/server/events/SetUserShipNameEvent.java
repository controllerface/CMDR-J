package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.server.JournalEventEX;
import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class SetUserShipNameEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        JournalEventEX.setShipStat(playerState, event, ShipStat.Ship);
        // todo: these should be coerced to the normal name/ID stats
        JournalEventEX.setShipStat(playerState, event, ShipStat.UserShipName);
        JournalEventEX.setShipStat(playerState, event, ShipStat.UserShipId);
    }
}
