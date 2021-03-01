package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.Map;
import java.util.function.BiConsumer;

public class ReputationEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEvent.setCommanderStat(gameState, event, RankStat.Reputation_Empire);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Reputation_Federation);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Reputation_Alliance);
        JournalEvent.setCommanderStat(gameState, event, RankStat.Reputation_Independent);
    }
}
