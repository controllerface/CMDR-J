package com.controllerface.cmdr_j.data.commander;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.data.procurements.ProcurementTask;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.costs.materials.MaterialSubCostCategory;
import com.controllerface.cmdr_j.structures.costs.materials.MaterialType;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Storage bin object for Encoded crafting materials
 *
 * NOTE: Mutable state data object
 *
 * Created by Controllerface on 3/21/2018.
 */
class EncodedInventoryStorageBin extends InventoryStorageBin
{
    EncodedInventoryStorageBin(Function<ProcurementCost, Integer> pendingTradeCost,
                               Consumer<ProcurementTask> addTask)
    {
        super(pendingTradeCost, addTask);
    }

    @Override
    public boolean check(ProcurementCost item)
    {
        return item instanceof Material &&
                MaterialType.ENCODED.hasMaterial(((Material) item));
    }

    @Override
    public void init()
    {
        MaterialType.ENCODED.categories()
                .flatMap(MaterialSubCostCategory::materials)
                .forEach(this::initializeItem);
    }
}