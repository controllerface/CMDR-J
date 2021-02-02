package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.PlayerState;

import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class BountyEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        var reward = ((Number) Optional.ofNullable(event.get("TotalReward"))
            .orElseGet(() -> event.get("Reward"))).intValue();
        playerState.adjustCreditBalance(reward);
    }
}
