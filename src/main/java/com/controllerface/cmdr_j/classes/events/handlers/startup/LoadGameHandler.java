package com.controllerface.cmdr_j.classes.events.handlers.startup;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.commander.ShipStat;

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

        setStatFromData(context, CommanderStat.Commander);
        setStatFromData(context, CommanderStat.Credits);
        setStatFromData(context, CommanderStat.Game_Mode);

        if (context.getRawData().get("Group") != null) setStatFromData(context, CommanderStat.Private_Group);
        if (context.getRawData().get("Loan") != null) setStatFromData(context, CommanderStat.Loan);

        setStatFromData(context, ShipStat.Fuel_Level);
        setStatFromData(context, ShipStat.Fuel_Capacity);

        context.getCommander().starShip
                .setCurrentFuel(extractStatDouble(context, ShipStat.Fuel_Level));

        setStatFromData(context, ShipStat.Ship);
        setStatFromData(context, ShipStat.Ship_Name);
        setStatFromData(context, ShipStat.Ship_Ident);
    }
}
