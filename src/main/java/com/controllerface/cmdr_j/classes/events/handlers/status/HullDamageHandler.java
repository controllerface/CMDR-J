package com.controllerface.cmdr_j.classes.events.handlers.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.ui.UIFunctions;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class HullDamageHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        boolean player = ((boolean) context.getRawData().get("PlayerPilot"));
        Boolean fighter = ((Boolean) context.getRawData().get("Fighter"));
        double damage = ((double) context.getRawData().get("Health"));

        String message = (player
                ? "You are"
                : "Your" + ((fighter != null && fighter)
                        ? " fighter is"
                        : " mothership is"))
                + " taking damage";

        logGeneralMessage(context, message);
        logGeneralMessage(context, "Hull integrity at " + UIFunctions.Data.round(damage * 100, 2) + "%");
    }
}
