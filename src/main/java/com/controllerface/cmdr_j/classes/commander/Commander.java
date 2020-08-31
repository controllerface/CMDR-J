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
import com.controllerface.cmdr_j.ui.CommanderUIControls;
import com.controllerface.cmdr_j.ui.UIFunctions;
import com.controllerface.cmdr_j.ui.models.ModelUtilities;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.PointLight;
import javafx.scene.SubScene;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.MeshView;
import javafx.scene.shape.Sphere;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import jetbrains.exodus.entitystore.*;

import java.text.NumberFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
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

    private CommanderUIControls uiControls;

    private final ObservableList<PoiData> galaxyPoiBackingList = FXCollections.observableArrayList();

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

    public void associateUIControls(CommanderUIControls commanderUIControls)
    {
        this.uiControls = commanderUIControls;

        cargo.associateTableView(commanderUIControls.cargo_table, commanderUIControls.show_zero_quantities);
        rawMats.associateTableView(commanderUIControls.raw_table, commanderUIControls.show_zero_quantities);
        mfdMats.associateTableView(commanderUIControls.manufactured_table, commanderUIControls.show_zero_quantities);
        dataMats.associateTableView(commanderUIControls.data_table, commanderUIControls.show_zero_quantities);

        this.uiControls.galaxy_poi_table.setItems(galaxyPoiBackingList);

        this.uiControls.create_poi_button.setOnMouseClicked(event -> Optional.of(event.getButton())
                .filter(button -> button == MouseButton.PRIMARY)
                .ifPresent(_x -> addNewPoi()));

        this.uiControls.current_system_button.setOnMouseClicked(event ->
                this.uiControls.create_poi_name.textProperty().set(location.getStarSystem().systemName));

        renderGalaxyGraphic();

    }

    // 25.21875 / -20.90625 / 25899.96875
    double offsetX = -25.21875;
    double offsetY = -25899.96875;
    double offsetZ = 20.90625;

    double scale = 1;

    private void renderGalaxyGraphic()
    {
        TriangleMesh mesh = ModelUtilities.STL.loadModel("/models/galaxy_model.stl", false, false);

        // Create a Camera to view the 3D Shapes
        PerspectiveCamera camera = new PerspectiveCamera(false);

        DoubleProperty camX = new SimpleDoubleProperty(-400);
        DoubleProperty camY = new SimpleDoubleProperty(300);
        DoubleProperty camZ = new SimpleDoubleProperty(100000);

        Rotate cRotate = new Rotate(180, Rotate.X_AXIS);

        Translate cameraMove = new Translate(0,0,0);
        cameraMove.xProperty().bind(camX);
        cameraMove.yProperty().bind(camY);
        cameraMove.zProperty().bind(camZ);

        camera.getTransforms().addAll(cameraMove, cRotate);

        Group sG = new Group();

        PointLight light = new PointLight(UIFunctions.Style.lightOrange);
        light.setTranslateZ(300000);


        PhongMaterial orangeMaterial =
                new PhongMaterial(UIFunctions.Style.standardOrange,
                        null, null, null, null);
        Sphere ballCurrent = new Sphere();
        ballCurrent.setMaterial(orangeMaterial);
        ballCurrent.setRadius(5);

        Optional.ofNullable(location)
                .map(CommanderLocation::getStarSystem)
                .ifPresent(starSystem ->
                {
                    double xP = (location.getStarSystem().xPos + offsetX) * scale;
                    double yP = (location.getStarSystem().yPos + offsetY) * scale;
                    double zP = (location.getStarSystem().zPos + offsetZ) * scale;
                    ballCurrent.translateXProperty().setValue(xP);
                    ballCurrent.translateYProperty().setValue(yP);
                    ballCurrent.translateZProperty().setValue(zP);
                });

        if (!currentRoute.isEmpty())
        {
            currentRoute.forEach(s->
            {
                Sphere next = new Sphere();
                next.setMaterial(orangeMaterial);
                next.setRadius(5 * scale);
                double xP = (s.xPos + offsetX) * scale;
                double yP = (s.yPos + offsetY) * scale;
                double zP = (s.zPos + offsetZ) * scale;
                next.translateXProperty().setValue(xP);
                next.translateYProperty().setValue(yP);
                next.translateZProperty().setValue(zP);
                sG.getChildren().add(next);
            });
        }

        Color color = new Color(1,0,0,1);
        PhongMaterial redMaterial = new PhongMaterial(color, null, null, null, null);

        Color color3 = new Color(0,1,0,1);
        PhongMaterial greenMaterial = new PhongMaterial(color3, null, null, null, null);

        Sphere center = new Sphere();
        center.setMaterial(redMaterial);
        center.setRadius(1);

        Sphere ballXPositive = new Sphere();
        ballXPositive.setMaterial(greenMaterial);
        ballXPositive.setRadius(5);
        ballXPositive.translateXProperty().setValue(500);

        Sphere ballXNegative = new Sphere();
        ballXNegative.setMaterial(redMaterial);
        ballXNegative.setRadius(5);
        ballXNegative.translateXProperty().setValue(-500);

        Sphere ballYPositive = new Sphere();
        ballYPositive.setMaterial(greenMaterial);
        ballYPositive.setRadius(5);
        ballYPositive.translateYProperty().setValue(500);

        Sphere ballYNegative = new Sphere();
        ballYNegative.setMaterial(redMaterial);
        ballYNegative.setRadius(5);
        ballYNegative.translateYProperty().setValue(-500);

        Sphere ballZPositive = new Sphere();
        ballZPositive.setMaterial(greenMaterial);
        ballZPositive.setRadius(5);
        ballZPositive.translateZProperty().setValue(50);

        Sphere ballZNegative = new Sphere();
        ballZNegative.setMaterial(redMaterial);
        ballZNegative.setRadius(5);
        ballZNegative.translateZProperty().setValue(-50);


        Color color2 = new Color(0,0,0,.2);
        PhongMaterial meshMaterial = new PhongMaterial(color2, null, null, null, null);

        MeshView meshView = new MeshView();
        meshView.setMesh(mesh);
        meshView.scaleXProperty().set(1000);
        meshView.scaleYProperty().set(1000);
        meshView.scaleZProperty().set(1000);

        meshView.setMaterial(meshMaterial);

        sG.getChildren().addAll(center, ballCurrent);
        sG.getChildren().addAll(ballXPositive, ballXNegative,
                ballYPositive, ballYNegative,
                ballZPositive, ballZNegative);

        sG.getChildren().add(meshView);

        Group shipGroup = new Group(camera, sG, light);

        DoubleProperty angleX = new SimpleDoubleProperty(-60);
        DoubleProperty angleY = new SimpleDoubleProperty(180);
        DoubleProperty angleZ = new SimpleDoubleProperty(-60);

        angleX.setValue(0);
        angleY.setValue(0);
        angleZ.setValue(0);

        Rotate xRotate = new Rotate(0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate(0, Rotate.Y_AXIS);
        Rotate zRotate = new Rotate(0, Rotate.Z_AXIS);
        sG.getTransforms().addAll(xRotate, yRotate, zRotate);
        xRotate.angleProperty().bind(angleX);
        yRotate.angleProperty().bind(angleY);
        zRotate.angleProperty().bind(angleZ);




        //Tracks drag starting point for x and y
        AtomicReference<Double> clickX = new AtomicReference<>(0d);
        AtomicReference<Double> clickY = new AtomicReference<>(0d);

        //Keep track of current angle for x and y
        AtomicReference<Double> initialAngleX = new AtomicReference<>(0d);
        AtomicReference<Double> initialAngleZ = new AtomicReference<>(0d);

        uiControls.galaxyGraphic.setRoot(shipGroup);
        //shipGraphic.setWidth(300);
        //shipGraphic.setHeight(250);
        uiControls.galaxyGraphic.setCamera(camera);

        uiControls.galaxyGraphic.setOnMousePressed(event ->
        {
            clickX.set(event.getSceneX());
            clickY.set(event.getSceneY());
            initialAngleX.set(angleX.get());
            initialAngleZ.set(angleZ.get());
        });

        uiControls.galaxyGraphic.setOnMouseDragged(event ->
        {
            angleX.set(initialAngleX.get() - (clickY.get() - event.getSceneY()));
            angleZ.set(initialAngleZ.get() - (clickX.get() - event.getSceneX()));
        });

        // todo: this is for debugging, should remove eventually
        uiControls.galaxyGraphic.setOnKeyPressed(event ->
        {
            switch (event.getCode())
            {
                case A:
                    camX.setValue(camX.add(100).getValue());
                    break;

                case D:
                    camX.setValue(camX.subtract(100).getValue());
                    break;

                case W:
                    camY.setValue(camY.subtract(100).getValue());
                    break;

                case S:
                    camY.setValue(camY.add(100).getValue());
                    break;

                case Q:
                    camZ.setValue(camZ.add(100).getValue());
                    break;

                case E:
                    camZ.setValue(camZ.subtract(100).getValue());
                    break;

                case SPACE:
                    System.out.println("X: " + camX.get() + " Y: " + camY.get() + " Z:" + camZ.get()
                            + "aX: " + angleX.get() + " aZ: " + angleZ.get());
            }
        });
    }

    public void refreshGalaxyPoiTable()
    {
        galaxyPoiBackingList.clear();
        database.executeInTransaction(transaction -> EntityKeys.entityStream(transaction.getAll(EntityKeys.POI_NOTES))
                .map(note -> Optional.ofNullable(note.getLink(EntityKeys.STAR_SYSTEM))
                        .map(system -> system.getProperty(EntityKeys.NAME))
                        .map(Object::toString)
                        .map(name -> new PoiData(note.getId(), name, note.getBlobString(EntityKeys.POI_NOTES))))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(galaxyPoiBackingList::add));
    }


    private void addNewPoi()
    {
        TextField systemName = this.uiControls.create_poi_name;
        TextArea poiNotes = this.uiControls.create_poi_notes;
        ListView<PoiData> systemPoiList = this.uiControls.system_poi_list;

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
                System.err.println("ERROR!");
                return Collections.emptyList();
            }

            // get any existing notes so we can display them
            Entity starSystem = getStarSystemEntity(txn, commander, targetSystem);
            List<PoiData> noteList = EntityKeys.entityStream(starSystem.getLinks(EntityKeys.POI_NOTES))
                    .map(note -> new PoiData(note.getId(), targetSystem, note.getBlobString(EntityKeys.POI_NOTES)))
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
        if (targetSystem.equalsIgnoreCase(location.getStarSystem().systemName))
        {
            systemPoiList.getItems().clear();
            systemPoiList.getItems().addAll(updatedNotes);
        }

        refreshGalaxyPoiTable();
    }





    //region DB Transaction Methods
    // methods in this section mut only be used from within a DB transaction

    /**
     * Gets the DB entity for a start system. If this system has never been visited before now, a new
     * DB entity will be created, and it will be returned.
     *
     * @param transaction current db transaction
     * @param commander commander entity
     * @param systemName name of the system to retrieve
     * @return the DB entity for the star system
     */
    private static Entity getStarSystemEntity(StoreTransaction transaction, Entity commander, String systemName)
    {
        EntityIterable results = transaction.find(EntityKeys.STAR_SYSTEM, EntityKeys.NAME, systemName);
        return Optional.ofNullable(results.getFirst())
                .orElseGet(()->
                {
                    Entity newSystem = transaction.newEntity(EntityKeys.STAR_SYSTEM);
                    newSystem.setProperty(EntityKeys.NAME, systemName);
                    newSystem.setLink(EntityKeys.COMMANDER, commander);
                    commander.addLink(EntityKeys.STAR_SYSTEM, newSystem);
                    return newSystem;
                });
    }

    //endregion

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
        String systemName = starSystem.systemName.toUpperCase();

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

            Entity starSystemEntity = getStarSystemEntity(txn, commander, systemName);
            return EntityKeys.entityStream(starSystemEntity.getLinks(EntityKeys.POI_NOTES))
                    .map(entity ->
                    {
                        String notes = entity.getBlobString(EntityKeys.POI_NOTES);
                        return new PoiData(entity.getId(), systemName, notes);
                    })
                    .collect(Collectors.toList());
        });

        Platform.runLater(()->
        {
            uiControls.system_poi_list.getItems().clear();
            uiControls.system_poi_list.getItems().addAll(updatedNotes);
        });
    }

    public void updatePoi(EntityId entityId, String notes)
    {
        database.executeInTransaction(txn ->
        {
            Entity poi = txn.getEntity(entityId);
            if (notes.isEmpty())
            {
                // must ensure than any incoming links are deleted before deleting the POI itself, otherwise
                // other entities can end up with "dead links" to deleted notes. At some point, it would be
                // a good idea to see if there is a way to query for all incoming links in Xodus to make this
                // more robust. The is a way to do the below check using an incoming link query, but it requires
                // the same foreknowledge of the links' existence.
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
        refreshGalaxyPoiTable();
    }

    List<StarSystem> currentRoute = new ArrayList<>();

    public void setRoute(List<StarSystem> route)
    {
        currentRoute.clear();
        currentRoute.addAll(route);
        renderGalaxyGraphic();
    }

    public void setLocation(StarSystem starSystem)
    {
        location.setStarSystem(starSystem);
        refreshSystemPoi(starSystem);

        List<String> systems = database.computeInTransaction(transaction ->
                EntityKeys.entityStream(transaction.getAll(EntityKeys.STAR_SYSTEM))
                        .map(entity -> entity.getProperty(EntityKeys.NAME))
                        .filter(Objects::nonNull)
                        .map(Object::toString)
                        .collect(Collectors.toList()));

        systems.sort(String::compareTo);

        Platform.runLater(() ->
        {
            uiControls.poi_system_selector.getItems().clear();
            uiControls.poi_system_selector.getItems().addAll(systems);
        });

        renderGalaxyGraphic();
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
            Platform.runLater(() -> uiControls.commander_name.setText(stat));
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
        Platform.runLater(() -> uiControls.credit_balance.setText(creditString));
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
                uiControls.credit_balance.setText(NumberFormat.getNumberInstance(Locale.US).format(creditBalance)));
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
