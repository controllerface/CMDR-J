package com.controllerface.edeps.data;

import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.Statistic;

import java.util.List;

/**
 * Created by Stephen on 5/2/2018.
 */
public class ShipModuleData
{
    private final Statistic moduleName;
    private final ShipModule module;

    private final String modificationName;
    private final String experimentalEffectName;
    private final List<ModifierData> modifiers;
    private final int level;
    private final double quality;

    public ShipModuleData(Builder builder)
    {
        this.moduleName = builder.moduleName;
        this.module = builder.module;
        this.modifiers = builder.modifiers;
        this.modificationName = builder.modifcationName;
        this.experimentalEffectName = builder.experimentalEffectName;
        this.level = builder.level;
        this.quality = builder.quality;
    }

    // todo: should be enum value
    public String getModificationName()
    {
        return modificationName;
    }

    // todo: should be enum value
    public String getExperimentalEffectName()
    {
        return experimentalEffectName;
    }

    public Statistic getModuleName()
    {
        return moduleName;
    }

    public ShipModule getModule()
    {
        return module;
    }

    public List<ModifierData> getModifiers()
    {
        return modifiers;
    }

    public int getLevel()
    {
        return level;
    }

    public double getQuality()
    {
        return quality;
    }

    public static class Builder
    {

        private Statistic moduleName;
        private ShipModule module;
        private List<ModifierData> modifiers;
        private String modifcationName;
        private String experimentalEffectName;
        private int level;
        private double quality;

        public Builder setModuleName(Statistic moduleName)
        {
            this.moduleName = moduleName;
            return this;
        }

        public Builder setModule(ShipModule module)
        {
            this.module = module;
            return this;
        }

        public Builder setModifiers(List<ModifierData> modifiers)
        {
            this.modifiers = modifiers;
            return this;
        }

        public Builder setModifcationName(String modifcationName)
        {
            this.modifcationName = modifcationName;
            return this;
        }

        public Builder setExperimentalEffectName(String experimentalEffectName)
        {
            this.experimentalEffectName = experimentalEffectName;
            return this;
        }

        public Builder setLevel(Integer level)
        {
            if (level != null) this.level = level;
            return this;
        }

        public Builder setQuality(Double quality)
        {
            if (quality != null) this.quality = quality;
            return this;
        }

        public ShipModuleData build()
        {
            if (modifcationName==null) modifcationName = "";
            if (experimentalEffectName==null) experimentalEffectName = "";
            return new ShipModuleData(this);
        }
    }
}
