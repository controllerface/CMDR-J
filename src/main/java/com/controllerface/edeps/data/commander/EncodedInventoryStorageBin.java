package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialSubCategory;
import com.controllerface.edeps.structures.costs.materials.MaterialType;

/**
 * Storage bin object for Encoded crafting materials
 *
 * NOTE: Mutable state data object
 *
 * Created by Stephen on 3/21/2018.
 */
public class EncodedInventoryStorageBin extends InventoryStorageBin
{
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
                .flatMap(MaterialSubCategory::materials)
                .forEach(material -> addItem(material,0));
    }
}
