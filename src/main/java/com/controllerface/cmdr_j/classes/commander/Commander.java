package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.StarSystem;
import com.controllerface.cmdr_j.database.EntityKeys;
import com.controllerface.cmdr_j.classes.data.PoiData;
import com.controllerface.cmdr_j.classes.data.Waypoint;
import com.controllerface.cmdr_j.classes.tasks.Task;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.database.EntityUtilities;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.commodities.CommodityType;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialType;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
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
    public final StarShip starShip = new StarShip();

    /**
     * Contains information about the commander's current location, including galactic coordinates and
     * other system specific data.
     */
    public final CommanderLocation location = new CommanderLocation();

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
     * When a route is currently being followed, contains the systems in the route, in the order they
     * appear in the planned route. Otherwise, this will be empty.
     */
    private final List<StarSystem> currentRoute = new ArrayList<>();

    /**
     * The backing list for the POI table UI component. ** must only be adjusted from UI thread **
     */
    private final ObservableList<PoiData> galaxyPoiBackingList = FXCollections.observableArrayList();

    /**
     * This object holds the persistent data related to this commander
     */
    private final PersistentEntityStore database =
            PersistentEntityStores.newInstance(UIFunctions.DATA_FOLDER + "/db_old");

    /**
     * Various commander statistics
     */
    private final Map<Statistic, String> stats = new ConcurrentHashMap<>(new LinkedHashMap<>());

    /**
     * Contains the commander's current credit balance.
     */
    private long creditBalance = 0;

    /**
     * When the commander name label is set, the change in text is delegated to a background UI thread, which can take
     * a short time to change. However, we may need to know what the commander's name is before that change occurs in
     * order to process other events correctly. For cases that need the name immediately, the internal implementation
     * can use this value instead of relying on the text stored in the actual name Label.
     */
    private String commanderNameImmediate = "";

    /**
     * During initialization, this is set, allowing the commander object to keep the UI components synchronized
     * as various state changes occur.
     */
    private CommanderUIControls uiControls;

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

        cargo.associateTableView(commanderUIControls.cargoTable, commanderUIControls.showZeroQuantities);
        rawMats.associateTableView(commanderUIControls.rawTable, commanderUIControls.showZeroQuantities);
        mfdMats.associateTableView(commanderUIControls.manufacturedTable, commanderUIControls.showZeroQuantities);
        dataMats.associateTableView(commanderUIControls.dataTable, commanderUIControls.showZeroQuantities);

        this.uiControls.galaxyPoiTable.setItems(galaxyPoiBackingList);

        this.uiControls.createPoiButton.setOnMouseClicked(event -> Optional.of(event.getButton())
                .filter(button -> button == MouseButton.PRIMARY)
                .ifPresent(_x -> addNewPoi()));

        this.uiControls.currentSystemButton.setOnMouseClicked(event ->
                this.uiControls.createPoiName.textProperty().set(location.getStarSystem().systemName));

        this.uiControls.addWaypointButton.onMouseClickedProperty().setValue(_x -> addNewWaypoint());

        renderGalaxyGraphic();
    }

    //region DB Transactions ** methods in this region must only be called from within a DB transaction **

    /**
     * Gets the DB entity for a star system. If this system has never been visited before now, a new
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

    //region Location, POI, and Waypoints

    private void addNewPoi()
    {
        TextField systemName = this.uiControls.createPoiName;
        TextArea poiNotes = this.uiControls.createPoiNotes;
        ListView<PoiData> systemPoiList = this.uiControls.systemPoiList;

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
            List<PoiData> noteList = EntityUtilities.entityStream(starSystem.getLinks(EntityKeys.POI_NOTE))
                    .map(note -> new PoiData(note.getId(), targetSystem, note.getBlobString(EntityKeys.POI_NOTE)))
                    .collect(Collectors.toList());

            // add the POI notes being set right now
            Entity n = txn.newEntity(EntityKeys.POI_NOTE);
            starSystem.addLink(EntityKeys.POI_NOTE, n);
            n.addLink(EntityKeys.STAR_SYSTEM, starSystem);
            n.setBlobString(EntityKeys.POI_NOTE, notes);
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

    private void addNewWaypoint()
    {
        String currentLatitude = this.uiControls.latitudeLabel.getText();
        String currentLongitude = this.uiControls.longitudeLabel.getText();
        double markedLat = Double.parseDouble(currentLatitude);
        double markedLong = Double.parseDouble(currentLongitude);
        String waypointName = this.uiControls.addWaypointName.getText();
        Waypoint waypoint = new Waypoint(waypointName, markedLat, markedLong);
        this.uiControls.waypointList.getItems().add(waypoint);
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
            return EntityUtilities.entityStream(starSystemEntity.getLinks(EntityKeys.POI_NOTE))
                    .map(entity ->
                    {
                        String notes = entity.getBlobString(EntityKeys.POI_NOTE);
                        return new PoiData(entity.getId(), systemName, notes);
                    })
                    .collect(Collectors.toList());
        });

        Platform.runLater(()->
        {
            uiControls.systemPoiList.getItems().clear();
            uiControls.systemPoiList.getItems().addAll(updatedNotes);
        });
    }

    private void renderGalaxyGraphic()
    {
        double scale = 1;

        TriangleMesh mesh = ModelUtilities.STL
                .loadModel("/models/galaxy_model.stl", false, false);

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

        Group routeGroup = new Group();

        PointLight light = new PointLight(UIFunctions.Style.lightOrange);
        light.setTranslateZ(300000);


        PhongMaterial orangeMaterial =
                new PhongMaterial(UIFunctions.Style.standardOrange,
                        null, null, null, null);
        Sphere currentSystem = new Sphere();
        currentSystem.setMaterial(orangeMaterial);
        currentSystem.setRadius(5);

        Optional.ofNullable(location.getStarSystem())
                .ifPresent(starSystem ->
                {
                    double xPosition = (location.getStarSystem().xPos + StarSystem.GALAXY_OFFSET_X) * scale;
                    double yPosition = (location.getStarSystem().yPos + StarSystem.GALAXY_OFFSET_Y) * scale;
                    double zPosition = (location.getStarSystem().zPos + StarSystem.GALAXY_OFFSET_Z) * scale;
                    currentSystem.translateXProperty().setValue(xPosition);
                    currentSystem.translateYProperty().setValue(yPosition);
                    currentSystem.translateZProperty().setValue(zPosition);
                });

        if (!currentRoute.isEmpty())
        {
            currentRoute.forEach(starSystem->
            {
                Sphere next = new Sphere();
                next.setMaterial(orangeMaterial);
                next.setRadius(5 * scale);
                double xPosition = (starSystem.xPos + StarSystem.GALAXY_OFFSET_X) * scale;
                double yPosition = (starSystem.yPos + StarSystem.GALAXY_OFFSET_Y) * scale;
                double zPosition = (starSystem.zPos + StarSystem.GALAXY_OFFSET_Z) * scale;
                next.translateXProperty().setValue(xPosition);
                next.translateYProperty().setValue(yPosition);
                next.translateZProperty().setValue(zPosition);
                routeGroup.getChildren().add(next);
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

        routeGroup.getChildren().addAll(center, currentSystem);
        routeGroup.getChildren().addAll(ballXPositive, ballXNegative,
                ballYPositive, ballYNegative,
                ballZPositive, ballZNegative);

        routeGroup.getChildren().add(meshView);

        Group shipGroup = new Group(camera, routeGroup, light);

        DoubleProperty angleX = new SimpleDoubleProperty(-60);
        DoubleProperty angleY = new SimpleDoubleProperty(180);
        DoubleProperty angleZ = new SimpleDoubleProperty(-60);

        angleX.setValue(0);
        angleY.setValue(0);
        angleZ.setValue(0);

        Rotate xRotate = new Rotate(0, Rotate.X_AXIS);
        Rotate yRotate = new Rotate(0, Rotate.Y_AXIS);
        Rotate zRotate = new Rotate(0, Rotate.Z_AXIS);
        routeGroup.getTransforms().addAll(xRotate, yRotate, zRotate);
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

    public void setLocation(StarSystem starSystem)
    {
        location.setStarSystem(starSystem);
        refreshSystemPoi(starSystem);

        List<String> systems = database.computeInTransaction(transaction ->
                EntityUtilities.entityStream(transaction.getAll(EntityKeys.STAR_SYSTEM))
                        .map(entity -> entity.getProperty(EntityKeys.NAME))
                        .filter(Objects::nonNull)
                        .map(Object::toString)
                        .collect(Collectors.toList()));

        systems.sort(String::compareTo);

        Platform.runLater(() ->
        {
            uiControls.poiSystemSelector.getItems().clear();
            uiControls.poiSystemSelector.getItems().addAll(systems);
        });

        renderGalaxyGraphic();
    }

    public void setRoute(List<StarSystem> route)
    {
        currentRoute.clear();
        currentRoute.addAll(route);
        renderGalaxyGraphic();
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
                        .ifPresent(system -> system.deleteLink(EntityKeys.POI_NOTE, poi));

                poi.delete();
            }
            else
            {
                poi.setBlobString(EntityKeys.POI_NOTE, notes);
            }
        });

        refreshSystemPoi(location.getStarSystem());
        refreshGalaxyPoiTable();
    }

    public void refreshGalaxyPoiTable()
    {
        galaxyPoiBackingList.clear();
        database.executeInTransaction(transaction -> EntityUtilities.entityStream(transaction.getAll(EntityKeys.POI_NOTE))
                .map(note -> Optional.ofNullable(note.getLink(EntityKeys.STAR_SYSTEM))
                        .map(system -> system.getProperty(EntityKeys.NAME))
                        .map(Object::toString)
                        .map(name -> new PoiData(note.getId(), name, note.getBlobString(EntityKeys.POI_NOTE))))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(galaxyPoiBackingList::add));
    }

    //endregion

    //region Player Statistics

    /**
     * Sets a named Statistic to a given string value
     *
     * @param key the Statistic key to set
     * @param stat the value to store for the given Statistic
     */
    public void setStat(Statistic key, String stat)
    {
        if (key == CommanderStat.Commander)
        {
            Platform.runLater(() -> uiControls.commanderName.setText(stat));
            commanderNameImmediate = stat;
            database.executeInTransaction(txn ->
            {
                if (txn.find(EntityKeys.COMMANDER, EntityKeys.NAME, commanderNameImmediate).isEmpty())
                {
                    txn.newEntity(EntityKeys.COMMANDER)
                            .setProperty(EntityKeys.NAME, commanderNameImmediate);
                }
            });
        }

        if (key == CommanderStat.Credits)
        {
            Platform.runLater(() -> uiControls.creditBalance.setText(stat));
            creditBalance = Long.parseLong(stat.replace(",",""));
        }

        stats.put(key, stat);
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

    //endregion

    //region Inventory and Credits

    public void adjustCreditBalance(long adjustment)
    {
        creditBalance += adjustment;
        Platform.runLater(() ->
                uiControls.creditBalance.setText(NumberFormat.getNumberInstance(Locale.US).format(creditBalance)));
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

    public long inventoryCount(TaskCost cost)
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

    //endregion
}
