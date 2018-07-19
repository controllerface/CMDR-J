package com.controllerface.cmdr_j.data.events.stats.startup;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;
import com.controllerface.cmdr_j.structures.commander.PlayerStat;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.*;

/**
 * Main game load event: written at startup, when loading from main menu
 *
 * Created by Stephen on 7/18/2018.
 */
public class LoadGameHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logGeneralMessage(context, "Commander Data Loaded");

        setStatFromData(context, PlayerStat.Commander);
        setStatFromData(context, PlayerStat.Credits);
        setStatFromData(context, PlayerStat.Game_Mode);

        if (context.getRawData().get("Group") != null) setStatFromData(context, PlayerStat.Private_Group);
        if (context.getRawData().get("Loan") != null) setStatFromData(context, PlayerStat.Loan);

        setStatFromData(context, PlayerStat.Fuel_Level);
        setStatFromData(context, PlayerStat.Fuel_Capacity);

        context.getCommanderData().getStarShip()
                .setCurrentFuel(extractStatDouble(context, PlayerStat.Fuel_Level));

        setStatFromData(context, PlayerStat.Ship);
        setStatFromData(context, PlayerStat.Ship_Name);
        setStatFromData(context, PlayerStat.Ship_Ident);
    }
}
