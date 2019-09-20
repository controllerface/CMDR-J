package com.controllerface.cmdr_j.classes.events.handlers.items.bounties;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logCombatMessage;

/**
 * Created by Stephen on 7/18/2018.
 */
public class BountyHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String victimFaction = ((String) context.getRawData().get("VictimFaction"));
        String targetVehicle = ((String) context.getRawData().get("Target"));

        boolean isGuardianSentinel = victimFaction.equalsIgnoreCase("None")
                && targetVehicle.equalsIgnoreCase("Skimmer");

        String destroyedTarget = isGuardianSentinel
                ? "a Guardian Sentinel"
                : victimFaction + " " + targetVehicle;

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

            context.getCommanderData().adjustCreditBalance(reward);
        }

        if (reward == 0)
        {
            logCombatMessage(context, "You destroyed " + destroyedTarget);
        }
        else
        {
            logCombatMessage(context, "You destroyed " + destroyedTarget + " for " + reward + " credits paid by " + benefactor);
        }

    }
}
