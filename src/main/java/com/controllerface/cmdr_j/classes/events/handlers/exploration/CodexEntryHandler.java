package com.controllerface.cmdr_j.classes.events.handlers.exploration;

import com.controllerface.cmdr_j.classes.events.JournalEventTransactions;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;

import java.util.Optional;

/**
 * Created by Stephen on 7/18/2018.
 */
public class CodexEntryHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        boolean isNew = Optional.ofNullable(context.getRawData().get("IsNewEntry"))
                .map(e-> ((Boolean) e))
                .orElse(false);

        if (!isNew) return;

        String region = ((String) context.getRawData().get("Region_Localised"));
        String system = ((String) context.getRawData().get("System"));

        String category = ((String) context.getRawData().get("Category_Localised"));
        String subCategory = ((String) context.getRawData().get("SubCategory_Localised"));
        String name = ((String) context.getRawData().get("Name_Localised"));

        String locationMessage = "New Codex Entry: " + region + " :: " + system;
        String codexMessage = " - " + category + " :: " + subCategory + " :: " + name;

        JournalEventTransactions.logExplorationMessage(context, locationMessage);
        JournalEventTransactions.logExplorationMessage(context, codexMessage);
    }
}
