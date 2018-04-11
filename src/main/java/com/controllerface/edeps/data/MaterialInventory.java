package com.controllerface.edeps.data;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.storage.EncodedInventoryStorageBin;
import com.controllerface.edeps.data.storage.InventoryStorageBin;
import com.controllerface.edeps.data.storage.ManufacturedInventoryStorageBin;
import com.controllerface.edeps.data.storage.RawInventoryStorageBin;
import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialType;

import java.util.stream.Stream;

/**
 * Created by Stephen on 4/4/2018.
 */
public class MaterialInventory
{
    private final InventoryStorageBin rawMats = new RawInventoryStorageBin();
    private final InventoryStorageBin dataMats = new EncodedInventoryStorageBin();
    private final InventoryStorageBin mfdMats = new ManufacturedInventoryStorageBin();

    public Stream<InventoryData> rawMaterialStream()
    {
        return rawMats.inventory();
    }

    public Stream<InventoryData> manufacturedMaterialStream()
    {
        return mfdMats.inventory();
    }

    public Stream<InventoryData> dataMaterialStream()
    {
        return dataMats.inventory();
    }

    public void clear()
    {
        rawMats.clear();
        mfdMats.clear();
        dataMats.clear();
    }

    public void adjustItem(ProcurementCost material, int adjustment)
    {
        if (!(material instanceof Material)) return;

        MaterialType type = MaterialType.findMatchingType(((Material) material));

        switch (type)
        {
            case RAW: rawMats.addItem(material, adjustment);
                break;

            case MANUFACTURED: mfdMats.addItem(material, adjustment);
                break;

            case ENCODED: dataMats.addItem(material, adjustment);
                break;
        }
    }

    public int hasMat(ProcurementCost material)
    {
        if (!(material instanceof Material)) return -1;

        switch (MaterialType.findMatchingType(((Material) material)))
        {
            case RAW: return rawMats.hasItem(material);

            case MANUFACTURED: return mfdMats.hasItem(material);

            case ENCODED: return dataMats.hasItem(material);

            default: return -1;
        }
    }
}
