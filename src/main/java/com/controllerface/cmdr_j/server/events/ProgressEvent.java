package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.JournalEventEX;

import java.util.Map;
import java.util.function.BiConsumer;

public class ProgressEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Progress_Combat);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Progress_Trade);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Progress_Explore);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Progress_Empire);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Progress_Federation);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Progress_CQC);
    }
}
