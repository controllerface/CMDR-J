package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.function.BiConsumer;

public class MissionAbandonedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var fine = ((Number) event.get("Fine")).longValue();
        var missionID = ((Number) event.get("MissionID")).longValue();
        
        gameState.adjustCreditBalance(-1 * fine);
        gameState.completeMission(missionID);
    }
}
