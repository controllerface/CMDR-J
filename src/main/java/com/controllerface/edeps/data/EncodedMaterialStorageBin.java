package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialType;

/**
 * Storage bin object for Encoded crafting materials
 *
 * Created by Stephen on 3/21/2018.
 */
public class EncodedMaterialStorageBin extends MaterialStorageBin
{
    @Override
    public boolean check(Material material)
    {
        return MaterialType.ENCODED.hasMaterial(material);
    }

    @Override
    public void init()
    {
        MaterialType.ENCODED.getCategories().stream()
                .flatMap(category -> category.getMaterials().stream())
                .forEach(material -> addMat(material,0));
    }
}
