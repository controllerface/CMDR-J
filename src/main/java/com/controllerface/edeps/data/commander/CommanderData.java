package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.commodities.CommodityType;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialType;
import com.controllerface.edeps.structures.equipment.ships.Ship;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * This class is intended to store all relevant data related to the Commander (player), such as inventory, ship loadout
 * and various statistics that are tracked in the game.
 *
 * NOTE: Mutable state data object
 *
 * Created by Controllerface on 4/4/2018.
 */
public class CommanderData
{
    /**
     * The Commander's star ship. Changes as the commander switches ships or modules
     */
    private final StarShip starShip = new StarShip();

    /**
     * Market salable Commodities and other items (like power play items, limpets, etc.) are stored in cargo
     */
    private final InventoryStorageBin cargo = new CargoStorageBin();

    /**
     * Raw element crafting materials
     */
    private final InventoryStorageBin rawMats = new RawInventoryStorageBin();

    /**
     * Manufactured crafting materials
     */
    private final InventoryStorageBin mfdMats = new ManufacturedInventoryStorageBin();

    /**
     * Encoded data crafting materials
     */
    private final InventoryStorageBin dataMats = new EncodedInventoryStorageBin();

    /**
     * Various commander statistics
     */
    private final Map<Statistic, String> stats = new ConcurrentHashMap<>(new LinkedHashMap<>());


    public void associateCargoTable(TableView<InventoryData> cargoTable)
    {
        cargo.associateTableView(cargoTable);
    }

    public void associateRawTable(TableView<InventoryData> rawTable)
    {
        rawMats.associateTableView(rawTable);
    }

    public void associateManufacturedTable(TableView<InventoryData> mfdTable)
    {
        mfdMats.associateTableView(mfdTable);
    }

    public void associateDataTable(TableView<InventoryData> dataTable)
    {
        dataMats.associateTableView(dataTable);
    }

    /**
     * Clears out the material storage bins. Typically used when fully refreshing commander data from disk. Usually,
     * this will be followed by a series of calls to adjustItem() with the actual counts of the materials.
     */
    public void clearMaterials()
    {
        rawMats.clear();
        mfdMats.clear();
        dataMats.clear();
    }

    /**
     * Clears out the cargo storage bin. Typically used when fully refreshing commander data from disk. Usually,
     * this will be followed by a series of calls to adjustItem() with the actual counts of the items.
     */
    public void clearCargo()
    {
        cargo.clear();
    }

    /**
     * Sets the current ship to the passed in ship type
     *
     * @param ship the ship to set as the commander's current ship
     */
    public void setShip(Ship ship)
    {
        starShip.setShip(ship);
    }

    public StarShip getStarShip()
    {
        return starShip;
    }

    /**
     * Sets a given ship module slot to a given ship module object, in the commander's current ship
     *
     * @param shipModuleData ship module data object describing the module
     */
    public void setShipModule(ShipModuleData shipModuleData)
    {
        starShip.installShipModule(shipModuleData);
    }

    /**
     * Sets a named Statistic to a given string value
     *
     * @param key the Statistic key to set
     * @param stat the value to store for the given Statistic
     * @return if there was a value previously stored for the given stat, it is returned. Otherwise, returns null
     */
    public String setStat(Statistic key, String stat)
    {
        return stats.put(key, stat);
    }

    /**
     * Removes the value mapped to the given stat from the commands list of stats
     *
     * @param stat the named Statistic to remove from the commander's stat list
     */
    public void removeStat(Statistic stat)
    {
        stats.remove(stat);
    }

    /**
     * Retrieves the value of the named stat from the commander's list of named stats
     *
     * @param statistic the name Statistic to get the value of
     * @return the value fo the named statistic, or null if the named stat is not set
     */
    public String getStat(Statistic statistic)
    {
        return stats.get(statistic);
    }

    /**
     * Returns the map of named stats for this commander
     *
     * @return commander's stat map
     */
    public Map<Statistic, String> getStats()
    {
        return stats;
    }

    /**
     * Adjusts the count of the given ProcurementCost item in the  commander's inventory
     *
     * @param cost the named ProcurementCost item to adjust the count of
     * @param adjustment amount to adjust the count by
     */
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
