package com.controllerface.edeps.ui;

import com.controllerface.edeps.*;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.data.commander.InventoryData;
import com.controllerface.edeps.data.commander.ShipStatisticData;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.data.procurements.ProcurementTaskData;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import com.controllerface.edeps.data.commander.CommanderData;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
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
import com.controllerface.edeps.structures.equipment.ItemGrade;
import com.controllerface.edeps.threads.JournalSyncTask;
import com.controllerface.edeps.threads.TransactionProcessingTask;
import com.controllerface.edeps.threads.UserTransaction;
import com.controllerface.edeps.ui.inventory.InventoryDisplayCell;
import com.controllerface.edeps.ui.inventory.InventoryGradeCell;
import com.controllerface.edeps.ui.procurements.ProcurementListCell;
import com.controllerface.edeps.ui.procurements.ProcurementTreeCell;
import javafx.application.Platform;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.util.Callback;
import javafx.util.Pair;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * UI Controller class for Elite Dangerous Engineer Procurement System
 *
 * Notes:
 *  - Uses JavaFX
 *
 * Created by Stephen on 3/20/2018.
 */
public class UIController
{
    /*
    =============================
    === UI Components (JavaFX) ===
    =============================
     */

    @FXML private TabPane mainPane;
    @FXML private Tab debugTab;

    // Procurement tree
    @FXML private HBox procurementBox;
    @FXML private Label procurementLabel;
    @FXML private TreeView<ProcurementTaskData> procurementTree;
    @FXML private ListView<ProcurementTaskData> procurementList;

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

    // Procurement task table
    @FXML private AnchorPane taskPane;
    @FXML private RadioButton sortTasksByName;
    @FXML private RadioButton sortTasksByGrade;

    @FXML private TableView<ProcurementRecipeData> procurementTaskTable;
    @FXML private TableColumn<ProcurementRecipeData, ProcurementRecipeData> taskCountColumn;
    @FXML private TableColumn<ProcurementRecipeData, ProcurementRecipeData> taskNameColumn;
    @FXML private TableColumn<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>> taskRemoveColumn;

    // Procurement cost table
    @FXML private TableView<ItemCostData> taskCostTable;
    @FXML private TableColumn<ItemCostData, String> taskCostNeedColumn;
    @FXML private TableColumn<ItemCostData, ItemCostData> taskCostNameColumn;

    // The observable list backing the task cost table view
    private ObservableList<ItemCostData> taskCostBackingList = FXCollections.observableList(new ArrayList<>());

    // player stats
    @FXML private TableView<Pair<Statistic, String>> statTable;
    @FXML private TableColumn<Pair<Statistic, String>, String> statNameColumn;
    @FXML private TableColumn<Pair<Statistic, String>, String> statValueColumn;

    @FXML private CheckBox showProcurements;
    @FXML private CheckBox showTasks;
    @FXML private CheckBox showItemsNeeded;

    @FXML private Label shipNameLabel;
    @FXML private Label shipTypeLabel;
    @FXML private Label shipIDLabel;

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
    =======================
    === Raw Data Objects ===
    =======================
     */

    private boolean initialzed = false;

    private final CommanderData commanderData = new CommanderData();

    private ObservableList<ProcurementTaskData> procSelectorBackingList = FXCollections.observableArrayList();

    // The observable list backing the task list table view
    private final ObservableList<ProcurementRecipeData> taskBackingList = FXCollections.observableArrayList();


