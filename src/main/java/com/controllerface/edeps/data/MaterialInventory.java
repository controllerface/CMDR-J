package com.controllerface.edeps.data;

import com.controllerface.edeps.data.*;
import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialType;

import java.util.stream.Stream;

/**
 * Created by Stephen on 4/4/2018.
 */
public class MaterialInventory
{
    private final MaterialStorageBin rawMats = new RawMaterialStorageBin();
    private final MaterialStorageBin dataMats = new EncodedMaterialStorageBin();
    private final MaterialStorageBin mfdMats = new ManufacturedMaterialStorageBin();

    public Stream<MaterialInventoryData> rawMaterialStream()
    {
        return rawMats.materialStream();
    }

    public Stream<MaterialInventoryData> manufacturedMaterialStream()
    {
        return mfdMats.materialStream();
    }

    public Stream<MaterialInventoryData> dataMaterialStream()
    {
        return dataMats.materialStream();
    }

    public void clear()
    {
        rawMats.clear();
        mfdMats.clear();
        dataMats.clear();
    }

    public boolean adjustMat(Material material, int adjustment)
    {
        MaterialType type = MaterialType.findMatchingType(material);

        switch (type)
        {
            case RAW:
                rawMats.addMat(material, adjustment);
                break;

            case MANUFACTURED:
                mfdMats.addMat(material, adjustment);
                break;

            case ENCODED:
                dataMats.addMat(material, adjustment);
                break;

            case UNKNOWN:
                System.out.println("Umm... no?");
                break;
        }
        return true;
    }


    public int hasMat(Material material)
    {
        int count = 0;
        switch (material.getType())
        {
            case RAW:
                count = rawMats.hasMat(material);
                break;
            case MANUFACTURED:
                count = mfdMats.hasMat(material);
                break;
            case ENCODED:
                count = dataMats.hasMat(material);
                break;
        }
        return count;
    }
}
