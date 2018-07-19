package com.controllerface.cmdr_j.data.events.items.missions;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;
import javafx.util.Pair;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.*;

/**
 * Written when a mission is completed
 *
 * Created by Stephen on 7/18/2018.
 */
public class MissionCompletedHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logGeneralMessage(context, "Mission Completed");

        Map<String, Object> data = context.getRawData();

        if (data.get("MaterialsReward") != null)
        {
            ((List<Map<String, Object>>) data.get("MaterialsReward"))
                    .forEach(reward -> adjustMaterialCount(context, reward));
        }

        if (data.get("CommodityReward") != null)
        {
            ((List<Map<String, Object>>) data.get("CommodityReward"))
                    .forEach(reward -> adjustCommodityCount(context, reward));
        }

        if (data.get("Commodity") != null)
        {
            String name = ((String) data.get("Commodity"))
                    .replace("$","")
                    .replace("_Name;","")
                    .toUpperCase();

            Integer count = ((Integer) data.get("Count"));
            adjustDown(context, new Pair<>(name, count), AdjustmentType.COMMODITY);
        }
    }
}
