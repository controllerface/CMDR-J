package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.ShipModuleData;
import com.controllerface.cmdr_j.classes.recipes.ModulePurchaseRecipe;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CosmeticSlot;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class BuyWeaponEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var cost = ((Number) event.get("Price")).intValue();
        gameState.adjustCreditBalance(-1 * cost);
    }
}
