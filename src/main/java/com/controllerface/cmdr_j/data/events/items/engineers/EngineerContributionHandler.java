package com.controllerface.cmdr_j.data.events.items.engineers;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;

import java.util.Map;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.*;

/**
 * Written when contributing items to an engineer in order to gain their favor
 *
 * Created by Stephen on 7/18/2018.
 */
public class EngineerContributionHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logEngineeringMessage(context, "Engineering Contribution");

        Map<String, Object> data = context.getRawData();

        if (data.get("Material") != null) adjustMaterialQuantityDown(context, data);

        if (data.get("Commodity") != null) adjustCommodityQuantityDown(context, data);    }
}
