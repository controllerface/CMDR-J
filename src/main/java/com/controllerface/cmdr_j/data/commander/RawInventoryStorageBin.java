package com.controllerface.cmdr_j.data.commander;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.data.procurements.ProcurementTask;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.costs.materials.MaterialSubCostCategory;
import com.controllerface.cmdr_j.structures.costs.materials.MaterialType;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Storage bin object for Raw crafting materials
 *
 * NOTE: Mutable state data object
 *
 * Created by Controllerface on 3/21/2018.
 */
public class RawInventoryStorageBin extends InventoryStorageBin
{
    public RawInventoryStorageBin(Function<ProcurementCost, Integer> pendingTradeCost,
                                  Consumer<ProcurementTask> addTask)
    {
        super(pendingTradeCost, addTask);
    }

    @Override
    public boolean check(ProcurementCost item)
    {
        return item instanceof Material &&
                MaterialType.RAW.hasMaterial(((Material) item));
    }

    @Override
    public void init()
    {
        MaterialType.RAW.categories()
                .flatMap(MaterialSubCostCategory::materials)
                .forEach(this::initializeItem);
    }
}
