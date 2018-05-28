package com.controllerface.edeps.data;

import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.edeps.structures.equipment.ItemEffect;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Controllerface on 5/2/2018.
 */
public class ShipModuleData
{
    private final Statistic moduleName;
    private final ShipModule module;

    private final ModificationBlueprint modificationBlueprint;
    private final ExperimentalRecipe experimentalEffectName;
    private final List<ModifierData> modifiers;
    private final int level;
    private final double quality;

    public ShipModuleData(Builder builder)
    {
        this.moduleName = builder.moduleName;
        this.module = builder.module;
        this.modifiers = builder.modifiers;
        this.modificationBlueprint = builder.modificationBlueprint;
        this.experimentalEffectName = builder.experimentalEffectRecipe;
        this.level = builder.level;
        this.quality = builder.quality;
    }

    public ModificationBlueprint getModificationBlueprint()
    {
        return modificationBlueprint;
    }

    public ExperimentalRecipe getExperimentalEffectName()
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

    /**
     * For the provided ItemEffect, returns the actual value this item has for that effect, if any.
     * If the module has modifications that override the stock value, this method will return the
     * modified value. If the provided effect is not present on this module, will return null.
     *
     * @param effect the ItemEffect to get the value of from this module
     * @return the actual applied value on this module for the given effect, or null if the effect is not present
     */
    public Double getEffectValue(ItemEffect effect)
    {
        Double stockValue = module.itemEffects().effectStream()
                .filter(effectData -> effectData.getEffect() == effect)
                .filter(ItemEffectData::isNumerical)
                .map(ItemEffectData::getDoubleValue)
                .findAny().orElse(null);

        Double modifiedValue = modifiers.stream()
                .filter(modifierData -> modifierData.getEffect() == effect)
                .map(ModifierData::getValue)
                .findAny().orElse(null);

        Double r = modifiedValue == null
                ? stockValue
                : modifiedValue;

        return r;
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

    @Override
    public int hashCode()
    {
        return moduleName.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof ShipModuleData))
        {
            return false;
        }
        ShipModuleData other = ((ShipModuleData) obj);
        return other == this || other.getModuleName() == this.moduleName;
    }

    public static class Builder
    {

        private Statistic moduleName;
        private ShipModule module;
        private List<ModifierData> modifiers;
        private ModificationBlueprint modificationBlueprint;
        private ExperimentalRecipe experimentalEffectRecipe;
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

        public Builder setModificationBlueprint(ModificationBlueprint modificationBlueprint)
        {
            this.modificationBlueprint = modificationBlueprint;
            return this;
        }

        public Builder setExperimentalEffectRecipe(ExperimentalRecipe experimentalEffectName)
        {
            this.experimentalEffectRecipe = experimentalEffectName;
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
            if (modifiers == null) modifiers = new ArrayList<>();
            return new ShipModuleData(this);
        }
    }
}
