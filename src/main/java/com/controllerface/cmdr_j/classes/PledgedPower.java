package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.ui.UIFunctions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class PledgedPower
{
    public final String name;
    public final int rank;
    public final int merits;
    public final int votes;
    public final long timePledged;

    public PledgedPower(String name, int rank, int merits, int votes, long timePledged)
    {
        this.name = name;
        this.rank = rank;
        this.merits = merits;
        this.votes = votes;
        this.timePledged = timePledged;
    }

    public Map<String, Object> toMap()
    {
        var seconds = Long.parseLong(String.valueOf(timePledged));
        var pledged = UIFunctions.Format.secondsToTimeString(seconds);

        var map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("rank", rank);
        map.put("merits", merits);
        map.put("votes", votes);
        map.put("time", pledged);
        return map;
    }
}
