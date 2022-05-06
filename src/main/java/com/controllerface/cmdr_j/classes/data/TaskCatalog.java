package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.recipes.MaterialTradeRecipe;
import com.controllerface.cmdr_j.classes.recipes.ModulePurchaseRecipe;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialSubCostCategory;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalCategory;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationCategory;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisCategory;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisRecipe;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyCategory;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.enums.craftable.upgrades.UpgradeCategory;
import com.controllerface.cmdr_j.enums.craftable.upgrades.UpgradeRecipe;
import com.controllerface.cmdr_j.enums.engineer.EngineerAccessRecipe;
import com.controllerface.cmdr_j.enums.engineer.EngineerAccessBlueprint;
import com.controllerface.cmdr_j.enums.engineers.KnownEngineer;
import com.controllerface.cmdr_j.enums.equipment.modules.ModulePurchaseType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;
import com.controllerface.cmdr_j.utilities.JSONSupport;

import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskCatalog
{
    public final Map<String, TaskRecipe> keyMap = new HashMap<>();
    public final Map<String, TaskType> typeMap = new HashMap<>();
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






    public GameState.TaskData determineModuleTaskData(ModulePurchaseRecipe taskRecipe)
    {
        var baseName = taskRecipe.product.cost.getLocalizedName();

        var size = ((OwnableModule) taskRecipe.product.cost).itemEffects()
            .effectByName(ItemEffect.Size)
            .map(d->d.doubleValue)
            .map(Double::intValue)
            .orElse(-1);

        var grade = ((OwnableModule) taskRecipe.product.cost).itemEffects()
            .effectByName(ItemEffect.Class)
            .map(d->d.stringValue)
            .orElse("");

        var mount = ((OwnableModule) taskRecipe.product.cost).itemEffects()
            .effectByName(ItemEffect.WeaponMode)
            .map(d->d.stringValue)
            .orElse("");

        var isArmour = baseName.endsWith("Armour");

        var sortRank = 0;
        var shipType = "";
        var name = baseName;

        if (isArmour)
        {
            if (baseName.contains("Lightweight"))
            {
                sortRank = 1;
                shipType = baseName.substring(0, baseName.indexOf("Lightweight") - 1);
            }
            else if (baseName.contains("Reinforced"))
            {
                sortRank = 2;
                shipType = baseName.substring(0, baseName.indexOf("Reinforced") - 1);
            }
            else if (baseName.contains("Military"))
            {
                sortRank = 3;
                shipType = baseName.substring(0, baseName.indexOf("Military") - 1);
            }
            else if (baseName.contains("Mirrored"))
            {
                sortRank = 4;
                shipType = baseName.substring(0, baseName.indexOf("Mirrored") - 1);
            }
            else if (baseName.contains("Reactive"))
            {
                sortRank = 5;
                shipType = baseName.substring(0, baseName.indexOf("Reactive") - 1);
            }
        }
        else
        {
            var gradeEffect = 0;
            switch (grade.toUpperCase())
            {
                case "A":
                    gradeEffect = 5;
                    break;

                case "B":
                    gradeEffect = 4;
                    break;

                case "C":
                    gradeEffect = 3;
                    break;

                case "D":
                    gradeEffect = 2;
                    break;

                case "E":
                    gradeEffect = 1;
                    break;
            }

            if (name.toLowerCase().contains("enhanced performance thrusters"))
            {
                gradeEffect += 1;
            }

            sortRank = (size * 10) + gradeEffect;

            name = size + grade + " " + baseName;
            if (!mount.isEmpty())
            {
                name += " [" + mount + "]";
            }
        }

        name = "Purchase - " + name;

        var costs = new ArrayList<Map<String, Object>>();
        var costMap = new HashMap<String, Object>();

        costMap.put("amount", NumberFormat
            .getNumberInstance(Locale.getDefault())
            .format(taskRecipe.price.quantity));

        costMap.put("unit", "Credits");
        costs.add(costMap);

        var effects = ((OwnableModule) taskRecipe.product.cost).itemEffects()
            .effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();
                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", effect.getValueString());
                effectMap.put("unit", effect.effect.unit);
                return effectMap;
            }).collect(Collectors.toList());

        return new GameState.TaskData(name, shipType, sortRank, effects, costs);
    }

    public GameState.TaskData determineSynthesisTaskData(SynthesisRecipe synthesisRecipe)
    {
        var costs = synthesisRecipe.costStream()
            .filter(costData -> costData.quantity > 0)
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                costMap.put("grade", costData.cost.getGrade().name());
                return costMap;
            }).collect(Collectors.toList());

        var effects = synthesisRecipe.effects().effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();
                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", effect.getValueString());
                effectMap.put("unit", effect.effect.unit);
                effectMap.put("impact", "positive");
                return effectMap;
            }).collect(Collectors.toList());

        var name = "Synthesize - " + synthesisRecipe.getDisplayLabel();
        var rank = 0;
        if (name.contains("Basic"))
        {
            rank = 1;
        }
        else if (name.contains("Standard"))
        {
            rank = 2;
        }
        else if (name.contains("Premium"))
        {
            rank = 3;
        }
        return new GameState.TaskData(name, rank, effects, costs);
    }

    public GameState.TaskData determineUpgradeTaskData(UpgradeRecipe upgradeRecipe)
    {
        var costs = upgradeRecipe.costStream()
            .filter(costData -> costData.quantity > 0)
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                costMap.put("grade", costData.cost.getGrade().name());
                return costMap;
            }).collect(Collectors.toList());

        var effects = upgradeRecipe.effects().effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();
                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", effect.getValueString());
                effectMap.put("unit", effect.effect.unit);
                effectMap.put("impact", "positive");
                return effectMap;
            }).collect(Collectors.toList());

        var name = "Upgrade - " + upgradeRecipe.getDisplayLabel();
        var rank = 0;

        if (name.contains("Grade 2"))
        {
            rank = 2;
        }
        else if (name.contains("Grade 3"))
        {
            rank = 3;
        }
        else if (name.contains("Grade 4"))
        {
            rank = 4;
        }
        else if (name.contains("Grade 5"))
        {
            rank = 5;
        }
        return new GameState.TaskData(name, rank, effects, costs);
    }

    public GameState.TaskData determineModificationTaskData(ModificationRecipe modificationRecipe, String taskKey)
    {
        boolean micro = modificationRecipe.getGrade() == ItemGrade.MicroMaterial;

        var prefix = typePrefixes.get(taskKey);
        String name;

        if (micro)
        {
            var cat = modificationRecipe.getParentBlueprint()
                .getParentType()
                .getParentCategory();
            name = cat + " - "
                + prefix
                + " - " + modificationRecipe.getParentBlueprint();
        }
        else
        {
            name = prefix
            + " - " + modificationRecipe.getParentBlueprint()
            + " - " + modificationRecipe.getShortLabel();
        }

        var sortRank = 0;
        var enumName = modificationRecipe.getName();
        var token = enumName.lastIndexOf("_");
        var grade = enumName.substring(token + 1);

        try
        {
            sortRank = Integer.parseInt(grade);
        }
        catch (NumberFormatException nfe)
        {
            sortRank = 0;
        }

        var costs = modificationRecipe.costStream()
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                return costMap;
            }).collect(Collectors.toList());

        var effects = modificationRecipe.effects()
            .effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();
                var value = effect.getDoubleValue();
                var valueSign = (value > 0) ? "+": "";
                var valueString = valueSign + value;
                var impact = effect.effect.moreIsGood
                    ? value > 0
                    ? "positive"
                    : "negative"
                    : value > 0
                        ? "negative"
                        : "positive";

                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", valueString);
                effectMap.put("unit", effect.effect.unit);
                effectMap.put("impact", impact);
                return effectMap;
            }).collect(Collectors.toList());

        var type = typeMap.get(taskKey);

        var supportedEngineers = micro
            ? KnownEngineer.findSupportedEngineers(modificationRecipe)
            : KnownEngineer.findSupportedEngineers(type, modificationRecipe.getGrade());

        var engineers = supportedEngineers.stream()
            .map(e->
            {
                Map<String, Object> engineerMap = new HashMap<>();

                engineerMap.put("name", e.getFullName());
                engineerMap.put("system", e.getLocation().systemName);
                engineerMap.put("location", e.getFacility());

                // todo: reconcile this
//                if (starSystem != null)
//                {
//                    var distance = starSystem.distanceBetween(e.getLocation());
//                    engineerMap.put("distance", distance);
//                }
                //engineerMap.put("distance", 0);
                return engineerMap;
            })
            .collect(Collectors.toList());
        return new GameState.TaskData(name, sortRank, effects, costs, engineers);
    }

    public GameState.TaskData determineExperimentalTaskData(ExperimentalRecipe experimentalRecipe, String taskKey)
    {
        var prefix = typePrefixes.get(taskKey);

        var name = prefix + " - " + experimentalRecipe.getDisplayLabel();

        var costs = experimentalRecipe.costStream()
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                return costMap;
            }).collect(Collectors.toList());

        var effects = experimentalRecipe.effects()
            .effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();

                String valueString;
                String impact;
                if (effect.isNumerical())
                {
                    var value = effect.getDoubleValue();
                    var valueSign = (value > 0)
                        ? "+"
                        : "";

                    valueString = valueSign + value;
                    impact = effect.effect.moreIsGood
                        ? value > 0
                        ? "positive"
                        : "negative"
                        : value > 0
                            ? "negative"
                            : "positive";
                }
                else
                {
                    valueString = effect.stringValue;
                    impact = "positive";
                }

                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", valueString);
                effectMap.put("unit", effect.effect.unit);
                effectMap.put("impact", impact);
                return effectMap;
            }).collect(Collectors.toList());

        var type = typeMap.get(taskKey);
        var engineers = KnownEngineer.findSupportedEngineers(type, experimentalRecipe.getGrade()).stream()
            .map(e->
            {
                Map<String, Object> engineerMap = new HashMap<>();
                engineerMap.put("name", e.getFullName());
                engineerMap.put("system", e.getLocation().systemName);
                engineerMap.put("location", e.getFacility());

                // todo: reconcile this
//                if (starSystem != null)
//                {
//                    var distance = starSystem.distanceBetween(e.getLocation());
//                    engineerMap.put("distance", distance);
//                }

                //engineerMap.put("distance", 0);
                return engineerMap;
            })
            .collect(Collectors.toList());

        return new GameState.TaskData(name, 0, effects, costs, engineers);
    }

    public GameState.TaskData determineTechBrokerTaskData(TechnologyRecipe technologyRecipe)
    {
        var name = "Unlock " + technologyRecipe.getShortLabel();

        var costs = technologyRecipe.costStream()
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                return costMap;
            }).collect(Collectors.toList());

        var effects = Stream.of(technologyRecipe.getModules())
            .map(module ->
            {
                var size = module.itemEffects()
                    .effectByName(ItemEffect.Size)
                    .map(d->d.doubleValue)
                    .map(Double::intValue)
                    .orElse(-1);

                var grade = module.itemEffects()
                    .effectByName(ItemEffect.Class)
                    .map(d->d.stringValue)
                    .orElse("");

                Map<String, Object> effectMap = new HashMap<>();
                var effect = size + grade + " " + module.displayText();
                effectMap.put("effect", effect);
                effectMap.put("value", "unlock");
                effectMap.put("unit", "");
                effectMap.put("impact", "positive");
                return effectMap;
            }).collect(Collectors.toList());

        var rank = 0;
        if (technologyRecipe.getModules().length == 1)
        {
            var module = technologyRecipe.getModules()[0];
            var size = module.itemEffects()
                .effectByName(ItemEffect.Size)
                .map(d->d.doubleValue)
                .map(Double::intValue)
                .orElse(0);

            var grade = module.itemEffects()
                .effectByName(ItemEffect.Class)
                .map(d->d.stringValue)
                .orElse("");

            var gradeEffect = 0;
            switch (grade.toUpperCase())
            {
                case "A":
                    gradeEffect = 5;
                    break;

                case "B":
                    gradeEffect = 4;
                    break;

                case "C":
                    gradeEffect = 3;
                    break;

                case "D":
                    gradeEffect = 2;
                    break;

                case "E":
                    gradeEffect = 1;
                    break;
            }

            rank = (size * 10) + gradeEffect;
        }

        return new GameState.TaskData(name, rank, effects, costs);
    }

    public GameState.TaskData determineTradeTaskData(MaterialTradeRecipe tradeRecipe)
    {
        var qty = new AtomicLong(0);
        var priceType = new AtomicReference<MaterialSubCostCategory>(null);
        var yieldType = new AtomicReference<MaterialSubCostCategory>(null);
        var costs = tradeRecipe.costStream()
            .filter(costData -> costData.quantity > 0)
            .map(costData ->
            {
                MaterialSubCostCategory.findMatchingSubCategory(costData.cost)
                    .ifPresent(priceType::set);

                Map<String, Object> costMap = new HashMap<>();
                qty.set(costData.quantity);
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                costMap.put("grade", costData.cost.getGrade().name());
                return costMap;
            }).collect(Collectors.toList());

        var effects = tradeRecipe.costStream()
            .filter(costData -> costData.quantity < 0)
            .map(costData ->
            {
                MaterialSubCostCategory.findMatchingSubCategory(costData.cost)
                    .ifPresent(yieldType::set);

                var abs = Math.abs(costData.quantity);
                var impact = qty.get() < abs
                    ? "positive"
                    : "negative";

                Map<String, Object> effectMap = new HashMap<>();
                effectMap.put("effect", costData.cost.getLocalizedName());
                effectMap.put("value", "acquire");
                effectMap.put("unit", abs);
                effectMap.put("impact", impact);
                effectMap.put("grade", costData.cost.getGrade().name());
                return effectMap;
            }).collect(Collectors.toList());

        var rank = qty.intValue();
        if (!Objects.equals(priceType.get(), yieldType.get()))
        {
            rank += 100;
        }

        return new GameState.TaskData(tradeRecipe.getDisplayLabel(), rank, effects, costs);
    }

    public GameState.TaskData determineEngineerTaskData(EngineerAccessRecipe engineerRecipe)
    {
        var costs = engineerRecipe.costStream()
            .filter(costData -> costData.quantity > 0)
            .map(costData ->
            {
                Map<String, Object> costMap = new HashMap<>();
                costMap.put("amount", costData.quantity);
                costMap.put("unit", costData.cost.getLocalizedName());
                costMap.put("grade", costData.cost.getGrade().name());
                return costMap;
            }).collect(Collectors.toList());

        var effects = engineerRecipe.effects().effectStream()
            .map(effect ->
            {
                Map<String, Object> effectMap = new HashMap<>();
                effectMap.put("effect", effect.effect.toString());
                effectMap.put("value", effect.getValueString());
                effectMap.put("unit", effect.effect.unit);
                effectMap.put("impact", "positive");
                return effectMap;
            }).collect(Collectors.toList());

        var name = engineerRecipe.getDisplayLabel();

        var s = engineerRecipe.effects().effectStream()
            .filter(e->e.effect == ItemEffect.engineer_referral)
            .findFirst().map(x -> " :: " + x.stringValue)
            .orElse("");

        name += s;
        var rank = 0;
//        if (name.contains("Basic"))
//        {
//            rank = 1;
//        }
//        else if (name.contains("Standard"))
//        {
//            rank = 2;
//        }
//        else if (name.contains("Premium"))
//        {
//            rank = 3;
//        }
        return new GameState.TaskData(name, rank, effects, costs);
    }

    public GameState.TaskData determineTaskData(TaskRecipe recipe, String taskKey)
    {
        if (recipe instanceof ModulePurchaseRecipe)
        {
            return determineModuleTaskData(((ModulePurchaseRecipe) recipe));
        }
        if (recipe instanceof ModificationRecipe)
        {
            return determineModificationTaskData(((ModificationRecipe) recipe), taskKey);
        }
        if (recipe instanceof ExperimentalRecipe)
        {
            return determineExperimentalTaskData(((ExperimentalRecipe) recipe), taskKey);
        }
        if (recipe instanceof TechnologyRecipe)
        {
            return determineTechBrokerTaskData(((TechnologyRecipe) recipe));
        }
        if (recipe instanceof MaterialTradeRecipe)
        {
            return determineTradeTaskData(((MaterialTradeRecipe) recipe));
        }
        if (recipe instanceof SynthesisRecipe)
        {
            return determineSynthesisTaskData(((SynthesisRecipe) recipe));
        }
        if (recipe instanceof UpgradeRecipe)
        {
            return determineUpgradeTaskData(((UpgradeRecipe) recipe));
        }
        if (recipe instanceof EngineerAccessRecipe)
        {
            return determineEngineerTaskData(((EngineerAccessRecipe) recipe));
        }
        return new GameState.TaskData(recipe.getDisplayLabel(), 0);
    }

    public String buildTaskCatalog()
    {
        var modules = new HashMap<String, Map<String, Object>>();
        var synthesis = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
        var upgrades = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
        var modifications = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
        var experimental = new HashMap<String, Map<String, Map<String, Object>>>();
        var technology = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
        var trades = new HashMap<String, Map<String, Map<String, Map<String, Object>>>>();
        var engineers = new HashMap<String, Map<String, Map<String, Object>>>();

        Map<String, Object> jsonMap  = new HashMap<>();
        jsonMap.put("modules", modules);
        jsonMap.put("synthesis", synthesis);
        jsonMap.put("upgrades", upgrades);
        jsonMap.put("modifications", modifications);
        jsonMap.put("experimental", experimental);
        jsonMap.put("technology", technology);
        jsonMap.put("trades", trades);
        jsonMap.put("engineers", engineers);

        // module purchases
        Stream.of(ModulePurchaseType.values()).forEach(modulePurchaseType ->
            modulePurchaseType.getBluePrints().forEach(taskBlueprint ->
            {
                Map<String, Object> currentBlueprint = modules
                    .computeIfAbsent(taskBlueprint.toString(), (_k) -> new HashMap<>());

                taskBlueprint.recipeStream().map(r -> ((ModulePurchaseRecipe) r)).forEach(taskRecipe ->
                {
                    //System.out.println(taskRecipe.getEnumName());
                    var key = "Purchase"
                        + ":" + taskBlueprint.toString()
                        + ":" + taskRecipe.getEnumName();

                    keyMap.put(key, taskRecipe);
                    untypedTaskMap.put(taskRecipe, key);

                    var taskData = determineModuleTaskData(taskRecipe);

                    var dataMap = new HashMap<String, Object>();
                    dataMap.put("key", key);
                    dataMap.put("name", taskData.name);
                    dataMap.put("sort", taskData.rank);
                    dataMap.put("costs", taskData.costs);
                    dataMap.put("effects", taskData.effects);

                    if (!taskData.ship.isEmpty())
                    {
                        dataMap.put("ship", taskData.ship);
                    }

                    currentBlueprint.put(taskRecipe.getEnumName(), dataMap);
                });
            }));

        // synthesis
        Stream.of(SynthesisCategory.values()).forEach(synthesisCategory ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = synthesis
                .computeIfAbsent(synthesisCategory.name(), (_k)-> new HashMap<>());

            synthesisCategory.typeStream().forEach(synthesisType ->
            {
                Map<String, Map<String, Object>> currentType = currentCategory
                    .computeIfAbsent(synthesisType.name(), (_k)-> new HashMap<>());

                synthesisType.blueprintStream().forEach(synthesisBlueprint ->
                {
                    Map<String, Object> currentBlueprint = currentType
                        .computeIfAbsent(synthesisBlueprint.name(), (_k)-> new HashMap<>());

                    synthesisBlueprint.recipeStream().forEach(synthesisRecipe ->
                    {
                        var key = synthesisCategory.name()
                            + ":" + synthesisType.name()
                            + ":" + synthesisBlueprint.name()
                            + ":" + synthesisRecipe.name();

                        keyMap.put(key, synthesisRecipe);
                        untypedTaskMap.put(synthesisRecipe, key);
                        var taskData = determineSynthesisTaskData(synthesisRecipe);

                        var dataMap = new HashMap<String, Object>();
                        dataMap.put("key", key);
                        dataMap.put("name", taskData.name);
                        dataMap.put("sort", taskData.rank);
                        dataMap.put("costs", taskData.costs);
                        dataMap.put("effects", taskData.effects);

                        currentBlueprint.put(synthesisRecipe.name(), dataMap);
                    });
                });
            });
        });

        // upgrades
        Stream.of(UpgradeCategory.values()).forEach(upgradeCategory ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = upgrades
                .computeIfAbsent(upgradeCategory.name(), (_k)-> new HashMap<>());

            upgradeCategory.typeStream().forEach(upgradeType ->
            {
                Map<String, Map<String, Object>> currentType = currentCategory
                    .computeIfAbsent(upgradeType.name(), (_k)-> new HashMap<>());

                upgradeType.blueprintStream().forEach(upgradeBlueprint ->
                {
                    Map<String, Object> currentBlueprint = currentType
                        .computeIfAbsent(upgradeBlueprint.name(), (_k)-> new HashMap<>());

                    upgradeBlueprint.recipeStream().forEach(upgradeRecipe ->
                    {
                        var key = upgradeCategory.name()
                            + ":" + upgradeType.name()
                            + ":" + upgradeBlueprint.name()
                            + ":" + upgradeRecipe.name();

                        keyMap.put(key, upgradeRecipe);
                        untypedTaskMap.put(upgradeRecipe, key);
                        var taskData = determineUpgradeTaskData(upgradeRecipe);

                        var dataMap = new HashMap<String, Object>();
                        dataMap.put("key", key);
                        dataMap.put("name", taskData.name);
                        dataMap.put("sort", taskData.rank);
                        dataMap.put("costs", taskData.costs);
                        dataMap.put("effects", taskData.effects);

                        currentBlueprint.put(upgradeRecipe.name(), dataMap);
                    });
                });
            });
        });

        // modifications
        Stream.of(ModificationCategory.values()).forEach(modificationCategory ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = modifications
                .computeIfAbsent(modificationCategory.name(), (_k)-> new HashMap<>());

            modificationCategory.typeStream().forEach(modificationType ->
            {
                Map<String, Map<String, Object>> currentType = currentCategory
                    .computeIfAbsent(modificationType.name(), (_k)-> new HashMap<>());

                modificationType.blueprintStream().forEach(modificationBlueprint ->
                {
                    Map<String, Object> currentBlueprint = currentType
                        .computeIfAbsent(modificationBlueprint.name(), (_k)-> new HashMap<>());

                    modificationBlueprint.recipeStream().map(r-> ((ModificationRecipe) r)).forEach(modificationRecipe ->
                    {
                        boolean micro = modificationRecipe.getGrade() == ItemGrade.MicroMaterial;
                        String key;

                        if (micro)
                        {
                            key = "Modification"
                                + ":" + modificationCategory.name()
                                + ":" + modificationType.getName()
                                + ":" + modificationBlueprint.name();
                        }
                        else
                        {
                            key = "Modification"
                            + ":" + modificationCategory.name()
                            + ":" + modificationType.getName()
                            + ":" + modificationBlueprint.name()
                            + ":" + modificationRecipe.getName();
                        }

                        keyMap.put(key, modificationRecipe);
                        typeMap.put(key, modificationType);
                        typedTaskMap.computeIfAbsent(modificationType, (_k) -> new HashMap<>())
                            .put(modificationRecipe, key);
                        typePrefixes.put(key, modificationType.toString());

                        var taskData = determineModificationTaskData(modificationRecipe, key);

                        var dataMap = new HashMap<String, Object>();
                        dataMap.put("key", key);
                        dataMap.put("name", taskData.name);
                        dataMap.put("sort", taskData.rank);
                        dataMap.put("costs", taskData.costs);
                        dataMap.put("effects", taskData.effects);

                        currentBlueprint.put(modificationRecipe.getName(), dataMap);
                    });
                });
            });
        });

        // experimental effects
        Stream.of(ExperimentalCategory.values()).forEach(experimentalCategory ->
        {
            Map<String, Map<String, Object>> currentCategory = experimental
                .computeIfAbsent(experimentalCategory.name(), (_k)-> new HashMap<>());

            experimentalCategory.typeStream().forEach(experimentalType ->
            {
                Map<String, Object> currentType = currentCategory
                    .computeIfAbsent(experimentalType.name(), (_k)-> new HashMap<>());

                experimentalType.blueprintStream().forEach(experimentalBlueprint ->
                    experimentalBlueprint.recipeStream().map(e-> ((ExperimentalRecipe) e))
                        .forEach(experimentalRecipe ->
                        {
                            var key = "Experimental"
                                + ":" + experimentalCategory.name()
                                + ":" + experimentalType.getName()
                                + ":" + experimentalRecipe.getName();

                            keyMap.put(key, experimentalRecipe);
                            typeMap.put(key, experimentalType);

                            typedTaskMap.computeIfAbsent(experimentalType, (_k) -> new HashMap<>())
                                .put(experimentalRecipe, key);
                            typePrefixes.put(key, experimentalType.toString());

                            var taskData = determineExperimentalTaskData(experimentalRecipe, key);

                            var dataMap = new HashMap<String, Object>();
                            dataMap.put("key", key);
                            dataMap.put("name", taskData.name);
                            dataMap.put("sort", taskData.rank);
                            dataMap.put("costs", taskData.costs);
                            dataMap.put("effects", taskData.effects);

                            currentType.put(experimentalRecipe.getName(), dataMap);
                        }));
            });
        });

        // technology unlocks
        Stream.of(TechnologyCategory.values()).forEach(technologyCategory ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = technology
                .computeIfAbsent(technologyCategory.name(), (_k)-> new HashMap<>());

            technologyCategory.typeStream().forEach(technologyType ->
            {
                Map<String, Map<String, Object>> currentType = currentCategory
                    .computeIfAbsent(technologyType.name(), (_k)-> new HashMap<>());

                technologyType.blueprintStream().forEach(technologyBlueprint ->
                {
                    Map<String, Object> currentBlueprint = currentType
                        .computeIfAbsent(technologyBlueprint.name(), (_k)-> new HashMap<>());

                    technologyBlueprint.recipeStream().forEach(technologyRecipe ->
                    {
                        var key = "Unlock"
                            + ":" + technologyCategory.name()
                            + ":" + technologyType.getName()
                            + ":" + technologyBlueprint.name()
                            + ":" + technologyRecipe.getName();

                        keyMap.put(key, technologyRecipe);
                        untypedTaskMap.put(technologyRecipe, key);

                        var taskData = determineTechBrokerTaskData(technologyRecipe);

                        var dataMap = new HashMap<String, Object>();
                        dataMap.put("key", key);
                        dataMap.put("name", taskData.name);
                        dataMap.put("sort", taskData.rank);
                        dataMap.put("costs", taskData.costs);
                        dataMap.put("effects", taskData.effects);
                        currentBlueprint.put(technologyRecipe.getName(), dataMap);
                    });
                });
            });
        });

        // engineer access
        Stream.of(EngineerAccessBlueprint.values())
            .forEach(engineerProgressRecipe ->
            {
                Map<String, Map<String, Object>> currentCategory = engineers
                    .computeIfAbsent(engineerProgressRecipe.name(), (_k)-> new HashMap<>());

                engineerProgressRecipe.recipeStream().forEach(unlockRecipe ->
                {
                    Map<String, Object> currentRecipe = currentCategory
                        .computeIfAbsent(engineerProgressRecipe.name(), (_k)-> new HashMap<>());

                    var key = engineerProgressRecipe.name()
                        + ":" + unlockRecipe.name();

                    keyMap.put(key, unlockRecipe);
                    untypedTaskMap.put(unlockRecipe, key);
                    var taskData = determineEngineerTaskData(unlockRecipe);

                    var dataMap = new HashMap<String, Object>();
                    dataMap.put("key", key);
                    dataMap.put("name", taskData.name);
                    dataMap.put("sort", taskData.rank);
                    dataMap.put("costs", taskData.costs);
                    dataMap.put("effects", taskData.effects);

                    currentRecipe.put(unlockRecipe.name(), dataMap);
                });
            });

        // trades
        Stream.of(MaterialTradeType.values()).forEach(materialTradeType ->
        {
            Map<String, Map<String, Map<String, Object>>> currentCategory = trades
                .computeIfAbsent(materialTradeType.name(), (_k)-> new HashMap<>());

            materialTradeType.subCategoryStream().forEach(materialSubCostCategory ->
            {
                Map<String, Map<String, Object>> currentSubType = currentCategory
                    .computeIfAbsent(materialSubCostCategory.name(), (_k)-> new HashMap<>());

                materialSubCostCategory.materials().forEach(material ->
                    material.getTradeBlueprint().ifPresent(materialTradeBlueprint ->
                    {
                        Map<String, Object> currentBlueprint = currentSubType
                            .computeIfAbsent(materialTradeBlueprint.toString(), (_k)-> new HashMap<>());

//                        System.out.println(((MaterialTradeBlueprint) materialTradeBlueprint)
//                            .material.getGrade().getNumericalValue());

//                        currentBlueprint.put("grade", ((MaterialTradeBlueprint) materialTradeBlueprint)
//                            .material.getGrade().getNumericalValue());

                        materialTradeBlueprint.recipeStream().map(r-> ((MaterialTradeRecipe) r))
                            .forEach(materialTradeRecipe ->
                            {
                                var key = "Trade"
                                    + ":" + materialTradeType.getName()
                                    + ":" + materialSubCostCategory.name()
                                    + ":" + materialTradeBlueprint.toString()
                                    + ":" + materialTradeRecipe.getName();

                                keyMap.put(key, materialTradeRecipe);
                                untypedTaskMap.put(materialTradeRecipe, key);

                                var taskData = determineTradeTaskData(materialTradeRecipe);

                                var dataMap = new HashMap<String, Object>();
                                dataMap.put("key", key);
                                dataMap.put("name", taskData.name);
                                dataMap.put("sort", taskData.rank);
                                dataMap.put("costs", taskData.costs);
                                dataMap.put("effects", taskData.effects);
                                currentBlueprint.put(materialTradeRecipe.getName(), dataMap);
                            });
                    }));
            });
        });

        return JSONSupport.Write.jsonToString.apply(jsonMap);
    }





}
