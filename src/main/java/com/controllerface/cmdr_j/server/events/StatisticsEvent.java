package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.text.NumberFormat;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class StatisticsEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        event.forEach((category, stats)->
        {
            if (category.equalsIgnoreCase("event")
                || category.equalsIgnoreCase("timestamp"))
            {
                return;
            }
            var remapped = new HashMap<String, String>();

            ((Map<String, Object>) stats)
                .forEach((name, value) ->
                {
                    var formattedName = name
                        .replace("_", " ")
                        .replace("NpcCrew"," NPC Crew")
                        .replace("TotalWages", "Total Wages")
                        .replace("SearchRescue", "Search and Rescue")
                        .replace("Passengers", "Passenger");

                    if (formattedName.contains("Missions Ejected"))
                    {
                        formattedName = "Passengers Ejected";
                    }
                    else if (formattedName.contains("Missions Delivered"))
                    {
                        formattedName = "Passengers Delivered";
                    }
                    else if (formattedName.contains("Missions VIP"))
                    {
                        formattedName = "VIP Passengers";
                    }
                    else if (formattedName.contains("Missions Bulk"))
                    {
                        formattedName = "Regular Passengers";
                    }

                    var formattedValue = formatValue(formattedName, value);
                    remapped.put(formattedName, formattedValue);
                });

            var formattedCategory = category.replace("_", " ");
            gameState.setExtendedStats(formattedCategory, remapped);
        });

        gameState.emitExtendedStatsEvent();
    }

    private String formatValue(String formattedName, Object value)
    {
        if (formattedName.contains("Time"))
        {
            var seconds = Long.parseLong(String.valueOf(value));
            var duration = Duration.ofSeconds(seconds).toString();
            return duration.replace("PT","")
                .replace("H", " H ")
                .replace("M", " M ")
                .replace("S", " S").trim();
        }
        else
        {
            var formattedNumber = NumberFormat.getInstance().format(value);
            return formatUnits(formattedName, formattedNumber);
        }
    }

    private String formatUnits(String formattedName, String formattedValue)
    {
        if (formattedName.contains("Profit")
            || formattedName.contains("Transaction")
            || formattedName.contains("Payout")
            || formattedName.contains("Wealth")
            || formattedName.contains("Credits")
            || formattedName.contains("Bonds")
            || formattedName.contains("Reward")
            || formattedName.contains("Bounty")
            || formattedName.contains("Wages")
            || formattedName.contains("Spent")
            || formattedName.contains("Multicrew Fines")
            || formattedName.contains("Total Bounties")
            || formattedName.contains("Total Fines"))
        {
            return formattedValue + " CR";
        }

        else if (formattedName.contains("Distance"))
        {
            return formattedValue + " LY";
        }

        else
        {
            return formattedValue;
        }
    }
}
