package com.controllerface.cmdr_j.data.events.handlers.items.materials;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.*;

/**
 * Written when synthesizing items
 *
 * Created by Stephen on 7/18/2018.
 */
public class SynthesisHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String name = ((String) context.getRawData().get("Name"));
        logInventoryMessage(context, "Synthesis Complete: " + name);

        // todo: need a way to check max cargo size. This will be "up to four" limpets, depending on cargo space
        if (name.contains("Limpet")) adjust(context, Commodity.DRONES, 4);
        ((List<Map<String, Object>>) context.getRawData().get("Materials"))
                .forEach(material -> adjustMaterialCountDown(context, material));
    }
}
