package com.controllerface.cmdr_j.enums.costs.commodities;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum CommodityType
{
    COMMODITY(EnumSet.of(CommodityCostCategory.Chemicals,
            CommodityCostCategory.Consumer_Items,
            CommodityCostCategory.Legal_Drugs,
            CommodityCostCategory.Foods,
            CommodityCostCategory.Industrial_Materials,
            CommodityCostCategory.Machinery,
            CommodityCostCategory.Medicines,
            CommodityCostCategory.Metals,
            CommodityCostCategory.Minerals,
            CommodityCostCategory.Salvage,
            CommodityCostCategory.Slaves,
            CommodityCostCategory.Technology,
            CommodityCostCategory.Textiles,
            CommodityCostCategory.Waste,
            CommodityCostCategory.Weapons,
            CommodityCostCategory.Drones)),

    FACTION(EnumSet.of(CommodityCostCategory.Power_Play)),

    ;

    private final EnumSet<CommodityCostCategory> categories;

    CommodityType(EnumSet<CommodityCostCategory> categories)
    {
        this.categories = categories;
    }

    public Stream<CommodityCostCategory> categories()
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
