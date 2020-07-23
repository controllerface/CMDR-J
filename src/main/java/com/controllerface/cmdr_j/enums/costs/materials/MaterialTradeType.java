package com.controllerface.cmdr_j.enums.costs.materials;

import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.classes.tasks.TaskType;
import javafx.util.Pair;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public enum MaterialTradeType implements TaskType
{

    Raw_Elements(EnumSet.of(MaterialSubCostCategory.Raw_Elements_1,
            MaterialSubCostCategory.Raw_Elements_2,
            MaterialSubCostCategory.Raw_Elements_3,
            MaterialSubCostCategory.Raw_Elements_4,
            MaterialSubCostCategory.Raw_Elements_5,
            MaterialSubCostCategory.Raw_Elements_6,
            MaterialSubCostCategory.Raw_Elements_7)),

    Manufactured_Materials(EnumSet.of(MaterialSubCostCategory.Alloys,
            MaterialSubCostCategory.Capacitors,
            MaterialSubCostCategory.Chemical,
            MaterialSubCostCategory.Composite,
            MaterialSubCostCategory.Conductive,
            MaterialSubCostCategory.Crystals,
            MaterialSubCostCategory.Heat,
            MaterialSubCostCategory.Mechanical_Components,
            MaterialSubCostCategory.Shielding,
            MaterialSubCostCategory.Thermic)),

    Encoded_Data(EnumSet.of(MaterialSubCostCategory.Data_Archives,
            MaterialSubCostCategory.Emission_Data,
            MaterialSubCostCategory.Encoded_Firmware,
            MaterialSubCostCategory.Encryption_Files,
            MaterialSubCostCategory.Shield_Data,
            MaterialSubCostCategory.Wake_Scans)),

    ;

    private static final double downgradeMultiplier = 3;
    private static final double upgradeMultiplier = 6;
    private final EnumSet<MaterialSubCostCategory> subCategories;

    MaterialTradeType(EnumSet<MaterialSubCostCategory> subCategories)
    {
        this.subCategories = subCategories;
        calculateSubCategoryTradeCosts(subCategories);
    }

    public static Optional<MaterialTradeType> findMatchingTradeType(Material material)
    {
        Objects.requireNonNull(material);

        return Stream.of(values())
                .filter(tradeType -> tradeType.subCategoryStream()
                        .anyMatch(subCategory -> subCategory.hasMaterial(material)))
                .findFirst();
    }

    private static void calculateSubCategoryTradeCosts(EnumSet<MaterialSubCostCategory> subCategories)
    {
        // loop through all the sub-categories and calculate trade costs for all cross-sub-category trades.
        // Note that trades made within the same category do not need to be calculated here because they are done
        // within the subcategories themselves upon creation.
        subCategories.stream()
                .peek(MaterialTradeType::calculateInCategoryTradeCosts)
                .forEach(subCategory ->subCategories.stream()
                        .filter(otherSubCategory -> otherSubCategory != subCategory)
                        .forEach(otherSubCategory -> calculateCrossCategoryTradeCosts(subCategory, otherSubCategory)));
    }

    private static void calculateInCategoryTradeCosts(MaterialSubCostCategory subCategory)
    {
        // for each of the materials in this sub-category, we need to calculate the trade costs required to
        // trade some number of one material, for some number of another.
        subCategory.materials().forEach(material ->
        {
            // now for all related materials (and filtering out THIS material which is unneeded for trades)
            // use the related material's grade to calculate how much it costs to trade for this one, and
            // how many of this material trading the related material will yield.
            subCategory.materials()
                    .filter(relatedMaterial -> relatedMaterial != material)
                    .forEach(relatedMaterial -> calculateMaterialTradeCost(0, material, relatedMaterial));
        });
    }

    private static void calculateCrossCategoryTradeCosts(MaterialSubCostCategory costs, MaterialSubCostCategory products)
    {
        Stream.of(products)
                .flatMap(MaterialSubCostCategory::materials)
                .forEach(product -> Stream.of(costs)
                        .flatMap(MaterialSubCostCategory::materials)
                        .forEach(cost -> calculateMaterialTradeCost(1, product, cost)));
    }

    private static void calculateMaterialTradeCost(int penalty, Material material, Material relatedMaterial)
    {
        int thisGrade = material.getGrade().getNumericalValue();

        // get the numerical value of the trade candidate's grade, and compare it with this
        // material's grade to determine the cost to convert between the two
        int thatGrade = relatedMaterial.getGrade().getNumericalValue();
        Pair<Integer, Integer> tradeValues = calculateTreadCost(penalty, thatGrade, thisGrade);

        // the the trade amount required would exceed the maximum storage capacity of the item,
        // there's no point in adding it as a trade cost because it can never be attained
        if (tradeValues.getKey() > relatedMaterial.getGrade().getMaximumQuantity()) return;

        material.addTradeCost(new CostData(relatedMaterial, tradeValues.getKey()), tradeValues.getValue());
    }


    private static Pair<Integer, Integer> calculateTreadCost(int penalty, int from, int to)
    {
        int tradeCost;
        int tradeYield;
        if (from > to)
        {
            tradeCost = 1 + penalty;
            int gradeDiff = from - to - penalty;
            tradeYield = (int) Math.pow(downgradeMultiplier, gradeDiff);
        }
        else
        {
            tradeYield = 1;
            int gradeDiff = to - from + penalty;
            tradeCost = (int) Math.pow(upgradeMultiplier, gradeDiff);
        }
        return new Pair<>(tradeCost, tradeYield);
    }

    public Stream<MaterialSubCostCategory> subCategoryStream()
    {
        return subCategories.stream();
    }

    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public List<TaskBlueprint> getBluePrints()
    {
        return Collections.emptyList();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
