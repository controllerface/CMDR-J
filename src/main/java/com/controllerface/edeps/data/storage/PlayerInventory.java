package com.controllerface.edeps.data.storage;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.InventoryData;
import com.controllerface.edeps.enums.costs.commodities.Commodity;
import com.controllerface.edeps.enums.costs.commodities.CommodityType;
import com.controllerface.edeps.enums.costs.materials.Material;
import com.controllerface.edeps.enums.costs.materials.MaterialType;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/4/2018.
 */
public class PlayerInventory
{
    private final InventoryStorageBin rawMats = new RawInventoryStorageBin();
    private final InventoryStorageBin dataMats = new EncodedInventoryStorageBin();
    private final InventoryStorageBin mfdMats = new ManufacturedInventoryStorageBin();
    private final InventoryStorageBin cargo = new CargoStorageBin();

    private final Map<Statistic, String> stats = new LinkedHashMap<>();


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

    public Stream<InventoryData> cargoStream()
    {
        return cargo.inventory();
    }

    public void clearAll()
    {
        rawMats.clear();
        mfdMats.clear();
        dataMats.clear();
        cargo.clear();
    }

    public void clearMaterials()
    {
        rawMats.clear();
        mfdMats.clear();
        dataMats.clear();
    }

    public void clearCargo()
    {
        cargo.clear();
    }

    public String getStat(String key)
    {
        return stats.get(key);
    }

    public String setStat(Statistic key, String stat)
    {
        System.out.println("Set Stat: " + key);
        return stats.put(key, stat);
    }

    public void removeStat(Statistic stat)
    {
        stats.remove(stat);
    }

    public Map<Statistic, String> getStats()
    {
        return stats;
    }

    public void adjustItem(ProcurementCost cost, int adjustment)
    {
        if (cost instanceof Material)
        {
            MaterialType type = MaterialType.findMatchingType(((Material) cost));

            switch (type)
            {
                case RAW: rawMats.addItem(cost, adjustment);
                    break;

                case MANUFACTURED: mfdMats.addItem(cost, adjustment);
                    break;

                case ENCODED: dataMats.addItem(cost, adjustment);
                    break;
            }
        }

        if (cost instanceof Commodity)
        {
            CommodityType type = CommodityType.findMatchingType(((Commodity) cost));

            switch (type)
            {
                case COMMODITY:
                case FACTION:
                    cargo.addItem(cost, adjustment);
                    break;
            }
        }
    }

    public int hasItem(ProcurementCost cost)
    {
        if (cost instanceof Material)
        {
            switch (MaterialType.findMatchingType(((Material) cost)))
            {
                case RAW:
                    return rawMats.hasItem(cost);

                case MANUFACTURED:
                    return mfdMats.hasItem(cost);

                case ENCODED:
                    return dataMats.hasItem(cost);
            }
        }

        if (cost instanceof Commodity)
        {
            switch (CommodityType.findMatchingType(((Commodity) cost)))
            {
                case COMMODITY:
                case FACTION:
                    return cargo.hasItem(cost);
            }
        }

        return -1;
    }
}
