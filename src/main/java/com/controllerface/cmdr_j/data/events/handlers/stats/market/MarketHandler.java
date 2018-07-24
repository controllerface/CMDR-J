package com.controllerface.cmdr_j.data.events.handlers.stats.market;

import com.controllerface.cmdr_j.EventProcessingContext;
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
        //todo: handle this
        System.out.println("Market");
        if (context.getRawData().get("Items")==null) return;

        ((List<Map<String, Object>>) context.getRawData().get("Items")).stream()
                .map(item ->
                {
                    String name = ((String) item.get("Name"));
                    if (name == null) return null;

                    String c = name.replace("$", "").replace("_name;", "").toUpperCase();
                    Commodity commodity = Commodity.valueOf(c);
                    String x = commodity.getLocalizedName();
                    int buy = ((int) item.get("BuyPrice"));
                    int sell = ((int) item.get("SellPrice"));
                    boolean imports = ((boolean) item.get("Consumer"));
                    boolean exports = ((boolean) item.get("Producer"));

                    Set<String> modifiers = new HashSet<>();
                    if (imports) modifiers.add("Imports");
                    if (exports) modifiers.add("Exports");

                    String m = modifiers.stream().collect(Collectors.joining(" and "));


                    return x + " :: Buy: "+ buy + " :: Sell: "+ sell + " :: Market: " + m;
                })
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }
}
