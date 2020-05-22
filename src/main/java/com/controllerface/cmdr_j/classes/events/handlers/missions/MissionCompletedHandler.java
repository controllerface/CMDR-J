package com.controllerface.cmdr_j.classes.events.handlers.missions;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import javafx.util.Pair;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.*;

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

        int creditReward = ((int)data.get("Reward"));
        context.getCommanderData().adjustCreditBalance(creditReward);

        if (data.get("MaterialsReward") != null)
        {
            ((List<Map<String, Object>>) data.get("MaterialsReward"))
                    .forEach(materialReward -> adjustMaterialCount(context, materialReward));
        }

        if (data.get("CommodityReward") != null)
        {
            ((List<Map<String, Object>>) data.get("CommodityReward"))
                    .forEach(commodityReward -> adjustCommodityCount(context, commodityReward));
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
