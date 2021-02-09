package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;

import java.util.Map;

public class TaskCatalog
{
    public final Map<String, TaskRecipe> keyMap;
    public final Map<TaskRecipe, String> taskMap;
    public final String rawCatalogJson;

    public enum AdjustmentType
    {
        ADD,
        SUBTRACT,
        DELETE;

        public static AdjustmentType fromString(String typeString)
        {
            if (typeString == null) return null;
            if (typeString.equalsIgnoreCase("add")) return ADD;
            if (typeString.equalsIgnoreCase("subtract")) return SUBTRACT;
            if (typeString.equalsIgnoreCase("delete")) return DELETE;
            return null;
        }
    }

    public TaskCatalog(Map<String, TaskRecipe> keyMap, Map<TaskRecipe, String> taskMap, String rawCatalogJson)
    {
        this.keyMap = keyMap;
        this.taskMap = taskMap;
        this.rawCatalogJson = rawCatalogJson;
    }
}
