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

    Raw(MaterialSubCategory.Raw_Elements_1,
            MaterialSubCategory.Raw_Elements_2,
            MaterialSubCategory.Raw_Elements_3,
            MaterialSubCategory.Raw_Elements_4,
            MaterialSubCategory.Raw_Elements_5,
            MaterialSubCategory.Raw_Elements_6,
            MaterialSubCategory.Raw_Elements_7),

    Manufactured(MaterialSubCategory.Alloys,
            MaterialSubCategory.Capacitors,
            MaterialSubCategory.Chemical,
            MaterialSubCategory.Composite,
            MaterialSubCategory.Conductive,
            MaterialSubCategory.Crystals,
            MaterialSubCategory.Heat,
            MaterialSubCategory.Mechanical_Components,
            MaterialSubCategory.Shielding,
            MaterialSubCategory.Thermic),

    Encoded(MaterialSubCategory.Data_Archives,
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
    }


    private static void calculateCrossTradeCosts(MaterialSubCategory ... subCategories)
    {
        // todo: go through them
    }



    private static void calculateTradeCosts(Material ... materials)
    {
        // for each of the materials in this sub-category, we need to calculate the trade costs required to
        // trade some number of one material, for some number of another.
        Stream.of(materials).forEach(material ->
        {
            // get the numerical value of this material's grade
            int thisGrade = material.getGrade().getNumericalValue();

            // now for all related materials (and filtering out THIS material which is unneeded for trades)
            // use the related material's grade to calculate how much it costs to trade for this one, and
            // how many of this material trading the related material will yield.
            Stream.of(materials)
                    .filter(relatedMaterial -> relatedMaterial != material)
                    .forEach(relatedMaterial ->
                    {
                        // get the numerical value of the trade candidate's grade, and compare it with this
                        // material's grade to determine the cost to convert between the two
                        int thatGrade = relatedMaterial.getGrade().getNumericalValue();
                        Pair<Integer, Integer> tradeValues = calculateTreadCost(thatGrade, thisGrade);

                        // the the trade amount required would exceed the maximum storage capacity of the item,
                        // there's no point in adding it as a trade cost because it can never be attained
                        if (tradeValues.getKey() > relatedMaterial.getGrade().getMaximumQuantity()) return;

                        material.addTradeCost(new CostData(relatedMaterial, tradeValues.getKey()), tradeValues.getValue());
                    });
        });
    }

    private static Pair<Integer, Integer> calculateTreadCost(int from, int to)
    {
        int tradeCost;
        int tradeYield;
        if (from > to)
        {
            tradeCost = 2;
            int gradeDiff = from - to - 1;
            tradeYield = (int) Math.pow(downgradeMultiplier, gradeDiff);
        }
        else
        {
            tradeYield = 1;
            int gradeDiff = to - from + 1;
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
}
