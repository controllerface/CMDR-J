package com.controllerface.cmdr_j.interfaces.tasks;

/**
 * In the context of this application, a "cost" is some material item, either a commodity, raw or manufactured item,
 * or encoded piece of data. Such costs are grouped into various categories, and this interface defines this type
 * of relationship. Mostly a marker interface, there is a single numerical value that implementors must provide
 * solely for the purposes of grouping together and sorting items that fall under some category implementation.
 *
 * Created by Controllerface on 4/11/2018.
 */
public interface TaskCostCategory
{
    int getNumericalValue();
}
