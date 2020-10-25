package com.controllerface.cmdr_j.classes.events.handlers.status;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.util.Optional;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;

public class ReceiveTextHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String channel = ((String) context.getRawData().get("Channel"));
        String from = ((String) context.getRawData().get("From_Localised"));
        if (from == null)
        {
            from = ((String) context.getRawData().get("From"));
        }

        String message = Optional.ofNullable(context.getRawData().get("Message_Localised"))
                .map(s-> ((String) s))
                .orElse(((String) context.getRawData().get("Message")));

        if (channel.equals("npc"))
        {
            logGeneralMessage(context, "Public Message: [" + from + "] " + message);
        }
        else
        {
            logGeneralMessage(context, "Message: [" + from + "] " + message);
        }
    }
}
