package com.controllerface.cmdr_j.data.commander;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.data.procurements.ProcurementTask;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;
import com.controllerface.cmdr_j.structures.costs.commodities.CommodityCostCategory;
import com.controllerface.cmdr_j.structures.costs.commodities.CommodityType;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Storage bin object for cargo items such as standard commodities, rare items, limpets, and power play objects
 *
 * NOTE: Mutable state data object
 *
 * Created by Controllerface on 3/21/2018.
 */
class CargoStorageBin extends InventoryStorageBin
{
    CargoStorageBin(Function<ProcurementCost, Integer> pendingTradeCost,
                    Consumer<ProcurementTask> addTask)
    {
        super(pendingTradeCost, addTask);
    }

    @Override
    public boolean check(ProcurementCost item)
    {
        return item instanceof Commodity;
    }

    @Override
    public void init()
    {
        Arrays.stream(CommodityType.values())
                .flatMap(CommodityType::categories)
                .flatMap(CommodityCostCategory::commodities)
                .forEach(this::initializeItem);
    }
}
