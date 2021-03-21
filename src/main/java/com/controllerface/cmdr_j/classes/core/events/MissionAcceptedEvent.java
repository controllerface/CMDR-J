package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.MissionData;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;

public class MissionAcceptedEvent implements BiConsumer<GameState, Map<String, Object>>
{
    private static final Set<String> ignoredKeys = Set.of
        (
            "Name",
            "LocalisedName",
            "TargetType_Localised",
            "Faction",
            "Influence",
            "Reputation",
            "Reward",
            "MissionID",
            "timestamp",
            "event"
        );

    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var name = ((String) event.get("LocalisedName"));
        var faction = ((String) event.get("Faction"));
        var influence = ((String) event.get("Influence"));
        var reputation = ((String) event.get("Reputation"));
        var reward = ((Number) event.get("Reward")).longValue();
        var missionID = ((Number) event.get("MissionID")).longValue();

        var details = new HashMap<String, Object>();
        event.entrySet().stream()
            .filter(entry -> !ignoredKeys.contains(entry.getKey()))
            .forEach(entry -> details.put(entry.getKey(), entry.getValue()));

        Optional.ofNullable(event.get("TargetType_Localised"))
            .map(localizedType -> ((String) localizedType))
            .ifPresent(localizedType -> details.put("TargetType", localizedType));

        var missionData = new MissionData(MissionData.MissionState.ACTIVE,
            name,
            faction,
            influence,
            reputation,
            reward,
            missionID,
            details);

        gameState.acceptMission(missionData);
    }
}
