package com.controllerface.cmdr_j.classes.events.handlers.stats.startup;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustMaterialCount;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

/**
 * Main material storage event: written at startup, when loading from main menu
 *
 * Created by Stephen on 7/18/2018.
 */
public class MaterialsHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logInventoryMessage(context, "Reloading Material Storage");

        context.getCommanderData().clearMaterials();

        Map<String, Object> data = context.getRawData();

        ((List<Map<String, Object>>) data.get("Raw"))
                .forEach(item -> adjustMaterialCount(context, item));

        ((List<Map<String, Object>>) data.get("Manufactured"))
                .forEach(item -> adjustMaterialCount(context, item));

        ((List<Map<String, Object>>) data.get("Encoded"))
                .forEach(item -> adjustMaterialCount(context, item));    }
}
