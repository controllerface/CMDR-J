package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.SuitModuleData;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.equipment.modules.PersonalWeapon;
import com.controllerface.cmdr_j.enums.equipment.modules.SpaceSuit;
import com.controllerface.cmdr_j.enums.equipment.suits.SuitGearSlot;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class SuitLoadoutEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        System.out.println(event);

        // 1 get suit
        var suitName = ((String) event.get("SuitName")).toLowerCase();
        SpaceSuit suit;
        suit = SpaceSuit.findModule(suitName).orElse(null);

        if (suit == null)
        {
            System.out.println("suit is null: " + suitName);
            return;
        }

        gameState.clearSuitModules();

        var data = new SuitModuleData.Builder(suit)
            .setLevel(suit.gearClass)
            .build();

        gameState.setSuitModule(SuitGearSlot.SpaceSuit, data);

        var modules = ((List<Map<String, Object>>) event.get("Modules"));

        modules.forEach(module -> handleModule(gameState, module));

        // 2 get weapons

        gameState.emitSuitLoadoutEvent();
    }


    private void handleModule(GameState gameState, Map<String, Object> module)
    {
        try
        {
            var sn = ((String) module.get("SlotName"));
            var mn = ((String) module.get("ModuleName"));
            int cl = ((Number) module.get("Class")).intValue();
            var wp = PersonalWeapon.findModule(mn);
            var sl = SuitGearSlot.valueOf(sn);
            var dt = new SuitModuleData.Builder(wp)
                .setLevel(cl)
                .build();
            gameState.setSuitModule(sl, dt);

        }
        catch (Exception e)
        {
            System.out.println("Problem!");
            e.printStackTrace();
        }
    }
}
