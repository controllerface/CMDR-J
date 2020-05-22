package com.controllerface.cmdr_j.ui;

import com.controllerface.cmdr_j.JSONSupport;
import com.controllerface.cmdr_j.classes.recipes.MaterialTradeRecipe;
import com.controllerface.cmdr_j.classes.MessageData;
import com.controllerface.cmdr_j.classes.ShipModuleData;
import com.controllerface.cmdr_j.classes.WindowDimensions;
import com.controllerface.cmdr_j.classes.commander.CommanderData;
import com.controllerface.cmdr_j.classes.commander.InventoryData;
import com.controllerface.cmdr_j.classes.commander.MarketData;
import com.controllerface.cmdr_j.classes.commander.ShipStatisticData;
import com.controllerface.cmdr_j.classes.procurements.*;
import com.controllerface.cmdr_j.classes.recipes.ModulePurchaseRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalCategory;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationCategory;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisCategory;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisRecipe;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisType;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyCategory;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyType;
import com.controllerface.cmdr_j.enums.equipment.modules.ModulePurchaseType;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;
import com.controllerface.cmdr_j.threads.JournalSyncTask;
import com.controllerface.cmdr_j.threads.UserTransaction;
import com.controllerface.cmdr_j.ui.costs.CostDataCell;
import com.controllerface.cmdr_j.ui.costs.CostGradeCell;
import com.controllerface.cmdr_j.ui.costs.CostValueCell;
import com.controllerface.cmdr_j.ui.inventory.InventoryGradeCell;
import com.controllerface.cmdr_j.ui.procurements.ProcurementListCell;
import com.controllerface.cmdr_j.ui.procurements.ProcurementTreeCell;
import com.controllerface.cmdr_j.ui.procurements.TaskTypeCell;
import com.controllerface.cmdr_j.ui.ship.ModuleDisplayCell;
import com.controllerface.cmdr_j.ui.ship.SlotNameCell;
import com.controllerface.cmdr_j.ui.ship.StatDataCell;
import com.controllerface.cmdr_j.ui.ship.StatDisplayCell;
import com.controllerface.cmdr_j.ui.tasks.TaskCountCell;
import com.controllerface.cmdr_j.ui.tasks.TaskDataCell;
import com.controllerface.cmdr_j.ui.tasks.TaskRemoveCell;
import javafx.application.Platform;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.collections.transformation.SortedList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.util.Callback;
import javafx.util.Pair;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * UI Controller class for CMDR J
 *
 * Created by Controllerface on 3/20/2018.
 */
public class UIController
{
    /*
    =============================
    === UI Components (JavaFX) ===
    =============================
     */

    // This is the top level UI element
    //@FXML private TabPane mainPane;

    @FXML private Label economy_label;
    @FXML private Label station_label;

    @FXML private ProgressBar message_progress;

    /*
    Ship LoadoutHandler Tab
     */

    @FXML private Label location_label;

    @FXML private Label ship_ID_label;
    @FXML private Label ship_name_label;
    @FXML private Label ship_type_label;
    @FXML private Label ship_make_label;

    @FXML private TableView<ShipStatisticData> ship_statistics_table;
    @FXML private TableColumn<ShipStatisticData, String> ship_statistics_name_column;
    @FXML private TableColumn<ShipStatisticData, ShipStatisticData> ship_statistics_data_column;

    @FXML private TableView<ShipModuleData> core_module_table;
    @FXML private TableColumn<ShipModuleData, String> core_module_name_column;
    @FXML private TableColumn<ShipModuleData, ShipModuleData> core_module_data_column;

    @FXML private TableView<ShipModuleData> optional_module_table;
    @FXML private TableColumn<ShipModuleData, String> optional_module_name_column;
    @FXML private TableColumn<ShipModuleData, ShipModuleData> optional_module_data_column;

    @FXML private TableView<ShipModuleData> hardpoint_table;
    @FXML private TableColumn<ShipModuleData, String> hardpoint_name_column;
    @FXML private TableColumn<ShipModuleData, ShipModuleData> hardpoint_data_column;


    /*
    Procurement Tasks Tab
     */

    // Section visibility controls
    @FXML private CheckBox show_procurements;
    @FXML private CheckBox show_tasks;
    @FXML private CheckBox show_items_needed;

    // Procurement tree/list selector components
    @FXML private HBox procurement_box;
    @FXML private Label procurement_label;
    @FXML private TreeView<ProcurementTask> procurement_tree;
    @FXML private ListView<ProcurementTask> procurement_list;

    // Task list container pane
    @FXML private AnchorPane task_pane;

    // Task list and columns
    @FXML private TableView<ProcurementTaskData> procurement_task_table;
    @FXML private TableColumn<ProcurementTaskData, ProcurementRecipe> task_type_column;
    @FXML private TableColumn<ProcurementTaskData, ProcurementTaskData> task_count_column;
    @FXML private TableColumn<ProcurementTaskData, ProcurementTaskData> task_name_column;
    @FXML private TableColumn<ProcurementTaskData, ProgressBar> task_progress_column;
    @FXML private TableColumn<ProcurementTaskData, Pair<ProcurementType, ProcurementRecipe>> task_remove_column;

    // Items needed/costs table and columns
    @FXML private TableView<ItemCostData> task_cost_table;
    @FXML private TableColumn<ItemCostData, String> task_cost_need_column;
    @FXML private TableColumn<Displayable, Displayable> task_cost_name_column;
    @FXML private TableColumn<ItemCostData, ProgressBar> task_cost_progress_column;
    @FXML private TableColumn<ItemCostData, ItemGrade> task_cost_type_column;


    /*
    Inventory Panel
     */

    @FXML private TabPane inventory_tab;
    @FXML private CheckBox show_zero_quantities;

    // Raw materials
    @FXML private Tab raw_mats_tab;
    @FXML private TableView<InventoryData> raw_table;
    @FXML private TableColumn<InventoryData, InventoryData> raw_material_column;
    @FXML private TableColumn<InventoryData, InventoryData> raw_grade_column;
    @FXML private TableColumn<InventoryData, Label> raw_quantity_column;
    @FXML private TableColumn<InventoryData, ProgressBar> raw_material_progress_column;

    // Manufactured materials
    @FXML private TableView<InventoryData> manufactured_table;
    @FXML private TableColumn<InventoryData, InventoryData> manufactured_material_column;
    @FXML private TableColumn<InventoryData, InventoryData> manufactured_grade_column;
    @FXML private TableColumn<InventoryData, Label> manufactured_quantity_column;
    @FXML private TableColumn<InventoryData, ProgressBar> manufactured_progress_column;

    // Data materials
    @FXML private TableView<InventoryData> data_table;
    @FXML private TableColumn<InventoryData, InventoryData> data_material_column;
    @FXML private TableColumn<InventoryData, InventoryData> data_grade_column;
    @FXML private TableColumn<InventoryData, Label> data_quantity_column;
    @FXML private TableColumn<InventoryData, ProgressBar> data_progress_column;

    // Cargo
    @FXML private TableView<InventoryData> cargo_table;
    @FXML private TableColumn<InventoryData, InventoryData> cargo_item_column;
    @FXML private TableColumn<InventoryData, InventoryData> cargo_grade_column;
    @FXML private TableColumn<InventoryData, Label> cargo_quantity_column;

    // Imports
    @FXML private TableView<MarketData> market_table;
    @FXML private TableColumn<MarketData, MarketData> market_commodity_col;
    @FXML private TableColumn<MarketData, Integer> market_sell_col;
    @FXML private TableColumn<MarketData, Integer> market_mean_col;
    @FXML private TableColumn<MarketData, Integer> market_profit_col;
    @FXML private TableColumn<MarketData, Integer> market_demand_col;

    // Exports
    @FXML private TableView<MarketData> market_table1;
    @FXML private TableColumn<MarketData, MarketData> market_commodity_col1;
    @FXML private TableColumn<MarketData, Integer> market_buy_col1;
    @FXML private TableColumn<MarketData, Integer> market_mean_col1;
    @FXML private TableColumn<MarketData, Integer> market_stock_col1;
    @FXML private TableColumn<MarketData, Integer> market_income_col1;


    @FXML private ListView<MessageData> console_message_list;

    // Status
    @FXML private Label status_body;
    @FXML private Label status_fuel;
    @FXML private Label status_fuel_reservoir;
    @FXML private Label status_cargo;
    @FXML private Label status_altitude;
    @FXML private Label status_latitude;
    @FXML private Label status_longitude;
    @FXML private Label status_marked_dist;
    @FXML private Label status_marked_lat;
    @FXML private Label status_marked_long;
    @FXML private Label status_heading;
    @FXML private Label status_bearing;

    @FXML private Button status_mark;
    @FXML private ListView<Waypoint> waypoint_list;
    @FXML private TextField waypoint_name_input;

    @FXML private Label market_name;


    @FXML private Label commander_name;
    @FXML private Label credit_balance;


    @FXML private Canvas mini_map;
    @FXML private Slider mini_map_scale;

    /*
    Backing lists for the procurement task UI elements
     */

    private final ObservableList<ProcurementTask> procSelectorBackingList = FXCollections.observableArrayList();

    // the backing list for tracked tasks, and a sorted wrapper used to keep the UI view sorted
    private final ObservableList<ProcurementTaskData> taskBackingList = FXCollections.observableArrayList();
    private final SortedList<ProcurementTaskData> sortedTasks = new SortedList<>(taskBackingList, UIFunctions.Sort.tasksByName);

    // the backing list for needed items/costs, and a sorted wrapper used to keep the UI view sorted
    private final ObservableList<ItemCostData> taskCostBackingList = FXCollections.observableArrayList();
    private final SortedList<ItemCostData> sortedCosts = new SortedList<>(taskCostBackingList, UIFunctions.Sort.costsByNeed);

    private final ObservableList<MessageData> consoleBackingList = FXCollections.observableArrayList();

    private final ObservableList<MarketData> importMarketData = FXCollections.observableArrayList();
    private final ObservableList<MarketData> exportMarketData = FXCollections.observableArrayList();


    /*
    =============================
    === END UI Components area ===
    =============================
     */

    private final AtomicBoolean nearPlanet = new AtomicBoolean(false);

    private double planetRadius = 0d;

    /**
     * This set acts as cache to keep track of what costs are currently being tracked as constituent costs of tasks
     * that the user has added to their task list. This is used by some UI elements to determine if a given item is
     * being tracked as a cost or not.
     */
    private final Set<ProcurementCost> taskCostCache = new HashSet<>();

