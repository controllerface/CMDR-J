package com.controllerface.edeps.structures.costs.commodities;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum CommodityType
{
    COMMODITY(EnumSet.of(CommodityCategory.Chemicals,
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
            CommodityCategory.Drones)),

    FACTION(EnumSet.of(CommodityCategory.Power_Play)),

    ;

    private final EnumSet<CommodityCategory> categories;

    CommodityType(EnumSet<CommodityCategory> categories)
    {
        this.categories = categories;
    }

    public Stream<CommodityCategory> categories()
    {
        return categories.stream();
    }

    public static Optional<CommodityType> findMatchingType(Commodity commodity)
    {
        return Arrays.stream(values())
                .filter(type -> type.categories().anyMatch(category -> category.hasCommodity(commodity)))
                .findFirst();
    }

}
