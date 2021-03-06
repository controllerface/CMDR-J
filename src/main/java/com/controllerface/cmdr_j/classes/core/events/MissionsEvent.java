package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.MissionData;

import java.util.*;
import java.util.function.BiConsumer;

public class MissionsEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var active = ((List<Map<String, Object>>) event.get("Active"));
        var retain = new HashSet<Long>();
        if (active != null && !active.isEmpty())
        {
            active.forEach(mission ->
            {
                var missionId = ((Number) mission.get("MissionID")).longValue();
                retain.add(missionId);
                gameState.updateMissionState(MissionData.MissionState.ACTIVE, missionId);
            });
        }
        gameState.expireOldMissions(retain);
        var complete = ((List<Map<String, Object>>) event.get("Complete"));
        if (complete != null && !complete.isEmpty())
        {
            complete.forEach(mission ->
            {
                var missionId = ((Number) mission.get("MissionID")).longValue();
                gameState.updateMissionState(MissionData.MissionState.COMPLETE, missionId);
            });
        }
        var failed = ((List<Map<String, Object>>) event.get("Failed"));
        if (failed != null && !failed.isEmpty())
        {
            failed.forEach(mission ->
            {
                var missionId = ((Number) mission.get("MissionID")).longValue();
                gameState.updateMissionState(MissionData.MissionState.FAILED, missionId);
            });
        }
        gameState.emitMissionData();
    }
}
