package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class ShipyardBuyEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var price = ((Number) event.get("ShipPrice")).intValue();
        gameState.adjustCreditBalance(-1 * price);

        Optional.ofNullable(event.get("SellPrice"))
            .ifPresent(sellPrice ->
            {
                var sale = ((Number) sellPrice).intValue();
                gameState.adjustCreditBalance(sale);
            });
    }
}
