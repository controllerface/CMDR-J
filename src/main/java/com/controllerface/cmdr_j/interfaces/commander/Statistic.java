package com.controllerface.cmdr_j.interfaces.commander;

/**
 * Created by Controllerface on 4/18/2018.
 */
public interface Statistic
{
    String getKey();
    String getText();
    String getName();
    String format(Object raw);
}
