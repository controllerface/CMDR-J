package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.classes.core.JournalServer;
import com.controllerface.cmdr_j.classes.core.JournalServlet;
import com.controllerface.cmdr_j.classes.core.JournalSyncTask;
import com.controllerface.cmdr_j.enums.costs.consumables.Consumable;
import com.controllerface.cmdr_j.utilities.JSONSupport;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCost;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        initialize();

        ExecutorService journalSync = Executors.newSingleThreadExecutor();

        JournalServlet journalServlet = new JournalServlet();

        journalSync.submit(new JournalSyncTask(journalServlet.getGameState()));

        JournalServer.withServlet(journalServlet).port(9000).start().join();

        journalSync.shutdownNow();
    }

    @SuppressWarnings("unchecked")
    private static void initialize()
    {
        InputStream jsonStream = null;
        try
        {
            URL localizationData = Main.class.getResource("/localization/eng.json");
            jsonStream = localizationData.openStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Map<String, Object> data = JSONSupport.Parse.jsonStream.apply(jsonStream);

        ((Map<String, Object>) data.get("materials"))
            .forEach((key, value) ->
            {
                TaskCost material = Material.valueOf(key);
                material.setLocalizedName(((String) ((Map<String, Object>) value).get("name")));
                List<String> locations = ((List<String>) ((Map<String, Object>) value).get("locations"));
                material.setLocationInformation(String.join("\n", locations));
            });

        ((Map<String, Object>) data.get("commodities"))
            .forEach((key, value) ->
            {
                TaskCost commodity = Commodity.valueOf(key);
                commodity.setLocalizedName(((String) ((Map<String, Object>) value).get("name")));
                List<String> locations = ((List<String>) ((Map<String, Object>) value).get("locations"));
                commodity.setLocationInformation(String.join("\n", locations));
            });

        ((Map<String, Object>) data.get("consumables"))
            .forEach((key, value) ->
            {
                TaskCost consumable = Consumable.valueOf(key);
                consumable.setLocalizedName(((String) ((Map<String, Object>) value).get("name")));
                List<String> locations = ((List<String>) ((Map<String, Object>) value).get("locations"));
                consumable.setLocationInformation(String.join("\n", locations));
            });
    }
}
