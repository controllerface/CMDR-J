package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.core.JournalSyncTask;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class CargoEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var cargoData = event.get("Inventory") == null
            ? JournalSyncTask.readCargoData()
            : event;

        gameState.clearCargo();

        ((List<Map<String, Object>>) cargoData.get("Inventory"))
            .forEach(item -> setCargoCount(gameState, item));

        gameState.emitCurrentMass();
    }

    private void setCargoCount(GameState gameState, Map<String, Object> item)
    {
        var name = ((String) item.get("Name")).toUpperCase();
        var nameLocalized = ((String) item.get("Name_Localised"));
        if (nameLocalized == null)
        {
            nameLocalized = name;
        }
        var commodity = Commodity.valueOf(name);
        var count = ((Number) item.get("Count")).intValue();
        gameState.setCargoCount(commodity, nameLocalized, count);
    }
}
