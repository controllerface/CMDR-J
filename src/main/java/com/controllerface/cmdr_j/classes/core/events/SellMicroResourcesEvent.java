package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.costs.materials.Material;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class SellMicroResourcesEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        System.out.println(event);
        var soldMaterials = ((List<Map<String, Object>>) event.get("MicroResources"));
        int price = ((Number) event.get("Price")).intValue();
        gameState.adjustCreditBalance(price);
        soldMaterials.forEach(payment->
        {
            var soldMaterial = Material.valueOf(((String) payment.get("Name")).toUpperCase());
            int sold = ((Number) payment.get("Count")).intValue();
            gameState.adjustMaterialCount(soldMaterial, -1 * sold);
        });
    }
}
