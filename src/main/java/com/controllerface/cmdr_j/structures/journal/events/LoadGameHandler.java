package com.controllerface.cmdr_j.structures.journal.events;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.structures.commander.PlayerStat;
import com.controllerface.cmdr_j.structures.equipment.ships.CoreInternalSlot;
import com.controllerface.cmdr_j.structures.equipment.ships.Ship;
import com.controllerface.cmdr_j.threads.JournalSyncTask;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.structures.journal.JournalEventTransactions.*;

/**
 * Created by Stephen on 7/18/2018.
 */
public class LoadGameHandler extends JournalEventHandler
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
