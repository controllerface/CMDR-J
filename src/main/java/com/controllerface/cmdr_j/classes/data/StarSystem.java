package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.utilities.database.EntityKeys;
import com.controllerface.cmdr_j.utilities.UIFunctions;
import jetbrains.exodus.entitystore.Entity;

/**
 * Created by Stephen on 6/13/2018.
 */
public class StarSystem
{
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
        return UIFunctions.Math.calculate3dDistance(otherSystem.xPos, otherSystem.yPos, otherSystem.zPos,
            this.xPos, this.yPos, this.zPos);
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
            var systemName = ((String) systemEntity.getProperty(EntityKeys.STAR_SYSTEM));
            var systemAddress = ((Long) systemEntity.getProperty(EntityKeys.STAR_SYSTEM_ADDRESS));
            var xCoordinate = ((Double) systemEntity.getProperty(EntityKeys.STAR_SYSTEM_X));
            var yCoordinate = ((Double) systemEntity.getProperty(EntityKeys.STAR_SYSTEM_Y));
            var zCoordinate = ((Double) systemEntity.getProperty(EntityKeys.STAR_SYSTEM_Z));
            return new StarSystem(systemName, xCoordinate, yCoordinate, zCoordinate, systemAddress);
        }
        catch (Exception e)
        {
            // todo: log error: Could not restore system data from entity
            e.printStackTrace();
        }
        return null;
    }
}
