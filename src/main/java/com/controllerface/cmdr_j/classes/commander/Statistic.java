package com.controllerface.cmdr_j.classes.commander;

/**
 * Created by Controllerface on 4/18/2018.
 */
public interface Statistic
{
    String getKey();
    String getText();
    String format(Object raw);
}
