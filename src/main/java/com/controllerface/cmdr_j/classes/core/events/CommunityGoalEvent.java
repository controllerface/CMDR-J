package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class CommunityGoalEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var goals = ((List<Map<String, Object>>) event.get("CurrentGoals"));
        gameState.setCommunityGoals(goals);
    }
}
