package com.controllerface.edeps.data.storage;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.enums.costs.materials.Material;
import com.controllerface.edeps.enums.costs.materials.MaterialCategory;
import com.controllerface.edeps.enums.costs.materials.MaterialType;

/**
 * Storage bin object for Raw crafting materials
 *
 * Created by Stephen on 3/21/2018.
 */
public class RawInventoryStorageBin extends InventoryStorageBin
{
    @Override
    public boolean check(ProcurementCost material)
    {
        return material instanceof Material &&
                MaterialType.RAW.hasMaterial(((Material) material));
    }

    @Override
    public void init()
    {
        MaterialType.RAW.categories()
                .flatMap(MaterialCategory::materials)
                .forEach(material -> addItem(material,0));
    }
}
