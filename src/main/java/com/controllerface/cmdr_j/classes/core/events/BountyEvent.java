package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class BountyEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        // this is an informational event only, the bounty is not awarded until turned in
//        var reward = ((Number) Optional.ofNullable(event.get("TotalReward"))
//            .orElseGet(() -> event.get("Reward"))).intValue();

    }
}
