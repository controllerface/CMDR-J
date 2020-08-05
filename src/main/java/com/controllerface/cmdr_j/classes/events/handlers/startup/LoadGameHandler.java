package com.controllerface.cmdr_j.classes.events.handlers.startup;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.enums.commander.PlayerStat;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.*;

/**
 * Main game load event: written at startup, when loading from main menu
 *
 * Created by Stephen on 7/18/2018.
 */
public class LoadGameHandler implements JournalEventHandler
{
    @Override
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

        context.getCommander().getShip()
                .setCurrentFuel(extractStatDouble(context, PlayerStat.Fuel_Level));

        setStatFromData(context, PlayerStat.Ship);
        setStatFromData(context, PlayerStat.Ship_Name);
        setStatFromData(context, PlayerStat.Ship_Ident);
    }
}
