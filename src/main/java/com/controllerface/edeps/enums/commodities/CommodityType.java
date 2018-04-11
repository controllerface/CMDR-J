package com.controllerface.edeps.enums.commodities;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Stephen on 4/11/2018.
 */
public enum CommodityType
{
    Common(CommodityCategory.CHEMICALS,
            CommodityCategory.CONSUMER_ITEMS,
            CommodityCategory.LEGAL_DRUGS,
            CommodityCategory.FOODS,
            CommodityCategory.INDUSTRIAL_MATERIALS,
            CommodityCategory.MACHINERY,
            CommodityCategory.MEDICINES,
            CommodityCategory.METALS,
            CommodityCategory.MINERALS,
            CommodityCategory.SALVAGE,
            CommodityCategory.SLAVES,
            CommodityCategory.TECHNOLOGY,
            CommodityCategory.TEXTILES,
            CommodityCategory.WASTE,
            CommodityCategory.WEAPONS,
            CommodityCategory.DRONES),

    Rare(CommodityCategory.RARES),

    Powerplay(CommodityCategory.POWERPLAY);

    private final CommodityCategory[] categories;

    CommodityType(CommodityCategory ... categories)
    {
        this.categories = categories;
    }
}
