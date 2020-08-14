package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.ShipModuleDisplay;
import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.classes.data.EntityKeys;
import com.controllerface.cmdr_j.classes.data.PoiData;
import com.controllerface.cmdr_j.classes.tasks.Task;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.enums.commander.PlayerStat;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.commodities.CommodityType;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialType;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.ships.Ship;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import jetbrains.exodus.entitystore.*;

import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * This class is intended to store all relevant data related to the Commander (player), such as inventory, ship loadout
 * and various statistics that are tracked in the game.
 *
 * Created by Controllerface on 4/4/2018.
 */
public class Commander
{
    /**
     * The Commander's star ship. Changes as the commander switches ships or modules
     */
    private final StarShip starShip = new StarShip();

    private final CommanderLocation location = new CommanderLocation();

    /**
     * Market salable Commodities and other items (like power play items, limpets, etc.) are stored in cargo
     */
    private final InventoryStorageBin cargo;

    /**
     * Raw element crafting materials
     */
    private final InventoryStorageBin rawMats;

    /**
     * Manufactured crafting materials
     */
    private final InventoryStorageBin mfdMats;

    /**
     * Encoded data crafting materials
     */
    private final InventoryStorageBin dataMats;

    /**
     * When the commander name label is set, the change in text is delegated to a background UI thread, which can take
     * a short time to change. However, we may need to know what the commander's name is before that change occurs in
     * order to process other events correctly. For cases that need the name immediately, the internal implementation
     * can use this value instead of relying on the text stored in the actual name Label.
     */
    private String commanderNameImmediate = "";

    /**
     * Label for commander name
     */
    private Label commanderName;

    /**
     * Label for player's credit balance
     */
    private Label creditBalanceLabel;

    private ListView<PoiData> currentPoiNotes;

    private TableView<PoiData> galaxyPoiTable;
    private ObservableList<PoiData> galaxyPoiBackingList = FXCollections.observableArrayList();

    /**
     * This object holds the persistent data related to this commander
     */
    private final PersistentEntityStore database =
            PersistentEntityStores.newInstance(UIFunctions.DATA_FOLDER + "/db");

    private long creditBalance = 0;

    /**
     * Various commander statistics
     */
    private final Map<Statistic, String> stats = new ConcurrentHashMap<>(new LinkedHashMap<>());

    public Commander(Function<TaskCost, Integer> pendingTradeCost, Consumer<Task> addTask)
    {
        cargo = new CargoStorageBin(pendingTradeCost, addTask);
        rawMats = new RawInventoryStorageBin(pendingTradeCost, addTask);
        mfdMats = new ManufacturedInventoryStorageBin(pendingTradeCost, addTask);
        dataMats = new EncodedInventoryStorageBin(pendingTradeCost, addTask);
    }




    public void associateCommanderName(Label commanderName)
    {
        this.commanderName = commanderName;
    }

    public void associateCommanderBalance(Label creditBalanceLabel)
    {
        this.creditBalanceLabel = creditBalanceLabel;
    }

    public void associateCargoTable(TableView<InventoryDisplay> cargoTable, CheckBox showZeroQuantities)
    {
        cargo.associateTableView(cargoTable, showZeroQuantities);
    }

    public void associateRawTable(TableView<InventoryDisplay> rawTable, CheckBox showZeroQuantities)
    {
        rawMats.associateTableView(rawTable, showZeroQuantities);
    }

    public void associateManufacturedTable(TableView<InventoryDisplay> mfdTable, CheckBox showZeroQuantities)
    {
        mfdMats.associateTableView(mfdTable, showZeroQuantities);
    }

    public void associateDataTable(TableView<InventoryDisplay> dataTable, CheckBox showZeroQuantities)
    {
        dataMats.associateTableView(dataTable, showZeroQuantities);
    }


    public void refreshGalaxyPoiTable()
    {
        galaxyPoiBackingList.clear();
        database.executeInTransaction(txn ->
        {
            EntityKeys.entityStream(txn.getAll(EntityKeys.POI_NOTES))
                    .map(n->
                    {
                        String name = n.getLink(EntityKeys.STAR_SYSTEM).getProperty(EntityKeys.NAME).toString();
                        return new PoiData(n.getId(), name, n.getBlobString(EntityKeys.POI_NOTES));
                    })
                    .forEach(galaxyPoiBackingList::add);
        });
    }


