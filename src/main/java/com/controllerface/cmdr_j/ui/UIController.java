package com.controllerface.cmdr_j.ui;

import com.controllerface.cmdr_j.JSONSupport;
import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.ProcurementType;
import com.controllerface.cmdr_j.data.MaterialTradeRecipe;
import com.controllerface.cmdr_j.data.MessageData;
import com.controllerface.cmdr_j.data.ShipModuleData;
import com.controllerface.cmdr_j.data.commander.CommanderData;
import com.controllerface.cmdr_j.data.commander.Displayable;
import com.controllerface.cmdr_j.data.commander.InventoryData;
import com.controllerface.cmdr_j.data.commander.ShipStatisticData;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.ItemCostData;
import com.controllerface.cmdr_j.data.procurements.ProcurementTask;
import com.controllerface.cmdr_j.data.procurements.ProcurementTaskData;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.structures.craftable.experimentals.ExperimentalCategory;
import com.controllerface.cmdr_j.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.structures.craftable.modifications.ModificationCategory;
import com.controllerface.cmdr_j.structures.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.structures.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.structures.craftable.modifications.WeaponModificationRecipe;
import com.controllerface.cmdr_j.structures.craftable.synthesis.SynthesisCategory;
import com.controllerface.cmdr_j.structures.craftable.synthesis.SynthesisRecipe;
import com.controllerface.cmdr_j.structures.craftable.synthesis.SynthesisType;
import com.controllerface.cmdr_j.structures.craftable.technologies.TechnologyCategory;
import com.controllerface.cmdr_j.structures.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.structures.craftable.technologies.TechnologyType;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;
import com.controllerface.cmdr_j.threads.JournalSyncTask;
import com.controllerface.cmdr_j.threads.TransactionProcessingTask;
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
import com.sun.javafx.event.EventDispatchChainImpl;
import javafx.application.Platform;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.shape.SVGPath;
import javafx.stage.WindowEvent;
import javafx.util.Callback;
import javafx.util.Pair;

