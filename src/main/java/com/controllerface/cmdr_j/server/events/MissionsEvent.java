package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.MissionData;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class MissionsEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var active = ((List<Map<String, Object>>) event.get("Active"));
        if (active != null && !active.isEmpty())
        {
            active.forEach(mission ->
            {
                var missionId = ((Number) mission.get("MissionID")).longValue();
                gameState.updateMissionState(MissionData.MissionState.ACTIVE, missionId);
            });
        }
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
