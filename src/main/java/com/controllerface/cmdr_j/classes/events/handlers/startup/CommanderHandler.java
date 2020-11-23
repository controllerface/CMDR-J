package com.controllerface.cmdr_j.classes.events.handlers.startup;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;

import java.util.Optional;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class CommanderHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = Optional.ofNullable(context.getRawData().get("Name"))
                .map(rawName -> ((String) rawName))
                .orElse("[ERROR]");

        context.getCommander().setStat(CommanderStat.Commander, name);
        JournalEventTransactions.logGeneralMessage(context, "Commander Loaded: " + name);
    }
}
