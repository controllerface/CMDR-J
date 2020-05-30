package com.controllerface.cmdr_j.classes.events.handlers.powerplay;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

/**
 * Status event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class PowerplayHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        int time = ((int) context.getRawData().get("TimePledged"));
        Duration t = Duration.ofSeconds(time);
        JournalEventTransactions.logGeneralMessage(context,
                "You've been pledged to " + context.getRawData().get("Power")
                        + " for: " + t.toDays() + " days;"
                        + " rank: " + context.getRawData().get("Rank")
                        + " merits: " + context.getRawData().get("Merits")
                        + " votes: " + context.getRawData().get("Votes"));
    }
}
