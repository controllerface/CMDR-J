package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.InventoryData;
import com.controllerface.edeps.data.ItemCostData;
import com.controllerface.edeps.data.ProcTreeData;
import com.controllerface.edeps.data.ProcurementRecipeData;
import com.controllerface.edeps.data.storage.PlayerInventory;
import com.controllerface.edeps.enums.costs.commodities.Commodity;
import com.controllerface.edeps.enums.costs.materials.Material;
import com.controllerface.edeps.enums.procurements.experimentals.ExperimentalCategory;
import com.controllerface.edeps.enums.procurements.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.enums.procurements.experimentals.ExperimentalType;
import com.controllerface.edeps.enums.procurements.modifications.ModificationCategory;
import com.controllerface.edeps.enums.procurements.modifications.ModificationRecipe;
import com.controllerface.edeps.enums.procurements.modifications.ModificationType;
import com.controllerface.edeps.enums.procurements.synthesis.SynthesisCategory;
import com.controllerface.edeps.enums.procurements.synthesis.SynthesisRecipe;
import com.controllerface.edeps.enums.procurements.synthesis.SynthesisType;
import com.controllerface.edeps.enums.procurements.technologies.TechnologyCategory;
import com.controllerface.edeps.enums.procurements.technologies.TechnologyRecipe;
import com.controllerface.edeps.enums.procurements.technologies.TechnologyType;
import com.controllerface.edeps.threads.JournalSyncTask;
import com.controllerface.edeps.enums.equipment.ships.PlayerStat;
import com.controllerface.edeps.threads.TransactionProcessingTask;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
    @FXML private TableColumn<InventoryData, Number> rawQuantityColumn;

    // Manufactured materials
    @FXML private TableView<InventoryData> manufacturedTable;
    @FXML private TableColumn<InventoryData, String> manufacturedCategoryColumn;
    @FXML private TableColumn<InventoryData, String> manufacturedGradeColumn;
    @FXML private TableColumn<InventoryData, String> manufacturedMaterialColumn;
    @FXML private TableColumn<InventoryData, Number> manufacturedQuantityColumn;

    // Data materials
    @FXML private TableView<InventoryData> dataTable;
    @FXML private TableColumn<InventoryData, String> dataCategoryColumn;
    @FXML private TableColumn<InventoryData, String> dataGradeColumn;
    @FXML private TableColumn<InventoryData, String> dataMaterialColumn;
    @FXML private TableColumn<InventoryData, Number> dataQuantityColumn;

    // Cargo
    @FXML private TableView<InventoryData> cargoTable;
    @FXML private TableColumn<InventoryData, String> cargoCategoryColumn;
    @FXML private TableColumn<InventoryData, String> cargoGradeColumn;
    @FXML private TableColumn<InventoryData, String> cargoMaterialColumn;
    @FXML private TableColumn<InventoryData, Number> cargoQuantityColumn;

    // Procurement task table
    @FXML private TableView<ProcurementRecipeData> procurementRecipeTable;
    @FXML private TableColumn<ProcurementRecipeData, ProcurementRecipeData> recipeCountColumn;
    @FXML private TableColumn<ProcurementRecipeData, ProgressIndicator> recipeProgressColumn;
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


    /*
    =======================
    === Raw Data Objects ===
    =======================
     */

    private boolean initialzed = false;

    private final PlayerInventory playerInventory = new PlayerInventory();

    private final Map<Pair<ProcurementType, ProcurementRecipe>, Integer> procurementRecipeMap = new HashMap<>();


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
                int val = procurementRecipeMap.computeIfPresent(recipe, (key, count) -> count + adjustment);
                if (val <= 0)
                {
                    val = 0;
                    procurementRecipeMap.remove(recipe);
                }
                syncUI();
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
        Runnable transactionProcessingTask = new TransactionProcessingTask(this::syncUI, playerInventory, transactionQueue);
        Thread transactionThread = new Thread(transactionProcessingTask);
        transactionThread.setDaemon(true);
        transactionThread.start();

        // disk monitor
        Runnable inventorySyncTask = new JournalSyncTask(this::syncUI, playerInventory, transactionQueue);
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

        // set placeholder labels shown when the procurement list is empty
        procurementRecipeTable.setPlaceholder(new Label("Use the \"Procurements\" menu to select tasks"));
        procurementCostTable.setPlaceholder(new Label("Materials needed for selected recipes will appear here"));

        // set the cell value factories for the player inventory tabs
        rawCategoryColumn.setCellValueFactory(UIFunctions.Data.inventoryCategoryCellFactory);
        rawGradeColumn.setCellValueFactory(UIFunctions.Data.inventoryGradeCellFactory);
        rawMaterialColumn.setCellValueFactory(UIFunctions.Data.inventoryMaterialCellFactory);
        rawQuantityColumn.setCellValueFactory(UIFunctions.Data.inventoryQuantityCellFactory);

        manufacturedCategoryColumn.setCellValueFactory(UIFunctions.Data.inventoryCategoryCellFactory);
        manufacturedGradeColumn.setCellValueFactory(UIFunctions.Data.inventoryGradeCellFactory);
        manufacturedMaterialColumn.setCellValueFactory(UIFunctions.Data.inventoryMaterialCellFactory);
        manufacturedQuantityColumn.setCellValueFactory(UIFunctions.Data.inventoryQuantityCellFactory);

        dataCategoryColumn.setCellValueFactory(UIFunctions.Data.inventoryCategoryCellFactory);
        dataGradeColumn.setCellValueFactory(UIFunctions.Data.inventoryGradeCellFactory);
        dataMaterialColumn.setCellValueFactory(UIFunctions.Data.inventoryMaterialCellFactory);
        dataQuantityColumn.setCellValueFactory(UIFunctions.Data.inventoryQuantityCellFactory);

        cargoCategoryColumn.setCellValueFactory(UIFunctions.Data.inventoryCategoryCellFactory);
        cargoGradeColumn.setCellValueFactory(UIFunctions.Data.inventoryGradeCellFactory);
        cargoMaterialColumn.setCellValueFactory(UIFunctions.Data.inventoryMaterialCellFactory);
        cargoQuantityColumn.setCellValueFactory(UIFunctions.Data.inventoryQuantityCellFactory);

        // set the cell and cell value factories for the procurement recipe list
        recipeCountColumn.setCellFactory(UIFunctions.Data.makeModRollCellFactory.apply(procurementListUpdate));
        recipeCountColumn.setCellValueFactory(UIFunctions.Data.modRollCellValueFactory);
        recipeCountColumn.setStyle( "-fx-alignment: CENTER;");

        recipeNameColumn.setCellFactory(UIFunctions.Data.makeModNameCellFactory.apply(playerInventory::hasItem));
        recipeNameColumn.setCellValueFactory(UIFunctions.Data.modNameCellValueFactory);
        recipeRemoveColumn.setCellFactory(UIFunctions.Data.makeModControlCellFactory.apply(procurementListUpdate));
        recipeRemoveColumn.setCellValueFactory(UIFunctions.Data.modControlCellValueFactory);
        recipeProgressColumn.setCellFactory(UIFunctions.Data.recipeProgressCellFactory);
        recipeProgressColumn.setCellValueFactory(UIFunctions.Data.makeRecipeProgressCellValuefactory.apply(playerInventory));


        // set the cell and cell value factories for the procurement material list
        costProgressColumn.setCellFactory(UIFunctions.Data.materialProgressCellFactory);
        costProgressColumn.setCellValueFactory(UIFunctions.Data.matProgressCellValueFactory);
        costNeedColumn.setCellValueFactory(UIFunctions.Data.materialNeedCellFactory);
        costHaveColumn.setCellValueFactory(UIFunctions.Data.materialHaveCellFactory);
        costNameColumn.setCellValueFactory(UIFunctions.Data.materialNameCellFactory);
        costTypeColumn.setCellValueFactory(UIFunctions.Data.materialTypeCellFactory);

        statNameColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getKey().getText()));
        statValueColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getValue()));
        rankNameColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getKey().getText()));
        rankValueColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getValue()));
        shipNameColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getKey().getText()));
        shipValueColumn.setCellValueFactory((stat) -> new SimpleStringProperty(stat.getValue().getValue()));

        // set the sorting comparator for the material progress column of the procurement list
        costProgressColumn.setComparator(UIFunctions.Sort.indicatorByProgress);
        recipeProgressColumn.setComparator(UIFunctions.Sort.indicatorByProgress);

        // build the tree to select procurement tasks from
        makeProcurementTree();

        // fill the inventory display tables with the player inventory items
        syncInventory();

        // load the auto-save data from disk
        fromJson();

        // set initialzed flag
        initialzed = true;

        // sync the UI now that everything is set up
        syncUI();
    }

    private TreeItem<ProcTreeData> makeSynthesisTree()
    {
        TreeItem<ProcTreeData> modifications = new TreeItem<>(new ProcTreeData("Synthesis"));
        modifications.setExpanded(true);

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
        modifications.setExpanded(true);

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
        experiments.setExpanded(true);

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
        modifications.setExpanded(true);

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
                new ProcTreeCell(addTaskToProcurementList, this.playerInventory::hasItem));

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

        playerInventory.rawMaterialStream()
                .forEach(material -> rawTable.getItems().add(material));

        playerInventory.manufacturedMaterialStream()
                .forEach(material -> manufacturedTable.getItems().add(material));

        playerInventory.dataMaterialStream()
                .forEach(material -> dataTable.getItems().add(material));

        playerInventory.cargoStream()
                .filter(commodity -> commodity.getQuantity() > 0)
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

        procurementTree.refresh();

        syncInventory();

        // Whenever we sync the UI, we always clear out the data structures first, as everything will be re-calculated
        // according to the current state of the player's inventory and stats
        procurementRecipeTable.getItems().clear();
        procurementCostTable.getItems().clear();
        statTable.getItems().clear();
        rankTable.getItems().clear();
        shipTable.getItems().clear();

        //
        procurementRecipeMap.forEach((pair, count)->
        {
            // do recipes
            AtomicBoolean found = new AtomicBoolean(false);
            procurementRecipeTable.getItems().stream()
                    .filter(r->r.matches(pair))
                    .findFirst()
                    .ifPresent(x->
                    {
                        x.setCount(count);
                        found.set(true);
                    });

            if (!found.get())
            {
                ProcurementRecipeData newItem = new ProcurementRecipeData(pair.getKey(), pair.getValue(), count);
                procurementRecipeTable.getItems().add(newItem);
            }

            pair.getValue().costStream()
                    .forEach(mat->
                    {
                        AtomicBoolean matFound = new AtomicBoolean(false);
                        procurementCostTable.getItems().stream()
                                .filter(m -> m.matches(mat.getCost()))
                                .findFirst()
                                .ifPresent(m ->
                                {
                                    matFound.set(true);
                                    m.add(mat.getQuantity() * count);
                                });

                        if (!matFound.get())
                        {
                            ItemCostData newItem = new ItemCostData(mat.getCost(), this.playerInventory::hasItem);
                            newItem.setCount(mat.getQuantity() * count);
                            procurementCostTable.getItems().add(newItem);
                        }
                    });
        });

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

        playerInventory.getStats()
                .entrySet().stream()
                .filter(e -> JournalSyncTask.playerStats.contains(e.getKey()))
                .map(entry -> new Pair<>(entry.getKey(), entry.getValue()))
                .forEach(pair -> statTable.getItems().add(pair));

        playerInventory.getStats()
                .entrySet().stream()
                .filter(e -> JournalSyncTask.rankStats.contains(e.getKey()))
                .map(entry -> new Pair<>(entry.getKey(), entry.getValue()))
                .forEach(pair -> rankTable.getItems().add(pair));

        playerInventory.getStats()
                .entrySet().stream()
                .filter(e -> JournalSyncTask.shipStats.contains(e.getKey()))
                .map(entry -> new Pair<>(entry.getKey(), entry.getValue()))
                .forEach(pair -> shipTable.getItems().add(pair));

        procurementRecipeTable.refresh();
        procurementCostTable.refresh();
        statTable.refresh();
        rankTable.refresh();
        shipTable.refresh();
    }

    private void localizeData()
    {
        InputStream inputStream = null;
        try
        {
            URL file = getClass().getResource("/localization/eng.json");
            inputStream = file.openStream();
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

        @SuppressWarnings("unchecked")
        Map<String, Object> materials = ((Map<String, Object>) data.get("materials"));

        @SuppressWarnings("unchecked")
        Map<String, Object> commodities = ((Map<String, Object>) data.get("commodities"));

        materials.entrySet().forEach(e->
        {
            ProcurementCost material = Material.valueOf(e.getKey());
            material.setLocalizedName(((String) e.getValue()));
        });

        commodities.entrySet().forEach(e->
        {
            ProcurementCost commodity = Commodity.valueOf(e.getKey());
            commodity.setLocalizedName(((String) e.getValue()));
        });
    }
}
