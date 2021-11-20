package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;

import java.util.*;

public class SuitModuleData
{
    public final OwnableModule module;
    public final List<ModifierData> modifiers;
    public final Integer ammoInClip;
    public final Integer level;

    private SuitModuleData(Builder builder)
    {
        this.module = builder.module;
        this.modifiers = builder.modifiers;
        this.ammoInClip = builder.ammoInClip;
        this.level = builder.level;
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

        Optional.ofNullable(level)
            .ifPresent(modLevel -> map.put("modLevel", modLevel));

        Map<String, Object> effects = new HashMap<>();

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
            if (modifierData.stringValue == null || modifierData.stringValue.isEmpty())
            {
                // the journal sometimes glitches listing a value as
                // modified from 0 to 0. In that case just bail out.
                return;
            }
            var name = modifierData.effect.toString();
            var values = (Map<String, Object>) effects.computeIfAbsent(name,
                (_k) -> new HashMap<String, Object>());
            values.put("value", modifierData.stringValue);
            values.put("effectType", "modification");
            values.put("impact", "positive");
        });

        map.put("effects", effects);
        map.put("modCount", modifiers.size());
        return map;
    }

    public static class Builder
    {
        private final OwnableModule module;
        private List<ModifierData> modifiers;
        private Integer ammoInClip;
        private Integer level;

        public Builder(OwnableModule module)
        {
            this.module = module;
        }

        public Builder setModifiers(List<ModifierData> modifiers)
        {
            this.modifiers = modifiers;
            return this;
        }

        public Builder setAmmoInClip(Integer ammoInClip)
        {
            this.ammoInClip = ammoInClip;
            return this;
        }

        public Builder setLevel(Integer level)
        {
            this.level = level;
            return this;
        }

        public SuitModuleData build()
        {
            if (modifiers == null) modifiers = new ArrayList<>();
            return new SuitModuleData(this);
        }
    }
}
