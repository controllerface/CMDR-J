package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;
import com.controllerface.cmdr_j.classes.core.JournalSyncTask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class OutfittingEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var outfittingData = JournalSyncTask.readOutfittingData();
        if (outfittingData.isEmpty()) return;

        var marketId = ((Number) outfittingData.get("MarketID")).longValue();
        var timestamp = ((String) outfittingData.get("timestamp"));
        var name = ((String) outfittingData.get("StationName"));
        var system = ((String) outfittingData.get("StarSystem"));
        var items = ((List<Map<String, Object>>) outfittingData.get("Items"));
        var modules = new HashMap<String, Map<String, Object>>();

        items.forEach(item ->
        {
            var moduleName = ((String) item.get("Name"));
            var category = determineCategory(moduleName);
            var remappedItem = remapItem(item, moduleName);
            modules.computeIfAbsent(category, (_k) -> new HashMap<>())
                .put(moduleName, remappedItem);
        });

        var remappedOutfittingData = new HashMap<String, Object>();
        remappedOutfittingData.put("marketId", marketId);
        remappedOutfittingData.put("timestamp", timestamp);
        remappedOutfittingData.put("name", name);
        remappedOutfittingData.put("system", system);
        remappedOutfittingData.put("modules", modules);

        gameState.setOutfittingData(remappedOutfittingData);
        gameState.emitOutfittingEvent();
    }

    private String determineCategory(String moduleName)
    {
        if (moduleName.startsWith("hpt"))
        {
            return "hardpoints";
        }
        else if (moduleName.startsWith("int"))
        {
            if (moduleName.contains("_engine_")
                || moduleName.contains("_hyperdrive_")
                || moduleName.contains("_lifesupport_")
                || moduleName.contains("_powerdistributor_")
                || moduleName.contains("_powerplant_")
                || moduleName.contains("_sensors_"))
            {
                return "core";
            }
            return "optional";
        }
        else if (moduleName.contains("_armour_"))
        {
            return "armour";
        }
        else
        {
            return "modules";
        }
    }

    private Map<String, Object> remapItem(Map<String, Object> item, String moduleName)
    {
        var price = ((Number) item.get("BuyPrice"));
        var module = JournalEvent.determineModuleType(moduleName);
        var remappedItem = new HashMap<String, Object>();
        remappedItem.put("name", formatName(module));
        remappedItem.put("itemId", item.get("id"));
        remappedItem.put("price", price);
        return remappedItem;
    }

    private String formatName(OwnableModule ownableModule)
    {
        var baseName = ownableModule.getLocalizedName();

        var isArmour = baseName.endsWith("Armour");

        var name = baseName;

        if (!isArmour)
        {
            var size = ownableModule.itemEffects()
                .effectByName(ItemEffect.Size)
                .map(sizeData -> sizeData.doubleValue)
                .map(Double::intValue)
                .orElse(0);

            var grade = ownableModule.itemEffects()
                .effectByName(ItemEffect.Class)
                .map(classData -> classData.stringValue)
                .orElse("");

            var mount = ownableModule.itemEffects()
                .effectByName(ItemEffect.WeaponMode)
                .map(modeData -> modeData.stringValue)
                .orElse("");

            name = size + grade + " " + baseName;
            if (!mount.isEmpty())
            {
                name += " [" + mount + "]";
            }
        }

        return name;
    }
}
