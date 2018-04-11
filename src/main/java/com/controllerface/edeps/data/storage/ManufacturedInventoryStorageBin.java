package com.controllerface.edeps.data.storage;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialType;

/**
 * Storage bin object for Manufactured crafting materials
 *
 * Created by Stephen on 3/21/2018.
 */
public class ManufacturedInventoryStorageBin extends InventoryStorageBin
{
    @Override
    public boolean check(ProcurementCost material)
    {
        return material instanceof Material &&
                MaterialType.MANUFACTURED.hasMaterial(((Material) material));
    }

    @Override
    public void init()
    {
        MaterialType.MANUFACTURED.getCategories().stream()
                .flatMap(category -> category.getMaterials().stream())
                .forEach(material -> addItem(material,0));
    }
}
