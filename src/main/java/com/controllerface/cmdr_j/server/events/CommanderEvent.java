package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class CommanderEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        String name = Optional.ofNullable(event.get("Name"))
            .map(rawName -> ((String) rawName))
            .orElse("[ERROR]");

        playerState.setCommanderStat(CommanderStat.Commander, name);
    }
}