import javax.xml.stream.EventFilter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * UI Controller class for Elite Dangerous Engineer Procurement System
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
    @FXML private TabPane mainPane;

    @FXML private Label economyLabel;
    @FXML private Label stationLabel;


    /*
    Ship Loadout Tab
     */

    @FXML private Label locationLabel;

    @FXML private Label shipIDLabel;
    @FXML private Label shipNameLabel;
    @FXML private Label shipTypeLabel;
    @FXML private Label shipMakeLabel;

    @FXML private TableView<ShipStatisticData> shipStatisticsTable;
    @FXML private TableColumn<ShipStatisticData, String> shipStatisticsNameColumn;
    @FXML private TableColumn<ShipStatisticData, ShipStatisticData> shipStatisticsDataColumn;

    @FXML private TableView<ShipModuleData> coreModuleTable;
    @FXML private TableColumn<ShipModuleData, String> coreModuleNameColumn;
    @FXML private TableColumn<ShipModuleData, ShipModuleData> coreModuleDataColumn;

    @FXML private TableView<ShipModuleData> optionalModuleTable;
    @FXML private TableColumn<ShipModuleData, String> optionalModuleNameColumn;
    @FXML private TableColumn<ShipModuleData, ShipModuleData> optionalModuleDataColumn;

    @FXML private TableView<ShipModuleData> hardpointTable;
    @FXML private TableColumn<ShipModuleData, String> hardpointNameColumn;
    @FXML private TableColumn<ShipModuleData, ShipModuleData> hardpointDataColumn;


    /*
    Procurement Tasks Tab
     */

    // Section visibility controls
    @FXML private CheckBox showProcurements;
    @FXML private CheckBox showTasks;
    @FXML private CheckBox showItemsNeeded;

    // Procurement tree/list selector components
    @FXML private HBox procurementBox;
    @FXML private Label procurementLabel;
    @FXML private TreeView<ProcurementTask> procurementTree;
    @FXML private ListView<ProcurementTask> procurementList;

    // Task list container pane
    @FXML private AnchorPane taskPane;

    // Task sorting controls
    @FXML private RadioButton sortTasksByName;
    @FXML private RadioButton sortTasksByGrade;

    // Task list and columns
    @FXML private TableView<ProcurementTaskData> procurementTaskTable;
    @FXML private TableColumn<ProcurementTaskData, ProcurementRecipe> taskTypeColumn;
    @FXML private TableColumn<ProcurementTaskData, ProcurementTaskData> taskCountColumn;
    @FXML private TableColumn<ProcurementTaskData, ProcurementTaskData> taskNameColumn;
    @FXML private TableColumn<ProcurementTaskData, ProgressBar> taskProgressColumn;
    @FXML private TableColumn<ProcurementTaskData, Pair<ProcurementType, ProcurementRecipe>> taskRemoveColumn;

    // Items needed/costs table and columns
    @FXML private TableView<ItemCostData> taskCostTable;
    @FXML private TableColumn<ItemCostData, String> taskCostNeedColumn;
    @FXML private TableColumn<Displayable, Displayable> taskCostNameColumn;
    @FXML private TableColumn<ItemCostData, ProgressBar> taskCostProgressColumn;
    @FXML private TableColumn<ItemCostData, ItemGrade> taskCostGradeColumn;


    /*
    Inventory Panel
     */

    @FXML private TabPane inventoryTab;
    @FXML private CheckBox showZeroQuantities;

    // Raw materials
    @FXML private Tab rawMatsTab;
    @FXML private TableView<InventoryData> rawTable;
    @FXML private TableColumn<InventoryData, InventoryData> rawGradeColumn;
    @FXML private TableColumn<InventoryData, InventoryData> rawMaterialColumn;
    @FXML private TableColumn<InventoryData, ProgressBar> rawMaterialProgressColumn;
    @FXML private TableColumn<InventoryData, Label> rawQuantityColumn;

    // Manufactured materials
    @FXML private TableView<InventoryData> manufacturedTable;
    @FXML private TableColumn<InventoryData, InventoryData> manufacturedGradeColumn;
    @FXML private TableColumn<InventoryData, InventoryData> manufacturedMaterialColumn;
    @FXML private TableColumn<InventoryData, ProgressBar> manufacturedProgressColumn;
    @FXML private TableColumn<InventoryData, Label> manufacturedQuantityColumn;

    // Data materials
    @FXML private TableView<InventoryData> dataTable;
    @FXML private TableColumn<InventoryData, InventoryData> dataGradeColumn;
    @FXML private TableColumn<InventoryData, InventoryData> dataMaterialColumn;
    @FXML private TableColumn<InventoryData, ProgressBar> dataProgressColumn;
    @FXML private TableColumn<InventoryData, Label> dataQuantityColumn;

    // Cargo
    @FXML private TableView<InventoryData> cargoTable;
    @FXML private TableColumn<InventoryData, InventoryData> cargoGradeColumn;
    @FXML private TableColumn<InventoryData, InventoryData> cargoItemColumn;
    @FXML private TableColumn<InventoryData, Label> cargoQuantityColumn;

    @FXML private ListView<MessageData> consoleMessageList;

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

    /*
    =============================
    === END UI Components area ===
    =============================
     */

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
    private final Map<ProcurementCost, Integer> tradeYieldCache = new HashMap<>();

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

    //private final List<MessageData> messageList = new CopyOnWriteArrayList<>();

    private final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    // this is the transaction queue the transaction processor and inventory threads will use to keep the UI
    // and player inventory in sync
    private final BlockingQueue<UserTransaction> transactionQueue = new LinkedBlockingQueue<>();

    private final BlockingQueue<MessageData> messageQueue = new LinkedBlockingDeque<>();
    private final AtomicBoolean hasMessages = new AtomicBoolean(false);

    /*
    Convenience consumer function that accepts a ProcurementTask and adds it to the procurement list. If the task
    already exists in the list, this effectively increments the count of that by 1
     */

    private final BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> addPairToProcurementList =
            (count, task) -> transactionQueue.add(new UserTransaction(count, task));

    private final Consumer<ProcurementTask> addTaskToProcurementList =
            (task) -> addPairToProcurementList.accept(1, new Pair<>(task.getType(), task.getRecipe()));

    private final Consumer<ProcurementTask> addTaskToProcurementList_direct =
            (task) -> procurementListUpdate(1, new Pair<>(task.getType(), task.getRecipe()));

    /**
     * Holds all of the data related to a commander (i.e. the player's on-disk data). While running, this application
     * will continuously update the data in this object based on events that are written to the player's Journal file
     */
    private final CommanderData commanderData = new CommanderData(tradeCostCache::get, addTaskToProcurementList_direct);

    public UIController()
    {
        localizeData();
    }

    private void consumeNextMessageBlock(List<MessageData> msgs)
    {
        consoleBackingList.addAll(msgs);
        while (consoleBackingList.size() > 500) consoleBackingList.remove(0);
        consoleMessageList.scrollTo(consoleBackingList.size());
    }

    private void processMessages()
    {
        Thread.currentThread().setName("Message Processor");
        if (hasMessages.getAndSet(false))
        {
            List<MessageData> msgs = IntStream.range(0, 100)
                    .mapToObj(i -> messageQueue.poll())
                    .filter(Objects::nonNull)
                    .collect(Collectors.toList());

            if (messageQueue.isEmpty()) hasMessages.set(false);
            else
            {
                hasMessages.set(true);
            }
            Platform.runLater(()->consumeNextMessageBlock(msgs));
        }
    }

    /**
     * Reflectively called by JavaFX when the application is closed bye the user. Note that if the program exits in an
     * unexpected way, this may not be called.
     */
    @FXML
    public void stop()
    {
        try
        {
            toJson();
            executorService.shutdown();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void showVisuals()
    {
        //synchronizeBackingLists();
        initializeUIComponents();

        // build the procurement task selection tree
        fromJson();

        // load the auto-save data from disk

        // set initialized flag

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
    }

    /**
     * Reflectively called by JavaFX after this class is instantiated. This is where the UI components are filled with
     * their respective data.
     */
    @FXML
    public void initialize()
    {
        makeProcurementTree();
        startupTasks();
    }

    private void startupTasks()
    {
        // convenience function that adjusts items and also refreshes teh cost table. This is useful because the
        // item adjustment isn't directly related to the cost table, so adjustments won't automatically trigger a
        // refresh. This allows the table to be refreshed in one function without leaking references into other scopes
        BiConsumer<ProcurementCost, Integer> adjustItem = (item, amount) ->
        {
            commanderData.adjustItem(item, amount);
            if (taskCostTable != null) taskCostTable.refresh();
        };

        // transaction processor
        Runnable transactionProcessingTask =
                new TransactionProcessingTask(adjustItem, this::procurementListUpdate, this::messageLogger, transactionQueue);
        Thread transactionThread = new Thread(transactionProcessingTask);
        transactionThread.setDaemon(true);
        transactionThread.start();

        // disk monitor
        Runnable inventorySyncTask = new JournalSyncTask(commanderData, transactionQueue);
        Thread inventoryThread = new Thread(inventorySyncTask);
        inventoryThread.setDaemon(true);
        inventoryThread.start();

        executorService.scheduleAtFixedRate(this::processMessages, 0, 1, TimeUnit.SECONDS);
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

        consoleMessageList.setItems(consoleBackingList);
        consoleBackingList.addListener((ListChangeListener<MessageData>) c -> consoleMessageList.refresh());

        // todo: abstract this factory out to UIFunctions or something
        consoleMessageList.setCellFactory(new Callback<ListView<MessageData>, ListCell<MessageData>>()
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

                        hBox.setAlignment(Pos.CENTER_LEFT);

                        Label typeLabel = new Label(item.getMessageType() + "  ");
                        typeLabel.setTextFill(UIFunctions.messageColors.get(item.getMessageType()));
                        typeLabel.setFont(UIFunctions.Fonts.size1Font);

                        Label message = new Label(item.getMessage());
                        message.setFont(UIFunctions.Fonts.size4Font);
                        hBox.getChildren().addAll(typeLabel, message);

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
        procurementLabel.textProperty().bind(labelText);
        procurementTree.setCellFactory(param -> new ProcurementTreeCell(procSelectorBackingList, labelText));
        procurementList.setItems(procSelectorBackingList);
        procurementList.setCellFactory(param -> new ProcurementListCell(addTaskToProcurementList,
                commanderData::amountOf, procurementList.widthProperty()));

        procurementTaskTable.setItems(sortedTasks);
        taskCostTable.setItems(sortedCosts);

        taskCountColumn.setCellFactory(x -> new TaskCountCell(addPairToProcurementList));
        taskCountColumn.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue()));

        taskProgressColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));

        taskTypeColumn.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair().getValue()));
        taskTypeColumn.setCellFactory(x-> new TaskTypeCell());

        taskNameColumn.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue()));
        taskNameColumn.setCellFactory(x -> new TaskDataCell());

        taskRemoveColumn.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair()));
        taskRemoveColumn.setCellFactory(x -> new TaskRemoveCell(addPairToProcurementList));

        taskCostNeedColumn.setCellValueFactory(UIFunctions.Data.costNeedCellFactory);
        taskCostNeedColumn.setCellFactory(x -> new CostValueCell());

        taskCostNameColumn.setCellValueFactory(modMaterial -> new ReadOnlyObjectWrapper<>(modMaterial.getValue()));
        taskCostNameColumn.setCellFactory(x -> new CostDataCell());

        taskCostProgressColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));

        taskCostGradeColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getCost().getGrade()));
        taskCostGradeColumn.setCellFactory(x -> new CostGradeCell());

        sortTasksByName.setOnAction(e -> sortedTasks.setComparator(UIFunctions.Sort.tasksByName));
        sortTasksByGrade.setOnAction(e -> sortedTasks.setComparator(UIFunctions.Sort.taskByGrade));

        showProcurements.setOnAction(e -> setProcurementsUIVisibility());
        showTasks.setOnAction(e -> setProcurementsUIVisibility());
        showItemsNeeded.setOnAction(e -> setProcurementsUIVisibility());
    }

    /**
     * Sets text placeholders on certain elements, which controls the text that displays within UI control, such as
     * a list view, when the list is empty.
     */
    private void initializeTextPlaceholders()
    {
        // set placeholder labels shown when the procurement list is empty
        Label procListLabel = new Label("<---- Select a Procurement Task Category");
        Label recipeTableLabel = new Label("Tracked Tasks Will Appear Here");
        Label costTableLabel = new Label("Tracked Items Will Appear Here");

        procListLabel.setFont(UIFunctions.Fonts.size4Font);
        recipeTableLabel.setFont(UIFunctions.Fonts.size4Font);
        costTableLabel.setFont(UIFunctions.Fonts.size4Font);

        procurementList.setPlaceholder(procListLabel);
        procurementTaskTable.setPlaceholder(recipeTableLabel);
        taskCostTable.setPlaceholder(costTableLabel);

        Label cargoTableLabel = new Label("You are not carrying any cargo");
        Label rawTableLabel = new Label("You are not carrying any raw materials");
        Label mfdTableLabel = new Label("You are not carrying any manufactured materials");
        Label dataTableLabel = new Label("You are not carrying any encoded data");

        cargoTableLabel.setFont(UIFunctions.Fonts.size4Font);
        rawTableLabel.setFont(UIFunctions.Fonts.size4Font);
        mfdTableLabel.setFont(UIFunctions.Fonts.size4Font);
        dataTableLabel.setFont(UIFunctions.Fonts.size4Font);

        cargoTable.setPlaceholder(cargoTableLabel);
        rawTable.setPlaceholder(rawTableLabel);
        manufacturedTable.setPlaceholder(mfdTableLabel);
        dataTable.setPlaceholder(dataTableLabel);

        Label messageLabel = new Label("Loading Message Log...");
        messageLabel.setFont(UIFunctions.Fonts.size4Font);
        consoleMessageList.setPlaceholder(messageLabel);
    }

    /**
     * Sets up the inventory tab
     */
    private void initializeInventoryTables()
    {
        // associate the inventory lists with the table view UI elements that display their contents
        commanderData.associateCargoTable(cargoTable, showZeroQuantities);
        commanderData.associateRawTable(rawTable, showZeroQuantities);
        commanderData.associateManufacturedTable(manufacturedTable, showZeroQuantities);
        commanderData.associateDataTable(dataTable, showZeroQuantities);

        // set sorting comparators for each data column
        rawGradeColumn.setComparator(UIFunctions.Sort.itemByGrade);
        rawMaterialColumn.setComparator(UIFunctions.Sort.itemByCategory);
        rawQuantityColumn.setComparator(UIFunctions.Sort.quantityByNumericValue);
        manufacturedGradeColumn.setComparator(UIFunctions.Sort.itemByGrade);
        manufacturedMaterialColumn.setComparator(UIFunctions.Sort.itemByCategory);
        manufacturedQuantityColumn.setComparator(UIFunctions.Sort.quantityByNumericValue);
        dataGradeColumn.setComparator(UIFunctions.Sort.itemByGrade);
        dataMaterialColumn.setComparator(UIFunctions.Sort.itemByCategory);
        dataQuantityColumn.setComparator(UIFunctions.Sort.quantityByNumericValue);
        cargoGradeColumn.setComparator(UIFunctions.Sort.itemByGrade);
        cargoItemColumn.setComparator(UIFunctions.Sort.itemByCategory);
        cargoQuantityColumn.setComparator(UIFunctions.Sort.quantityByNumericValue);

        // This callback defines a simple Label object to use as the contents of the quantity columns for each item
        // type. It is re used for all of the quantity columns, giving them a uniform look
        final Callback<TableColumn.CellDataFeatures<InventoryData, Label>, ObservableValue<Label>>
                inventoryQuantityCellFactory = (materialData) ->
        {
            int quantity = materialData.getValue().getQuantity();
            int max = materialData.getValue().getItem().getGrade().getMaximumQuantity();
            Label label = new Label();
            String q = String.format("%1$" + 3 + "s", quantity);
            if (max != -1)
            {
                q += " / " + max;
            }
            label.setText(q);

            label.paddingProperty().setValue(new Insets(5,0,0,0));
            label.setFont(UIFunctions.Fonts.size2Font);
            return new ReadOnlyObjectWrapper<>(label);
        };

        // quantity columns use a basic Label value so don't need cell factories
        rawQuantityColumn.setCellValueFactory(inventoryQuantityCellFactory);
        manufacturedQuantityColumn.setCellValueFactory(inventoryQuantityCellFactory);
        dataQuantityColumn.setCellValueFactory(inventoryQuantityCellFactory);
        cargoQuantityColumn.setCellValueFactory(inventoryQuantityCellFactory);

        // manually set the styles for the quantity columns todo: in the future move this to CSS or use custom cells
        rawQuantityColumn.setStyle( "-fx-alignment: TOP-CENTER;");
        manufacturedQuantityColumn.setStyle( "-fx-alignment: TOP-CENTER;");
        dataQuantityColumn.setStyle( "-fx-alignment: TOP-CENTER;");
        cargoQuantityColumn.setStyle( "-fx-alignment: TOP-CENTER;");

        // this Callback implementation provides a simple read-only wrapper around the InventoryData objects
        // stored in the various inventory lists. This is required to use custom display cells in JavaFX. We will
        // re-use this for all the relevant data columns
        final Callback<TableColumn.CellDataFeatures<InventoryData, InventoryData>, ObservableValue<InventoryData>>
                inventoryItemCellValueFactory = (materialData) -> new ReadOnlyObjectWrapper<>(materialData.getValue());

        // These columns use a custom display cells but for the cell values can all use the same read-only wrapper
        rawMaterialColumn.setCellValueFactory(inventoryItemCellValueFactory);
        manufacturedMaterialColumn.setCellValueFactory(inventoryItemCellValueFactory);
        dataMaterialColumn.setCellValueFactory(inventoryItemCellValueFactory);
        cargoItemColumn.setCellValueFactory(inventoryItemCellValueFactory);
        rawGradeColumn.setCellValueFactory(inventoryItemCellValueFactory);
        manufacturedGradeColumn.setCellValueFactory(inventoryItemCellValueFactory);
        dataGradeColumn.setCellValueFactory(inventoryItemCellValueFactory);
        cargoGradeColumn.setCellValueFactory(inventoryItemCellValueFactory);

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


        rawMaterialColumn.setCellFactory(inventoryItemCellFactory);
        manufacturedMaterialColumn.setCellFactory(inventoryItemCellFactory);
        dataMaterialColumn.setCellFactory(inventoryItemCellFactory);
        cargoItemColumn.setCellFactory(inventoryItemCellFactory);

        rawMaterialProgressColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));
        manufacturedProgressColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));
        dataProgressColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue().getProgressBar()));

        rawMaterialProgressColumn.setComparator(UIFunctions.Sort.progressByValue);
        manufacturedProgressColumn.setComparator(UIFunctions.Sort.progressByValue);
        dataProgressColumn.setComparator(UIFunctions.Sort.progressByValue);


        // the "item grade" columns use a very similar structure to the "data" columns, with the same read-only wrapper
        // factory but different custom data cells. This callback provides the custom cells for the item grades
        final Callback<TableColumn<InventoryData, InventoryData>, TableCell<InventoryData, InventoryData>>
                inventoryGradeCellFactory = (x) -> new InventoryGradeCell();

        rawGradeColumn.setCellFactory(inventoryGradeCellFactory);
        manufacturedGradeColumn.setCellFactory(inventoryGradeCellFactory);
        dataGradeColumn.setCellFactory(inventoryGradeCellFactory);
        cargoGradeColumn.setCellFactory(inventoryGradeCellFactory);
    }

    /**
     * Sets up the ship loadout tab
     */
    private void initializeShipLoadoutTab()
    {
        commanderData.getLocation().associateStarSystem(locationLabel);
        commanderData.getLocation().associateSpaceStation(stationLabel);
        commanderData.getLocation().associateEconomy(economyLabel);

        commanderData.getStarShip().associateShipManufacturer(shipMakeLabel);
        commanderData.getStarShip().associateShipGivenName(shipNameLabel);
        commanderData.getStarShip().associateShipDisplayName(shipTypeLabel);
        commanderData.getStarShip().associateShipID(shipIDLabel);
        commanderData.getStarShip().associateStatisticsTable(shipStatisticsTable);
        commanderData.getStarShip().associateCoreTable(coreModuleTable);
        commanderData.getStarShip().associateOptionalTable(optionalModuleTable);
        commanderData.getStarShip().associateHardpointTable(hardpointTable);

        shipStatisticsNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().statName()));
        shipStatisticsNameColumn.setCellFactory(x -> new StatDataCell());
        shipStatisticsDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        shipStatisticsDataColumn.setCellFactory(x -> new StatDisplayCell());

        coreModuleNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        coreModuleNameColumn.setCellFactory(x -> new SlotNameCell());
        coreModuleDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        coreModuleDataColumn.setCellFactory(x -> new ModuleDisplayCell());

        optionalModuleNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        optionalModuleNameColumn.setCellFactory(x -> new SlotNameCell());
        optionalModuleDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        optionalModuleDataColumn.setCellFactory(x -> new ModuleDisplayCell());

        hardpointNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        hardpointNameColumn.setCellFactory(x -> new SlotNameCell());
        hardpointDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        hardpointDataColumn.setCellFactory(x -> new ModuleDisplayCell());
    }

    /**
     * Certain UI elements should auto-adjust their size values based on their siblings and parents' size values.
     * This function handles setting up these bindings to keep the UI elements sized correctly.
     */
    private void initializeAutoResizeBindings()
    {
        bindTableResize(shipStatisticsTable, shipStatisticsDataColumn);
        bindTableResize(rawTable, rawMaterialColumn);
        bindTableResize(manufacturedTable, manufacturedMaterialColumn);
        bindTableResize(dataTable, dataMaterialColumn);
        bindTableResize(cargoTable, cargoItemColumn);
        bindTableResize(procurementTaskTable, taskNameColumn);
        bindTableResize(taskCostTable, taskCostNameColumn);
        bindTableResize(coreModuleTable, coreModuleDataColumn);
        bindTableResize(optionalModuleTable, optionalModuleDataColumn);
        bindTableResize(hardpointTable, hardpointDataColumn);

        shipStatisticsTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        coreModuleTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        optionalModuleTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        hardpointTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        procurementTaskTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        taskCostTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        rawTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        manufacturedTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        dataTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
        cargoTable.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
    }

    /**
     * Ensures that the selection "highlight" is made as unobtrusive as possible. By default, the electric blue
     * selection color is a jarring and selection of elements in this way is unnecessary for this application
     */
    private void initializeSelectionOverrides()
    {
        disableListSelection(consoleMessageList);

        disableTreeSelection(procurementTree);
        disableListSelection(procurementList);

        disableTableSelection(rawTable);
        disableTableSelection(manufacturedTable);
        disableTableSelection(dataTable);
        disableTableSelection(cargoTable);

        disableTableSelection(procurementTaskTable);
        disableTableSelection(taskCostTable);

        disableTableSelection(shipStatisticsTable);
        disableTableSelection(coreModuleTable);
        disableTableSelection(optionalModuleTable);
        disableTableSelection(hardpointTable);
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
                .addListener((x,y,z) -> Platform.runLater(() -> treeView.getSelectionModel().clearSelection()));
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
                .addListener((x,y,z) -> Platform.runLater(() -> listView.getSelectionModel().clearSelection()));
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
                .addListener((x,y,z) -> Platform.runLater(() -> tableView.getSelectionModel().clearSelection()));
    }

    /**
     * Called after mutations to the "raw" task/cost lists are complete, ensuring the UI is kept in sync
     */
    private void synchronizeBackingLists()
    {
        synchronized (taskBackingList)
        {
            taskBackingList.clear();
            taskBackingList.addAll(taskList);
        }

        synchronized (taskCostBackingList)
        {
            taskCostBackingList.clear();
            taskCostBackingList.addAll(costList);
        }
    }

    private void messageLogger(UserTransaction.MessageType messageType, String message)
    {
        messageQueue.add(new MessageData(message, messageType));
        hasMessages.set(true);
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
    private Integer procurementListUpdate(Integer adjustment, Pair<ProcurementType, ProcurementRecipe> task)
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
            if (adjustment <= 0) return -1;

                // otherwise, this is an indication that we should add this new task to the list, so we create
                // a new one, and initialize the count to zero, as the actual adjustment logic can then work
                // the same for new and existing tasks
            else
            {

                data.set(new ProcurementTaskData.Builder(0)
                        .setType(task.getKey())
                        .setRecipe(task.getValue())
//                            .setCount(0)
                        .setCheckInventory(commanderData::amountOf)
                        .setPendingTradeYield(tradeYieldCache::get)
                        .setGetCurrentSystem(commanderData.getLocation()::getStarSystem).createProcurementTaskData());


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
                                tradeYieldCache::get,
                                tradeCostCache::get,
                                addTaskToProcurementList))
                        .forEach(costList::add);
            }
        }

        // grab the count before adjustment so we can tell how much the final adjustment actually was
        int oldCount = data.get().getCount();

        // here we do a quick sanity count, in case the count is already at the maximum. if that's the case,
        // we will not adjust further, just return the count
        if (oldCount == 999) return oldCount;

        // now, we can continue with the adjustment.
        AtomicInteger newCount = new AtomicInteger(oldCount + adjustment);

        // We max out at 999, just because the UI will get weird and it's unlikely anyone will want/need
        // anywhere near that many tasks of a given type. If the adjustment would bring the value over that
        // maximum, we'll clamp it.
        if (newCount.get() > 999) newCount.set(999);

        // just in case, we also need to check that the adjustment would bring the count below zero. if that
        // would occur, we clamp the new count to 0
        if (newCount.get() < 0) newCount.set(0);

        // now we ACTUALLY set the new count, performing the adjustment
        data.get().setCount(newCount.get());


        //executorService.submit(()->
        //{
            // to make sure we've cleaned everything up, if the new count became 0, remove the task
            if (newCount.get() == 0) taskList.remove(data.get());

            // figure out what the difference was, we'll need this to calculate the cost adjustment
            int costDifference = newCount.get() - oldCount;

            // now we need to calculate the cost adjustments that this task adjustment requires. To do this,
            // we find all the costs of this recipe, and multiply the required cost by the cost difference
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
                                int yield = Math.abs(costData.getQuantity());

                                // the yield adjustment is applied to the current count of this cost
                                int yieldAdjustment = yield * adjustment;

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
                                // since the cost will be negative, use absolute value
                                int tradeCost = costData.getQuantity();

                                // the yield adjustment is applied to the current count of this cost
                                int costAdjustment = tradeCost * adjustment;

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
                    .peek(removedCost -> taskCostCache.remove(removedCost.getCost()))
                    .forEach(costList::remove);

            rawTable.refresh();

            //if (Platform.isFxApplicationThread()) synchronizeBackingLists();
            //else
            Platform.runLater(this::synchronizeBackingLists);
        //});

        return newCount.get();
    }

    private TreeItem<ProcurementTask> makeTradeTree()
    {
        TreeItem<ProcurementTask> materialTrades = new TreeItem<>(new ProcurementTask("Material Trades"));

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
        TreeItem<ProcurementTask> modifications = new TreeItem<>(new ProcurementTask("Engineering Modifications"));

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
        TreeItem<ProcurementTask> experiments = new TreeItem<>(new ProcurementTask("Experimental Effects"));

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
        TreeItem<ProcurementTask> modifications = new TreeItem<>(new ProcurementTask("Tech Broker Unlocks"));

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
        root.getChildren().addAll(makeModificationTree(),
                makeExperimentTree(),
                makeTechnologyTree(),
                makeSynthesisTree(),
                makeTradeTree());

        // set the root as expanded by default
        root.setExpanded(true);

        // now that the root object has been filled with sub-trees, add it to the tree
        procurementTree.setRoot(root);

        // hide the root, showing just its children in the tree view
        procurementTree.setShowRoot(false);
    }

    private void sortInventory()
    {
        // sort pass 1, numerically by grade
        rawTable.getItems().sort(UIFunctions.Sort.itemByGrade);
        manufacturedTable.getItems().sort(UIFunctions.Sort.itemByGrade);
        dataTable.getItems().sort(UIFunctions.Sort.itemByGrade);

        // sort pass 2, alphabetically, by category name
        rawTable.getItems().sort(UIFunctions.Sort.itemByCategory);
        manufacturedTable.getItems().sort(UIFunctions.Sort.itemByCategory);
        dataTable.getItems().sort(UIFunctions.Sort.itemByCategory);

        // Cargo sorts a bit differently,
        cargoTable.getItems().sort(UIFunctions.Sort.itemByGrade);
        cargoTable.getItems().sort(UIFunctions.Sort.itemByCount);
    }

    private void setProcurementsUIVisibility()
    {
        int shown = 0;

        if (showProcurements.isSelected())
        {
            shown++;
            procurementLabel.setMinHeight(35);
            procurementBox.setPrefHeight(10000);
            procurementBox.setVisible(true);
        }
        else
        {
            procurementLabel.setMinHeight(0);
            procurementBox.setPrefHeight(0);
            procurementBox.setVisible(false);
        }

        if (showTasks.isSelected())
        {
            shown++;
            taskPane.setVisible(true);
            taskPane.setPrefHeight(10000);
        }
        else
        {
            taskPane.setVisible(false);
            taskPane.setPrefHeight(0);
        }


        if (showItemsNeeded.isSelected())
        {
            shown++;
            taskCostTable.setPrefHeight(10000);
            taskCostTable.setVisible(true);
        }
        else
        {
            taskCostTable.setPrefHeight(0);
            taskCostTable.setVisible(false);

        }

        if (shown == 1)
        {
            if (showProcurements.isSelected()) showProcurements.setDisable(true);
            if (showTasks.isSelected()) showTasks.setDisable(true);
            if (showItemsNeeded.isSelected()) showItemsNeeded.setDisable(true);
        }
        else
        {
            showProcurements.setDisable(false);
            showTasks.setDisable(false);
            showItemsNeeded.setDisable(false);
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
                    material.setLocalizedName(((String) value));
                });

        ((Map<String, Object>) data.get("commodities"))
                .forEach((key, value) ->
                {
                    ProcurementCost commodity = Commodity.valueOf(key);
                    commodity.setLocalizedName(((String) value));
                });

        InputStream locStream = null;
        try
        {
            URL localizationData = getClass().getResource("/localization/locations.json");
            locStream = localizationData.openStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Map<String, Object> locData = JSONSupport.Parse.jsonStream.apply(locStream);

        ((Map<String, Object>) locData.get("materials"))
                .forEach((key, value) ->
                {
                    ProcurementCost material = Material.valueOf(key);

                    List<String> locations = ((List<String>) value);

                    material.setLocationInformation(locations.stream().collect(Collectors.joining("\n")));
                });

        ((Map<String, Object>) locData.get("commodities"))
                .forEach((key, value) ->
                {
                    ProcurementCost commodity = Commodity.valueOf(key);

                    List<String> locations = ((List<String>) value);

                    commodity.setLocationInformation(locations.stream().collect(Collectors.joining("\n")));
                });
    }

    private void toJson() throws IOException
    {
        Map<String, Object> data = new HashMap<>();

        List<Map<String, Object>> tasks = taskList.stream()
                .map(e->
                {
                    // todo: it may be beneficial to store the JSON output logic inside the procurement type
                    // implementation, so if it needs to be different (ex: trade recipes) this code can delegate
                    // to another class that has the specific serialization logic

                    Pair<ProcurementType, ProcurementRecipe> pair = e.asPair();
                    ProcurementType type = pair.getKey();
                    ProcurementRecipe recipe = pair.getValue();

                    boolean isTrade = type instanceof MaterialTradeType;

                    Integer count = e.getCount();

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
                    else procTypedata.put(recipeType, recipeName);

                    procTypedata.put("Count", count);

                    return procTypedata;
                }).collect(Collectors.toList());

        data.put("tasks", tasks);

        File file = new File("data.json");
        if (!file.exists() && !file.createNewFile()) throw new RuntimeException("Could not create file");
        JSONSupport.Write.jsonToFile.apply(file, data);
    }

    @SuppressWarnings("unchecked")
    private void fromJson()
    {
        File file = new File("data.json");
        if (!file.exists())
        {
            System.err.println("data.json File not found");
            return;
        }

        Map<String, Object> data = JSONSupport.Parse.jsonFile.apply(file);

        taskList.clear();

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> tasks = ((List<Map<String, Object>>) data.get("tasks"));
        tasks.forEach(taskEntry ->
        {
            //todo: if this is a trade recipe, we need to read the price/product costs in the JSON object

            AtomicReference<ProcurementType> procType = new AtomicReference<>();
            AtomicReference<ProcurementRecipe> recipeType = new AtomicReference<>();
            AtomicInteger count = new AtomicInteger(0);

            taskEntry.forEach((key, value) ->
            {
                switch (key)
                {
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

                    case "ExperimentalRecipe":
                        recipeType.set(ExperimentalRecipe.valueOf((String) value));
                        break;

                    case "ModificationRecipe":
                        recipeType.set(ModificationRecipe.valueOf((String) value));
                        break;

                    case "WeaponModificationRecipe":
                        recipeType.set(WeaponModificationRecipe.valueOf((String) value));
                        break;

                    case "SynthesisRecipe":
                        recipeType.set(SynthesisRecipe.valueOf((String) value));
                        break;

                    case "TechnologyRecipe":
                        recipeType.set(TechnologyRecipe.valueOf((String) value));
                        break;

                    case "Count":
                        count.set((Integer) value);
                        break;

                    case "MaterialTradeRecipe":
                        recipeType.set(MaterialTradeRecipe.deserializeRecipe(((Map<String, Object>) value)));
                        break;

                    default:
                        System.out.println("UNSUPPORTED: "+key);
                }
            });

            transactionQueue.add(new UserTransaction(count.get(), new Pair<>(procType.get(), recipeType.get())));
        });
    }
}
