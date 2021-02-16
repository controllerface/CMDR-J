package com.controllerface.cmdr_j.classes;

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
        var duration = Duration.ofSeconds(seconds).toString();
        var pledged = duration.replace("PT","")
            .replace("H", " H ")
            .replace("M", " M ")
            .replace("S", " S").trim();

        var hourMarker = pledged.indexOf(" H ");
        if (hourMarker != -1)
        {
            var hours = Long.parseLong(pledged.substring(0, hourMarker));
            if (hours >= 24)
            {
                var days = TimeUnit.HOURS.toDays(hours);
                var newHours = hours - (days * 24);
                pledged = pledged.replace(hours + " H ", newHours + " H ");
                pledged = days + " D " + pledged;
            }
        }

        var map = new HashMap<String, Object>();
        map.put("name", name);
        map.put("rank", rank);
        map.put("merits", merits);
        map.put("votes", votes);
        map.put("time", pledged);
        return map;
    }
}
