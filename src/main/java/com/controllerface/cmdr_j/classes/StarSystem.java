package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.ui.UIFunctions;

/**
 * Created by Stephen on 6/13/2018.
 */
public class StarSystem
{
    // todo: make public, drop getters
    public final String systemName;
    public final double xPos;
    public final double yPos;
    public final double zPos;
    public final long address;

    public StarSystem(String systemName, double xPos, double yPos, double zPos, long address)
    {
        this.systemName = systemName;

        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;

        this.address = address;
    }

    public double distanceBetween(StarSystem that)
    {
        // AB=|√((x2−x1)^2+(y2−y1)^2+(z2−z1)^2)|

        double xDiff = that.xPos - this.xPos;
        double yDiff = that.yPos - this.yPos;
        double zDiff = that.zPos - this.zPos;

        double xSq = Math.pow((xDiff), 2);
        double ySq = Math.pow((yDiff), 2);
        double zSq = Math.pow((zDiff), 2);

        double sum = xSq + ySq + zSq;

        return UIFunctions.Data.round(Math.abs(Math.sqrt(sum)), 2);
    }
}
