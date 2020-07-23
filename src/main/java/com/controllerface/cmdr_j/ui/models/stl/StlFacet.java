package com.controllerface.cmdr_j.ui.models.stl;

import com.controllerface.cmdr_j.ui.models.FloatVector;

public class StlFacet
{
    public final FloatVector pointA;
    public final FloatVector pointB;
    public final FloatVector pointC;
    public final FloatVector normal;

    public StlFacet(FloatVector pointA, FloatVector pointB, FloatVector pointC, FloatVector normal)
    {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.normal = normal;
    }
}
