package com.controllerface.cmdr_j.ui.models;

public class FloatVector
{
    public final float x;
    public final float y;
    public final float z;

    public FloatVector(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public FloatVector add(FloatVector vector)
    {
        return new FloatVector(x + vector.x, y + vector.y, z + vector.z);
    }
}
