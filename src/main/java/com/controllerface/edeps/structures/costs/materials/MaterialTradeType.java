package com.controllerface.edeps.structures.costs.materials;

import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.data.procurements.CostData;
import javafx.util.Pair;

import java.util.stream.Stream;

/**
 * Created by Stephen on 5/19/2018.
 */
public enum MaterialTradeType implements ProcurementType
{

    Raw_Elements(MaterialSubCategory.Raw_Elements_1,
            MaterialSubCategory.Raw_Elements_2,
            MaterialSubCategory.Raw_Elements_3,
            MaterialSubCategory.Raw_Elements_4,
            MaterialSubCategory.Raw_Elements_5,
            MaterialSubCategory.Raw_Elements_6,
            MaterialSubCategory.Raw_Elements_7),

    Manufactured_Materials(MaterialSubCategory.Alloys,
            MaterialSubCategory.Capacitors,
            MaterialSubCategory.Chemical,
            MaterialSubCategory.Composite,
            MaterialSubCategory.Conductive,
            MaterialSubCategory.Crystals,
            MaterialSubCategory.Heat,
            MaterialSubCategory.Mechanical_Components,
            MaterialSubCategory.Shielding,
            MaterialSubCategory.Thermic),

    Encoded_Data(MaterialSubCategory.Data_Archives,
            MaterialSubCategory.Emission_Data,
            MaterialSubCategory.Encoded_Firmware,
            MaterialSubCategory.Encryption_Files,
            MaterialSubCategory.Shield_Data,
            MaterialSubCategory.Wake_Scans),

    ;

    private static final double downgradeMultiplier = 3;
    private static final double upgradeMultiplier = 6;
    private final MaterialSubCategory[] subCategories;


    MaterialTradeType(MaterialSubCategory ... subCategories)
    {
        this.subCategories = subCategories;
        calculateSubCategoryTradeCosts(subCategories);
    }

    private static void calculateSubCategoryTradeCosts(MaterialSubCategory ... subCategories)
    {
        // loop through all the sub-categories and calculate trade costs for all cross-sub-category trades.
        // Note that trades made within the same category do not need to be calculated here because they are done
        // within the subcategories themselves upon creation.
        Stream.of(subCategories)
                .peek(MaterialTradeType::calculateInCategoryTradeCosts)
                .forEach(subCategory -> Stream.of(subCategories)
                        .filter(otherSubCategory -> otherSubCategory != subCategory)
                        .forEach(otherSubCategory -> calculateCrossCategoryTradeCosts(subCategory, otherSubCategory)));
    }



    private static void calculateInCategoryTradeCosts(MaterialSubCategory subCategory)
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



    private static void calculateCrossCategoryTradeCosts(MaterialSubCategory costs, MaterialSubCategory products)
    {
        Stream.of(products)
                .flatMap(MaterialSubCategory::materials)
                .forEach(product -> Stream.of(costs)
                        .flatMap(MaterialSubCategory::materials)
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

    public Stream<MaterialSubCategory> subCategoryStream()
    {
        return Stream.of(subCategories);
    }

    @Override
    public String getName()
    {
        return name();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
