package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.MissionData;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.*;

public class MissionCompletedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var reward = ((Number) event.get("Reward")).longValue();
        var missionID = ((Number) event.get("MissionID")).longValue();
        var name = (String) event.get("Name");
        var wingMission = name != null && name.toLowerCase().contains("wing");

        if (event.get("MaterialsReward") != null)
        {
            ((List<Map<String, Object>>) event.get("MaterialsReward"))
                .forEach(materialReward -> adjustMaterialCount(gameState, materialReward));
        }

        if (event.get("CommodityReward") != null)
        {
            ((List<Map<String, Object>>) event.get("CommodityReward"))
                .forEach(commodityReward -> adjustCargoCount(gameState, commodityReward));
        }

        if (event.get("Commodity") != null && !wingMission)
        {
            adjustCommodityCount(gameState, event);
        }

        gameState.adjustCreditBalance(reward);
        gameState.completeMission(missionID);
    }

    private void adjustMaterialCount(GameState gameState, Map<String, Object> item)
    {
        String name = ((String) item.get("Name"));
        Material material = Material.valueOf(name.toUpperCase());
        Integer count = ((Integer) item.get("Count"));
        gameState.adjustMaterialCount(material, count);
    }

    private void adjustCargoCount(GameState gameState, Map<String, Object> item)
    {
        String name = ((String) item.get("Name"));
        String nameLocalized = ((String) item.get("Name_Localised"));
        if (nameLocalized == null)
        {
            nameLocalized = name;
        }
        Commodity commodity = Commodity.valueOf(name.toUpperCase());
        Integer count = ((Integer) item.get("Count"));
        gameState.adjustCargoCount(commodity, nameLocalized, count);
    }

    private void adjustCommodityCount(GameState gameState, Map<String, Object> item)
    {
        String name = ((String) item.get("Commodity"))
            .replace("$","")
            .replace("_Name;","")
            .toUpperCase();
        String nameLocalized = ((String) item.get("Commodity_Localised"));
        if (nameLocalized == null)
        {
            nameLocalized = name;
        }
        Commodity commodity = Commodity.valueOf(name.toUpperCase());
        Integer count = ((Integer) item.get("Count"));
        gameState.adjustCargoCount(commodity, nameLocalized, -1 * count);
    }
}