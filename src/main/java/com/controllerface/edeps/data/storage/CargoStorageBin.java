package com.controllerface.edeps.data.storage;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.enums.costs.commodities.Commodity;
import com.controllerface.edeps.enums.costs.commodities.CommodityCategory;
import com.controllerface.edeps.enums.costs.commodities.CommodityType;

import java.util.Arrays;

/**
 * Storage bin object for Raw crafting materials
 *
 * Created by Stephen on 3/21/2018.
 */
public class CargoStorageBin extends InventoryStorageBin
{
    @Override
    public boolean check(ProcurementCost material)
    {
        // todo: maybe also check the contiutanet types, just in case
        return material instanceof Commodity;
    }

    @Override
    public void init()
    {
        Arrays.stream(CommodityType.values())
                .flatMap(CommodityType::categories)
                .flatMap(CommodityCategory::commodities)
                .forEach(commodity -> addItem(commodity, 0));
    }
}
