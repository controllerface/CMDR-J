package com.controllerface.cmdr_j.server;

public class StaticAsset
{
    public final String location;
    public final String mimetype;

    public StaticAsset(String location, String mimetype)
    {
        this.location = location;
        this.mimetype = mimetype;
    }

    public static StaticAsset make(String location, String mimetype)
    {
        return new StaticAsset(location, mimetype);
    }
}
