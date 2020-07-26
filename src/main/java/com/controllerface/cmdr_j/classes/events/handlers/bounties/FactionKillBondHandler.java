package com.controllerface.cmdr_j.classes.events.handlers.bounties;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logCombatMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class FactionKillBondHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String victim = ((String) context.getRawData().get("VictimFaction"));
        int reward = ((int) context.getRawData().get("Reward"));
        context.getCommander().adjustCreditBalance(reward);
        String benefactor = ((String) context.getRawData().get("AwardingFaction"));

        logCombatMessage(context, "You destroyed a " + victim + " for " + reward + " credits paid by " + benefactor);
    }
}
