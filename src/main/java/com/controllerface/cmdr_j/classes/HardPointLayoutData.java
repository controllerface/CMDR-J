package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.enums.equipment.modules.HardPointSize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Controllerface on 4/16/2018.
 *
 * NOTE: Immutable static data object
 *
 */
public class HardPointLayoutData
{
    private final HardPointSize[] slots;

    private HardPointLayoutData(Builder builder)
    {
        HardPointSize[] h = new HardPointSize[builder.slots.size()];
        this.slots = builder.slots.toArray(h);
    }

    public HardPointSize[] getSlots() { return slots; }

    public static Builder builder() { return new Builder(); }

    public static class Builder
    {
        private List<HardPointSize> slots = new ArrayList<>();

        public Builder addHardPoint(HardPointSize size)
        {
            slots.add(size);
            return this;
        }

        public HardPointLayoutData build()
        {
            if (slots.isEmpty()) throw new UnsupportedOperationException("hardpoint slots must not be empty");
            return new HardPointLayoutData(this);
        }
    }
}
