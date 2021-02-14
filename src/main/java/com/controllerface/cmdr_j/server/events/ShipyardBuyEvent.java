package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class ShipyardBuyEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        int price = ((int) event.get("ShipPrice"));
        gameState.adjustCreditBalance(-1 * price);

        if (event.get("SellPrice") != null)
        {
            int sale = ((int) event.get("SellPrice"));
            gameState.adjustCreditBalance(sale);
        }
    }
}
