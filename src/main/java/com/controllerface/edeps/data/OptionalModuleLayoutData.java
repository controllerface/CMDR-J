package com.controllerface.edeps.data;

import com.controllerface.edeps.Immutable;
import com.controllerface.edeps.structures.equipment.modules.ModuleSize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stephen on 4/16/2018.
 */
@Immutable
public class OptionalModuleLayoutData
{
    private final ModuleSize[] slots;

    private OptionalModuleLayoutData(Builder builder)
    {
        ModuleSize[] h = new ModuleSize[builder.slots.size()];
        this.slots = builder.slots.toArray(h);
    }

    public ModuleSize[] getSlots()
    {
        return slots;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public static class Builder
    {
        private List<ModuleSize> slots = new ArrayList<>();

        public Builder addModule(ModuleSize size)
        {
            slots.add(size);
            return this;
        }

        public OptionalModuleLayoutData build()
        {
            return new OptionalModuleLayoutData(this);
        }
    }
}
