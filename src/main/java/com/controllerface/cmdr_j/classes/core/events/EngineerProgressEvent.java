package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.engineers.Engineer;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class EngineerProgressEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        if (event.get("Engineers") != null)
        {
            var engineers = ((List<Map<String, Object>>) event.get("Engineers"));
            engineers.forEach(engineerData -> setEngineerProgress(gameState, engineerData));
        }
        else
        {
            setEngineerProgress(gameState, event);
        }
        gameState.emitEngineerData();
    }

    private void setEngineerProgress(GameState gameState, Map<String, Object> engineerData)
    {
        var id = ((Number) engineerData.get("EngineerID")).intValue();
        var engineer = Engineer.findEngineerById(id);
        if (engineer == null)
        {
            System.err.println("Unknown Engineer ID: " + id);
            return;
        }
        var formattedData = new HashMap<String, Object>();
        formattedData.put("status", engineerData.get("Progress"));
        formattedData.put("rank", Optional.ofNullable(engineerData.get("Rank"))
            .orElse(0));
        formattedData.put("progress", Optional.ofNullable(engineerData.get("RankProgress"))
            .orElse(0));
        formattedData.put("location", engineer.getFacility());
        formattedData.put("system", engineer.getLocation().systemName);
        formattedData.put("name", engineer.getFullName());
        gameState.setEngineerProgress(engineer, formattedData);
    }
}
