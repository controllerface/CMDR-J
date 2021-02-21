package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.database.EntityKeys;
import com.controllerface.cmdr_j.ui.UIFunctions;
import jetbrains.exodus.entitystore.Entity;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Stephen on 6/13/2018.
 */
public class StarSystem
{
    /**
     * When rendering galactic points on the galaxy model, the center of the model is actually
     * Sagittarius A*, not Sol. However, all galactic coordinates are specified relative to SOL.
     * These offsets can be applied to any galactic co-ordinates to translate them from offset
     * to Sol to an offset from Sagittarius A*. I.e., the following offsets are the inverse of
     * the coordinates of Sagittarius A*.
     */
    public static final double GALAXY_OFFSET_X = -25.21875;
    public static final double GALAXY_OFFSET_Y = -25899.96875;
    public static final double GALAXY_OFFSET_Z = 20.90625;

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

    public double distanceBetween(StarSystem otherSystem)
    {
        // AB = |√((x2−x1)^2+(y2−y1)^2+(z2−z1)^2)|

        double xDiff = otherSystem.xPos - this.xPos;
        double yDiff = otherSystem.yPos - this.yPos;
        double zDiff = otherSystem.zPos - this.zPos;

        double xSq = Math.pow((xDiff), 2);
        double ySq = Math.pow((yDiff), 2);
        double zSq = Math.pow((zDiff), 2);

        double sum = xSq + ySq + zSq;

        return UIFunctions.Data.round(Math.abs(Math.sqrt(sum)), 2);
    }

    public void storeSystemData(Entity systemEntity)
    {
        systemEntity.setProperty(EntityKeys.STAR_SYSTEM, systemName);
        systemEntity.setProperty(EntityKeys.STAR_SYSTEM_ADDRESS, address);
        systemEntity.setProperty(EntityKeys.STAR_SYSTEM_X, xPos);
        systemEntity.setProperty(EntityKeys.STAR_SYSTEM_Y, yPos);
        systemEntity.setProperty(EntityKeys.STAR_SYSTEM_Z, zPos);
    }

    public static StarSystem unstoreSystemData(Entity systemEntity)
    {
        try
        {
            var s = ((String) systemEntity.getProperty(EntityKeys.STAR_SYSTEM));
            var a = ((Long) systemEntity.getProperty(EntityKeys.STAR_SYSTEM_ADDRESS));
            var x = ((Double) systemEntity.getProperty(EntityKeys.STAR_SYSTEM_X));
            var y = ((Double) systemEntity.getProperty(EntityKeys.STAR_SYSTEM_Y));
            var z = ((Double) systemEntity.getProperty(EntityKeys.STAR_SYSTEM_Z));
            return new StarSystem(s, x, y, z, a);
        }
        catch (Exception e)
        {
            System.out.println("Could not restore system data from entity: " + systemEntity.getId().toString());
            e.printStackTrace();
        }
        return null;
    }
}
