package com.controllerface.edeps.ui;

import com.controllerface.edeps.JSONSupport;
import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.data.MaterialTradeRecipe;
import com.controllerface.edeps.data.MessageData;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.data.commander.CommanderData;
import com.controllerface.edeps.data.commander.InventoryData;
import com.controllerface.edeps.data.commander.ShipStatisticData;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.data.procurements.ProcurementTask;
import com.controllerface.edeps.data.procurements.ProcurementTaskData;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialTradeType;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalCategory;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.edeps.structures.craftable.modifications.ModificationCategory;
import com.controllerface.edeps.structures.craftable.modifications.ModificationRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationType;
import com.controllerface.edeps.structures.craftable.modifications.WeaponModificationRecipe;
import com.controllerface.edeps.structures.craftable.synthesis.SynthesisCategory;
import com.controllerface.edeps.structures.craftable.synthesis.SynthesisRecipe;
import com.controllerface.edeps.structures.craftable.synthesis.SynthesisType;
import com.controllerface.edeps.structures.craftable.technologies.TechnologyCategory;
import com.controllerface.edeps.structures.craftable.technologies.TechnologyRecipe;
import com.controllerface.edeps.structures.craftable.technologies.TechnologyType;
import com.controllerface.edeps.threads.JournalSyncTask;
import com.controllerface.edeps.threads.TransactionProcessingTask;
import com.controllerface.edeps.threads.UserTransaction;
import com.controllerface.edeps.ui.costs.CostDataCell;
import com.controllerface.edeps.ui.costs.CostValueCell;
import com.controllerface.edeps.ui.inventory.InventoryDataCell;
import com.controllerface.edeps.ui.inventory.InventoryGradeCell;
import com.controllerface.edeps.ui.procurements.ProcurementListCell;
import com.controllerface.edeps.ui.procurements.ProcurementTreeCell;
import com.controllerface.edeps.ui.ship.ModuleDisplayCell;
import com.controllerface.edeps.ui.ship.SlotNameCell;
import com.controllerface.edeps.ui.ship.StatDataCell;
import com.controllerface.edeps.ui.ship.StatDisplayCell;
import com.controllerface.edeps.ui.tasks.TaskCountCell;
import com.controllerface.edeps.ui.tasks.TaskDataCell;
import com.controllerface.edeps.ui.tasks.TaskRemoveCell;
import javafx.application.Platform;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import javafx.util.Pair;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;
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

    @FXML private TableView<ShipModuleData> coreModuleList;
    @FXML private TableColumn<ShipModuleData, String> coreModuleNameColumn;
    @FXML private TableColumn<ShipModuleData, ShipModuleData> coreModuleDataColumn;

    @FXML private TableView<ShipModuleData> optionalModuleList;
    @FXML private TableColumn<ShipModuleData, String> optionalModuleNameColumn;
    @FXML private TableColumn<ShipModuleData, ShipModuleData> optionalModuleDataColumn;

    @FXML private TableView<ShipModuleData> hardpointList;
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
    @FXML private TableColumn<ProcurementTaskData, ProcurementTaskData> taskCountColumn;
    @FXML private TableColumn<ProcurementTaskData, ProcurementTaskData> taskNameColumn;
    @FXML private TableColumn<ProcurementTaskData, Pair<ProcurementType, ProcurementRecipe>> taskRemoveColumn;

    // Items needed/costs table and columns
    @FXML private TableView<ItemCostData> taskCostTable;
    @FXML private TableColumn<ItemCostData, String> taskCostNeedColumn;
    @FXML private TableColumn<ItemCostData, ItemCostData> taskCostNameColumn;


    /*
    Inventory Panel
     */

    // Raw materials
    @FXML private TableView<InventoryData> rawTable;
    @FXML private TableColumn<InventoryData, InventoryData> rawGradeColumn;
    @FXML private TableColumn<InventoryData, InventoryData> rawMaterialColumn;
    @FXML private TableColumn<InventoryData, Label> rawQuantityColumn;

    // Manufactured materials
    @FXML private TableView<InventoryData> manufacturedTable;
    @FXML private TableColumn<InventoryData, InventoryData> manufacturedGradeColumn;
    @FXML private TableColumn<InventoryData, InventoryData> manufacturedMaterialColumn;
    @FXML private TableColumn<InventoryData, Label> manufacturedQuantityColumn;

    // Data materials
    @FXML private TableView<InventoryData> dataTable;
    @FXML private TableColumn<InventoryData, InventoryData> dataGradeColumn;
    @FXML private TableColumn<InventoryData, InventoryData> dataMaterialColumn;
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
     * Holds all of the data related to a commander (i.e. the player's on-disk data). While running, this application
     * will continuously update the data in this object based on events that are written to the player's Journal file
     */
    private final CommanderData commanderData = new CommanderData();

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

    private final List<MessageData> messageList = new CopyOnWriteArrayList<>();

    /*
    Convenience consumer function that accepts a ProcurementTask and adds it to the procurement list. If the task
    already exists in the list, this effectively increments the count of that by 1
     */
    private final Consumer<ProcurementTask> addTaskToProcurementList =
            (task)->
            {
                Pair<ProcurementType, ProcurementRecipe> ref = new Pair<>(task.getType(), task.getRecipe());
                procurementListUpdate(1, ref);
            };

    public UIController()
    {
        localizeData();

        // this is the transaction queue the transaction processor and inventory threads will use to keep the UI
        // and player inventory in sync
        BlockingQueue<UserTransaction> transactionQueue = new LinkedBlockingQueue<>();

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
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Reflectively called by JavaFX after this class is instantiated. This is where the UI components are filled with
     * their respective data.
     */
    @FXML
    public void initialize()
    {
        initializeUIComponents();

        // build the procurement task selection tree
        makeProcurementTree();

        // load the auto-save data from disk
        fromJson();

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
    }

    /**
     * Calls the various methods that set up each tab in the UI
     */
    private void initializeUIComponents()
    {
        initializeTextPlaceholders();
        initializeProcurementTab();
        initializeInventoryTables();
        initializeShipLoadoutTab();
        initializeAutoResizeBindings();
        initializeSelectionOverrides();

        consoleMessageList.setItems(consoleBackingList);
        consoleBackingList.addListener((ListChangeListener<MessageData>) c -> consoleMessageList.refresh());
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
                commanderData::hasItem, procurementList.widthProperty()));

        procurementTaskTable.setItems(sortedTasks);
        taskCostTable.setItems(sortedCosts);

        taskCountColumn.setCellFactory(x -> new TaskCountCell(this::procurementListUpdate));
        taskCountColumn.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue()));

        taskNameColumn.setCellFactory(x -> new TaskDataCell());
        taskNameColumn.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue()));

        taskRemoveColumn.setCellFactory(x -> new TaskRemoveCell(this::procurementListUpdate));
        taskRemoveColumn.setCellValueFactory(modRecipe -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair()));

        taskCostNeedColumn.setCellValueFactory(UIFunctions.Data.costNeedCellFactory);
        taskCostNeedColumn.setCellFactory(x -> new CostValueCell());

        taskCostNameColumn.setCellValueFactory(modMaterial -> new ReadOnlyObjectWrapper<>(modMaterial.getValue()));
        taskCostNameColumn.setCellFactory(x -> new CostDataCell());

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
        Label procListLabel = new Label("<---- Select a task category from the tree on the left");
        Label recipeTableLabel = new Label("Selected tasks will appear here");
        Label costTableLabel = new Label("Items needed for selected tasks will appear here");

        procListLabel.setFont(UIFunctions.Fonts.size1Font);
        recipeTableLabel.setFont(UIFunctions.Fonts.size1Font);
        costTableLabel.setFont(UIFunctions.Fonts.size1Font);

        procurementList.setPlaceholder(procListLabel);
        procurementTaskTable.setPlaceholder(recipeTableLabel);
        taskCostTable.setPlaceholder(costTableLabel);
    }

    /**
     * Sets up the inventory tab
     */
    private void initializeInventoryTables()
    {
        // associate the inventory lists with the table view UI elements that display their contents
        commanderData.associateCargoTable(cargoTable);
        commanderData.associateRawTable(rawTable);
        commanderData.associateManufacturedTable(manufacturedTable);
        commanderData.associateDataTable(dataTable);

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
            Label label = new Label(String.valueOf(quantity));
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

        // This call back simply creates a new custom InventoryDataCell which is used int he center "data" columns
        // of the various inventory UI tables. The custom cell contains the display logic and supports all of the
        // various item categories, so we can re use it for all of the data columns
        final Callback<TableColumn<InventoryData, InventoryData>, TableCell<InventoryData, InventoryData>>
                inventoryItemCellFactory = (x) -> new InventoryDataCell();

        rawMaterialColumn.setCellFactory(inventoryItemCellFactory);
        manufacturedMaterialColumn.setCellFactory(inventoryItemCellFactory);
        dataMaterialColumn.setCellFactory(inventoryItemCellFactory);
        cargoItemColumn.setCellFactory(inventoryItemCellFactory);

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
        commanderData.getLocation().associateStarStystem(locationLabel);
        commanderData.getStarShip().associateShipManufacturer(shipMakeLabel);
        commanderData.getStarShip().associateShipGivenName(shipNameLabel);
        commanderData.getStarShip().associateShipDisplayName(shipTypeLabel);
        commanderData.getStarShip().associateShipID(shipIDLabel);
        commanderData.getStarShip().associateStatisticsTable(shipStatisticsTable);
        commanderData.getStarShip().associateCoreTable(coreModuleList);
        commanderData.getStarShip().associateOptionalTable(optionalModuleList);
        commanderData.getStarShip().associateHardpointTable(hardpointList);

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
        DoubleBinding rawTableWidthUsed = rawGradeColumn.widthProperty()
                .add(rawQuantityColumn.widthProperty())
                .add(UIFunctions.scrollBarAllowance);

        rawMaterialColumn.prefWidthProperty()
                .bind(rawTable.widthProperty().subtract(rawTableWidthUsed));


        DoubleBinding mfdTableWidthUsed = manufacturedGradeColumn.widthProperty()
                .add(manufacturedQuantityColumn.widthProperty())
                .add(UIFunctions.scrollBarAllowance);

        manufacturedMaterialColumn.prefWidthProperty()
                .bind(manufacturedTable.widthProperty().subtract(mfdTableWidthUsed));


        DoubleBinding dataTableWidthUsed = dataGradeColumn.widthProperty()
                .add(dataQuantityColumn.widthProperty())
                .add(UIFunctions.scrollBarAllowance);

        dataMaterialColumn.prefWidthProperty()
                .bind(dataTable.widthProperty().subtract(dataTableWidthUsed));


        DoubleBinding cargoTableWidthUsed = cargoGradeColumn.widthProperty()
                .add(cargoQuantityColumn.widthProperty())
                .add(UIFunctions.scrollBarAllowance);

        cargoItemColumn.prefWidthProperty()
                .bind(cargoTable.widthProperty().subtract(cargoTableWidthUsed));


        DoubleBinding recipeTableWidthUsed = taskCountColumn.widthProperty()
                .add(taskRemoveColumn.widthProperty())
                .add(UIFunctions.scrollBarAllowance);

        taskNameColumn.prefWidthProperty()
                .bind(procurementTaskTable.widthProperty()
                        .subtract(recipeTableWidthUsed));


        DoubleBinding costTableWidthUsed = taskCostNeedColumn.widthProperty()
                .add(UIFunctions.scrollBarAllowance);

        taskCostNameColumn.prefWidthProperty()
                .bind(taskCostTable.widthProperty()
                        .subtract(costTableWidthUsed));


        DoubleBinding shipTable1WidthUsed = coreModuleNameColumn.widthProperty()
                .add(UIFunctions.scrollBarAllowance);

        coreModuleDataColumn.prefWidthProperty()
                .bind(coreModuleList.widthProperty()
                        .subtract(shipTable1WidthUsed));


        DoubleBinding shipTable2WidthUsed = optionalModuleNameColumn.widthProperty()
                .add(UIFunctions.scrollBarAllowance);

        optionalModuleDataColumn.prefWidthProperty()
                .bind(optionalModuleList.widthProperty()
                        .subtract(shipTable2WidthUsed));


        DoubleBinding shipTable3WidthUsed = hardpointNameColumn.widthProperty()
                .add(UIFunctions.scrollBarAllowance);

        hardpointDataColumn.prefWidthProperty()
                .bind(hardpointList.widthProperty()
                        .subtract(shipTable3WidthUsed));
    }

    /**
     * Ensures that the selection "highlight" is made as unobtrusive as possible. By default, the electric blue
     * selection color is a jarring and selection of elements in this way is unnecessary for this application
     */
    private void initializeSelectionOverrides()
    {
        procurementTree.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> procurementTree.getSelectionModel().clearSelection()));

        procurementList.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> procurementList.getSelectionModel().clearSelection()));

        rawTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> rawTable.getSelectionModel().clearSelection()));

        manufacturedTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> manufacturedTable.getSelectionModel().clearSelection()));

        dataTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> dataTable.getSelectionModel().clearSelection()));

        cargoTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> cargoTable.getSelectionModel().clearSelection()));

        procurementTaskTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> procurementTaskTable.getSelectionModel().clearSelection()));

        taskCostTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> taskCostTable.getSelectionModel().clearSelection()));

        shipStatisticsTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> shipStatisticsTable.getSelectionModel().clearSelection()));

        coreModuleList.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> coreModuleList.getSelectionModel().clearSelection()));

        optionalModuleList.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> optionalModuleList.getSelectionModel().clearSelection()));

        hardpointList.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
                Platform.runLater(() -> hardpointList.getSelectionModel().clearSelection()));
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
        synchronized (messageList)
        {
            messageList.add(new MessageData(message, messageType));
            while (messageList.size() > 500) messageList.remove(0);
        }

        Platform.runLater(()->
        {
            consoleBackingList.clear();
            consoleBackingList.addAll(messageList);
            consoleMessageList.scrollTo(consoleBackingList.size());
        });
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
        // because this can be called asynchronously and there's math involved, best to synchronize
        // so the counts don't get messed up
        synchronized (taskList)
        {
            // find the task we need to adjust
            ProcurementTaskData data = taskList.stream()
                    .filter(storedTask -> storedTask.matches(task))
                    .findFirst().orElse(null);

            // if this happens, we don't currently have this task in the list, so we need to determine what to
            // do next based on the adjustment amount
            if (data == null)
            {
                // this this was a 0 adjustment or negative, just return -1 indicating the task is not present
                if (adjustment <= 0) return -1;

                    // otherwise, this is an indication that we should add this new task to the list, so we create
                    // a new one, and initialize the count to zero, as the actual adjustment logic can then work
                    // the same for new and existing tasks
                else
                {
                    data = new ProcurementTaskData(task.getKey(),
                            task.getValue(),
                            0,
                            commanderData::hasItem,
                            tradeYieldCache::get,
                            commanderData.getLocation()::getStarSystem);
                    taskList.add(data);

                    // initialize the costs as well, if they are not already present in the cost list. It is
                    // critical to ensure a new item is added ONLY if it's not already present, which is
                    // possible if another task requires some amount of the same material as this one.
                    // Otherwise, duplicate entries will end up in the list
                    task.getValue().costStream()
                            .filter(costData -> costData.getQuantity() > 0)
                            .map(CostData::getCost)
                            .filter(taskCost -> costList.stream().noneMatch(cost -> cost.getCost().equals(taskCost)))
                            .map(taskCost ->  new ItemCostData(taskCost,
                                    commanderData::hasItem,
                                    taskCostCache::contains,
                                    tradeYieldCache::get,
                                    tradeCostCache::get,
                                    addTaskToProcurementList))
                            .forEach(costList::add);
                }
            }

            // grab the count before adjustment so we can tell how much the final adjustment actually was
            int oldCount = data.getCount();

            // here we do a quick sanity count, in case the count is already at the maximum. if that's the case,
            // we will not adjust further, just return the count
            if (oldCount == 999) return oldCount;

            // now, we can continue with the adjustment.
            int newCount = oldCount + adjustment;

            // We max out at 999, just because the UI will get weird and it's unlikely anyone will want/need
            // anywhere near that many tasks of a given type. If the adjustment would bring the value over that
            // maximum, we'll clamp it.
            if (newCount > 999) newCount = 999;

            // just in case, we also need to check that the adjustment would bring the count below zero. if that
            // would occur, we clamp the new count to 0
            if (newCount < 0) newCount = 0;

            // now we ACTUALLY set the new count, performing the adjustment
            data.setCount(newCount);

            // to make sure we've cleaned everything up, if the new count became 0, remove the task
            if (newCount == 0) taskList.remove(data);

            // figure out what the difference was, we'll need this to calculate the cost adjustment
            int costDifference = newCount - oldCount;

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
            List<ItemCostData> toRemove = costList.stream()
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
                    .collect(Collectors.toList());

            costList.removeAll(toRemove);

            procurementTaskTable.refresh();
            taskCostTable.refresh();

            if (Platform.isFxApplicationThread()) synchronizeBackingLists();
            else Platform.runLater(this::synchronizeBackingLists);

            return newCount;
        }
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

            procurementListUpdate(count.get(), new Pair<>(procType.get(), recipeType.get()));
        });
    }
}
