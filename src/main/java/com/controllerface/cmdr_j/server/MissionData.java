package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.JSONSupport;
import jetbrains.exodus.entitystore.Entity;

import java.util.HashMap;
import java.util.Map;

public class MissionData
{
    public final MissionState state;
    public final String name;
    public final String faction;
    public final String influence;
    public final String reputation;
    public final long reward;
    public final long missionID;
    public final Map<String, Object> details;

    public enum MissionState
    {
        ACTIVE,
        COMPLETE,
        FAILED
    }

    public MissionData(MissionState state,
                       String name,
                       String faction,
                       String influence,
                       String reputation,
                       long reward,
                       long missionID,
                       Map<String, Object> details)
    {
        this.state = state;
        this.name = name;
        this.faction = faction;
        this.influence = influence;
        this.reputation = reputation;
        this.reward = reward;
        this.missionID = missionID;
        this.details = details;
    }

    public static Map<String, Object> toMap(Entity entity)
    {
        var data = new HashMap<String, Object>();

        entity.getPropertyNames()
            .forEach(propertyName -> data.put(propertyName, entity.getProperty(propertyName)));

        entity.getBlobNames()
            .forEach(propertyName ->
            {
                var json = JSONSupport.Parse.jsonString.apply(entity.getBlobString(propertyName));
                data.put(propertyName, json);
            });

        return data;
    }

    public void storeMissionData(Entity entity)
    {
        entity.setProperty("state", state.name().toLowerCase());
        entity.setProperty("name", name);
        entity.setProperty("faction", faction);
        entity.setProperty("influence", influence);
        entity.setProperty("reputation", reputation);
        entity.setProperty("reward", reward);
        entity.setProperty("missionID", missionID);

        var detailJson = JSONSupport.Write.jsonToString.apply(details);
        entity.setBlobString("details", detailJson);
    }
}
