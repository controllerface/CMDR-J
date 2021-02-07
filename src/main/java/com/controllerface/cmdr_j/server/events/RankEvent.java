package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.JournalEventEX;

import java.util.Map;
import java.util.function.BiConsumer;

public class RankEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Rank_Combat);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Rank_Trade);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Rank_Explore);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Rank_Empire);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Rank_Federation);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Rank_CQC);
    }
}