    /**
     * Keeps track of materials that MAY be procured at some time in the future, provided a trade task is completed.
     * For example, if the player adds a trade task to trade 1 unit Vanadium for 3 units Carbon, the 3 units of Carbon
     * will be added to this map. Note that all yields are accumulated this way in the map. I.e, if the player also
     * adds a trade task to trade 1 units of Niobium for 9 units of Carbon, this map will contain 12 units of carbon.
     */
    private final Map<ProcurementCost, Integer> tradeYieldCache = new ConcurrentHashMap<>();

    /**
     * Keeps track of materials that MAY be procured at some time in the future, provided a trade task is completed.
     * For example, if the player adds a trade task to trade 1 unit Vanadium for 3 units Carbon, the 3 units of Carbon
     * will be added to this map. Note that all yields are accumulated this way in the map. I.e, if the player also
     * adds a trade task to trade 1 units of Niobium for 9 units of Carbon, this map will contain 12 units of carbon.
     */
    private final Map<ProcurementCost, Integer> tradeCostCache = new HashMap<>();

    /**
     * This list is the "raw" task list. When the user adds or removes tasks, or when a task is completed (thereby
     * removing it from the list), it is THIS list that is actually modified. After calculations for adjustments are
     * done and resulting mutations to this list are complete, THEN the UI backing lists are synced with the contents
     * of this list. This is a best practice to ensure that heavy computations are not done on the UI thread.
     */
    private final List<ProcurementTaskData> taskList = new CopyOnWriteArrayList<>();

    /**
     * This list functions the same way as the "raw" task list, only for the constituent costs of the tracked tasks.
     */
    private final List<ItemCostData> costList = new CopyOnWriteArrayList<>();

    private final ScheduledExecutorService messageExecutor = Executors.newSingleThreadScheduledExecutor();
    private final ExecutorService transactionPool = Executors.newFixedThreadPool(4);
    private final BlockingQueue<UserTransaction> transactionQueue = new LinkedBlockingQueue<>();

    private final AtomicInteger queuedMessages = new AtomicInteger(0);
    private final AtomicInteger processedMessages = new AtomicInteger(0);
    //private final Map<UserTransaction.MessageType, Boolean> messageTypeFilters = new HashMap<>();

    private final BlockingQueue<MessageData> messageQueue = new LinkedBlockingDeque<>();
    private final AtomicBoolean hasMessages = new AtomicBoolean(false);

    private final BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> addPairToProcurementList =
            (count, task) -> transactionQueue.add(UserTransaction.start(UserTransaction.TransactionType.BLUEPRINT)
                    .setTransactionAmount(count)
                    .setBlueprint(task)
                    .build());

    private final Consumer<ProcurementTask> addTaskToProcurementList =
            (task) -> addPairToProcurementList.accept(1, new Pair<>(task.getType(), task.getRecipe()));

    private final Consumer<ProcurementTask> addTaskPairToProcurementList_direct =
            (task) -> procurementListUpdate(1, new Pair<>(task.getType(), task.getRecipe()));

    private final Function<ProcurementCost, Integer> calculateTradeYield = (item) ->
    {
        if (item.getGrade() == ItemGrade.Any)
        {
            return tradeYieldCache.values().stream().mapToInt(y -> y).sum();
        }
        else
        {
            return tradeYieldCache.get(item);
        }
    };

    /**
     * Holds all of the data related to a commander (i.e. the player's on-disk data). While running, this application
     * will continuously update the data in this object based on events that are written to the player's Journal file
     */
    private final CommanderData commanderData = new CommanderData(tradeCostCache::get, addTaskPairToProcurementList_direct);

    private Consumer<Double> initialLoadCallback;

    public UIController()
    {
        localizeData();
    }

    public void setInitialLoadCallback(Consumer<Double> cb)
    {
        this.initialLoadCallback = cb;
    }

    private void consumeNextMessageBlock(List<MessageData> msgs)
    {
        msgs.stream()
                .filter(Objects::nonNull)
                .forEach(consoleBackingList::add);

        processedMessages.addAndGet(msgs.size());

        double progress = (double) processedMessages.get() / (double) queuedMessages.get();

        message_progress.setProgress(progress);
        initialLoadCallback.accept(progress);

        if (message_progress.getProgress() >= 1.0)
        {
            message_progress.visibleProperty().setValue(false);
            message_progress.setProgress(0.0d);
        }

        while (consoleBackingList.size() > 500) consoleBackingList.remove(0);
        console_message_list.scrollTo(consoleBackingList.size());
    }

