package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.enums.commander.PlayerStat;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class CommanderEvent implements BiConsumer<CommanderState, Map<String, Object>>
{
    @Override
    public void accept(CommanderState commanderState, Map<String, Object> event)
    {
        String name = Optional.ofNullable(event.get("Name"))
            .map(rawName -> ((String) rawName))
            .orElse("[ERROR]");

        System.out.println("Setting commander name: " + name);

        commanderState.setStat(PlayerStat.Commander, name);
    }
}
