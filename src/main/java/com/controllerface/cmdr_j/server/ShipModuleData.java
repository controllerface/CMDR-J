package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.data.ItemEffectData;
import com.controllerface.cmdr_j.classes.data.ModifierData;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.*;

public class ShipModuleData
{
    public final ShipModule module;
    public final ModificationBlueprint modificationBlueprint;
    public final ExperimentalRecipe experimentalEffectRecipe;
    public final List<ModifierData> modifiers;
    public final Integer ammoInClip;
    public final Integer ammoInHopper;
    public final Boolean powered;
    public final Integer priority;
    public final Double health;
    public final Integer level;
    public final Double quality;

    private ShipModuleData(Builder builder)
    {
        this.module = builder.module;
        this.modifiers = builder.modifiers;
        this.modificationBlueprint = builder.modificationBlueprint;
        this.experimentalEffectRecipe = builder.experimentalEffectRecipe;
        this.ammoInClip = builder.ammoInClip;
        this.ammoInHopper = builder.ammoInHopper;
        this.powered = builder.powered;
        this.priority = builder.priority;
        this.health = builder.health;
        this.level = builder.level;
        this.quality = builder.quality;
    }

    public Optional<ItemEffectData> effectByName(ItemEffect effect)
    {
        Optional<ModifierData> modified = modifiers.stream()
            .filter(modifierData -> modifierData.effect == effect)
            .findFirst();

        if (modified.isPresent())
        {
            return modified.map(mod -> new ItemEffectData(mod.effect, mod.value));
        }

        return module.itemEffects().effectStream()
            .filter(e -> e.effect == effect)
            .findFirst();
    }

    public Optional<ItemEffectData> stockEffectByName(ItemEffect effect)
    {
        return module.itemEffects().effectStream()
            .filter(e -> e.effect == effect)
            .findFirst();
    }

    @SuppressWarnings("unchecked")
    public Map<String, Object> toJson()
    {
        var map = new HashMap<String, Object>();

        map.put("name", module.displayText());
        map.put("powered", powered);
        map.put("priority", priority);
        map.put("health", UIFunctions.Data.round(health * 100, 0));

        Optional.ofNullable(level)
            .ifPresent(modLevel -> map.put("modLevel", modLevel));

        Optional.ofNullable(quality)
            .ifPresent(modQuality -> map.put("modQuality", modQuality));

        Optional.ofNullable(ammoInClip)
            .ifPresent(ammo -> map.put("ammoInClip", ammo));

        Optional.ofNullable(ammoInHopper)
            .ifPresent(ammo -> map.put("ammoInHopper", ammo));

        Optional.ofNullable(modificationBlueprint)
            .ifPresent(mod -> map.put("modification", mod.toString()));

        Optional.ofNullable(experimentalEffectRecipe)
            .ifPresent(exp -> map.put("experimental", exp.getDisplayLabel()));

        Map<String, Object> effects = new HashMap<>();

        Optional.ofNullable(experimentalEffectRecipe)
            .ifPresent(experimentalRecipe -> experimentalRecipe.effects().effectStream()
                .filter(e->e.effect.effectType == ItemEffect.EffectType.EXPERIMENTAL)
                .forEach(effectData->
                {
                    var name = effectData.effect.toString();
                    var values = new HashMap<String, Object>();
                    if (effectData.isNumerical())
                    {
                        values.put("value", effectData.getDoubleValue());
                    }
                    else
                    {
                        values.put("value", effectData.getValueString());
                    }

                    var type = effectData.effect.effectType
                        .toString()
                        .toLowerCase()
                        .replace("_", "");

                    values.put("effectType", type);

                    Optional.of(effectData.effect.unit)
                        .filter(unit -> !unit.isEmpty())
                        .ifPresent(unit -> values.put("unit", unit));

                    effects.put(name, values);
                }));

        module.itemEffects().effectStream()
            .forEach(effectData ->
            {
                var name = effectData.effect.toString();
                var values = new HashMap<String, Object>();
                if (effectData.isNumerical())
                {
                    values.put("value", effectData.getDoubleValue());
                }
                else
                {
                    values.put("value", effectData.getValueString());
                }

                var type = effectData.effect.effectType
                    .toString()
                    .toLowerCase()
                    .replace("_", "");

                values.put("effectType", type);

                Optional.of(effectData.effect.unit)
                    .filter(unit -> !unit.isEmpty())
                    .ifPresent(unit -> values.put("unit", unit));

                effects.put(name, values);
            });

        modifiers.forEach(modifierData ->
        {
            if (modifierData.value == modifierData.originalValue)
            {
                // the journal sometimes glitches listing a value as
                // modified from 0 to 0. In that case just bail out.
                return;
            }
            var name = modifierData.effect.toString();
            var values = (Map<String, Object>) effects.computeIfAbsent(name,
                (_k) -> new HashMap<String, Object>());
            values.put("value", modifierData.value);
            values.put("originalValue", modifierData.originalValue);
            boolean positive = modifierData.lessIsGood
                ? modifierData.value < modifierData.originalValue
                : modifierData.value > modifierData.originalValue;
            values.put("impact", positive ? "positive" : "negative");
        });

        map.put("effects", effects);
        return map;
    }

    public static class Builder
    {
        private final ShipModule module;
        private List<ModifierData> modifiers;
        private ModificationBlueprint modificationBlueprint;
        private ExperimentalRecipe experimentalEffectRecipe;
        private Integer ammoInClip;
        private Integer ammoInHopper;
        private Boolean powered;
        private Integer priority;
        private Double health;
        private Integer level;
        private Double quality;

        public Builder(ShipModule module)
        {
            this.module = module;
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

        public Builder setAmmoInClip(Integer ammoInClip)
        {
            this.ammoInClip = ammoInClip;
            return this;
        }

        public Builder setAmmoInHopper(Integer ammoInHopper)
        {
            this.ammoInHopper = ammoInHopper;
            return this;
        }

        public Builder setPowered(Boolean powered)
        {
            this.powered = powered;
            return this;
        }

        public Builder setPriority(Integer priority)
        {
            this.priority = priority;
            return this;
        }

        public Builder setHealth(Double health)
        {
            this.health = health;
            return this;
        }

        public Builder setLevel(Integer level)
        {
            this.level = level;
            return this;
        }

        public Builder setQuality(Double quality)
        {
            this.quality = quality;
            return this;
        }

        public ShipModuleData build()
        {
            if (modifiers == null) modifiers = new ArrayList<>();
            return new ShipModuleData(this);
        }
    }
}
