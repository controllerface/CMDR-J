package com.controllerface.cmdr_j.classes.events.handlers.missions;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.*;

/**
 * Written when contributing materials to a community goal
 *
 * Created by Stephen on 7/18/2018.
 */
public class CommunityGoalRewardHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("Name"));
        int reward = ((int) context.getRawData().get("Reward"));
        context.getCommanderData().adjustCreditBalance(reward);
        logGeneralMessage(context, "Community goal reward: " + reward + " CR for " + name);
    }
}
