package com.controllerface.edeps.structures.costs.commodities;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/11/2018.
 */
public enum CommodityType
{
    COMMODITY(CommodityCategory.Chemicals,
            CommodityCategory.Consumer_Items,
            CommodityCategory.Legal_Drugs,
            CommodityCategory.Foods,
            CommodityCategory.Industrial_Materials,
            CommodityCategory.Machinery,
            CommodityCategory.Medicines,
            CommodityCategory.Metals,
            CommodityCategory.Minerals,
            CommodityCategory.Salvage,
            CommodityCategory.Slaves,
            CommodityCategory.Technology,
            CommodityCategory.Textiles,
            CommodityCategory.Waste,
            CommodityCategory.Weapons,
            CommodityCategory.Drones),

    FACTION(CommodityCategory.Power_Play),

    UNKNOWN();

    private final CommodityCategory[] categories;

    CommodityType(CommodityCategory ... categories)
    {
        this.categories = categories;
    }

    public Stream<CommodityCategory> categories()
    {
        return Arrays.stream(categories);
    }

    public static CommodityType findMatchingType(Commodity commodity)
    {
        return Arrays.stream(values())
                .filter(type -> type.categories()
                        .anyMatch(category -> category.hasCommodity(commodity)))
                .findFirst().orElse(UNKNOWN);
    }

}
