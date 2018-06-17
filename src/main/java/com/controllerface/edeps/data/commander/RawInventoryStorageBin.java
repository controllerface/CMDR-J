package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialSubCostCategory;
import com.controllerface.edeps.structures.costs.materials.MaterialType;

/**
 * Storage bin object for Raw crafting materials
 *
 * NOTE: Mutable state data object
 *
 * Created by Controllerface on 3/21/2018.
 */
public class RawInventoryStorageBin extends InventoryStorageBin
{
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
