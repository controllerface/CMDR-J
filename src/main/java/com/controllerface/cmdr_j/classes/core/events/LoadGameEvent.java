package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.Map;
import java.util.function.BiConsumer;

public class LoadGameEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEvent.setCommanderStat(gameState, event, CommanderStat.Commander);
        JournalEvent.setCommanderStat(gameState, event, CommanderStat.Credits);
        JournalEvent.setCommanderStat(gameState, event, CommanderStat.Game_Mode);

        JournalEvent.tryCommanderStat(gameState, event, CommanderStat.Private_Group);
        JournalEvent.tryCommanderStat(gameState, event, CommanderStat.Loan);

        JournalEvent.setShipStat(gameState, event, ShipStat.Fuel_Level);
        JournalEvent.setShipStat(gameState, event, ShipStat.Fuel_Capacity);
        JournalEvent.setShipStat(gameState, event, ShipStat.Ship);
        JournalEvent.setShipStat(gameState, event, ShipStat.Ship_Ident);
        JournalEvent.setShipStat(gameState, event, ShipStat.Ship_Name);
    }
}
