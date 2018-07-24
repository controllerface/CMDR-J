package com.controllerface.cmdr_j.data.events.handlers.items.bounties;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logCombatMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class BountyHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String victim = ((String) context.getRawData().get("VictimFaction"));
        String target = ((String) context.getRawData().get("Target"));
        int reward;
        String benefactor;

        if (context.getRawData().get("Rewards") == null)
        {
            reward = ((int) context.getRawData().get("Reward"));
            benefactor = ((String) context.getRawData().get("Faction"));
        }
        else
        {
            reward = ((int) context.getRawData().get("TotalReward"));
            benefactor = ((List<Map<String, Object>>) context.getRawData().get("Rewards")).stream()
                    .map(r-> ((String) r.get("Faction")))
                    .collect(Collectors.joining(", ","Rewarding Faction(s): ",""));
        }

        logCombatMessage(context, "You destroyed " + victim + " " + target + " for " + reward + " credits paid by " + benefactor);
    }
}
