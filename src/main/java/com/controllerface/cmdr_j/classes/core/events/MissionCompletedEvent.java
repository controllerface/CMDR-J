package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

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
        var name = ((String) item.get("Name")).toUpperCase();
        var count = ((Integer) item.get("Count"));
        var material = Material.valueOf(name);
        gameState.adjustMaterialCount(material, count);
    }

    private void adjustCargoCount(GameState gameState, Map<String, Object> item)
    {
        var name = ((String) item.get("Name")).toUpperCase();
        var count = ((Integer) item.get("Count"));
        var commodity = Commodity.valueOf(name);
        gameState.adjustCargoCount(commodity, count);
    }

    private void adjustCommodityCount(GameState gameState, Map<String, Object> item)
    {
        var name = ((String) item.get("Commodity"))
            .replace("$","")
            .replace("_Name;","")
            .toUpperCase();
        var count = ((Integer) item.get("Count"));
        var commodity = Commodity.valueOf(name);
        gameState.adjustCargoCount(commodity, -1 * count);
    }
}
