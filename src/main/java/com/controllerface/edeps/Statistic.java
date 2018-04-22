package com.controllerface.edeps;

/**
 * Created by Stephen on 4/18/2018.
 */
public interface Statistic
{
    String getKey();
    String getText();
    String format(Object raw);
}
