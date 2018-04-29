package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.commander.InventoryData;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.data.procurements.ProcTreeData;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import com.controllerface.edeps.data.commander.CommanderData;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.procurements.experimentals.ExperimentalCategory;
import com.controllerface.edeps.structures.procurements.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.procurements.experimentals.ExperimentalType;
import com.controllerface.edeps.structures.procurements.modifications.ModificationCategory;
import com.controllerface.edeps.structures.procurements.modifications.ModificationRecipe;
import com.controllerface.edeps.structures.procurements.modifications.ModificationType;
import com.controllerface.edeps.structures.procurements.synthesis.SynthesisCategory;
import com.controllerface.edeps.structures.procurements.synthesis.SynthesisRecipe;
import com.controllerface.edeps.structures.procurements.synthesis.SynthesisType;
import com.controllerface.edeps.structures.procurements.technologies.TechnologyCategory;
import com.controllerface.edeps.structures.procurements.technologies.TechnologyRecipe;
import com.controllerface.edeps.structures.procurements.technologies.TechnologyType;
import com.controllerface.edeps.threads.JournalSyncTask;
import com.controllerface.edeps.threads.TransactionProcessingTask;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
    @FXML private TreeView<ProcTreeData> procurementTree;

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
    @FXML private TableView<ProcurementRecipeData> procurementRecipeTable;
    @FXML private TableColumn<ProcurementRecipeData, ProcurementRecipeData> recipeCountColumn;
    @FXML private TableColumn<ProcurementRecipeData, ProcurementRecipeData> recipeNameColumn;
    @FXML private TableColumn<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>> recipeRemoveColumn;

    // Procurement cost table
    @FXML private TableView<ItemCostData> procurementCostTable;
    @FXML private TableColumn<ItemCostData, ProgressIndicator> costProgressColumn;
    @FXML private TableColumn<ItemCostData, Number> costNeedColumn;
    @FXML private TableColumn<ItemCostData, Number> costHaveColumn;
    @FXML private TableColumn<ItemCostData, String> costNameColumn;
    @FXML private TableColumn<ItemCostData, String> costTypeColumn;

    // player stats
    @FXML private TableView<Pair<Statistic, String>> statTable;
    @FXML private TableColumn<Pair<Statistic, String>, String> statNameColumn;
    @FXML private TableColumn<Pair<Statistic, String>, String> statValueColumn;

    @FXML private TableView<Pair<Statistic, String>> rankTable;
    @FXML private TableColumn<Pair<Statistic, String>, String> rankNameColumn;
    @FXML private TableColumn<Pair<Statistic, String>, String> rankValueColumn;

    @FXML private TableView<Pair<Statistic, String>> shipTable;
    @FXML private TableColumn<Pair<Statistic, String>, String> shipNameColumn;
    @FXML private TableColumn<Pair<Statistic, String>, String> shipValueColumn;

    @FXML private CheckBox showProcurements;
    @FXML private CheckBox showTasks;
    @FXML private CheckBox showItemsNeeded;


    /*
    =======================
    === Raw Data Objects ===
    =======================
     */

    private boolean initialzed = false;

    private final CommanderData commanderData = new CommanderData();

    private final Map<Pair<ProcurementType, ProcurementRecipe>, Integer> procurementRecipeMap = new HashMap<>();

    private final int scrollBarAllowance = 20;

    @FXML
    protected void toJson(ActionEvent event) throws IOException
    {
        // serialize procurementRecipeMap to JSON
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        Map<String, Object> data = new HashMap<>();

        List<Map<String, Object>> tasks = procurementRecipeMap.entrySet().stream()
                .map(e->
                {
                    Pair<ProcurementType, ProcurementRecipe> pair = e.getKey();
                    ProcurementType type = pair.getKey();
                    ProcurementRecipe recipe = pair.getValue();
                    Integer count = e.getValue();

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
        OutputStream outputStream = new FileOutputStream(file);
        writer.writeValue(outputStream, data);
        outputStream.close();
    }

    @FXML
    private void fromJson()
    {
        File file = new File("data.json");
        if (!file.exists())
        {
            System.err.println("data.json File not found");
            return;
        }

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> data;
        try
        {
            data = objectMapper.readValue(file, JournalSyncTask.mapTypeReference);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            throw new RuntimeException("Error reading localization data", ioe );
        }

        procurementRecipeMap.clear();
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> tasks = ((List<Map<String, Object>>) data.get("tasks"));
        tasks.forEach(task ->
        {
            AtomicReference<ProcurementType> procType = new AtomicReference<>();
            AtomicReference<ProcurementRecipe> recipeType = new AtomicReference<>();
            AtomicInteger count = new AtomicInteger(0);

            task.entrySet().stream()
                    .forEach(entry ->
                    {
                        switch (entry.getKey())
                        {
                            case "ExperimentalType" :
                                procType.set(ExperimentalType.valueOf(((String) entry.getValue())));
                                break;

                            case "ModificationType" :
                                procType.set(ModificationType.valueOf(((String) entry.getValue())));
                                break;

                            case "SynthesisType" :
                                procType.set(SynthesisType.valueOf(((String) entry.getValue())));
                                break;

                            case "TechnologyType" :
                                procType.set(TechnologyType.valueOf(((String) entry.getValue())));
                                break;

                            case "ExperimentalRecipe" :
                                recipeType.set(ExperimentalRecipe.valueOf(((String) entry.getValue())));
                                break;

                            case "ModificationRecipe" :
                                recipeType.set(ModificationRecipe.valueOf(((String) entry.getValue())));
                                break;

                            case "SynthesisRecipe" :
                                recipeType.set(SynthesisRecipe.valueOf(((String) entry.getValue())));
                                break;

                            case "TechnologyRecipe" :
                                recipeType.set(TechnologyRecipe.valueOf(((String) entry.getValue())));
                                break;

                            case "Count" :
                                count.set(((Integer) entry.getValue()));
                                break;
                        }
                    });

            procurementRecipeMap.put(new Pair<>(procType.get(), recipeType.get()), count.get());
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
                // max out at 999, just because the UI will get weird
                int val = procurementRecipeMap
                        .computeIfPresent(recipe, (key, count) -> count < 999 ? count + adjustment : 999);

                syncUI();

                if (val <= 0)
                {
                    val = 0;
                    procurementRecipeMap.remove(recipe);
                }

                return val;
            };

    /*
    Consumer function that accepts a ProcTreeData and adds it to the procurement list. If the task already exists in the
    list, this effectively increments the count of that by 1
     */
    private final Consumer<ProcTreeData> addTaskToProcurementList =
            (mod)->
            {
                Pair<ProcurementType, ProcurementRecipe> ref = new Pair<>(mod.getType(), mod.getRecipe());

                // increment the count for this mod if it exists
                procurementRecipeMap
                        .computeIfPresent(ref, (recipe, count) -> count + 1);

                // add a count for the mod if it does not exist
                procurementRecipeMap
                        .computeIfAbsent(ref, (recipe) -> 1);

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
            toJson(null);
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

        procurementRecipeTable.setPlaceholder(recipeTableLabel);
        procurementCostTable.setPlaceholder(costTableLabel);

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
        recipeCountColumn.setCellFactory(UIFunctions.Data.makeModRollCellFactory.apply(procurementListUpdate));
        recipeCountColumn.setCellValueFactory(UIFunctions.Data.modRollCellValueFactory);
        recipeCountColumn.setStyle( "-fx-alignment: CENTER;");

        recipeNameColumn.setCellFactory(UIFunctions.Data.makeModNameCellFactory.apply(commanderData::hasItem));
        recipeNameColumn.setCellValueFactory(UIFunctions.Data.modNameCellValueFactory);
        recipeRemoveColumn.setCellFactory(UIFunctions.Data.makeModControlCellFactory.apply(procurementListUpdate));
        recipeRemoveColumn.setCellValueFactory(UIFunctions.Data.modControlCellValueFactory);

        // set the cell and cell value factories for the procurement material list
        costProgressColumn.setCellFactory(UIFunctions.Data.costProgressCellFactory);
        costProgressColumn.setCellValueFactory(UIFunctions.Data.costProgressCellValueFactory);

        costNeedColumn.setCellValueFactory(UIFunctions.Data.costNeedCellFactory);
        costNeedColumn.setCellFactory(UIFunctions.Data.boldCostNumberCellFactory);
        costHaveColumn.setCellValueFactory(UIFunctions.Data.costHaveCellFactory);
        costHaveColumn.setCellFactory(UIFunctions.Data.boldCostNumberCellFactory);

        costNameColumn.setCellValueFactory(UIFunctions.Data.costNameCellValueFactory);
        costNameColumn.setCellFactory(UIFunctions.Data.boldCostStringCellFactory);

        costTypeColumn.setCellValueFactory(UIFunctions.Data.costTypeCellFactory);
        costTypeColumn.setCellFactory(UIFunctions.Data.boldCostStringCellFactory);


        statNameColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getKey().getText()));
        statValueColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getValue()));
        statNameColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);
        statValueColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);

        rankNameColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getKey().getText()));
        rankValueColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getValue()));
        rankNameColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);
        rankValueColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);

        shipNameColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getKey().getText()));
        shipValueColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getValue()));
        shipNameColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);
        shipValueColumn.setCellFactory(UIFunctions.Data.boldStringNameCellFactory);


        showProcurements.setOnAction((e)->setProcumentsUIVisibility());
        showTasks.setOnAction((e)->setProcumentsUIVisibility());
        showItemsNeeded.setOnAction((e)->setProcumentsUIVisibility());

        // set the sorting comparator for the material progress column of the procurement list
        costProgressColumn.setComparator(UIFunctions.Sort.indicatorByProgress);

        DoubleBinding recipeTableWidthUsed = recipeCountColumn.widthProperty()
                .add(recipeRemoveColumn.widthProperty())
                .add(scrollBarAllowance);

        recipeNameColumn.prefWidthProperty()
                .bind(procurementRecipeTable.widthProperty()
                        .subtract(recipeTableWidthUsed));

        DoubleBinding costTableWidthUsed = costProgressColumn.widthProperty()
                .add(costNeedColumn.widthProperty())
                .add(costHaveColumn.widthProperty())
                .add(costTypeColumn.widthProperty())
                .add(scrollBarAllowance);

        costNameColumn.prefWidthProperty()
                .bind(procurementCostTable.widthProperty()
                        .subtract(costTableWidthUsed));
    }

    private TreeItem<ProcTreeData> makeSynthesisTree()
    {
        TreeItem<ProcTreeData> modifications = new TreeItem<>(new ProcTreeData("Synthesis"));
        //modifications.setExpanded(true);

        // loop through all mod categories
        Arrays.stream(SynthesisCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcTreeData> categoryItem = new TreeItem<>(new ProcTreeData(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcTreeData> typeItem = new TreeItem<>(new ProcTreeData(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a collapsible blueprint label
                    TreeItem<ProcTreeData> bluePrintItem = new TreeItem<>(new ProcTreeData(blueprint.toString()));

                    // for this blueprint, loop through all recipes it contains
                    blueprint.recipeStream().forEach(recipe->
                    {
                        // add a button allowing the user to add the recipe to their procurement list
                        TreeItem<ProcTreeData> recipeItem = new TreeItem<>(new ProcTreeData(type, recipe));

                        // add the recipe button to this blueprint
                        bluePrintItem.getChildren().add(recipeItem);
                    });

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

    private TreeItem<ProcTreeData> makeModTree()
    {
        TreeItem<ProcTreeData> modifications = new TreeItem<>(new ProcTreeData("Engineering Modifications"));
        //modifications.setExpanded(true);

        // loop through all mod categories
        Arrays.stream(ModificationCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcTreeData> categoryItem = new TreeItem<>(new ProcTreeData(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcTreeData> typeItem = new TreeItem<>(new ProcTreeData(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {

                    String r = blueprint.toString() + " " + typeItem.getValue().toString();

                    // add a collapsible blueprint label
                    TreeItem<ProcTreeData> bluePrintItem =
                            new TreeItem<>(new ProcTreeData(r));

                    // for this blueprint, loop through all recipes it contains
                    blueprint.recipeStream().forEach(recipe->
                    {
                        // add a button allowing the user to add the recipe to their procurement list
                        TreeItem<ProcTreeData> recipeItem = new TreeItem<>(new ProcTreeData(type, recipe));

                        // add the recipe button to this blueprint
                        bluePrintItem.getChildren().add(recipeItem);
                    });

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

    private TreeItem<ProcTreeData> makeExperimentTree()
    {
        TreeItem<ProcTreeData> experiments = new TreeItem<>(new ProcTreeData("Experimental Effects"));
        //experiments.setExpanded(true);

        // loop through all experimental categories
        Arrays.stream(ExperimentalCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcTreeData> categoryItem = new TreeItem<>(new ProcTreeData(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcTreeData> typeItem = new TreeItem<>(new ProcTreeData(type.toString()));

                // for this experiment type, loop through all blueprints it contains
                type.bluePrintStream().forEach(blueprint ->
                {
                    // for this blueprint, loop through all recipes it contains
                    blueprint.recipeStream().forEach(recipe->
                    {
                        // add a button allowing the user to add the recipe to their procurement list
                        TreeItem<ProcTreeData> recipeItem = new TreeItem<>(new ProcTreeData(type, recipe));

                        // add the recipe button to this blueprint
                        typeItem.getChildren().add(recipeItem);
                    });
                });

                // add the type item to this category
                categoryItem.getChildren().add(typeItem);
            });

            // add this category to the root
            experiments.getChildren().add(categoryItem);
        });

        return experiments;
    }

    private TreeItem<ProcTreeData> makeTechnologyTree()
    {
        TreeItem<ProcTreeData> modifications = new TreeItem<>(new ProcTreeData("Tech Brokers"));
        //modifications.setExpanded(true);

        // loop through all mod categories
        Arrays.stream(TechnologyCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ProcTreeData> categoryItem = new TreeItem<>(new ProcTreeData(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ProcTreeData> typeItem = new TreeItem<>(new ProcTreeData(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {
                    // add a collapsible blueprint label
                    TreeItem<ProcTreeData> bluePrintItem = new TreeItem<>(new ProcTreeData(blueprint.toString()));

                    // for this blueprint, loop through all recipes it contains
                    blueprint.recipeStream().forEach(recipe->
                    {
                        // add a button allowing the user to add the recipe to their procurement list
                        TreeItem<ProcTreeData> recipeItem = new TreeItem<>(new ProcTreeData(type, recipe));

                        // add the recipe button to this blueprint
                        bluePrintItem.getChildren().add(recipeItem);
                    });

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
        TreeItem<ProcTreeData> root = new TreeItem<>(new ProcTreeData("root"));

        // create and add the various procurement sub-trees to the root object
        root.getChildren().addAll(makeSynthesisTree(),
                makeModTree(),
                makeExperimentTree(),
                makeTechnologyTree());

        // set the root as expanded by default
        root.setExpanded(true);

        // now that the root object has been filled with sub-trees, add it to the tree
        procurementTree.setRoot(root);

        // use a custom cell factory so we can have more useful tree cells
        procurementTree.setCellFactory(param ->
                new ProcTreeCell(addTaskToProcurementList, this.commanderData::hasItem));

        // hide the root, showing just it's children in the tree view (which are the mod categories)
        procurementTree.setShowRoot(false);
    }

    private synchronized void syncInventory()
    {
        // fill the inventory display tables with the player inventory items
        rawTable.getItems().clear();
        manufacturedTable.getItems().clear();
        dataTable.getItems().clear();
        cargoTable.getItems().clear();

        commanderData.rawMaterialStream()
                .forEach(material -> rawTable.getItems().add(material));

        commanderData.manufacturedMaterialStream()
                .forEach(material -> manufacturedTable.getItems().add(material));

        commanderData.dataMaterialStream()
                .forEach(material -> dataTable.getItems().add(material));

        commanderData.cargoStream()
                //.filter(commodity -> commodity.getQuantity() > 0)
                .forEach(commodity -> cargoTable.getItems().add(commodity));

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

        rawTable.refresh();
        manufacturedTable.refresh();
        dataTable.refresh();
        cargoTable.refresh();
    }

    private void syncUI()
    {
        if (!initialzed) return;


        // fill the inventory display tables with the player inventory items
        syncInventory();

        // Whenever we sync the UI, we always clear out the data structures first, as everything will be re-calculated
        // according to the current state of the player's inventory and stats
        //procurementRecipeTable.getItems().clear();
        //procurementCostTable.getItems().clear();
        statTable.getItems().clear();
        rankTable.getItems().clear();
        shipTable.getItems().clear();

        //
        Map<ProcurementCost, Integer> costs = new HashMap<>();

        procurementRecipeMap.forEach((procPair, count)->
        {
            // do recipes
            AtomicBoolean recipeFound = new AtomicBoolean(false);
            AtomicReference<ProcurementRecipeData> removedRecipe = new AtomicReference<>(null);
            procurementRecipeTable.getItems().stream()
                    .filter(recipePair -> recipePair.matches(procPair))
                    .findFirst()
                    .ifPresent(foundRecipe ->
                    {
                        recipeFound.set(true);
                        if (foundRecipe.getCount() != count)
                        {
                            foundRecipe.setCount(count);
                            if (count <= 0) removedRecipe.set(foundRecipe);
                        }
                    });

            if (removedRecipe.get()!=null) procurementRecipeTable.getItems().remove(removedRecipe.get());

            if (!recipeFound.get())
            {
                ProcurementRecipeData newItem = new ProcurementRecipeData(procPair.getKey(), procPair.getValue(), count);
                procurementRecipeTable.getItems().add(newItem);
            }


            procPair.getValue().costStream()
                    .forEach(mat->
                    {
                        AtomicBoolean costFound = new AtomicBoolean(false);

                        procurementCostTable.getItems().stream()
                                .filter(costData -> costData.matches(mat.getCost()))
                                .findFirst()
                                .ifPresent(foundCost ->
                                {
                                    costs.computeIfAbsent(foundCost.getMaterial(),(k)->0);
                                    costFound.set(true);
                                    int cost = mat.getQuantity() * count;
                                    costs.computeIfPresent(foundCost.getMaterial(),(k,v)->v+=cost);
                                });

                        if (!costFound.get())
                        {
                            ItemCostData newItem = new ItemCostData(mat.getCost(), this.commanderData::hasItem);
                            int newCOst = mat.getQuantity() * count;
                            newItem.setCount(newCOst);
                            costs.put(newItem.getMaterial(), newCOst);
                            procurementCostTable.getItems().add(newItem);
                        }
                    });


        });

        List<ItemCostData> toRemove = procurementCostTable.getItems().stream()
                .filter(c->costs.get(c.getMaterial())!=null)
                .filter(c->costs.get(c.getMaterial())!=c.getCount())
                .peek(c->c.setCount(costs.get(c.getMaterial() )))
                .filter(c->c.getCount()<=0)
                .collect(Collectors.toList());

        toRemove.forEach(i->procurementCostTable.getItems().remove(i));

        if (procurementRecipeTable.getItems().size() > 0)
        {
            procurementRecipeTable.getItems().sort((a, b) ->
            {
                String as = a.asPair().getKey().toString() + a.asPair().getValue().toString();
                String bs = b.asPair().getKey().toString() + b.asPair().getValue().toString();
                return as.compareTo(bs);
            });
        }

        if (procurementCostTable.getItems().size() > 0)
        {
            procurementCostTable.getItems().sort((a, b)->
            {
                double ad = ((double)a.getHave() / (double)a.getNeed());
                double bd = ((double)b.getHave() / (double)b.getNeed());
                if (ad == bd) return 0;
                else return ad > bd ? 1 : -1;
            });
        }

        // player stat table
        commanderData.getStats()
                .entrySet().stream()
                .filter(e -> JournalSyncTask.playerStats.contains(e.getKey()))
                .map(entry -> new Pair<>(entry.getKey(), entry.getValue()))
                .forEach(pair -> statTable.getItems().add(pair));

        // rank & reputation table
        commanderData.getStats()
                .entrySet().stream()
                .filter(e -> JournalSyncTask.rankStats.contains(e.getKey()))
                .map(entry -> new Pair<>(entry.getKey(), entry.getValue()))
                .forEach(pair -> rankTable.getItems().add(pair));

        // ship table
        commanderData.getStats()
                .entrySet().stream()
                .filter(e -> JournalSyncTask.shipStats.contains(e.getKey()))
                .map(entry -> new Pair<>(entry.getKey(), entry.getValue()))
                .forEach(pair -> shipTable.getItems().add(pair));

        setProcumentsUIVisibility();

        // update the UI elements
        procurementRecipeTable.refresh();
        procurementCostTable.refresh();
        statTable.refresh();
        rankTable.refresh();
        shipTable.refresh();
    }

    private void setProcumentsUIVisibility()
    {
        int shown = 0;

        if (showProcurements.isSelected())
        {
            shown++;
            procurementTree.setPrefHeight(10000);
        }
        else procurementTree.setPrefHeight(0);

        if (showTasks.isSelected())
        {
            shown++;
            procurementRecipeTable.setPrefHeight(10000);
        }
        else procurementRecipeTable.setPrefHeight(0);

        if (showItemsNeeded.isSelected())
        {
            shown++;
            procurementCostTable.setPrefHeight(10000);
        }
        else procurementCostTable.setPrefHeight(0);

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

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> data;
        try
        {
            data = objectMapper.readValue(inputStream, JournalSyncTask.mapTypeReference);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            throw new RuntimeException("Error reading localization data", ioe );
        }

        ((Map<String, Object>) data.get("materials")).entrySet()
                .forEach(materialEntry ->
                {
                    ProcurementCost material = Material.valueOf(materialEntry.getKey());
                    material.setLocalizedName(((String) materialEntry.getValue()));
                });

        ((Map<String, Object>) data.get("commodities")).entrySet()
                .forEach(commodityEntry ->
                {
                    ProcurementCost commodity = Commodity.valueOf(commodityEntry.getKey());
                    commodity.setLocalizedName(((String) commodityEntry.getValue()));
                });
    }
}
