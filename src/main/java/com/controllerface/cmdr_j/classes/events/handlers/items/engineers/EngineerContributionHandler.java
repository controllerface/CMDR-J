package com.controllerface.cmdr_j.classes.events.handlers.items.engineers;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.util.Map;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.*;

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

        String type = ((String) data.get("Type"));

        if (type.equalsIgnoreCase("Credits"))
        {
            int contribution = ((int) context.getRawData().get("Quantity"));
            context.getCommanderData().adjustCreditBalance(-1 * contribution);
        }

        if (data.get("Material") != null) adjustMaterialQuantityDown(context, data);

        if (data.get("Commodity") != null) adjustCommodityQuantityDown(context, data);

    }
}
