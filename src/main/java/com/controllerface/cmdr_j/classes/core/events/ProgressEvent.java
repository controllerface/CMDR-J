package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.Map;
import java.util.function.BiConsumer;

public class ProgressEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEvent.setCommanderStat(gameState, event, RankStat.Progress_Combat);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Progress_Trade);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Progress_Explore);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Progress_Soldier);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Progress_Exobiologist);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Progress_Empire);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Progress_Federation);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Progress_CQC);
    }
}
