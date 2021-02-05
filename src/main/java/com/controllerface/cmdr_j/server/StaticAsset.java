package com.controllerface.cmdr_j.server;

import java.util.Map;

public class StaticAsset
{
    public final String location;
    public final String mimetype;

    public static Map<String, String> mimeTypes = Map.of
        (
            "css",  "text/css",
            "html", "text/html",
            "ttf",  "font/ttf",
            "svg",  "image/svg+xml",
            "js",   "text/javascript"
        );

    public StaticAsset(String location, String mimetype)
    {
        this.location = location;
        this.mimetype = mimetype;
    }

    public static StaticAsset make(String location, String mimetype)
    {
        return new StaticAsset(location, mimetype);
    }

    public static StaticAsset make(String location)
    {
        return make(location, determineMimeType(location));
    }

    private static String determineMimeType(String location)
    {
        var dot = location.lastIndexOf(".");
        if (dot == -1)
        {
            throw new RuntimeException("Filename must have extension");
        }
        var extension = location.substring(dot + 1);
        var mimeType = mimeTypes.get(extension);
        if (mimeType == null)
        {
            throw new RuntimeException("Unknown extension: " + extension);
        }
        return mimeType;
    }
}
