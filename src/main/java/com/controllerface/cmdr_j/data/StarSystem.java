package com.controllerface.cmdr_j.data;

import com.controllerface.cmdr_j.ui.UIFunctions;

/**
 * Created by Stephen on 6/13/2018.
 */
public class StarSystem
{
    private final String systemName;
    private final double xPos;
    private final double yPos;
    private final double zPos;

    public StarSystem(String systemName, double xPos, double yPos, double zPos)
    {
        this.systemName = systemName;
        this.xPos = xPos;
        this.yPos = yPos;
        this.zPos = zPos;
    }

    public String getSystemName() { return systemName; }
    public double getxPos() { return xPos; }
    public double getyPos() { return yPos; }
    public double getzPos() { return zPos; }

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
