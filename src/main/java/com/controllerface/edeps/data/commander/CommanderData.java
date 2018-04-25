package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ShipModule;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.commodities.CommodityType;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialType;
import com.controllerface.edeps.structures.equipment.ships.Ship;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * Created by Stephen on 4/4/2018.
 *
 * NOTE: Mutable state data object
 *
 */
public class CommanderData
{
    private final InventoryStorageBin rawMats = new RawInventoryStorageBin();
    private final InventoryStorageBin dataMats = new EncodedInventoryStorageBin();
    private final InventoryStorageBin mfdMats = new ManufacturedInventoryStorageBin();
    private final InventoryStorageBin cargo = new CargoStorageBin();

    private final StarShip starShip = new StarShip();

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

    public void setShip(Ship ship)
    {
        starShip.setShip(ship);
    }

    public void setShipModule(Statistic statistic, ShipModule shipModule)
    {
        starShip.setShipModule(statistic, shipModule);
    }

    public String setStat(Statistic key, String stat)
    {
        return stats.put(key, stat);
    }

    public void removeStat(Statistic stat)
    {
        stats.remove(stat);
    }

    public String getStat(Statistic statistic)
    {
        return stats.get(statistic);
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
