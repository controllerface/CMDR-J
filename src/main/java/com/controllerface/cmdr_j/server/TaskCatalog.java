package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.classes.tasks.TaskType;

import java.util.HashMap;
import java.util.Map;

public class TaskCatalog
{
    public final Map<String, TaskRecipe> keyMap = new HashMap<>();
    public final Map<TaskRecipe, String> untypedTaskMap = new HashMap<>();
    public final Map<TaskType, Map<TaskRecipe, String>> typedTaskMap = new HashMap<>();
    public final Map<String, String> typePrefixes = new HashMap<>();

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
}
