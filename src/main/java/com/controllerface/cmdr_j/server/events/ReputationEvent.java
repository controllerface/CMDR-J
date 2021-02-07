package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.JournalEventEX;

import java.util.Map;
import java.util.function.BiConsumer;

public class ReputationEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Reputation_Empire);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Reputation_Federation);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Reputation_Alliance);
        JournalEventEX.setCommanderStat(gameState, event, RankStat.Reputation_Independent);
    }
}
