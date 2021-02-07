package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.server.GameState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class CommanderEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        String name = Optional.ofNullable(event.get("Name"))
            .map(rawName -> ((String) rawName))
            .orElse("[ERROR]");

        gameState.setCommanderStat(CommanderStat.Commander, name);
    }
}
