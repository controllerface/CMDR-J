package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.enums.commander.RankStat;
import com.controllerface.cmdr_j.server.PlayerState;
import com.controllerface.cmdr_j.server.JournalEventEX;

import java.util.Map;
import java.util.function.BiConsumer;

public class ProgressEvent implements BiConsumer<PlayerState, Map<String, Object>>
{
    @Override
    public void accept(PlayerState playerState, Map<String, Object> event)
    {
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Progress_Combat);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Progress_Trade);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Progress_Explore);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Progress_Empire);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Progress_Federation);
        JournalEventEX.setCommanderStat(playerState, event, RankStat.Progress_CQC);
    }
}
