package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialCategory;
import com.controllerface.edeps.structures.costs.materials.MaterialType;

/**
 * Storage bin object for Manufactured crafting materials
 *
 * NOTE: Mutable state data object
 *
 * Created by Stephen on 3/21/2018.
 */
public class ManufacturedInventoryStorageBin extends InventoryStorageBin
{
    @Override
    public boolean check(ProcurementCost item)
    {
        return item instanceof Material &&
                MaterialType.MANUFACTURED.hasMaterial(((Material) item));
    }

    @Override
    public void init()
    {
        MaterialType.MANUFACTURED.categories()
                .flatMap(MaterialCategory::materials)
                .forEach(material -> addItem(material,0));
    }
}