    /*
    Functional object providing a generic way to adjust the count of a given blueprint in current procurement list. If,
    after applying the given adjustment, the count of that blueprint within the list drops to zero or lower, the
    blueprint is completely removed from the list. After adjustment is made, the UI is automatically updated to reflect
    the changes.

    param 1: amount to adjust the blueprint by - positive to add to count, negative to subtract
    param 2: pair object used to determine the mod type and related recipe to adjust
    returns: the new count of the given mod
     */
    private final BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer> procurementListUpdate =
            (adjustment, recipe)->
            {
                // because this can be called asynchronously and there's math involved, best to synchronize
                // so the counts don't get messed up
                synchronized (taskBackingList)
                {
                    // find the task we need to adjust
                    ProcurementRecipeData data = taskBackingList.stream()
                            .filter(task -> task.matches(recipe))
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
                            data = new ProcurementRecipeData(recipe.getKey(), recipe.getValue(), 0);
                            taskBackingList.add(data);

                            // initialize the costs as well, if they are not already present in the cost list. It is
                            // critical to ensure a new item is added ONLY if it's not already present, which is
                            // possible if another task requires some amount of the same material as this one.
                            // Otherwise, duplicate entries will end up in the list
                            recipe.getValue().costStream()
                                    .map(CostData::getCost)
                                    .filter(taskCost -> taskCostBackingList.stream()
                                            .noneMatch(knownCost -> knownCost.getCost().equals(taskCost)))
                                    .forEach(taskCost->
                                    {
                                        ItemCostData newItem = new ItemCostData(taskCost, this.commanderData::hasItem);
                                        taskCostBackingList.add(newItem);
                                    });
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
                    if (newCount == 0) taskBackingList.remove(data);

                    // figure out what the difference was, we'll need this to calculate the cost adjustment
                    int diff = newCount - oldCount;

                    // now we need to calculate the cost adjustments that this task adjustment requires. To do this,
                    // we find all the costs of this recipe, and multiply the required cost by the difference of the
                    // task adjustment
                    List<CostData> costAdjustments = recipe.getValue().costStream()
                            .map(taskCost -> new CostData(taskCost.getCost(), taskCost.getQuantity() * diff))
                            .collect(Collectors.toList());

                    // loop through the cost list and make the actual adjustments, and then collect the adjusted
                    // costs so we can check for any that need to be removed after adjustment
                    List<ItemCostData> toRemove = taskCostBackingList.stream()
                            .filter(costToAdjust -> costAdjustments.stream().anyMatch(costToAdjust::matches))
                            .peek(costToAdjust ->
                            {
                                CostData toAdjust = costAdjustments.stream()
                                        .filter(costToAdjust::matches)
                                        .findFirst().get();
                                costToAdjust.setCount(costToAdjust.getCount() + toAdjust.getQuantity());
                            })
                            .filter(adjustedCost -> adjustedCost.getCount() <= 0)
                            .collect(Collectors.toList());

                    taskCostBackingList.removeAll(toRemove);

                    syncUI();

                    procurementTaskTable.refresh();
                    taskCostTable.refresh();

                    return newCount;
                }
            };

    /*
    This is a convenience wrapper around the procurementListUpdate function, used for cases where the calling code does
    not need to get the post adjustment value after the adjustment is made.
     */
    private final BiConsumer<Integer, Pair<ProcurementType, ProcurementRecipe>> adjustBlueprint =
            procurementListUpdate::apply;

    /*
    Consumer function that accepts a ProcurementTaskData and adds it to the procurement list. If the task already exists in the
    list, this effectively increments the count of that by 1
     */
    private final Consumer<ProcurementTaskData> addTaskToProcurementList =
            (mod)->
            {
                Pair<ProcurementType, ProcurementRecipe> ref = new Pair<>(mod.getType(), mod.getRecipe());
                adjustBlueprint.accept(1, ref);
            };

    public UIController()
    {
        localizeData();

        // this is the transaction queue the transaction processor and inventory threads will use to keep the UI
        // and player inventory in sync
        BlockingQueue<UserTransaction> transactionQueue = new LinkedBlockingQueue<>();

        // transaction processor
        Runnable transactionProcessingTask =
                new TransactionProcessingTask(this::syncUI, commanderData::adjustItem, adjustBlueprint, transactionQueue);

        Thread transactionThread = new Thread(transactionProcessingTask);
        transactionThread.setDaemon(true);
        transactionThread.start();

        // disk monitor
        Runnable inventorySyncTask = new JournalSyncTask(this::syncUI, commanderData, transactionQueue);
        Thread inventoryThread = new Thread(inventorySyncTask);
        inventoryThread.setDaemon(true);
        inventoryThread.start();
    }

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
        initialzed = true;