    /**
     * NOTE: not intended to run from multiple threads
     */
    private void processMessages()
    {
        Thread.currentThread().setName("Message Processor");
        if (hasMessages.get())
        {
            List<MessageData> msgs = IntStream.range(0, 100)
                    .mapToObj(i -> messageQueue.poll())
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());

            hasMessages.set(!messageQueue.isEmpty());
            Platform.runLater(()->consumeNextMessageBlock(msgs));
        }
    }

    /**
     * Reflectively called by JavaFX when the application is closed bye the user. Note that if the program exits in an
     * unexpected way, this may not be called.
     */
    @FXML
    public void stop(WindowDimensions windowDimensions)
    {
        try
        {
            toJson(windowDimensions);
            messageExecutor.shutdown();
            transactionPool.shutdownNow();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private WindowDimensions windowDimensions;

    public WindowDimensions showVisuals()
    {
        initializeUIComponents();

        Properties properties = new Properties();
        try {properties.load(this.getClass().getResourceAsStream("/config.properties"));}
        catch (IOException e) {e.printStackTrace();}

        // todo: implement, maybe dump certain data to the info log? or possibly have a debug tab
        String debug = properties.getProperty("debug");
        if (debug != null && debug.equals("true"))
        {
            System.out.println("Debug mode currently not implemented");
        }

        sortInventory();
        setProcurementsUIVisibility();
        initializeComponents();

        return windowDimensions;
    }


    private boolean inSRV = false;
    private double lastShipLat = 0;
    private double lastShipLong = 0;

    private void renderOffPlanet()
    {
        double w = mini_map.getWidth();
        double h = mini_map.getHeight();

        // fill the whole canvas with the BG color, starting fresh for this render cycle
        mini_map.getGraphicsContext2D().rect(0, 0, w, h);
        mini_map.getGraphicsContext2D().setFill(Color.rgb(51, 17, 0));
        mini_map.getGraphicsContext2D().fillRect(0,0,w,h);

        // draw a border
        mini_map.getGraphicsContext2D().rect(0.0, 0.0, w, h);
        mini_map.getGraphicsContext2D().setStroke(Color.DARKORANGE);
        mini_map.getGraphicsContext2D().setLineWidth(5);
        mini_map.getGraphicsContext2D().stroke();
        mini_map.getGraphicsContext2D().closePath();

        mini_map.getGraphicsContext2D().setTextAlign(TextAlignment.CENTER);
        mini_map.getGraphicsContext2D().setTextBaseline(VPos.CENTER);
        mini_map.getGraphicsContext2D().setFill(Color.DARKORANGE);

        // write the distance text near the marked location
        mini_map.getGraphicsContext2D().fillText("Currently Off-planet", w / 2, h / 2);
    }

    private void renderMiniMap()
    {
        if (!nearPlanet.get())
        {
            renderOffPlanet();
            return;
        }

        mini_map.getGraphicsContext2D().clearRect(0,0, mini_map.getWidth(), mini_map.getHeight());

        /* Step 1:
        First order of business is to fill in the background and draw a border around the map itself. The minimap
        canvas may be re-sized, so we calculate everything based on the current size.
         */

        double w = mini_map.getWidth();
        double h = mini_map.getHeight();

        // fill the whole canvas with the BG color, starting fresh for this render cycle
        mini_map.getGraphicsContext2D().rect(0, 0, w, h);
        mini_map.getGraphicsContext2D().setFill(UIFunctions.Style.darkestOrange);
        mini_map.getGraphicsContext2D().fillRect(0,0,w,h);

        // draw a border
        mini_map.getGraphicsContext2D().rect(0.0, 0.0, w, h);
        mini_map.getGraphicsContext2D().setStroke(UIFunctions.Style.darkOrange);
        mini_map.getGraphicsContext2D().setLineWidth(5);
        mini_map.getGraphicsContext2D().stroke();
        mini_map.getGraphicsContext2D().closePath();

        double gridDist = UIFunctions.Data.mapRange(mini_map_scale.getValue(),
                mini_map_scale.getMin(),
                mini_map_scale.getMax(),
                mini_map.getWidth() / 8,
                mini_map.getWidth() / 4);

        mini_map.getGraphicsContext2D().setStroke(UIFunctions.Style.darkerOrange);
        mini_map.getGraphicsContext2D().setLineWidth(2);

        double s = 0;
        while (s < mini_map.getWidth())
        {
            mini_map.getGraphicsContext2D().strokeLine(s,0, s, mini_map.heightProperty().doubleValue());
            mini_map.getGraphicsContext2D().strokeLine(0, s, mini_map.widthProperty().doubleValue(), s);
            s += gridDist;
        }


        /* Step 2:
        Next we have to draw the player's ship icon, which is a small arrow-like triangle. The arrow must be rotated
        correctly so the player can use it as a rough directional guide. Note the arrow will always appear in the
        center of the map, the waypoints will "move" as the player's position changes.
         */

        // find where the center of the arrow icon will be
        double centerX = w / 2;
        double centerY = h / 2;

        // define a y off-set for the "tip" of the arrow. Will re use the center X
        double topY = centerY - 10;

        // define a point for the "left fletching" of the arrow
        double leftX = centerX - 5;
        double leftY = centerY + 10;

        // define a y off-set for the "nock" of the arrow. Will re use the center X
        double midY = centerY + 5;

        // define a point for the "right fletching" of the arrow
        double rightX = centerX + 5;
        double rightY = centerY + 10;

        // get the current heading
        double angle = Double.parseDouble(status_heading.getText());

        // save the existing transform so we can return after drawing the arrow, and have a base to rotate from
        Affine baseTransform = mini_map.getGraphicsContext2D().getTransform();

        // create our rotation transform from the base one
        Affine rot = baseTransform.clone();

        // now actually rotate to the correct angle
        rot.append(new Rotate(angle, centerX, centerY));

        // set the current transform to our correct rotation, set the color and then actually draw the polygon
        mini_map.getGraphicsContext2D().setTransform(rot);
        mini_map.getGraphicsContext2D().setFill(Color.ORANGE);
        mini_map.getGraphicsContext2D().fillPolygon(new double[]{centerX, leftX, centerX, rightX},
                new double[]{topY, leftY, midY, rightY}, 4);

        // once we're done, set the transform back to normal so remaining draw operations work as expected
        mini_map.getGraphicsContext2D().setTransform(baseTransform);


        /* Step 3:
        The process below is what renders the marked waypoints
         */

        waypoint_list.getItems().forEach(wayPoint ->
        {
            ObservableList<Waypoint> x = waypoint_list.getSelectionModel().getSelectedItems();

            Waypoint selectedWayPoint = x.size() > 0 ? x.get(0) : null;

            Color color = Color.LIGHTBLUE;
            if (selectedWayPoint != null)
            {
                if (wayPoint.equals(selectedWayPoint)) color = Color.DARKORANGE;
            }

            renderWaypoint(wayPoint.longitude, wayPoint.latitude, centerX, centerY, color, wayPoint.name + "\n\n" + "$D");
        });

        // render closest settlement
        renderWaypoint(settlementLong, settlementLat, centerX, centerY, Color.YELLOW, settlement + "\n\n" + "$D");

        if (inSRV)
        {
            renderWaypoint(lastShipLong, lastShipLat, centerX, centerY, Color.LIME, ship_name_label.getText() + "\n\n" + "$D");
        }
    }


    private double calculateDistance(double currentLong,
                                     double currentLat,
                                     double waypointLongitude,
                                     double waypointLatitude)
    {
        double latDistance = Math.toRadians(waypointLatitude - currentLat);
        double lonDistance = Math.toRadians(waypointLongitude - currentLong);

        double a = Math.sin(latDistance / 2)
                * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(currentLat))
                * Math.cos(Math.toRadians(waypointLatitude))
                * Math.sin(lonDistance / 2)
                * Math.sin(lonDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        double haversine = planetRadius * c;

        // todo: should store status_altitude as a double not string
        return Math.sqrt(Math.pow(haversine, 2) +
                Math.pow(Double.parseDouble(status_altitude.getText()),2));
    }

    private void renderWaypoint(double waypointLongitude, double waypointLatitude, double centerX, double centerY, Color color, String text)
    {
        //         TODO: should handle multiple waypoints

        double currentLat = Double.parseDouble(status_latitude.getText());
        double currentLong = Double.parseDouble(status_longitude.getText());

        // todo: these multipliers need to change based on SRV or Ship
        double mX = currentLong - waypointLongitude;
        mX *= mini_map_scale.getValue();
        double mY = currentLat - waypointLatitude;
        mY *= mini_map_scale.getValue();

        double markX = centerX - mX;
        double markY = centerY + mY;

        double distance = calculateDistance(currentLong, currentLat, waypointLongitude, waypointLatitude);

        boolean kmScale = distance > 1000;
        if (kmScale) distance = distance / 1000d;
        String unit = kmScale ? "km" : "m";
        distance = UIFunctions.Data.round(distance, kmScale ? 1 : 0);
        if (text == null) text = distance + unit;
        else text = text.replaceAll("\\$D",distance + unit);
        if (!kmScale) text = text.replace(".0","");

        // draw the waypoint on the map
        mini_map.getGraphicsContext2D().setFill(color);
        mini_map.getGraphicsContext2D().fillPolygon(new double[]{markX - 3, markX - 3, markX + 3, markX + 3},
                new double[]{markY - 3, markY + 3, markY + 3, markY - 3}, 4);

        // write the distance text near the marked location
        mini_map.getGraphicsContext2D().fillText(text, markX + 5, markY);
    }

    private void initializeMarketTables()
    {
        market_table.setItems(importMarketData);
        market_table1.setItems(exportMarketData);

        bindTableResize(market_table, market_commodity_col);
        bindTableResize(market_table1, market_commodity_col1);

        @SuppressWarnings("unchecked")
        final Callback<TableColumn<MarketData, MarketData>, TableCell<MarketData, MarketData>>
                commodityCellFactory = (x) ->
        {
            TableCell<?,?> c = new CostDataCell();
            return ((TableCell<MarketData, MarketData>) c);
        };

        final Callback<TableColumn.CellDataFeatures<MarketData, MarketData>, ObservableValue<MarketData>>
                commodityCellValueFactory = (materialData) -> new ReadOnlyObjectWrapper<>(materialData.getValue());

        market_commodity_col.setCellFactory(commodityCellFactory);
        market_commodity_col.setCellValueFactory(commodityCellValueFactory);
        market_commodity_col1.setCellFactory(commodityCellFactory);
        market_commodity_col1.setCellValueFactory(commodityCellValueFactory);


        market_sell_col.setCellValueFactory(param -> new SimpleIntegerProperty(param.getValue().getSell()).asObject());
        market_mean_col.setCellValueFactory(param -> new SimpleIntegerProperty(param.getValue().getMean()).asObject());
        market_demand_col.setCellValueFactory(param ->
        {
            int demand = param.getValue().getDemand() > 1
                    ? param.getValue().getDemand()
                    : 0;

            return new SimpleIntegerProperty(demand).asObject();
        });


        market_profit_col.setCellValueFactory(param ->
        {
            int profit = param.getValue().getDemand() == 1
                    ? 0
                    : param.getValue().getSell() - param.getValue().getMean();

            return new SimpleIntegerProperty(profit).asObject();
        });

        market_buy_col1.setCellValueFactory(param -> new SimpleIntegerProperty(param.getValue().getBuy()).asObject());
        market_mean_col1.setCellValueFactory(param -> new SimpleIntegerProperty(param.getValue().getMean()).asObject());
        market_stock_col1.setCellValueFactory(param -> new SimpleIntegerProperty(param.getValue().getStock()).asObject());

        market_income_col1.setCellValueFactory(param ->
        {
            int profit = param.getValue().getBuy() == 0 || param.getValue().getStock() == 0
                    ? 0
                    : param.getValue().getMean() - param.getValue().getBuy();

            return new SimpleIntegerProperty(profit).asObject();
        });
    }


    private void initializeComponents()
    {
        makeProcurementTree();
        startTransactionProcessor();
        startupTasks();
        fromJson();
        initializeMarketTables();

        mini_map_scale.valueProperty().addListener((observable, oldValue, newValue) -> renderMiniMap());

        waypoint_list.setCellFactory(new Callback<ListView<Waypoint>, ListCell<Waypoint>>()
        {
            @Override
            public ListCell<Waypoint> call(ListView<Waypoint> param)
            {
                return new ListCell<Waypoint>()
                {
                    @Override
                    protected void updateItem(Waypoint item, boolean empty)
                    {
                        super.updateItem(item, empty);
                        if (item == null || empty)
                        {
                            setText(null);
                            setGraphic(null);
                            return;
                        }
                        setText((item.name == null ? "" : item.name + " ")  + "Lat: " + item.latitude + " Long: " + item.longitude);
                    }
                };
            }
        });

        renderMiniMap();

        status_mark.onMouseClickedProperty().setValue((e)->
        {
            double markedLat = Double.parseDouble(status_latitude.getText());
            double markedLong = Double.parseDouble(status_longitude.getText());

            waypoint_list.getItems().add(new Waypoint(waypoint_name_input.getText(), markedLat, markedLong));
        });
    }



    private static class Waypoint
    {
        private final String name;
        private final double latitude;
        private final double longitude;

        private Waypoint(String name, double latitude, double longitude)
        {
            this.name = name;
            this.latitude = latitude;
            this.longitude = longitude;
        }
    }

    private String settlement = "";
    private double settlementLat = 0.0;
    private double settlementLong = 0.0;

    @SuppressWarnings("unchecked")
    private void updateMarketTable(UserTransaction nextTransaction)
    {
        market_name.setText(nextTransaction.getMessage());

        importMarketData.clear();
        exportMarketData.clear();

        if (nextTransaction.getStatusObject().get("Items") != null)
        {
            List<MarketData> imports = new ArrayList<>();
            List<MarketData> exports = new ArrayList<>();

            ((List<Map<String, Object>>) nextTransaction.getStatusObject().get("Items"))
                    .stream()
                    .map(object ->
                    {
                        boolean produces = ((boolean) object.get("Producer"));
                        boolean consumes = ((boolean) object.get("Consumer"));

                        // This ternary is hilarious on purpose
                        String market = produces && consumes ? "Both"
                                : produces ? "Exports"
                                        : consumes ? "Imports"
                                                : "None";

                        return MarketData.builder().setMarket(market)
                                .setName(((String) object.get("Name_Localised")))
                                .setCategory(((String) object.get("Category_Localised")))
                                .setBuy(((int) object.get("BuyPrice")))
                                .setSell(((int) object.get("SellPrice")))
                                .setMean(((int) object.get("MeanPrice")))
                                .setStock(((int) object.get("Stock")))
                                .setDemand(((int) object.get("Demand")))
                                .build();
                    })
                    .forEach(data ->
                    {
                        if (data.getMarket().equals("Imports")) imports.add(data);
                        if (data.getMarket().equals("Exports")) exports.add(data);

                        if (data.getMarket().equals("Both"))
                        {
                            imports.add(data);
                            exports.add(data);
                        }

                        if (data.getMarket().equals("None")) messageLogger(UserTransaction.MessageType.GENERAL,
                                "Commodity: " + data.getName() + " listed with no import or export information");
                    });


            importMarketData.addAll(imports);
            exportMarketData.addAll(exports);
        }
    }

    private boolean transactionsComplete = false;

    enum Status
    {
        DOCKED(0x0000_0001),
        LANDED(0x0000_0002),
        LANDING_GEAR_DOWN(0x0000_0004),
        SHIELDS_UP(0x0000_0008),
        SUPERCRUISE(0x0000_0010),
        FLIGHT_ASSIST_OFF(0x0000_0020),
        HARDPOINTS_DEPLOYED(0x0000_0040),
        IN_WING(0x0000_0080),
        LIGHTS_ON(0x0000_0100),
        CARGO_SCOOP_DEPLOYED(0x0000_0200),
        SILENT_RUNNING(0x0000_0400),
        SCOOPING_FUEL(0x0000_0800),
        SRV_HANDBRAKE(0x0000_1000),
        SRV_TURRET_DEPLOYED(0x0000_2000),
        SRV_TURRET_DISABLED(0x0000_4000),
        SRV_DRIVE_ASSIST(0x0000_8000),
        FSD_MASS_LOCKED(0x0001_0000),
        FSD_CHARGING(0x0002_0000),
        FSD_COOL_DOWN(0x0004_0000),
        LOW_FUEL(0x0008_0000),
        OVER_HEATING(0x0010_0000),
        HAS_LAT_LONG(0x0020_0000),
        IS_IN_DANGER(0x0040_0000),
        BEING_INTERDICTED(0x0080_0000),
        IN_MAIN_SHIP(0x0100_0000),
        IN_FIGHTER(0x0200_0000),
        IN_SRV(0x0400_0000),
        HUD_IN_ANALYSIS_MODE(0x0800_0000),
        NIGHT_VISION(0x1000_0000),

        ;

        final int bitmask;

        Status(int bitmask)
        {
            this.bitmask = bitmask;
        }

        public static Stream<Status> extractFlags(int flags)
        {
            return Stream.of(Status.values())
                    .filter(flag -> (flag.bitmask & flags) == flag.bitmask);
        }
    }


    private void startTransactionProcessor()
    {
        // convenience function that adjusts items and also refreshes teh cost table. This is useful because the
        // item adjustment isn't directly related to the cost table, so adjustments won't automatically trigger a
        // refresh. This allows the table to be refreshed in one function without leaking references into other scopes
        BiConsumer<ProcurementCost, Long> adjustItem = (item, amount) ->
        {
            commanderData.adjustItem(item, amount);
            if (task_cost_table != null) task_cost_table.refresh();
        };


        //TODO: refactor this to use TransactionProcessorTask with callbacks

        // transaction processor
        Runnable transactionProcessingTask = () ->
        {
            Thread.currentThread().setName("Transaction Processor");
            boolean go = true;
            while (go)
            {
                // always be nice and exit if already interrupted
                if (Thread.currentThread().isInterrupted())
                {
                    go = false;
                    continue;
                }

                // get the next transaction
                UserTransaction nextTransaction;
                try
                {
                    // this call blocks until a transaction is ready
                    nextTransaction = transactionQueue.take();
                }
                catch (InterruptedException e)
                {
                    // interruption while waiting for a transaction also triggers an exit
                    go = false;
                    continue;
                }

                // perform the transaction
                switch (nextTransaction.getTransactionType())
                {
                    case VEHICLE:
                        inSRV = nextTransaction.isInSRV();
                        lastShipLat = Double.parseDouble(status_latitude.getText());
                        lastShipLong = Double.parseDouble(status_longitude.getText());
                        break;

                    case INVENTORY:
                        adjustItem.accept(nextTransaction.getInventoryItem(), nextTransaction.getTransactionAmount());
                        break;

                    case BLUEPRINT:
                        procurementListUpdate(nextTransaction.getTransactionAmount(), nextTransaction.getBlueprint());
                        break;

                    case MESSAGE:
                        messageLogger(nextTransaction.getMessageType(), nextTransaction.getMessage());
                        break;

                    case ARRIVAL:
                        processArrival(nextTransaction);
                        break;

                    case MARKET:
                        if (Platform.isFxApplicationThread()) { updateMarketTable(nextTransaction); }
                        else { Platform.runLater(() -> updateMarketTable(nextTransaction)); }
                        break;

                    case STATUS:
                        Platform.runLater(()->
                        {
                            Map<String, Object> statusObject = nextTransaction.getStatusObject();

                            Integer flags  = ((Integer) statusObject.get("Flags"));

                            List<Status> currentFlags = Status.extractFlags(flags)
                                    .collect(Collectors.toList());

                            nearPlanet.set(currentFlags.contains(Status.HAS_LAT_LONG));

                            @SuppressWarnings("unchecked")
                            Map<String, Object> fuelData = ((Map<String, Object>) statusObject.get("Fuel"));

                            status_cargo.setText(statusObject.get("Cargo") + " Tons");
                            status_fuel.setText(fuelData.get("FuelMain") + " Tons");
                            status_fuel_reservoir.setText(fuelData.get("FuelReservoir") + " Tons");

                            Object Altitude  = statusObject.get("Altitude");
                            Object Latitude  = statusObject.get("Latitude");
                            Object Longitude  = statusObject.get("Longitude");
                            Object Heading  = statusObject.get("Heading");

                            Object radius  = statusObject.get("PlanetRadius");

                            status_altitude.setText("0.0");
                            status_latitude.setText("0.0");
                            status_longitude.setText("0.0");
                            status_heading.setText("0.0");

                            if (Altitude != null) status_altitude.setText(Altitude.toString());
                            if (Latitude != null) status_latitude.setText(Latitude.toString());
                            if (Longitude != null) status_longitude.setText(Longitude.toString());
                            if (Heading != null) status_heading.setText(Heading.toString());
                            if (radius != null) planetRadius = ((Double) radius);

                            if (Altitude == null || Latitude == null || Longitude == null || Heading == null) return;

                            double lat = Double.parseDouble(Latitude.toString());
                            double lon = Double.parseDouble(Longitude.toString());

                            if (!waypoint_list.getItems().isEmpty())
                            {
                                ObservableList<Waypoint> x = waypoint_list.getSelectionModel().getSelectedItems();

                                Waypoint selectedWaypoint = x.size() > 0 ? x.get(0) : null;

                                if (selectedWaypoint != null)
                                {
                                    status_bearing.setText(String.valueOf(UIFunctions.Data
                                            .calculateBearingAngle(lat, lon, selectedWaypoint.latitude, selectedWaypoint.longitude)));

                                    status_marked_lat.setText(String.valueOf(selectedWaypoint.latitude));
                                    status_marked_long.setText(String.valueOf(selectedWaypoint.longitude));

                                    double distance = calculateDistance(lon, lat, selectedWaypoint.longitude, selectedWaypoint.latitude);

                                    boolean kmScale = distance > 1000d;
                                    if (kmScale) distance = distance / 1000d;
                                    distance = UIFunctions.Data.round(distance,2);
                                    String unit = kmScale ? "km" : "m";
                                    status_marked_dist.setText(distance +unit);
                                }
                            }

                            renderMiniMap();
                        });
                        break;
                }
                transactionsComplete = transactionQueue.isEmpty();
            }
        };

        int cores = Runtime.getRuntime().availableProcessors();
        int threads = cores / 2;
        if (threads > 6) threads = 6;
        if (threads < 1) threads = 1;
        IntStream.range(0,threads).forEach(i-> transactionPool.submit(transactionProcessingTask));
    }

    private void startupTasks()
    {
        // disk monitor
        Runnable inventorySyncTask = new JournalSyncTask(commanderData, transactionQueue);
        Thread inventoryThread = new Thread(inventorySyncTask);
        inventoryThread.setDaemon(true);
        inventoryThread.start();

        messageExecutor.scheduleAtFixedRate(this::processMessages, 0, 1, TimeUnit.SECONDS);

        while (!transactionsComplete)
        {
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    private Supplier<Boolean> cssReload;

    public void setCSSReloadFunction(Supplier<Boolean> cssReload)
    {
        this.cssReload = cssReload;
        cssReload.get();
    }

    /**
     * Calls the various methods that set up each tab in the UI
     */
    private void initializeUIComponents()
    {
        initializeTextPlaceholders();
        initializeInventoryTables();
        initializeShipLoadoutTab();
        initializeAutoResizeBindings();
        initializeSelectionOverrides();
        initializeProcurementTab();

        console_message_list.setItems(consoleBackingList);
        consoleBackingList.addListener((ListChangeListener<MessageData>) c -> console_message_list.refresh());

        console_message_list.setSelectionModel(new MultipleSelectionModel<MessageData>()
        {
            @Override
            public ObservableList<Integer> getSelectedIndices()
            {
                return FXCollections.emptyObservableList();
            }

            @Override
            public ObservableList<MessageData> getSelectedItems()
            {
                return FXCollections.emptyObservableList();
            }

            @Override
            public void selectIndices(int index, int... indices)
            {

            }

            @Override
            public void selectAll()
            {

            }

            @Override
            public void selectFirst()
            {

            }

            @Override
            public void selectLast()
            {

            }

            @Override
            public void clearAndSelect(int index)
            {

            }

            @Override
            public void select(int index)
            {

            }

            @Override
            public void select(MessageData obj)
            {

            }

            @Override
            public void clearSelection(int index)
            {

            }

            @Override
            public void clearSelection()
            {

            }

            @Override
            public boolean isSelected(int index)
            {
                return false;
            }

            @Override
            public boolean isEmpty()
            {
                return false;
            }

            @Override
            public void selectPrevious()
            {

            }

            @Override
            public void selectNext()
            {

            }
        });
        // todo: abstract this factory out to UIFunctions or something
        console_message_list.setCellFactory(new Callback<ListView<MessageData>, ListCell<MessageData>>()
        {
            @Override
            public ListCell<MessageData> call(ListView<MessageData> param)
            {
                return new ListCell<MessageData>()
                {
                    @Override
                    protected void updateItem(MessageData item, boolean empty)
                    {
                        super.updateItem(item, empty);
                        if (item == null || empty)
                        {
                            setText(null);
                            setGraphic(null);
                            return;
                        }
                        HBox hBox = new HBox();

                        hBox.setAlignment(Pos.TOP_LEFT);

                        Label typeLabel = new Label(item.getMessageType() + "  ");
                        typeLabel.getStyleClass().addAll("base_font");
                        typeLabel.setTextFill(item.getMessageType().getColor());

                        Label message = new Label(item.getMessage());
                        message.setWrapText(true);
                        message.getStyleClass().addAll("base_font");
                        hBox.getChildren().addAll(typeLabel, message);
                        message.prefWidthProperty()
                                .bind(console_message_list.widthProperty()
                                        .subtract(typeLabel.widthProperty())
                                        .subtract(30));
                        setGraphic(hBox);
                    }
                };
            }
        });
    }

    /**
     * Sets up the the procurement tasks tab
     */
    private void initializeProcurementTab()
    {
        SimpleStringProperty labelText = new SimpleStringProperty("");
        procurement_label.textProperty().bind(labelText);
        procurement_tree.setCellFactory(param -> new ProcurementTreeCell(procSelectorBackingList, labelText));
        procurement_list.setItems(procSelectorBackingList);
        procurement_list.setCellFactory(param -> new ProcurementListCell(addTaskToProcurementList,
                commanderData::amountOf, procurement_list.widthProperty()));

        procurement_task_table.setItems(sortedTasks);
        sortedTasks.comparatorProperty().bind(procurement_task_table.comparatorProperty());
        task_cost_table.setItems(sortedCosts);

        task_count_column.setCellFactory(x -> new TaskCountCell());
        task_count_column.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue()));

        task_progress_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));
        task_progress_column.setCellFactory(UIFunctions.Data.taskProgressCellFactory);

        task_type_column.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair().getValue()));
        task_type_column.setCellFactory(x-> new TaskTypeCell());

        task_name_column.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue()));
        task_name_column.setCellFactory(x -> new TaskDataCell());

        task_remove_column.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair()));
        task_remove_column.setCellFactory(x -> new TaskRemoveCell(addPairToProcurementList));

        task_cost_need_column.setCellValueFactory(UIFunctions.Data.costNeedCellFactory);
        task_cost_need_column.setCellFactory(x -> new CostValueCell());

        task_cost_name_column.setCellValueFactory(modMaterial -> new ReadOnlyObjectWrapper<>(modMaterial.getValue()));
        task_cost_name_column.setCellFactory(x -> new CostDataCell());

        task_cost_progress_column.setCellFactory(UIFunctions.Data.costProgressCellFactory);
        task_cost_progress_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));

        task_cost_type_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getCost().getGrade()));
        task_cost_type_column.setCellFactory(x -> new CostGradeCell());

        //sort_tasks_by_name.setOnAction(e -> sortedTasks.setComparator(UIFunctions.Sort.tasksByName));
        //sort_tasks_by_grade.setOnAction(e -> sortedTasks.setComparator(UIFunctions.Sort.taskByGrade));

        show_procurements.setOnAction(e -> setProcurementsUIVisibility());
        show_tasks.setOnAction(e -> setProcurementsUIVisibility());
        show_items_needed.setOnAction(e -> setProcurementsUIVisibility());
    }

    /**
     * Sets text placeholders on certain elements, which controls the text that displays within UI control, such as
     * a list view, when the list is empty.
     */
    private void initializeTextPlaceholders()
    {
        // set placeholder labels shown when the task list is empty
        Label procListLabel = new Label("<---- Select a Task Category");
        Label recipeTableLabel = new Label("Tracked Tasks Will Appear Here");
        Label costTableLabel = new Label("Tracked Items Will Appear Here");
        Label importLabel = new Label("Visit a market to see import commodities");
        Label exportLabel = new Label("Visit a market to see export commodities");

        procListLabel.getStyleClass().addAll("base_font");
        recipeTableLabel.getStyleClass().addAll("base_font");
        costTableLabel.getStyleClass().addAll("base_font");
        importLabel.getStyleClass().addAll("base_font");
        exportLabel.getStyleClass().addAll("base_font");

        procurement_list.setPlaceholder(procListLabel);
        procurement_task_table.setPlaceholder(recipeTableLabel);
        task_cost_table.setPlaceholder(costTableLabel);
        market_table.setPlaceholder(importLabel);
        market_table1.setPlaceholder(exportLabel);

        Label cargoTableLabel = new Label("You are not carrying any cargo");
        Label rawTableLabel = new Label("You are not carrying any raw materials");
        Label mfdTableLabel = new Label("You are not carrying any manufactured materials");
        Label dataTableLabel = new Label("You are not carrying any encoded data");

        cargoTableLabel.getStyleClass().addAll("base_font");
        rawTableLabel.getStyleClass().addAll("base_font");
        mfdTableLabel.getStyleClass().addAll("base_font");
        dataTableLabel.getStyleClass().addAll("base_font");

        cargo_table.setPlaceholder(cargoTableLabel);
        raw_table.setPlaceholder(rawTableLabel);
        manufactured_table.setPlaceholder(mfdTableLabel);
        data_table.setPlaceholder(dataTableLabel);

        Label messageLabel = new Label("Loading Message Log...");
        messageLabel.getStyleClass().addAll("base_font");
        console_message_list.setPlaceholder(messageLabel);

        Label messageLabel2 = new Label("Not currently in a ship...");
        messageLabel2.getStyleClass().addAll("base_font");
        core_module_table.setPlaceholder(messageLabel2);
    }

    /**
     * Sets up the inventory tab
     */
    private void initializeInventoryTables()
    {
        // associate the inventory lists with the table view UI elements that display their contents
        commanderData.associateCommanderName(commander_name);
        commanderData.associateCommanderBalance(credit_balance);
        commanderData.associateCargoTable(cargo_table, show_zero_quantities);
        commanderData.associateRawTable(raw_table, show_zero_quantities);
        commanderData.associateManufacturedTable(manufactured_table, show_zero_quantities);
        commanderData.associateDataTable(data_table, show_zero_quantities);

        // set sorting comparators for each data column
        raw_grade_column.setComparator(UIFunctions.Sort.itemByGrade);
        raw_material_column.setComparator(UIFunctions.Sort.itemByCategory);
        raw_quantity_column.setComparator(UIFunctions.Sort.quantityByNumericValue);
        manufactured_grade_column.setComparator(UIFunctions.Sort.itemByGrade);
        manufactured_material_column.setComparator(UIFunctions.Sort.itemByCategory);
        manufactured_quantity_column.setComparator(UIFunctions.Sort.quantityByNumericValue);
        data_grade_column.setComparator(UIFunctions.Sort.itemByGrade);
        data_material_column.setComparator(UIFunctions.Sort.itemByCategory);
        data_quantity_column.setComparator(UIFunctions.Sort.quantityByNumericValue);
        cargo_grade_column.setComparator(UIFunctions.Sort.itemByGrade);
        cargo_item_column.setComparator(UIFunctions.Sort.itemByCategory);
        cargo_quantity_column.setComparator(UIFunctions.Sort.quantityByNumericValue);

        // This callback defines a simple Label object to use as the contents of the quantity columns for each item
        // type. It is re used for all of the quantity columns, giving them a uniform look
        final Callback<TableColumn.CellDataFeatures<InventoryData, Label>, ObservableValue<Label>>
                inventoryQuantityCellFactory = (materialData) ->
        {
            long quantity = materialData.getValue().getQuantity();
            int max = materialData.getValue().getItem().getGrade().getMaximumQuantity();
            Label label = new Label();
            String q = String.format("%1$" + 3 + "s", quantity);
            if (max != -1)
            {
                q += " / " + max;
            }
            label.setText(q);

            label.paddingProperty().setValue(new Insets(5,0,0,0));
            label.getStyleClass().addAll("inventory_label", "base_font");
            return new ReadOnlyObjectWrapper<>(label);
        };

        // quantity columns use a basic Label value so don't need cell factories
        raw_quantity_column.setCellValueFactory(inventoryQuantityCellFactory);
        manufactured_quantity_column.setCellValueFactory(inventoryQuantityCellFactory);
        data_quantity_column.setCellValueFactory(inventoryQuantityCellFactory);
        cargo_quantity_column.setCellValueFactory(inventoryQuantityCellFactory);

        // manually set the styles for the quantity columns todo: in the future move this to CSS or use custom cells
        raw_quantity_column.setStyle( "-fx-alignment: TOP-CENTER;");
        manufactured_quantity_column.setStyle( "-fx-alignment: TOP-CENTER;");
        data_quantity_column.setStyle( "-fx-alignment: TOP-CENTER;");
        cargo_quantity_column.setStyle( "-fx-alignment: TOP-CENTER;");

        // this Callback implementation provides a simple read-only wrapper around the InventoryData objects
        // stored in the various inventory lists. This is required to use custom display cells in JavaFX. We will
        // re-use this for all the relevant data columns
        final Callback<TableColumn.CellDataFeatures<InventoryData, InventoryData>, ObservableValue<InventoryData>>
                inventoryItemCellValueFactory = (materialData) -> new ReadOnlyObjectWrapper<>(materialData.getValue());

        // These columns use a custom display cells but for the cell values can all use the same read-only wrapper
        raw_material_column.setCellValueFactory(inventoryItemCellValueFactory);
        manufactured_material_column.setCellValueFactory(inventoryItemCellValueFactory);
        data_material_column.setCellValueFactory(inventoryItemCellValueFactory);
        cargo_item_column.setCellValueFactory(inventoryItemCellValueFactory);
        raw_grade_column.setCellValueFactory(inventoryItemCellValueFactory);
        manufactured_grade_column.setCellValueFactory(inventoryItemCellValueFactory);
        data_grade_column.setCellValueFactory(inventoryItemCellValueFactory);
        cargo_grade_column.setCellValueFactory(inventoryItemCellValueFactory);

        // This call back simply creates a new custom data cell which is used int he center "data" columns
        // of the various inventory UI tables. The custom cell contains the display logic and supports all of the
        // various item categories, so we can re use it for all of the data columns

        // todo: use this for other displayables
        @SuppressWarnings("unchecked")
        final Callback<TableColumn<InventoryData, InventoryData>, TableCell<InventoryData, InventoryData>>
                inventoryItemCellFactory = (x) ->
        {
            TableCell c = new CostDataCell();
            return ((TableCell<InventoryData, InventoryData>) c);
        };


        raw_material_column.setCellFactory(inventoryItemCellFactory);
        manufactured_material_column.setCellFactory(inventoryItemCellFactory);
        data_material_column.setCellFactory(inventoryItemCellFactory);
        cargo_item_column.setCellFactory(inventoryItemCellFactory);

        raw_material_progress_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));
        manufactured_progress_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));
        data_progress_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));

        raw_material_progress_column.setComparator(UIFunctions.Sort.progressByValue);
        manufactured_progress_column.setComparator(UIFunctions.Sort.progressByValue);
        data_progress_column.setComparator(UIFunctions.Sort.progressByValue);


        // the "item grade" columns use a very similar structure to the "data" columns, with the same read-only wrapper
        // factory but different custom data cells. This callback provides the custom cells for the item grades
        final Callback<TableColumn<InventoryData, InventoryData>, TableCell<InventoryData, InventoryData>>
                inventoryGradeCellFactory = (x) -> new InventoryGradeCell();

        raw_grade_column.setCellFactory(inventoryGradeCellFactory);
        manufactured_grade_column.setCellFactory(inventoryGradeCellFactory);
        data_grade_column.setCellFactory(inventoryGradeCellFactory);
        cargo_grade_column.setCellFactory(inventoryGradeCellFactory);
    }

    /**
     * Sets up the ship loadout tab
     */
    private void initializeShipLoadoutTab()
    {
        commanderData.getLocation().associateStarSystem(location_label);
        commanderData.getLocation().associateSpaceStation(station_label);
        commanderData.getLocation().associateEconomy(economy_label);

        commanderData.getStarShip().associateShipManufacturer(ship_make_label);
        commanderData.getStarShip().associateShipGivenName(ship_name_label);
        commanderData.getStarShip().associateShipDisplayName(ship_type_label);
        commanderData.getStarShip().associateShipID(ship_ID_label);
        commanderData.getStarShip().associateStatisticsTable(ship_statistics_table);
        commanderData.getStarShip().associateCoreTable(core_module_table);
        commanderData.getStarShip().associateOptionalTable(optional_module_table);
        commanderData.getStarShip().associateHardpointTable(hardpoint_table);

        ship_statistics_name_column.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().statName()));
        ship_statistics_name_column.setCellFactory(x -> new StatDataCell());
        ship_statistics_data_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        ship_statistics_data_column.setCellFactory(x -> new StatDisplayCell());

        core_module_name_column.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        core_module_name_column.setCellFactory(x -> new SlotNameCell());
        core_module_data_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        core_module_data_column.setCellFactory(x -> new ModuleDisplayCell());

        optional_module_name_column.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        optional_module_name_column.setCellFactory(x -> new SlotNameCell());
        optional_module_data_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        optional_module_data_column.setCellFactory(x -> new ModuleDisplayCell());

        hardpoint_name_column.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        hardpoint_name_column.setCellFactory(x -> new SlotNameCell());
        hardpoint_data_column.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        hardpoint_data_column.setCellFactory(x -> new ModuleDisplayCell());
    }

    /**
     * Certain UI elements should auto-adjust their size values based on their siblings and parents' size values.
     * This function handles setting up these bindings to keep the UI elements sized correctly.
     */
    private void initializeAutoResizeBindings()
    {
        bindTableResize(ship_statistics_table, ship_statistics_data_column);
        bindTableResize(raw_table, raw_material_column);
        bindTableResize(manufactured_table, manufactured_material_column);
        bindTableResize(data_table, data_material_column);
        bindTableResize(cargo_table, cargo_item_column);
        bindTableResize(procurement_task_table, task_name_column);
        bindTableResize(task_cost_table, task_cost_name_column);
        bindTableResize(core_module_table, core_module_data_column);
        bindTableResize(optional_module_table, optional_module_data_column);
        bindTableResize(hardpoint_table, hardpoint_data_column);

        ship_statistics_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        core_module_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        optional_module_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        hardpoint_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        procurement_task_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        task_cost_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        raw_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        manufactured_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        data_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        cargo_table.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
    }

    /**
     * Ensures that the selection "highlight" is made as unobtrusive as possible. By default, the electric blue
     * selection color is a jarring and selection of elements in this way is unnecessary for this application
     */
    private void initializeSelectionOverrides()
    {
        disableListSelection(console_message_list);

        disableTreeSelection(procurement_tree);
        disableListSelection(procurement_list);

        disableTableSelection(raw_table);
        disableTableSelection(manufactured_table);
        disableTableSelection(data_table);
        disableTableSelection(cargo_table);

        disableTableSelection(procurement_task_table);
        disableTableSelection(task_cost_table);

        disableTableSelection(ship_statistics_table);
        disableTableSelection(core_module_table);
        disableTableSelection(optional_module_table);
        disableTableSelection(hardpoint_table);
    }

    /**
     * Binds a given table column's width to a variable size equal to the "free" horizontal space in its parent table.
     * This variable value automatically updates as the containing table is re-sized. In order to work effectively, all
     * other columns in the provided table should have static widths, and in general the total widths of other columns
     * combined should leave some reasonable amount of free space. When calculating the space to use, the value of
     * {@link UIFunctions#scrollBarAllowance} will be used to ensure scroll bars will work properly.
     *
     * The provided table and column must not be null, and the provided column must actually be a child of the table
     * or this method will have no effect.
     *
     * @param table parent table to derive the base width value from
     * @param column child column to bind to the "free" space in the table
     */
    private <T> void bindTableResize(TableView<T> table, TableColumn<?, ?> column)
    {
        // sanity checks
        Objects.requireNonNull(table);
        Objects.requireNonNull(column);
        if (!table.getColumns().contains(column)) return;

        // collect sibling widths
        List<ReadOnlyDoubleProperty> siblingWidths = table.getColumns().stream()
                .filter(childColumn -> !childColumn.equals(column))
                .map(TableColumnBase::widthProperty)
                .collect(Collectors.toList());

        // initialize binding with the scrollbar allowance
        DoubleBinding bindingWidth = table.widthProperty().subtract(UIFunctions.scrollBarAllowance);

        // subtract all sibling widths from the calculated width binding
        for (ReadOnlyDoubleProperty siblingWidth : siblingWidths)
        {
            bindingWidth = bindingWidth.subtract(siblingWidth);
        }

        // set the calculated binding
        column.prefWidthProperty().bind(bindingWidth);
    }

    /**
     * Binds a selection listener to a TreeView object that automatically clears the object's selection, having the
     * visual effect of disabling the colored selection box around the selected item. The container object that the
     * TreeView is within will still have a very small outline of the selection color, which is unfortunately
     * unavoidable. This is however better visually than the jarring selection highlight.
     *
     * @param treeView tree view object to "disable" selection behavior
     */
    private void disableTreeSelection(TreeView<ProcurementTask> treeView)
    {
        treeView.getSelectionModel().selectedIndexProperty()
                .addListener((x,y,z) -> {
                    Platform.runLater(()->treeView.getSelectionModel().clearSelection());
                    //treeView.getSelectionModel().clearSelection();
                });
    }

    /**
     * Binds a selection listener to a ListView object that automatically clears the object's selection, having the
     * visual effect of disabling the colored selection box around the selected item. The container object that the
     * ListView is within will still have a very small outline of the selection color, which is unfortunately
     * unavoidable. This is however better visually than the jarring selection highlight.
     *
     * @param listView list view object to "disable" selection behavior
     */
    private void disableListSelection(ListView listView)
    {
        listView.getSelectionModel().selectedIndexProperty()
                .addListener((x,y,z) -> {
                    Platform.runLater(()->listView.getSelectionModel().clearSelection());
                    //listView.getSelectionModel().clearSelection();
                });
    }

    /**
     * Binds a selection listener to a TableView object that automatically clears the object's selection, having the
     * visual effect of disabling the colored selection box around the selected item. The container object that the
     * TableView is within will still have a very small outline of the selection color, which is unfortunately
     * unavoidable. This is however better visually than the jarring selection highlight.
     *
     * @param tableView table view object to "disable" selection behavior
     */
    private void disableTableSelection(TableView tableView)
    {
        tableView.getSelectionModel().selectedIndexProperty()
                .addListener((x,y,z) -> {
                    Platform.runLater(()->tableView.getSelectionModel().clearSelection());
                    //tableView.getSelectionModel().clearSelection();
                });
    }

    /**
     * Called after mutations to the "raw" task/cost lists are complete, ensuring the UI is kept in sync
     */
    private void synchronizeBackingLists()
    {
        taskBackingList.clear();
        taskBackingList.addAll(taskList);
        taskCostBackingList.clear();
        taskCostBackingList.addAll(costList);
    }

    private void messageLogger(UserTransaction.MessageType messageType, String message)
    {
        messageQueue.add(new MessageData(message, messageType));
        hasMessages.set(true);
        message_progress.visibleProperty().setValue(true);
        queuedMessages.incrementAndGet();
    }

    private void processArrival(UserTransaction nextTransaction)
    {
        Consumer<UserTransaction> doWork = (transaction) ->
        {
            status_body.setText(transaction.getMessage());

            Map<String, Object> data = transaction.getStatusObject();
            if (data == null) return;

            String event = ((String) nextTransaction.getStatusObject().get("event"));
            if (event == null) return;

            if (event.equalsIgnoreCase(JournalEvent.ApproachSettlement.name()))
            {
                settlement = ((String) data.get("Name"));
                if (data.get("Latitude") != null && data.get("Longitude") != null)
                {
                    settlementLat = ((Double) data.get("Latitude"));
                    settlementLong = ((Double) data.get("Longitude"));
                }
            }
        };

        if (Platform.isFxApplicationThread()) doWork.accept(nextTransaction);
        else Platform.runLater(() -> doWork.accept(nextTransaction));
    }

    private Map<ProcurementCost, Set<String>> costLabelCache = new HashMap<>();

    private String calculateCostLabel(ProcurementType type, ProcurementRecipe recipe)
    {
        List<String> tokens = new ArrayList<>();

        if (type instanceof ModificationType)
        {
            tokens.add("Modification");
            tokens.add(type.toString());
            tokens.add(recipe.getParentBlueprintName());
            tokens.add(recipe.getShortLabel());
        }
        else if (type instanceof ExperimentalType)
        {
            tokens.add("Experimental Effect");
            tokens.add(type.toString());
            tokens.add(recipe.getShortLabel());
        }
        else if (type instanceof TechnologyType)
        {
            tokens.add("Tech Broker Unlock");
            tokens.add(type.toString());
            tokens.add(recipe.getShortLabel());
        }
        else if (type instanceof SynthesisType)
        {
            tokens.add("Synthesis");
            tokens.add(type.toString());
            tokens.add(recipe.getShortLabel());
        }
        else if (type instanceof MaterialTradeType)
        {
            tokens.add("Material Trade");
            tokens.add(recipe.getDisplayLabel());
        }
        else if (type instanceof ModulePurchaseType)
        {
            tokens.add("Outfitting");
            tokens.add(type.toString());
            tokens.add(recipe.getShortLabel());
        }

        return tokens.stream()
                .map(String::trim)
                .collect(Collectors.joining(" :: "));
    }

    /**
     * This method is used to add a new "tracked" task to the task list, as well as increase or decrease the count
     * of an existing task in the list. Typically, this method is called by clicking on the various buttons in the
     * UI but can also be called in response to the user performing a task in game. In the later case, this will
     * typically adjust some task count downward as a "tracked" task is completed.
     *
     * Note that the count of any given task is clamped to a max of 999 and will handle adjustments that result in a
     * count of zero or less as a command to remove the task from the list. For example, if some task has a count of 5
     * and and adjustment of -5 is passed for that task (which would adjust teh count to zero), it will be removed from
     * the list. Conversely, if an adjustment would result in a total count greater than 999, the result will simply
     * be exactly 999. Lastly, if an adjustment of any non-zero, positive amount is passed AND the desired task is not
     * already present in the list, it will be added with a count matching the adjustment value.
     *
     * @param adjustment the amount by which to adjust the existing count of the desired task
     * @param task the task to adjust the count of in the tracked tasks list
     * @return the total count of the passed in task after the adjustment is applied, zero if the task was removed
     */
    private void procurementListUpdate(long adjustment, Pair<ProcurementType, ProcurementRecipe> task)
    {
        Task<Void> task1 = new Task<Void>()
        {
            @Override
            protected Void call()
            {
                procurementListUpdate1(adjustment, task);
                return null;
            }
        };
        messageExecutor.submit(task1);
    }

    private void procurementListUpdate1(long adjustment, Pair<ProcurementType, ProcurementRecipe> task)
    {
        // find the task we need to adjust
        AtomicReference<ProcurementTaskData> data = new AtomicReference<>(taskList.stream()
                .filter(storedTask -> storedTask.matches(task))
                .findFirst().orElse(null));


        // if this happens, we don't currently have this task in the list, so we need to determine what to
        // do next based on the adjustment amount
        if (data.get() == null)
        {

            // this this was a 0 adjustment or negative, just return -1 indicating the task is not present
            if (adjustment <= 0) return;

                // otherwise, this is an indication that we should add this new task to the list, so we create
                // a new one, and initialize the count to zero, as the actual adjustment logic can then work
                // the same for new and existing tasks
            else
            {

                data.set(new ProcurementTaskData.Builder(0)
                        .setType(task.getKey())
                        .setRecipe(task.getValue())
                        .setCheckInventory(commanderData::amountOf)
                        .setPendingTradeYield(calculateTradeYield)
                        .setInventoryUpdate(addPairToProcurementList)
                        .setGetCurrentSystem(commanderData.getLocation()::getStarSystem)
                        .createProcurementTaskData());


                taskList.add(data.get());


                // initialize the costs as well, if they are not already present in the cost list. It is
                // critical to ensure a new item is added ONLY if it's not already present, which is
                // possible if another task requires some amount of the same material as this one.
                // Otherwise, duplicate entries will end up in the list
                task.getValue().costStream()
                        .filter(costData -> costData.getQuantity() > 0)
                        .map(CostData::getCost)
                        .filter(taskCost -> costList.stream().noneMatch(cost -> cost.getCost().equals(taskCost)))
                        .map(taskCost ->  new ItemCostData(taskCost,
                                commanderData::amountOf,
                                taskCostCache::contains,
                                costLabelCache::get,
                                calculateTradeYield,
                                tradeCostCache::get,
                                addTaskToProcurementList))
                        .forEach(costList::add);
            }
        }

        // grab the count before adjustment so we can tell how much the final adjustment actually was
        long oldCount = data.get().getCount();

        // here we do a quick sanity count, in case the count is already at the maximum. if that's the case,
        // we will not adjust further, just return the count
        if (oldCount == 999) return;

        // now, we can continue with the adjustment.
        AtomicLong newCount = new AtomicLong(oldCount + adjustment);

        // We max out at 999, just because the UI will get weird and it's unlikely anyone will want/need
        // anywhere near that many tasks of a given type. If the adjustment would bring the value over that
        // maximum, we'll clamp it.
        if (newCount.get() > 999) newCount.set(999);

        // just in case, we also need to check that the adjustment would bring the count below zero. if that
        // would occur, we clamp the new count to 0
        if (newCount.get() < 0) newCount.set(0);

        // now we ACTUALLY set the new count, performing the adjustment
        data.get().setCount(newCount.get());

        // to make sure we've cleaned everything up, if the new count became 0, remove the task
        if (newCount.get() == 0)
        {
            taskList.remove(data.get());
            String costLabel = calculateCostLabel(task.getKey(), task.getValue());
            task.getValue().costStream()
                    .filter(costData -> costData.getQuantity() > 0)
                    .forEach(c ->
                    {

                        costLabelCache.get(c.getCost()).remove(costLabel);
                    });
        }

        // figure out what the difference was, we'll need this to calculate the cost adjustment
        long costDifference = newCount.get() - oldCount;

        // now we need to calculate the cost adjustments that this task adjustment requires. To do this,
        // we find all the costs of this recipe, and multiply the required cost by the cost difference.
        // note that costs with a quantity less than 0 are avoided, this is because a negative code is
        // considered a "yield" of a given task. not all tasks have their output tracked this way
        List<CostData> costAdjustments = task.getValue().costStream()
                .filter(costData -> costData.getQuantity() > 0)
                .map(taskCost -> new CostData(taskCost.getCost(), taskCost.getQuantity() * costDifference))
                .collect(Collectors.toList());

        // if this is a trade recipe, calculate the total pending trade yield and store it. Some UI
        // elements use this information to determine how they measure progress toward a tracked task.
        if (task.getValue() instanceof MaterialTradeRecipe)
        {
            // in practice, these recipes will always have two costs, and one will be negative, indicating
            // that the "cost" is a actually a trade yield. The other is the actual cost. Both values are
            // accumulated in a cache to allow for their cumulative values to be considered in calculations
            task.getValue().costStream()
                    .forEach(costData ->
                    {
                        if (costData.getQuantity() < 0)
                        {
                            // since the cost will be negative, use absolute value
                            long yield = Math.abs(costData.getQuantity());

                            // the yield adjustment is applied to the current count of this cost
                            long yieldAdjustment = yield * adjustment;

                            // grab the current pending yield for this trade, init to zero if not present
                            int current = tradeYieldCache.computeIfAbsent(costData.getCost(), (x) -> 0);

                            // apply the adjustment to the current cost
                            current += yieldAdjustment;

                            // if the adjustment would make the quantity zero or less, remove the cached item
                            if (current <= 0) tradeYieldCache.remove(costData.getCost());

                            // otherwise, update the cached pending yield
                            else tradeYieldCache.put(costData.getCost(), current);
                        }
                        else
                        {
                            // since the cost will be positive, use value as-is
                            long tradeCost = costData.getQuantity();

                            // the yield adjustment is applied to the current count of this cost
                            long costAdjustment = tradeCost * adjustment;

                            // grab the current pending yield for this trade, init to zero if not present
                            int current = tradeCostCache.computeIfAbsent(costData.getCost(), (x) -> 0);

                            // apply the adjustment to the current cost
                            current += costAdjustment;

                            // if the adjustment would make the quantity zero or less, remove the cached item
                            if (current <= 0) tradeCostCache.remove(costData.getCost());

                            // otherwise, update the cached pending yield
                            else tradeCostCache.put(costData.getCost(), current);
                        }
                    });
        }

        // loop through the cost list and make the actual adjustments, then collect the adjusted
        // costs so we can check for any that need to be removed after adjustment.
        costList.stream()
                .filter(costToAdjust -> costAdjustments.stream().anyMatch(costToAdjust::matches))
                .peek(costToAdjust ->
                {
                    if (newCount.get() != 0)
                    {
                        costLabelCache.computeIfAbsent(costToAdjust.getCost(), (k)-> new HashSet<>())
                                .add(calculateCostLabel(task.getKey(), task.getValue()));
                    }

                    // we don't want to count trade costs as cached, because the cache is used to filter
                    // trades from the recommended trades drop down. If we cache the trade costs for these,
                    // the a recommended trade becomes unrecommended as soon as it is added.
                    if (task.getValue() instanceof MaterialTradeRecipe) return;

                    // add this cost to the cost cache. note that the quantity is not captured, all that
                    // is needed is the cost item itself.
                    taskCostCache.add(costToAdjust.getCost());
                })
                .peek(costToAdjust ->
                {
                    CostData toAdjust = costAdjustments.stream()
                            .filter(costToAdjust::matches)
                            .findFirst().orElse(null);

                    if (toAdjust == null) return;

                    costToAdjust.setNeed(costToAdjust.getNeed() + toAdjust.getQuantity());
                })
                .filter(adjustedCost -> adjustedCost.getNeed() <= 0)
                .peek(removedCost ->
                {
                    taskCostCache.remove(removedCost.getCost());
                    if (costLabelCache.get(removedCost.getCost()).isEmpty())
                    {
                        costLabelCache.remove(removedCost.getCost());
                    }
                })
                .forEach(costList::remove);

        synchronizeBackingLists();
    }

    private TreeItem<ProcurementTask> makeTradeTree()
    {
        TreeItem<ProcurementTask> materialTrades = new TreeItem<>(new ProcurementTask("Trades"));

        // loop through all possible trades
        Stream.of(MaterialTradeType.values())
                .forEach(tradeCategory ->
                {
                    // add a collapsible category label
                    TreeItem<ProcurementTask> categoryItem =
                            new TreeItem<>(new ProcurementTask(tradeCategory, tradeCategory.toString()));

                    // for this category, loop through trade sub-categories it contains
                    tradeCategory.subCategoryStream()
                            .forEach(subCategory ->
                            {
                                // add a collapsible subcategory label
                                TreeItem<ProcurementTask> subCatItem =
                                        new TreeItem<>(new ProcurementTask(tradeCategory, subCategory.toString()));

                                // for this subcategory, loop through all materials it contains
                                subCategory.materials().forEach(material -> material.getTradeBlueprint()
                                        .ifPresent(tradeBlueprint->
                                        {
                                            // add a collapsible a selectable material label
                                            TreeItem<ProcurementTask> bluePrintItem =
                                                    new TreeItem<>(new ProcurementTask(tradeCategory, tradeBlueprint));

                                            // add the material item to the subcategory
                                            subCatItem.getChildren().add(bluePrintItem);
                                        }));

                                // add the subcategory item to the category
                                categoryItem.getChildren().add(subCatItem);
                            });

                    // add the category item to the root
                    materialTrades.getChildren().add(categoryItem);
                });

        return materialTrades;
    }

    private TreeItem<ProcurementTask> makeModuleTree()
    {
        TreeItem<ProcurementTask> modulePrices = new TreeItem<>(new ProcurementTask("Modules"));

        // loop through all possible trades
        Stream.of(ModulePurchaseType.values())
                .forEach(modulePurchaseType ->
                {
                    // for this category, loop through trade sub-categories it contains
                    modulePurchaseType.getBluePrints()
                            .forEach(blueprint ->
                            {
                                // add a collapsible subcategory label
                                TreeItem<ProcurementTask> subCatItem =
                                        new TreeItem<>(new ProcurementTask(modulePurchaseType, blueprint));

                                // add the subcategory item to the category
                                modulePrices.getChildren().add(subCatItem);
                            });
                });

        return modulePrices;
    }

    private TreeItem<ProcurementTask> makeSynthesisTree()
    {
        TreeItem<ProcurementTask> modifications = new TreeItem<>(new ProcurementTask("Synthesis"));

        // loop through all mod categories
        Arrays.stream(SynthesisCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcurementTask> categoryItem = new TreeItem<>(new ProcurementTask(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcurementTask> typeItem = new TreeItem<>(new ProcurementTask(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a selectable blueprint label
                    TreeItem<ProcurementTask> bluePrintItem = new TreeItem<>(new ProcurementTask(type, blueprint));

                    // add the blueprint item to this mod type
                    typeItem.getChildren().add(bluePrintItem);
                });

                // add the type item to this category
                categoryItem.getChildren().add(typeItem);
            });

            // add this category to the root
            modifications.getChildren().add(categoryItem);
        });

        return modifications;
    }

    private TreeItem<ProcurementTask> makeModificationTree()
    {
        TreeItem<ProcurementTask> modifications = new TreeItem<>(new ProcurementTask("Modifications"));

        // loop through all mod categories
        Arrays.stream(ModificationCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcurementTask> categoryItem = new TreeItem<>(new ProcurementTask(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcurementTask> typeItem = new TreeItem<>(new ProcurementTask(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a selectable blueprint label
                    TreeItem<ProcurementTask> bluePrintItem = new TreeItem<>(new ProcurementTask(type, blueprint));

                    // add the blueprint item to this mod type
                    typeItem.getChildren().add(bluePrintItem);
                });

                // add the type item to this category
                categoryItem.getChildren().add(typeItem);
            });

            // add this category to the root
            modifications.getChildren().add(categoryItem);
        });

        return modifications;
    }

    private TreeItem<ProcurementTask> makeExperimentTree()
    {
        TreeItem<ProcurementTask> experiments = new TreeItem<>(new ProcurementTask("Experimentals"));

        // loop through all mod categories
        Arrays.stream(ExperimentalCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcurementTask> categoryItem = new TreeItem<>(new ProcurementTask(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a selectable blueprint label
                    TreeItem<ProcurementTask> bluePrintItem = new TreeItem<>(new ProcurementTask(type, blueprint));

                    // add the blueprint item to this mod type
                    categoryItem.getChildren().add(bluePrintItem);

                });
            });

            // add this category to the root
            experiments.getChildren().add(categoryItem);
        });

        return experiments;
    }

    private TreeItem<ProcurementTask> makeTechnologyTree()
    {
        TreeItem<ProcurementTask> modifications = new TreeItem<>(new ProcurementTask("Technology"));

        // loop through all mod categories
        Arrays.stream(TechnologyCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcurementTask> categoryItem = new TreeItem<>(new ProcurementTask(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcurementTask> typeItem = new TreeItem<>(new ProcurementTask(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a collapsible blueprint label
                    TreeItem<ProcurementTask> bluePrintItem = new TreeItem<>(new ProcurementTask(type, blueprint));

                    // add the blueprint item to this mod type
                    typeItem.getChildren().add(bluePrintItem);
                });

                // add the type item to this category
                categoryItem.getChildren().add(typeItem);
            });

            // add this category to the root
            modifications.getChildren().add(categoryItem);
        });

        return modifications;
    }

    @SuppressWarnings("unchecked")
    private void makeProcurementTree()
    {
        // create an root object for procurements
        TreeItem<ProcurementTask> root = new TreeItem<>(new ProcurementTask("root"));

        // create and add the various procurement sub-trees to the root object
        root.getChildren().addAll(
                makeModuleTree(),
                makeSynthesisTree(),
                makeModificationTree(),
                makeExperimentTree(),
                makeTechnologyTree(),
                makeTradeTree());

        // set the root as expanded by default
        root.setExpanded(true);

        // now that the root object has been filled with sub-trees, add it to the tree
        procurement_tree.setRoot(root);

        // hide the root, showing just its children in the tree view
        procurement_tree.setShowRoot(false);

        procurement_tree.setOnMouseClicked((e)->{});
    }

    private void sortInventory()
    {
        // sort pass 1, numerically by grade
        raw_table.getItems().sort(UIFunctions.Sort.itemByGrade);
        manufactured_table.getItems().sort(UIFunctions.Sort.itemByGrade);
        data_table.getItems().sort(UIFunctions.Sort.itemByGrade);

        // sort pass 2, alphabetically, by category name
        raw_table.getItems().sort(UIFunctions.Sort.itemByCategory);
        manufactured_table.getItems().sort(UIFunctions.Sort.itemByCategory);
        data_table.getItems().sort(UIFunctions.Sort.itemByCategory);

        // Cargo sorts a bit differently,
        cargo_table.getItems().sort(UIFunctions.Sort.itemByGrade);
        cargo_table.getItems().sort(UIFunctions.Sort.itemByCount);
    }

    private void setProcurementsUIVisibility()
    {
        int shown = 0;

        if (show_procurements.isSelected())
        {
            shown++;
            procurement_label.setMinHeight(35);
            procurement_box.setPrefHeight(10000);
            procurement_box.setVisible(true);
        }
        else
        {
            procurement_label.setMinHeight(0);
            procurement_box.setPrefHeight(0);
            procurement_box.setVisible(false);
        }

        if (show_tasks.isSelected())
        {
            shown++;
            task_pane.setVisible(true);
            task_pane.setPrefHeight(10000);
        }
        else
        {
            task_pane.setVisible(false);
            task_pane.setPrefHeight(0);
        }


        if (show_items_needed.isSelected())
        {
            shown++;
            task_cost_table.setPrefHeight(10000);
            task_cost_table.setVisible(true);
        }
        else
        {
            task_cost_table.setPrefHeight(0);
            task_cost_table.setVisible(false);

        }

        if (shown == 1)
        {
            if (show_procurements.isSelected()) show_procurements.setDisable(true);
            if (show_tasks.isSelected()) show_tasks.setDisable(true);
            if (show_items_needed.isSelected()) show_items_needed.setDisable(true);
        }
        else
        {
            show_procurements.setDisable(false);
            show_tasks.setDisable(false);
            show_items_needed.setDisable(false);
        }
    }

    @SuppressWarnings("unchecked")
    private void localizeData()
    {
        InputStream jsonStream = null;
        try
        {
            URL localizationData = getClass().getResource("/localization/eng.json");
            jsonStream = localizationData.openStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Map<String, Object> data = JSONSupport.Parse.jsonStream.apply(jsonStream);

        ((Map<String, Object>) data.get("materials"))
                .forEach((key, value) ->
                {
                    ProcurementCost material = Material.valueOf(key);
                    material.setLocalizedName(((String) ((Map<String, Object>) value).get("name")));
                    List<String> locations = ((List<String>) ((Map<String, Object>) value).get("locations"));
                    material.setLocationInformation(locations.stream().collect(Collectors.joining("\n")));
                });

        ((Map<String, Object>) data.get("commodities"))
                .forEach((key, value) ->
                {
                    ProcurementCost commodity = Commodity.valueOf(key);
                    commodity.setLocalizedName(((String) ((Map<String, Object>) value).get("name")));
                    List<String> locations = ((List<String>) ((Map<String, Object>) value).get("locations"));
                    commodity.setLocationInformation(locations.stream().collect(Collectors.joining("\n")));

                });
    }

    private void toJson(WindowDimensions windowDimensions) throws IOException
    {
        // this is the raw JSON object that is saved to disk
        Map<String, Object> data = new HashMap<>();

        Map<String, Object> dimensionData = new LinkedHashMap<>();
        dimensionData.put("x",windowDimensions.getX());
        dimensionData.put("y",windowDimensions.getY());
        dimensionData.put("h",windowDimensions.getHeight());
        dimensionData.put("w",windowDimensions.getWidth());
        data.put("window", dimensionData);

        List<Map<String, Object>> tasks = taskBackingList.stream()
                .map(e->
                {
                    // todo: it may be beneficial to store the JSON output logic inside the procurement type
                    // implementation, so if it needs to be different (ex: trade recipes) this code can delegate
                    // to another class that has the specific serialization logic

                    Pair<ProcurementType, ProcurementRecipe> pair = e.asPair();
                    ProcurementType type = pair.getKey();
                    ProcurementRecipe recipe = pair.getValue();

                    boolean isTrade = type instanceof MaterialTradeType;
                    boolean isModulePurchase = type instanceof ModulePurchaseType;

                    Long count = e.getCount();

                    String procType = type.getClass().getSimpleName();
                    String procName = type.getName();

                    String recipeType = recipe.getClass().getSimpleName();
                    String recipeName = recipe.getName();

                    //todo: if this is a trade recipe, we need to write the price/product costs in the JSON object

                    Map<String, Object> procTypedata = new LinkedHashMap<>();
                    procTypedata.put(procType, procName);

                    if (isTrade)
                    {
                        procTypedata.put(recipeType, ((MaterialTradeRecipe) recipe).serializeRecipe());
                    }
                    else if (isModulePurchase)
                    {
                        procTypedata.put(recipeType, ((ModulePurchaseRecipe) recipe).getEnumName());
                    }
                    else procTypedata.put(recipeType, recipeName);

                    procTypedata.put("Count", count);

                    return procTypedata;
                }).collect(Collectors.toList());

        data.put("tasks", tasks);

        File file = new File(DATA_FOLDER, "tasks.json");
        if (!file.exists() && !file.createNewFile()) throw new RuntimeException("Could not create file");

        JSONSupport.Write.jsonToFile.apply(file, data);
    }

    private static final String DATA_FOLDER = System.getProperty("user.home")
            + File.separator + "CMDR_J";

    @SuppressWarnings("unchecked")
    private void fromJson()
    {
        File file = new File(DATA_FOLDER, "tasks.json");
        if (!file.getParentFile().mkdirs() && !file.getParentFile().exists())
        {
            System.err.println("Parent directory inaccessible");
            return;
        }
        if (!file.exists())
        {
            System.err.println("tasks.json File not found");
            return;
        }

        Map<String, Object> data = JSONSupport.Parse.jsonFile.apply(file);

        if (data.get("window") != null)
        {
            Map<String, Object> window = ((Map<String, Object>) data.get("window"));

            windowDimensions = WindowDimensions.builder()
                    .setX(((double) window.get("x")))
                    .setY(((double) window.get("y")))
                    .setHeight(((double) window.get("h")))
                    .setWidth(((double) window.get("w")))
                    .build();
        }
        else windowDimensions = WindowDimensions.builder().build();

        taskBackingList.clear();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> tasks = ((List<Map<String, Object>>) data.get("tasks"));
        tasks.forEach(taskEntry ->
        {
            AtomicReference<ProcurementType> procType = new AtomicReference<>();
            AtomicReference<ProcurementRecipe> recipeType = new AtomicReference<>();
            AtomicInteger count = new AtomicInteger(0);

            taskEntry.forEach((key, value) ->
            {
                switch (key)
                {
                    /*
                    Types
                     */

                    case "ExperimentalType":
                        procType.set(ExperimentalType.valueOf((String) value));
                        break;

                    case "ModificationType":
                        procType.set(ModificationType.valueOf((String) value));
                        break;

                    case "SynthesisType":
                        procType.set(SynthesisType.valueOf((String) value));
                        break;

                    case "TechnologyType":
                        procType.set(TechnologyType.valueOf((String) value));
                        break;

                    case "MaterialTradeType":
                        procType.set(MaterialTradeType.valueOf((String) value));
                        break;

                    case "ModulePurchaseType":
                        procType.set(ModulePurchaseType.valueOf(((String) value)));
                        break;


                    /*
                    Recipes
                     */

                    case "ExperimentalRecipe":
                        recipeType.set(ExperimentalRecipe.valueOf((String) value));
                        break;

                    case "ModificationRecipe":
                        recipeType.set(ModificationRecipe.valueOf((String) value));
                        break;

                    case "SynthesisRecipe":
                        recipeType.set(SynthesisRecipe.valueOf((String) value));
                        break;

                    case "TechnologyRecipe":
                        recipeType.set(TechnologyRecipe.valueOf((String) value));
                        break;

                    case "MaterialTradeRecipe":
                        recipeType.set(MaterialTradeRecipe.deserializeRecipe(((Map<String, Object>) value)));
                        break;

                    case "ModulePurchaseRecipe":
                        recipeType.set(ModulePurchaseRecipe
                                .deserializeRecipe(((ModulePurchaseType) procType.get()), ((String) value)));
                        break;


                    /*
                    Count
                     */

                    case "Count":
                        count.set((Integer) value);
                        break;

                    default:
                        System.out.println("UNSUPPORTED: "+key);
                }
            });

            transactionQueue.add(UserTransaction.start(UserTransaction.TransactionType.BLUEPRINT)
                    .setTransactionAmount(count.get())
                    .setBlueprint(new Pair<>(procType.get(), recipeType.get()))
                    .build());
        });
    }
}
