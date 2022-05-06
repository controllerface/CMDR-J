package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.Map;
import java.util.function.BiConsumer;

public class RankEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEvent.setCommanderStat(gameState, event, RankStat.Rank_Combat);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Rank_Trade);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Rank_Explore);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Rank_Soldier);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Rank_Exobiologist);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Rank_Empire);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Rank_Federation);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Rank_CQC);
    }
}