    private void addNewPoi(TextField systemName,
                           TextArea poiNotes,
                           ListView<PoiData> systemPoiList)
    {
        String targetSystem = systemName.getText().toUpperCase();
        String notes = poiNotes.getText().toUpperCase();

        if (targetSystem.isEmpty() || notes.isEmpty())
        {
            System.out.println("System name and notes must be non-empty");
            return;
        }

        // update the notes and collect all notes we will need to display
        List<PoiData> updatedNotes = database.computeInTransaction(txn ->
        {
            // get this commander
            Entity commander = txn.find(EntityKeys.COMMANDER, EntityKeys.NAME, commanderNameImmediate).getFirst();
            if (commander == null)
            {
                System.out.println("ERROR!");
                return Collections.emptyList();
            }

            // query the DB for star systems with this system's name. If it does not exist yet, create it.
            EntityIterable results = txn.find(EntityKeys.STAR_SYSTEM, EntityKeys.NAME, targetSystem);
            Entity starSystem = Optional.ofNullable(results.getFirst())
                    .orElseGet(() ->
                    {
                        Entity newSystem = txn.newEntity(EntityKeys.STAR_SYSTEM);
                        newSystem.setProperty(EntityKeys.NAME, targetSystem);
                        newSystem.setLink(EntityKeys.COMMANDER, commander);
                        commander.addLink(EntityKeys.STAR_SYSTEM, newSystem);
                        return newSystem;
                    });

            // get any existing notes so we can display them
            List<PoiData> noteList = EntityKeys.entityStream(starSystem.getLinks(EntityKeys.POI_NOTES))
                    .map(e ->
                    {
                        String t = e.getBlobString(EntityKeys.POI_NOTES);
                        return new PoiData(e.getId(), targetSystem, t);
                    })
                    .collect(Collectors.toList());

            // add the POI notes being set right now
            Entity n = txn.newEntity(EntityKeys.POI_NOTES);
            starSystem.addLink(EntityKeys.POI_NOTES, n);
            n.addLink(EntityKeys.STAR_SYSTEM, starSystem);
            n.setBlobString(EntityKeys.POI_NOTES, notes);
            noteList.add(new PoiData(n.getId(), targetSystem, notes));
            return noteList;
        });

        // if this was an update for the current system, update the list
        if (targetSystem.equalsIgnoreCase(location.getStarSystem().getSystemName()))
        {
            systemPoiList.getItems().clear();
            systemPoiList.getItems().addAll(updatedNotes);
        }
    }


