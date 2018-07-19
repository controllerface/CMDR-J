package com.controllerface.cmdr_j.data.events.stats.factions;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.JournalEventHandler;
import com.controllerface.cmdr_j.structures.commander.RankStat;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logGeneralMessage;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.setStatFromData;

/**
 * Rank progress event: written at startup, when loading from main menu
 *
 * Created by Stephen on 7/18/2018.
 */
public class ProgressHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logGeneralMessage(context, "Reloading Rank Progress");

        setStatFromData(context, RankStat.Progress_Combat);
        setStatFromData(context, RankStat.Progress_Trade);
        setStatFromData(context, RankStat.Progress_Explore);
        setStatFromData(context, RankStat.Progress_Empire);
        setStatFromData(context, RankStat.Progress_Federation);
        setStatFromData(context, RankStat.Progress_CQC);    }
}
