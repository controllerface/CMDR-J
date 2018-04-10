package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialType;

/**
 * Storage bin object for Raw crafting materials
 *
 * Created by Stephen on 3/21/2018.
 */
public class RawMaterialStorageBin extends MaterialStorageBin
{
    @Override
    public boolean check(Material material)
    {
        return MaterialType.RAW.hasMaterial(material);
    }

    @Override
    public void init()
    {
        MaterialType.RAW.getCategories().stream()
                .flatMap(category -> category.getMaterials().stream())
                .forEach(material -> addMat(material,0));
    }
}
