package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialType;

/**
 * Storage bin object for Manufactured crafting materials
 *
 * Created by Stephen on 3/21/2018.
 */
public class ManufacturedMaterialStorageBin extends MaterialStorageBin
{
    @Override
    public boolean check(Material material)
    {
        return MaterialType.MANUFACTURED.hasMaterial(material);
    }

    @Override
    public void init()
    {
        MaterialType.MANUFACTURED.getCategories().stream()
                .flatMap(category -> category.getMaterials().stream())
                .forEach(material -> addMat(material,0));
    }
}