    public void associatePoiControls(Button poiButton,
                                     TextField systemName,
                                     TextArea poiNotes,
                                     ListView<PoiData> systemPoiList,
                                     TableView<PoiData> galaxyPoiList)
    {
        currentPoiNotes = systemPoiList;
        galaxyPoiTable = galaxyPoiList;
        galaxyPoiTable.setItems(galaxyPoiBackingList);

        poiButton.setOnMouseClicked(event ->
        {
            if (event.getButton() != MouseButton.PRIMARY)
            {
                return;
            }

            addNewPoi(systemName, poiNotes, systemPoiList);
        });
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

    public void setStation(String station)
    {
        location.setStation(station);
    }

    public void setEconomy(String economy)
    {
        location.setEconomy(economy);
    }

    private void refreshSystemPoi(StarSystem starSystem)
    {
        String systemName = starSystem.getSystemName().toUpperCase();

        // update the notes and collect all notes we will need to display for the current system
        List<PoiData> updatedNotes = database.computeInTransaction(txn ->
        {
            // get this commander
            Entity commander = txn.find(EntityKeys.COMMANDER, EntityKeys.NAME, commanderNameImmediate).getFirst();
            if (commander == null)
            {
                System.out.println("ERROR!");
                return Collections.emptyList();
            }

            EntityIterable results = txn.find(EntityKeys.STAR_SYSTEM, EntityKeys.NAME, systemName);
            Entity starSystem2 = Optional.ofNullable(results.getFirst())
                    .orElseGet(()->
                    {
                        Entity newSystem = txn.newEntity(EntityKeys.STAR_SYSTEM);
                        newSystem.setProperty(EntityKeys.NAME, systemName);
                        newSystem.setLink(EntityKeys.COMMANDER, commander);
                        commander.addLink(EntityKeys.STAR_SYSTEM, newSystem);
                        return newSystem;
                    });

            return EntityKeys.entityStream(starSystem2.getLinks(EntityKeys.POI_NOTES))
                    .map(entity ->
                    {
                        String notes = entity.getBlobString(EntityKeys.POI_NOTES);
                        return new PoiData(entity.getId(), systemName, notes);
                    })
                    .collect(Collectors.toList());
        });

        Platform.runLater(()->
        {
            currentPoiNotes.getItems().clear();
            currentPoiNotes.getItems().addAll(updatedNotes);
        });
    }

    public void updatePoi(EntityId entityId, String notes)
    {
        database.executeInTransaction(txn ->
        {
            Entity poi = txn.getEntity(entityId);
            if (notes.isEmpty())
            {
                Optional.ofNullable(poi.getLinks(EntityKeys.STAR_SYSTEM).getFirst())
                        .ifPresent(system -> system.deleteLink(EntityKeys.POI_NOTES, poi));

                poi.delete();
            }
            else
            {
                poi.setBlobString(EntityKeys.POI_NOTES, notes);
            }
        });

        refreshSystemPoi(location.getStarSystem());
    }

    public void setLocation(StarSystem starSystem)
    {
        location.setStarSystem(starSystem);
        refreshSystemPoi(starSystem);
    }

    /**
     * Sets a given ship module slot to a given ship module object, in the commander's current ship
     *
     * @param shipModuleDisplay ship module data object describing the module
     */
    public void setShipModule(ShipModuleDisplay shipModuleDisplay)
    {
        starShip.installShipModule(shipModuleDisplay);
    }

    /**
     * Sets a named Statistic to a given string value
     *
     * @param key the Statistic key to set
     * @param stat the value to store for the given Statistic
     */
    public void setStat(Statistic key, String stat)
    {
        if (key == PlayerStat.Commander)
        {
            Platform.runLater(() -> commanderName.setText(stat));
            commanderNameImmediate = stat;
            database.executeInTransaction(txn ->
            {
                if (txn.find(EntityKeys.COMMANDER, EntityKeys.NAME, commanderNameImmediate).isEmpty());
                {
                    txn.newEntity(EntityKeys.COMMANDER)
                            .setProperty(EntityKeys.NAME, commanderNameImmediate);
                }
            });
        }

        if (key == PlayerStat.Credits) setCreditBalanceLabel(stat);

        stats.put(key, stat);
    }

    private void setCreditBalanceLabel(String creditString)
    {
        Platform.runLater(() -> creditBalanceLabel.setText(creditString));
        creditBalance = Long.parseLong(creditString.replace(",",""));
    }



    public StarShip getShip()
    {
        return starShip;
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

    public CommanderLocation getLocation()
    {
        return location;
    }




    /**
     * Adjusts the count of the given TaskCost item in the  commander's inventory
     *
     * @param cost the named TaskCost item to adjust the count of
     * @param adjustment amount to adjust the count by
     */
    public void adjustItem(TaskCost cost, long adjustment)
    {
        Objects.requireNonNull(cost);

        if (cost instanceof Material)
        {
            Optional<MaterialType> matchingType = MaterialType.findMatchingType(((Material) cost));

            if (matchingType.isPresent())
            {
                switch (matchingType.get())
                {
                    case RAW: rawMats.addItem(cost, adjustment);
                        break;

                    case MANUFACTURED: mfdMats.addItem(cost, adjustment);
                        break;

                    case ENCODED: dataMats.addItem(cost, adjustment);
                        break;
                }
            }
            else
            {
                System.err.println("No matching Material type for: " + cost);
            }
        }

        if (cost instanceof Commodity)
        {
            Optional<CommodityType> matchingType = CommodityType.findMatchingType(((Commodity) cost));

            if (matchingType.isPresent())
            {
                cargo.addItem(cost, adjustment);
            }
            else
            {
                System.err.println("No matching Commodity type for: " + cost);
            }
        }
    }

    public void adjustCreditBalance(long adjustment)
    {
        creditBalance += adjustment;
        Platform.runLater(() ->
                creditBalanceLabel.setText(NumberFormat.getNumberInstance(Locale.US).format(creditBalance)));
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
     * Clears out the cargo.path storage bin. Typically used when fully refreshing commander data from disk. Usually,
     * this will be followed by a series of calls to adjustItem() with the actual counts of the items.
     */
    public void clearCargo()
    {
        cargo.clear();
    }

    public long amountOf(TaskCost cost)
    {
        Objects.requireNonNull(cost);

        if (cost instanceof Material)
        {
            Optional<MaterialType> matchingType = MaterialType.findMatchingType(((Material) cost));

            if (matchingType.isPresent())
            {
                switch (matchingType.get())
                {
                    case RAW:
                        return rawMats.amountOf(cost);

                    case MANUFACTURED:
                        return mfdMats.amountOf(cost);

                    case ENCODED:
                        return dataMats.amountOf(cost);
                }
            }
            else
            {
                System.err.println("No matching Material type for: " + cost);
            }
        }

        if (cost instanceof Commodity)
        {
            Optional<CommodityType> matchingType = CommodityType.findMatchingType(((Commodity) cost));

            if (matchingType.isPresent())
            {
                return cargo.amountOf(cost);
            }
            else
            {
                System.err.println("No matching Commodity type for: " + cost);
            }
        }

        if (cost instanceof CreditCost)
        {
            return creditBalance;
        }

        return 0;
    }
}
