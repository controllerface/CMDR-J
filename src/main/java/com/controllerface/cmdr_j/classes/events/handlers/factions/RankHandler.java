package com.controllerface.cmdr_j.classes.events.handlers.factions;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.enums.commander.RankStat;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.logGeneralMessage;
import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.setStatFromData;

/**
 * Rank event: written at startup, when loading from main menu
 *
 * Created by Stephen on 7/18/2018.
 */
public class RankHandler implements JournalEventHandler
{
    @Override
    public void handle(EventProcessingContext context)
    {
        logGeneralMessage(context, "Reloading Current Rank Status");

        setStatFromData(context, RankStat.Rank_Combat);
        setStatFromData(context, RankStat.Rank_Trade);
        setStatFromData(context, RankStat.Rank_Explore );
        setStatFromData(context, RankStat.Rank_Empire);
        setStatFromData(context, RankStat.Rank_Federation);
        setStatFromData(context, RankStat.Rank_CQC);
    }
}
