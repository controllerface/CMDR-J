package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.server.JournalSyncTaskEX;
import com.controllerface.cmdr_j.server.PlayerState;
import com.controllerface.cmdr_j.threads.JournalSyncTask;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.adjustCommodityCount;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logInventoryMessage;

public class CargoEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var cargoData = event.get("Inventory") == null
            ? JournalSyncTaskEX.readCargoData()
            : event;

        playerState.clearCargo();

        ((List<Map<String, Object>>) cargoData.get("Inventory"))
            .forEach(item -> setCargoCount(playerState, item));

        playerState.emitCurrentMass();
    }

    private void setCargoCount(PlayerState playerState, Map<String, Object> item)
    {
        String name = ((String) item.get("Name"));
        String nameLocalized = ((String) item.get("Name_Localised"));
        Commodity commodity = Commodity.valueOf(name.toUpperCase());
        Integer count = ((Integer) item.get("Count"));
        playerState.setCargoCount(commodity, nameLocalized, count);
    }
}
