package com.controllerface.cmdr_j.data.events.handlers.stats.market;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventTransactions;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Stephen on 7/18/2018.
 */
public class MarketHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        JournalEventTransactions.processMarket(context);
    }
}
