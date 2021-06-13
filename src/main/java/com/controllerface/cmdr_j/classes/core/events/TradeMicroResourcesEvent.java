package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.costs.materials.Material;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;

public class TradeMicroResourcesEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var paidMaterials = ((List<Map<String, Object>>) event.get("Offered"));
        int received = ((Number) event.get("Count")).intValue();
        var yieldMaterial = Material.valueOf(((String) event.get("Received")).toUpperCase());
        gameState.adjustMaterialCount(yieldMaterial, received);
        paidMaterials.forEach(payment->
        {
            var paidMaterial = Material.valueOf(((String) payment.get("Name")).toUpperCase());
            int paid = ((Number) payment.get("Count")).intValue();
            gameState.adjustMaterialCount(paidMaterial, -1 * paid);
        });
    }
}
