package com.controllerface.cmdr_j.interfaces.tasks;


import java.util.List;

/**
 * Tasks fall under a number of overarching "types" and this interface defines that relationship. Mostly
 * a marker interface, a single string returning name function is used to create descriptions for different UI elements.
 *
 * Created by Controllerface on 4/10/2018.
 */
public interface TaskType
{
    String getName();
    List<TaskBlueprint> getBluePrints();
    void setParentCategory(TaskCategory type);
    TaskCategory getParentCategory();
}
