package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class EngineerContributionEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var type = ((String) event.get("Type"));
        if (type.equalsIgnoreCase("Credits"))
        {
            var quantity = ((Number) event.get("Quantity")).intValue();
            gameState.adjustCreditBalance(-1 * quantity);
        }

        if (event.get("Material") != null)
        {
            adjustMaterial(gameState, event);
        }

        if (event.get("Commodity") != null)
        {
            adjustCargoCount(gameState, event);
        }
    }

    private void adjustMaterial(GameState gameState, Map<String, Object> ingredient)
    {
        var name = ((String) ingredient.get("Material")).toUpperCase();
        var count = ((Number) ingredient.get("Quantity")).intValue();
        var cost = Material.valueOf(name);
        gameState.adjustMaterialCount(cost, -1 * count);
    }

    private void adjustCargoCount(GameState gameState, Map<String, Object> item)
    {
        var name = ((String) item.get("Commodity")).toUpperCase();
        var count = ((Number) item.get("Quantity")).intValue();
        var cost = Commodity.valueOf(name);
        gameState.adjustCargoCount(cost, -1 * count);
    }
}
