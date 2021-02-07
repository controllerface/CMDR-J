package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.server.JournalEventEX;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class LoadGameEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEventEX.setCommanderStat(gameState, event, CommanderStat.Commander);
        JournalEventEX.setCommanderStat(gameState, event, CommanderStat.Credits);
        JournalEventEX.setCommanderStat(gameState, event, CommanderStat.Game_Mode);

        JournalEventEX.tryCommanderStat(gameState, event, CommanderStat.Private_Group);
        JournalEventEX.tryCommanderStat(gameState, event, CommanderStat.Loan);

        JournalEventEX.setShipStat(gameState, event, ShipStat.Fuel_Level);
        JournalEventEX.setShipStat(gameState, event, ShipStat.Fuel_Capacity);
        JournalEventEX.setShipStat(gameState, event, ShipStat.Ship);
        JournalEventEX.setShipStat(gameState, event, ShipStat.Ship_Ident);
        JournalEventEX.setShipStat(gameState, event, ShipStat.Ship_Name);
    }
}
