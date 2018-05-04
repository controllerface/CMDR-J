package com.controllerface.edeps.ui;

import com.controllerface.edeps.*;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.data.commander.InventoryData;
import com.controllerface.edeps.data.commander.ShipStatisticData;
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
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Callback;
import javafx.util.Pair;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
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

    // Procurement tree
    @FXML private HBox procurementBox;
    @FXML private TreeView<ProcurementTaskData> procurementTree;
    @FXML private ListView<ProcurementTaskData> procurementList;

    // Raw materials
    @FXML private TableView<InventoryData> rawTable;
    @FXML private TableColumn<InventoryData, String> rawCategoryColumn;
    @FXML private TableColumn<InventoryData, String> rawGradeColumn;
    @FXML private TableColumn<InventoryData, String> rawMaterialColumn;
    @FXML private TableColumn<InventoryData, Label> rawQuantityColumn;

    // Manufactured materials
    @FXML private TableView<InventoryData> manufacturedTable;
    @FXML private TableColumn<InventoryData, String> manufacturedCategoryColumn;
    @FXML private TableColumn<InventoryData, String> manufacturedGradeColumn;
    @FXML private TableColumn<InventoryData, String> manufacturedMaterialColumn;
    @FXML private TableColumn<InventoryData, Label> manufacturedQuantityColumn;

    // Data materials
    @FXML private TableView<InventoryData> dataTable;
    @FXML private TableColumn<InventoryData, String> dataCategoryColumn;
    @FXML private TableColumn<InventoryData, String> dataGradeColumn;
    @FXML private TableColumn<InventoryData, String> dataMaterialColumn;
    @FXML private TableColumn<InventoryData, Label> dataQuantityColumn;

    // Cargo
    @FXML private TableView<InventoryData> cargoTable;
    @FXML private TableColumn<InventoryData, String> cargoCategoryColumn;
    @FXML private TableColumn<InventoryData, String> cargoGradeColumn;
    @FXML private TableColumn<InventoryData, String> cargoMaterialColumn;
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
    @FXML private TableColumn<ItemCostData, ProgressIndicator> taskCostProgressColumn;
    @FXML private TableColumn<ItemCostData, Number> taskCostNeedColumn;
    @FXML private TableColumn<ItemCostData, Number> taskCostHaveColumn;
    @FXML private TableColumn<ItemCostData, String> taskCostNameColumn;
    @FXML private TableColumn<ItemCostData, String> taskCostTypeColumn;

    // The observable list backing the task cost table view
    private ObservableList<ItemCostData> taskCostBackingList = FXCollections.observableList(new ArrayList<>());

    // player stats
    @FXML private TableView<Pair<Statistic, String>> statTable;
    @FXML private TableColumn<Pair<Statistic, String>, String> statNameColumn;
    @FXML private TableColumn<Pair<Statistic, String>, String> statValueColumn;

    @FXML private CheckBox showProcurements;
    @FXML private CheckBox showTasks;
    @FXML private CheckBox showItemsNeeded;

    @FXML private Label shipTypeLabel;

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
    private ObservableList<ProcurementRecipeData> taskBackingList = FXCollections.observableArrayList();

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
        Support.JSON.writeJsonToFile.apply(file, data);
    }

    private void fromJson()
    {
        File file = new File("data.json");
        if (!file.exists())
        {
            System.err.println("data.json File not found");
            return;
        }

        Map<String, Object> data = Support.JSON.parseJsonFile.apply(file);

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

            taskBackingList.add(new ProcurementRecipeData(procType.get(),recipeType.get(), count.get()));
        });

        if (initialzed) syncUI();
    }


    /*
    ========================
    === Ship Functions ===
    ========================
     */


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
                ProcurementRecipeData data =
                        taskBackingList.filtered((k)->k.asPair().equals(recipe))
                        .stream().findFirst()
                        .orElse(null);

                if (data == null) return -1;

                // max out at 999, just because the UI will get weird
                int val = data.getCount() + adjustment;
                if (val > 999) val = 999;

                data.setCount(val);

                syncUI();

                if (val <= 0)
                {
                    val = 0;
                    taskBackingList.remove(data);
                }


                procurementTaskTable.refresh();

                return val;
            };

    /*
    Consumer function that accepts a ProcurementTaskData and adds it to the procurement list. If the task already exists in the
    list, this effectively increments the count of that by 1
     */
    private final Consumer<ProcurementTaskData> addTaskToProcurementList =
            (mod)->
            {
                Pair<ProcurementType, ProcurementRecipe> ref = new Pair<>(mod.getType(), mod.getRecipe());
                ProcurementRecipeData data =
                        taskBackingList.filtered((k)->k.asPair().equals(ref))
                                .stream().findFirst()
                                .orElse(null);

                // add a count for the mod if it does not exist
                if (data == null)
                {
                    taskBackingList.add(new ProcurementRecipeData(mod.getType(), mod.getRecipe(), 1));
                }

                // increment the count for this mod if it exists
                else data.setCount(data.getCount() + 1);

                procurementTaskTable.refresh();

                syncUI();
            };

    public UIController()
    {
        localizeData();

        // this is the transaction queue the transaction processor and inventory threads will use to keep the UI
        // and player inventory in sync
        BlockingQueue<Pair<ProcurementCost, Integer>> transactionQueue = new LinkedBlockingQueue<>();

        // transaction processor
        Runnable transactionProcessingTask = new TransactionProcessingTask(this::syncUI, commanderData, transactionQueue);
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

        // sync the UI now that everything is set up
        syncUI();
    }

    private void initializeUIComponents()
    {
        // set placeholder labels shown when the procurement list is empty
        Label recipeTableLabel = new Label("Use the Procurement Tasks menu to select tasks");
        Label costTableLabel = new Label("Items needed for selected tasks will appear here");

        Font recipeTableFont = Font.font(recipeTableLabel.getFont().getFamily(),
                FontWeight.BOLD,
                recipeTableLabel.getFont().getSize() * 1.5);

        Font costTableFont = Font.font(costTableLabel.getFont().getFamily(),
                FontWeight.BOLD,
                costTableLabel.getFont().getSize() * 1.5);

        recipeTableLabel.setFont(recipeTableFont);
        costTableLabel.setFont(costTableFont);

        procurementTree.setCellFactory(param -> new ProcTreeCell(procSelectorBackingList));

        procurementList.setItems(procSelectorBackingList);
        procurementList.setCellFactory(param ->
                new ProcListCell(addTaskToProcurementList, commanderData::hasItem, procurementList.widthProperty()));

        rawTable.setItems(commanderData.observableRawMaterials());
        dataTable.setItems(commanderData.observableDataMaterials());
        manufacturedTable.setItems(commanderData.observableManufacturedMaterials());
        cargoTable.setItems(commanderData.observableCargo());

        procurementTaskTable.setItems(taskBackingList);
        taskCostTable.setItems(taskCostBackingList);

        procurementTaskTable.setPlaceholder(recipeTableLabel);
        taskCostTable.setPlaceholder(costTableLabel);
        sortTasksByName.setOnAction((e)->sortTasktable());
        sortTasksByGrade.setOnAction((e)->sortTasktable());

        shipStatisticsTable.setItems(commanderData.getStarShip().getStatistics());
        coreModuleList.setItems(commanderData.getStarShip().getCoreInternals());
        optionalModuleList.setItems(commanderData.getStarShip().getOptionalInternals());
        hardpointList.setItems(commanderData.getStarShip().getHardpoints());

        shipStatisticsNameColumn.setCellValueFactory(param -> new SimpleStringProperty(param.getValue().statName()));
        shipStatisticsNameColumn.setCellFactory(UIFunctions.Data.boldStatNameCellFactory);
        shipStatisticsDataColumn.setCellValueFactory(param -> new ReadOnlyObjectWrapper<>(param.getValue()));
        shipStatisticsDataColumn.setCellFactory(new Callback<TableColumn<ShipStatisticData, ShipStatisticData>, TableCell<ShipStatisticData, ShipStatisticData>>()
        {
            @Override
            public TableCell<ShipStatisticData, ShipStatisticData> call(TableColumn<ShipStatisticData, ShipStatisticData> param)
            {
                return new TableCell<ShipStatisticData, ShipStatisticData>()
                {
                    @Override
                    protected void updateItem(ShipStatisticData item, boolean empty)
                    {
                        super.updateItem(item, empty);
                        if (item == null)
                        {
                            setGraphic(null);
                            return;
                        }
                        if (!empty)
                        {
                            Label label = new Label(item.statDisplayValue());
                            setGraphic(label);
                        }
                    }
                };
            }
        });

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


        // set the cell value factories for the player inventory tabs
        rawCategoryColumn.setCellValueFactory(UIFunctions.Data.inventoryCategoryCellFactory);
        rawGradeColumn.setCellValueFactory(UIFunctions.Data.inventoryGradeCellFactory);
        rawMaterialColumn.setCellValueFactory(UIFunctions.Data.inventoryMaterialCellFactory);
        rawQuantityColumn.setCellValueFactory(UIFunctions.Data.inventoryQuantityCellFactory);
        rawQuantityColumn.setComparator(UIFunctions.Sort.quantityByNumericValue);

        manufacturedCategoryColumn.setCellValueFactory(UIFunctions.Data.inventoryCategoryCellFactory);
        manufacturedGradeColumn.setCellValueFactory(UIFunctions.Data.inventoryGradeCellFactory);
        manufacturedMaterialColumn.setCellValueFactory(UIFunctions.Data.inventoryMaterialCellFactory);
        manufacturedQuantityColumn.setCellValueFactory(UIFunctions.Data.inventoryQuantityCellFactory);
        manufacturedQuantityColumn.setComparator(UIFunctions.Sort.quantityByNumericValue);

        dataCategoryColumn.setCellValueFactory(UIFunctions.Data.inventoryCategoryCellFactory);
        dataGradeColumn.setCellValueFactory(UIFunctions.Data.inventoryGradeCellFactory);
        dataMaterialColumn.setCellValueFactory(UIFunctions.Data.inventoryMaterialCellFactory);
        dataQuantityColumn.setCellValueFactory(UIFunctions.Data.inventoryQuantityCellFactory);
        dataQuantityColumn.setComparator(UIFunctions.Sort.quantityByNumericValue);

        cargoCategoryColumn.setCellValueFactory(UIFunctions.Data.inventoryCategoryCellFactory);
        cargoGradeColumn.setCellValueFactory(UIFunctions.Data.inventoryGradeCellFactory);
        cargoMaterialColumn.setCellValueFactory(UIFunctions.Data.inventoryMaterialCellFactory);
        cargoQuantityColumn.setCellValueFactory(UIFunctions.Data.inventoryQuantityCellFactory);
        cargoQuantityColumn.setComparator(UIFunctions.Sort.quantityByNumericValue);

        // set the cell and cell value factories for the procurement recipe list
        taskCountColumn.setCellFactory(UIFunctions.Data.makeModRollCellFactory.apply(procurementListUpdate));
        taskCountColumn.setCellValueFactory(UIFunctions.Data.modRollCellValueFactory);
        taskCountColumn.setStyle( "-fx-alignment: CENTER;");

        taskNameColumn.setCellFactory(UIFunctions.Data.makeModNameCellFactory.apply(commanderData::hasItem));
        taskNameColumn.setCellValueFactory(UIFunctions.Data.modNameCellValueFactory);
        taskRemoveColumn.setCellFactory(UIFunctions.Data.makeModControlCellFactory.apply(procurementListUpdate));
        taskRemoveColumn.setCellValueFactory(UIFunctions.Data.modControlCellValueFactory);

        // set the cell and cell value factories for the procurement material list
        taskCostProgressColumn.setCellFactory(UIFunctions.Data.costProgressCellFactory);
        taskCostProgressColumn.setCellValueFactory(UIFunctions.Data.costProgressCellValueFactory);

        taskCostNeedColumn.setCellValueFactory(UIFunctions.Data.costNeedCellFactory);
        taskCostNeedColumn.setCellFactory(UIFunctions.Data.boldCostNumberCellFactory);
        taskCostHaveColumn.setCellValueFactory(UIFunctions.Data.costHaveCellFactory);
        taskCostHaveColumn.setCellFactory(UIFunctions.Data.boldCostNumberCellFactory);

        taskCostNameColumn.setCellValueFactory(UIFunctions.Data.costNameCellValueFactory);
        taskCostNameColumn.setCellFactory(UIFunctions.Data.boldCostStringCellFactory);

        taskCostTypeColumn.setCellValueFactory(UIFunctions.Data.costTypeCellFactory);
        taskCostTypeColumn.setCellFactory(UIFunctions.Data.boldCostStringCellFactory);


        statNameColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getKey().getText()));
        statValueColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getValue()));
        statNameColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);
        statValueColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);

        showProcurements.setOnAction((e)->setProcumentsUIVisibility());
        showTasks.setOnAction((e)->setProcumentsUIVisibility());
        showItemsNeeded.setOnAction((e)->setProcumentsUIVisibility());


        shipTypeLabel.textProperty().bind(commanderData.getStarShip().getShipDisplayName());


        // set the sorting comparator for the material progress column of the procurement list
        taskCostProgressColumn.setComparator(UIFunctions.Sort.indicatorByProgress);

        DoubleBinding recipeTableWidthUsed = taskCountColumn.widthProperty()
                .add(taskRemoveColumn.widthProperty())
                .add(UIFunctions.scrollBarAllowance);

        taskNameColumn.prefWidthProperty()
                .bind(procurementTaskTable.widthProperty()
                        .subtract(recipeTableWidthUsed));

        DoubleBinding costTableWidthUsed = taskCostProgressColumn.widthProperty()
                .add(taskCostNeedColumn.widthProperty())
                .add(taskCostHaveColumn.widthProperty())
                .add(taskCostTypeColumn.widthProperty())
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

    private TreeItem<ProcurementTaskData> makeSynthesisTree()
    {
        TreeItem<ProcurementTaskData> modifications = new TreeItem<>(new ProcurementTaskData("Synthesis"));
        //modifications.setExpanded(true);

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
        //modifications.setExpanded(true);

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
        TreeItem<ProcurementTaskData> modifications = new TreeItem<>(new ProcurementTaskData("Tech Brokers"));
        //modifications.setExpanded(true);

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

    // Builds the "Procurement Tree" from which the user can select tasks to add to their procurement list
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

        // hide the root, showing just it's children in the tree view (which are the mod categories)
        procurementTree.setShowRoot(false);
    }

    private synchronized void sortInventory()
    {
        // sort pass 1, numerically by grade
        rawTable.getItems().sort(UIFunctions.Sort.materialByGrade);
        manufacturedTable.getItems().sort(UIFunctions.Sort.materialByGrade);
        dataTable.getItems().sort(UIFunctions.Sort.materialByGrade);

        // sort pass 2, alphabetically, by category name
        rawTable.getItems().sort(UIFunctions.Sort.costByCategory);
        manufacturedTable.getItems().sort(UIFunctions.Sort.costByCategory);
        dataTable.getItems().sort(UIFunctions.Sort.costByCategory);

        // Cargo sorts a bit differently,
        cargoTable.getItems().sort(UIFunctions.Sort.materialByGrade);
        cargoTable.getItems().sort(UIFunctions.Sort.cargoByCount);
    }

    private void sortTasktable()
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

        // sort the inventory display tables
        sortInventory();

        // Whenever we sync the UI, we always clear out the data structures first, as everything will be re-calculated
        // according to the current state of the player's inventory and stats
        statTable.getItems().clear();

        // buffer map that stores all the cumulative costs in the current task list
        Map<ProcurementCost, Integer> costs = new HashMap<>();


        // todo: see if making the costs calculated at the same time as the tasks can work. would be a lot cooler
        taskBackingList.forEach((recipeData)->
        {
            ProcurementRecipe recipe = recipeData.asPair().getValue();
            recipe.costStream()
                    .forEach(mat->
                    {
                        AtomicBoolean costFound = new AtomicBoolean(false);

                        taskCostBackingList.stream()
                                .filter(costData -> costData.matches(mat.getCost()))
                                .findFirst()
                                .ifPresent(foundCost ->
                                {
                                    costs.putIfAbsent(foundCost.getCost(), 0);
                                    costFound.set(true);
                                    int cost = mat.getQuantity() * recipeData.getCount();
                                    costs.computeIfPresent(foundCost.getCost(),(k, v)->v+=cost);
                                });

                        if (!costFound.get())
                        {
                            ItemCostData newItem = new ItemCostData(mat.getCost(), this.commanderData::hasItem);
                            int newCost = mat.getQuantity() * recipeData.getCount();
                            newItem.setCount(newCost);
                            costs.put(newItem.getCost(), newCost);
                            taskCostBackingList.add(newItem);
                        }
                    });
        });

        List<ItemCostData> toRemove = taskCostBackingList.stream()
                .filter(c->costs.get(c.getCost())!=null)
                .filter(c->costs.get(c.getCost())!=c.getCount())
                .peek(c->c.setCount(costs.get(c.getCost())))
                .filter(c->c.getCount()<=0)
                .collect(Collectors.toList());

        toRemove.forEach(i -> taskCostBackingList.remove(i));

        sortTasktable();

        if (taskCostTable.getItems().size() > 0)
        {
            taskCostTable.getItems().sort((a, b)->
            {
                double ad = ((double)a.getHave() / (double)a.getNeed());
                double bd = ((double)b.getHave() / (double)b.getNeed());
                if (ad == bd) return 0;
                else return ad > bd ? 1 : -1;
            });
        }

        commanderData.getStats()
                .entrySet().stream()
                .filter(e -> JournalSyncTask.allStats.contains(e.getKey()))
                .map(entry -> new Pair<>(entry.getKey(), entry.getValue()))
                .forEach(pair -> statTable.getItems().add(pair));

        setProcumentsUIVisibility();

        // update the UI elements
        taskCostTable.refresh();
        statTable.refresh();
    }

    private void setProcumentsUIVisibility()
    {
        int shown = 0;

        if (showProcurements.isSelected())
        {
            shown++;
            procurementBox.setPrefHeight(10000);
            procurementBox.setVisible(true);
        }
        else
        {
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
        InputStream inputStream = null;
        try
        {
            URL localizationData = getClass().getResource("/localization/eng.json");
            inputStream = localizationData.openStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Map<String, Object> data = Support.JSON.parseJsonStream.apply(inputStream);

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
    }
}