        Properties properties = new Properties();
        try {properties.load(this.getClass().getResourceAsStream("/config.properties"));}
        catch (IOException e) {e.printStackTrace();}

        String debug = properties.getProperty("debug");
        if (debug != null && debug.equals("true"))
        {
            System.out.println("DEBUg!!");
        }
        else
        {
            mainPane.getTabs().stream()
                    .filter(t->t.equals(debugTab)).findFirst()
                    .ifPresent(t->mainPane.getTabs().remove(t));
        }

        // sync the UI now that everything is set up
        syncUI();

        sortInventory();
    }

    private void initializeTextPlaceholders()
    {
        // set placeholder labels shown when the procurement list is empty
        Label recipeTableLabel = new Label("Use the Procurement Tasks menu to select tasks");
        Label costTableLabel = new Label("Items needed for selected tasks will appear here");
        recipeTableLabel.setFont(UIFunctions.Fonts.size1Font);
        costTableLabel.setFont(UIFunctions.Fonts.size1Font);
        procurementTaskTable.setPlaceholder(recipeTableLabel);
        taskCostTable.setPlaceholder(costTableLabel);
    }

    private void initializeInventoryTables()
    {
        // associate the inventory lists with the table view UI elements that display their contents
        rawTable.setItems(commanderData.observableRawMaterials());
        dataTable.setItems(commanderData.observableDataMaterials());
        manufacturedTable.setItems(commanderData.observableManufacturedMaterials());
        cargoTable.setItems(commanderData.observableCargo());

        // for each of the inventory lists, we need to add a listener that refreshes the corresponding UI table
        // when the backing list is updated.
        // todo: the refresh lambdas should store and re-apply existing sorts on the table
        // todo: it may be necessary to use Platform.runLater() to ensure no UI thread exceptions when sorting
        commanderData.observableCargo().addListener((ListChangeListener<InventoryData>)
                c -> cargoTable.refresh());

        commanderData.observableDataMaterials().addListener((ListChangeListener<InventoryData>)
                c -> dataTable.refresh());

        commanderData.observableManufacturedMaterials().addListener((ListChangeListener<InventoryData>)
                c -> manufacturedTable.refresh());

        commanderData.observableRawMaterials().addListener((ListChangeListener<InventoryData>)
                c -> rawTable.refresh());

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

        // This call back simply creates a new custom InventoryDisplayCell which is used int he center "data" columns
        // of the various inventory UI tables. The custom cell contains the display logic and supports all of the
        // various item categories, so we can re use it for all of the data columns
        final Callback<TableColumn<InventoryData, InventoryData>, TableCell<InventoryData, InventoryData>>
                inventoryItemCellFactory = (x) -> new InventoryDisplayCell();

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

    private void initializeShipLoadoutTables()
    {
        shipStatisticsTable.setItems(commanderData.getStarShip().getStatistics());
        coreModuleList.setItems(commanderData.getStarShip().getCoreInternals());
        optionalModuleList.setItems(commanderData.getStarShip().getOptionalInternals());
        hardpointList.setItems(commanderData.getStarShip().getHardpoints());

        commanderData.getStarShip().getStatistics()
                .addListener((ListChangeListener<ShipStatisticData>)
                        c -> shipStatisticsTable.refresh());

        commanderData.getStarShip().getCoreInternals()
                .addListener((ListChangeListener<ShipModuleData>)
                        c -> coreModuleList.refresh());

        commanderData.getStarShip().getOptionalInternals()
                .addListener((ListChangeListener<ShipModuleData>)
                        c -> optionalModuleList.refresh());

        commanderData.getStarShip().getHardpoints()
                .addListener((ListChangeListener<ShipModuleData>)
                        c -> hardpointList.refresh());

        shipStatisticsNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().statName()));
        shipStatisticsNameColumn.setCellFactory(UIFunctions.Data.boldStatNameCellFactory);
        shipStatisticsDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        shipStatisticsDataColumn.setCellFactory(UIFunctions.Data.boldStatDataCellFactory);

        coreModuleNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        coreModuleNameColumn.setCellFactory(UIFunctions.Data.boldSlotNameCellFactory);
        coreModuleDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        coreModuleDataColumn.setCellFactory(UIFunctions.Data.moduleDisplayCellFactory);

        optionalModuleNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        optionalModuleNameColumn.setCellFactory(UIFunctions.Data.boldSlotNameCellFactory);
        optionalModuleDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        optionalModuleDataColumn.setCellFactory(UIFunctions.Data.moduleDisplayCellFactory);

        hardpointNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().getModuleName().getText()));
        hardpointNameColumn.setCellFactory(UIFunctions.Data.boldSlotNameCellFactory);
        hardpointDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        hardpointDataColumn.setCellFactory(UIFunctions.Data.moduleDisplayCellFactory);
    }

    private void initializeUIComponents()
    {
        initializeTextPlaceholders();

        SimpleStringProperty labelText = new SimpleStringProperty("");
        procurementLabel.textProperty().bind(labelText);
        procurementTree.setCellFactory(param -> new ProcurementTreeCell(procSelectorBackingList, labelText));
        procurementList.setItems(procSelectorBackingList);
        procurementList.setCellFactory(param ->
                new ProcurementListCell(addTaskToProcurementList, commanderData::hasItem, procurementList.widthProperty()));

        procurementTaskTable.setItems(taskBackingList);
        taskCostTable.setItems(taskCostBackingList);

        initializeInventoryTables();
        initializeShipLoadoutTables();

        taskCountColumn.setCellFactory(UIFunctions.Data.makeModRollCellFactory.apply(procurementListUpdate));
        taskCountColumn.setCellValueFactory(UIFunctions.Data.modRollCellValueFactory);

        taskNameColumn.setCellFactory(UIFunctions.Data.makeModNameCellFactory.apply(commanderData::hasItem));
        taskNameColumn.setCellValueFactory(UIFunctions.Data.modNameCellValueFactory);
        taskRemoveColumn.setCellFactory(UIFunctions.Data.makeModControlCellFactory.apply(procurementListUpdate));
        taskRemoveColumn.setCellValueFactory(UIFunctions.Data.modControlCellValueFactory);

        taskCostNeedColumn.setCellValueFactory(UIFunctions.Data.costNeedCellFactory);
        taskCostNeedColumn.setCellFactory(UIFunctions.Data.boldCostNumberCellFactory);

        taskCostNameColumn.setCellValueFactory(UIFunctions.Data.costNameCellValueFactory);
        taskCostNameColumn.setCellFactory(UIFunctions.Data.boldCostStringCellFactory);

        statNameColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getKey().getText()));
        statValueColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getValue()));
        statNameColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);
        statValueColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);


        sortTasksByName.setOnAction((e)-> sortTaskTable());
        sortTasksByGrade.setOnAction((e)-> sortTaskTable());

        showProcurements.setOnAction((e)-> setProcurementsUIVisibility());
        showTasks.setOnAction((e)-> setProcurementsUIVisibility());
        showItemsNeeded.setOnAction((e)-> setProcurementsUIVisibility());

        shipNameLabel.textProperty().bind(commanderData.getStarShip().getShipGivenName());
        shipTypeLabel.textProperty().bind(commanderData.getStarShip().getShipDisplayName());
        shipIDLabel.textProperty().bind(commanderData.getStarShip().getShipID());


        // table auto-resize bindings

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


        // fix ugly selection stuff


        procurementTree.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> procurementTree.getSelectionModel().clearSelection());
        });

        procurementList.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> procurementList.getSelectionModel().clearSelection());
        });

        rawTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> rawTable.getSelectionModel().clearSelection());
        });

        manufacturedTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> manufacturedTable.getSelectionModel().clearSelection());
        });

        dataTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> dataTable.getSelectionModel().clearSelection());
        });

        cargoTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> cargoTable.getSelectionModel().clearSelection());
        });

        procurementTaskTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> procurementTaskTable.getSelectionModel().clearSelection());
        });

        taskCostTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> taskCostTable.getSelectionModel().clearSelection());
        });

        statTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> statTable.getSelectionModel().clearSelection());
        });

        shipStatisticsTable.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> shipStatisticsTable.getSelectionModel().clearSelection());
        });

        coreModuleList.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> coreModuleList.getSelectionModel().clearSelection());
        });

        optionalModuleList.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> optionalModuleList.getSelectionModel().clearSelection());
        });

        hardpointList.getSelectionModel().selectedIndexProperty().addListener((observable, oldvalue, newValue) ->
        {
            Platform.runLater(() -> hardpointList.getSelectionModel().clearSelection());
        });






    }

    private TreeItem<ProcurementTaskData> makeSynthesisTree()
    {
        TreeItem<ProcurementTaskData> modifications = new TreeItem<>(new ProcurementTaskData("Synthesis"));

        // loop through all mod categories
        Arrays.stream(SynthesisCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcurementTaskData> categoryItem = new TreeItem<>(new ProcurementTaskData(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcurementTaskData> typeItem = new TreeItem<>(new ProcurementTaskData(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a collapsible blueprint label
                    TreeItem<ProcurementTaskData> bluePrintItem = new TreeItem<>(new ProcurementTaskData(type, blueprint));

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

    private TreeItem<ProcurementTaskData> makeModTree()
    {
        TreeItem<ProcurementTaskData> modifications = new TreeItem<>(new ProcurementTaskData("Engineering Modifications"));

        // loop through all mod categories
        Arrays.stream(ModificationCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcurementTaskData> categoryItem = new TreeItem<>(new ProcurementTaskData(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcurementTaskData> typeItem = new TreeItem<>(new ProcurementTaskData(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a collapsible blueprint label
                    TreeItem<ProcurementTaskData> bluePrintItem = new TreeItem<>(new ProcurementTaskData(type, blueprint));

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

    private TreeItem<ProcurementTaskData> makeExperimentTree()
    {
        TreeItem<ProcurementTaskData> experiments = new TreeItem<>(new ProcurementTaskData("Experimental Effects"));

        // loop through all mod categories
        Arrays.stream(ExperimentalCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcurementTaskData> categoryItem = new TreeItem<>(new ProcurementTaskData(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                //TreeItem<ProcurementTaskData> typeItem = new TreeItem<>(new ProcurementTaskData(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a collapsible blueprint label
                    TreeItem<ProcurementTaskData> bluePrintItem = new TreeItem<>(new ProcurementTaskData(type, blueprint));

                    // add the blueprint item to this mod type
                    //typeItem.getChildren().add(bluePrintItem);
                    categoryItem.getChildren().add(bluePrintItem);

                });

                // add the type item to this category
                //categoryItem.getChildren().add(typeItem);
            });

            // add this category to the root
            experiments.getChildren().add(categoryItem);
        });

        return experiments;
    }

    private TreeItem<ProcurementTaskData> makeTechnologyTree()
    {
        TreeItem<ProcurementTaskData> modifications = new TreeItem<>(new ProcurementTaskData("Tech Broker Unlocks"));

        // loop through all mod categories
        Arrays.stream(TechnologyCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcurementTaskData> categoryItem = new TreeItem<>(new ProcurementTaskData(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcurementTaskData> typeItem = new TreeItem<>(new ProcurementTaskData(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a collapsible blueprint label
                    TreeItem<ProcurementTaskData> bluePrintItem = new TreeItem<>(new ProcurementTaskData(type, blueprint));

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
        TreeItem<ProcurementTaskData> root = new TreeItem<>(new ProcurementTaskData("root"));

        // create and add the various procurement sub-trees to the root object
        root.getChildren().addAll(makeSynthesisTree(),
                makeModTree(),
                makeExperimentTree(),
                makeTechnologyTree());

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

    private void sortTaskTable()
    {
        if (procurementTaskTable.getItems().size() > 0)
        {
            procurementTaskTable.getItems().sort((a, b) ->
            {
                if (sortTasksByGrade.isSelected())
                {
                    return ItemGrade.compare(a.asPair().getValue().getGrade(),
                            b.asPair().getValue().getGrade());
                }
                if (sortTasksByName.isSelected())
                {
                    String as = a.asPair().getKey().toString() + a.asPair().getValue().toString();
                    String bs = b.asPair().getKey().toString() + b.asPair().getValue().toString();
                    return as.compareTo(bs);
                }
                else return a.toString().compareTo(b.toString());
            });
        }
    }

    private void syncUI()
    {
        if (!initialzed) return;

        statTable.getItems().clear();

        sortTaskTable();

        if (taskCostTable.getItems().size() > 0)
        {
            taskCostTable.getItems().sort((a, b)->
            {
                int aNeed = a.getNeed();
                int bNeed = b.getNeed();
                int aHave = a.getHave();
                int bHave = b.getHave();
                boolean aok = aHave >= aNeed;
                boolean bok = bHave >= bNeed;

                int r2;

                if (aok && bok) r2 = 0;
                else if (aok || bok) r2 = aok ? 1 : -1;
                else
                {
                    int aDiff = Math.abs(aNeed - aHave);
                    int bDiff = Math.abs(bNeed - bHave);
                    r2 = bDiff - aDiff;
                }

                return r2;
            });
        }

        setProcurementsUIVisibility();

        statTable.refresh();
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

        List<Map<String, Object>> tasks = taskBackingList.stream()
                .map(e->
                {
                    Pair<ProcurementType, ProcurementRecipe> pair = e.asPair();
                    ProcurementType type = pair.getKey();
                    ProcurementRecipe recipe = pair.getValue();
                    Integer count = e.getCount();

                    String procType = type.getClass().getSimpleName();
                    String procName = type.getName();

                    String recipeType = recipe.getClass().getSimpleName();
                    String recipeName = recipe.getName();

                    Map<String, Object> procTypedata = new LinkedHashMap<>();
                    procTypedata.put(procType, procName);
                    procTypedata.put(recipeType, recipeName);
                    procTypedata.put("Count", count);

                    return procTypedata;
                }).collect(Collectors.toList());

        data.put("tasks", tasks);

        File file = new File("data.json");
        if (!file.exists() && !file.createNewFile()) throw new RuntimeException("Could not create file");
        JSONSupport.Write.jsonToFile.apply(file, data);
    }

    private void fromJson()
    {
        File file = new File("data.json");
        if (!file.exists())
        {
            System.err.println("data.json File not found");
            return;
        }

        Map<String, Object> data = JSONSupport.Parse.jsonFile.apply(file);

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
                    case "ExperimentalType":
                        procType.set(ExperimentalType.valueOf(((String) value)));
                        break;

                    case "ModificationType":
                        procType.set(ModificationType.valueOf(((String) value)));
                        break;

                    case "SynthesisType":
                        procType.set(SynthesisType.valueOf(((String) value)));
                        break;

                    case "TechnologyType":
                        procType.set(TechnologyType.valueOf(((String) value)));
                        break;

                    case "ExperimentalRecipe":
                        recipeType.set(ExperimentalRecipe.valueOf(((String) value)));
                        break;

                    case "ModificationRecipe":
                        recipeType.set(ModificationRecipe.valueOf(((String) value)));
                        break;

                    case "WeaponModificationRecipe":
                        recipeType.set(WeaponModificationRecipe.valueOf(((String) value)));
                        break;

                    case "SynthesisRecipe":
                        recipeType.set(SynthesisRecipe.valueOf(((String) value)));
                        break;

                    case "TechnologyRecipe":
                        recipeType.set(TechnologyRecipe.valueOf(((String) value)));
                        break;

                    case "Count":
                        count.set(((Integer) value));
                        break;
                }
            });

            adjustBlueprint.accept(count.get(),new Pair<>(procType.get(), recipeType.get()));
        });

        if (initialzed) syncUI();
    }
}
