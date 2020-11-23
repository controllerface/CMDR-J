package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.server.JournalEventEX;
import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.function.BiConsumer;

public class LoadGameEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        JournalEventEX.setCommanderStat(playerState, event, CommanderStat.Commander);
        JournalEventEX.setCommanderStat(playerState, event, CommanderStat.Credits);
        JournalEventEX.setCommanderStat(playerState, event, CommanderStat.Game_Mode);

        JournalEventEX.tryCommanderStat(playerState, event, CommanderStat.Private_Group);
        JournalEventEX.tryCommanderStat(playerState, event, CommanderStat.Loan);

        JournalEventEX.setShipStat(playerState, event, ShipStat.Fuel_Level);
        JournalEventEX.setShipStat(playerState, event, ShipStat.Fuel_Capacity);
        JournalEventEX.setShipStat(playerState, event, ShipStat.Ship);
        JournalEventEX.setShipStat(playerState, event, ShipStat.Ship_Ident);
        JournalEventEX.setShipStat(playerState, event, ShipStat.Ship_Name);
    }
}
