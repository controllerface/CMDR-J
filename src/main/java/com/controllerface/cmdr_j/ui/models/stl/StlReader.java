package com.controllerface.cmdr_j.ui.models.stl;

public interface StlReader
{
    boolean hasMoreFacets();
    StlFacet getNextFacet();
}
