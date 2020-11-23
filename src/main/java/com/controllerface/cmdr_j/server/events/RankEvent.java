package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.server.PlayerState;
import com.controllerface.cmdr_j.server.JournalEventEX;

import java.util.Map;
import java.util.function.BiConsumer;

public class RankEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Rank_Combat);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Rank_Trade);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Rank_Explore);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Rank_Empire);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Rank_Federation);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Rank_CQC);
    }
}
