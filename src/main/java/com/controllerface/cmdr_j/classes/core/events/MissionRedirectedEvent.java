package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MissionRedirectedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var missionID = ((Number) event.get("MissionID")).longValue();
        var newSystem = ((String) event.get("NewDestinationSystem"));
        var newStation = ((String) event.get("NewDestinationStation"));

        System.out.println("Redirecting: " + missionID + " :: " + newSystem + " : " + newStation);
        gameState.redirectMission(missionID, newSystem, newStation);
    }
}
