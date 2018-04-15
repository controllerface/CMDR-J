package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.data.*;
import com.controllerface.edeps.data.storage.PlayerInventory;
import com.controllerface.edeps.enums.costs.commodities.Commodity;
import com.controllerface.edeps.enums.costs.commodities.CommodityCategory;
import com.controllerface.edeps.enums.procurements.experimentals.ExperimentalCategory;
import com.controllerface.edeps.enums.costs.materials.Material;
import com.controllerface.edeps.enums.costs.materials.MaterialCategory;
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
import com.controllerface.edeps.threads.InventorySyncTask;
import com.controllerface.edeps.threads.TransactionProcessingTask;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
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
            data = objectMapper.readValue(file, InventorySyncTask.mapTypeReference);
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
            syncUI();
        });

    }

    private static final Label recipeTableEmpty = new Label("Use the \"Procurements\" menu to select tasks");
    private static final Label materialTableEmpty = new Label("Materials needed for selected recipes will appear here");


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

    /*
    Inventory display values
     */

    // simple string for material category name
    private final Callback<TableColumn.CellDataFeatures<InventoryData, String>, ObservableValue<String>>
            inventoryCategoryCellFactory =
            (materialData) ->
            {
                ProcurementCost material = materialData.getValue().getItem();
                SimpleStringProperty categoryValue = null;
                if (material instanceof Material)
                {
                    String category = MaterialCategory.findMatchingCategory(material).toString();
                    categoryValue =  new SimpleStringProperty(category);
                }
                else if (material instanceof Commodity)
                {
                    String category = CommodityCategory.findMatchingCategory(material).toString();
                    categoryValue =  new SimpleStringProperty(category);
                }
                return categoryValue;
            };

    // simple string for material grade
    private final Callback<TableColumn.CellDataFeatures<InventoryData, String>, ObservableValue<String>>
            inventoryGradeCellFactory =
            (materialData) ->
            {
                String grade = materialData.getValue().getItem().getGrade().toString();
                return new SimpleStringProperty(grade);
            };

    // simple string for material name
    private final Callback<TableColumn.CellDataFeatures<InventoryData, String>, ObservableValue<String>>
            inventoryMaterialCellFactory =
            (materialData) ->
            {
                String materialName = materialData.getValue().getItem().getLocalizedName();
                return new SimpleStringProperty(materialName);
            };

    // simple integer for material count
    private final Callback<TableColumn.CellDataFeatures<InventoryData, Number>, ObservableValue<Number>>
            inventoryQuantityCellFactory =
            (materialData) ->
            {
                int quantity = materialData.getValue().getQuantity();
                return new SimpleIntegerProperty(quantity);
            };

    /*
     procurement List: Roll/Mod Blueprint
     */

    private final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProcurementRecipeData>, ObservableValue<ProcurementRecipeData>>
            modRollCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue());

    // simple integer for number of rolls
    private final Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>
            modRollCellFactory = (modRecipe) -> new TaskCountCell(procurementListUpdate);


    // simple string for blueprint/recipe name
    private final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProcurementRecipeData>, ObservableValue<ProcurementRecipeData>>
            modNameCellValueFactory = (modRecipe) ->new ReadOnlyObjectWrapper<>(modRecipe.getValue());

    // simple string for blueprint/recipe name
    private final Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>
            modNameCellFactory = (modRecipe) -> new RecipeNameCell(playerInventory::hasItem);

    // wrapper object for recipe pair object
    private final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, ObservableValue<Pair<ProcurementType, ProcurementRecipe>>>
            modControlCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair());

    // custom cell object creates display for the controls
    private final Callback<TableColumn<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, TableCell<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>>
            modControlCellFactory = (modRecipe) -> new ModControlCell(procurementListUpdate);

    /*
     procurement List: Material Need/Have, Progress information
     */

    // simple integer for the need count
    private final Callback<TableColumn.CellDataFeatures<ItemCostData, Number>, ObservableValue<Number>>
            materialNeedCellFactory = (modMaterial) -> new SimpleIntegerProperty(modMaterial.getValue().getNeed());

    // simple integer for the have count
    private final Callback<TableColumn.CellDataFeatures<ItemCostData, Number>, ObservableValue<Number>>
            materialHaveCellFactory = (modMaterial) -> new SimpleIntegerProperty(modMaterial.getValue().getHave());

    // simple string for the material name
    private final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
            materialNameCellFactory = (modMaterial) -> new SimpleStringProperty(modMaterial.getValue().toString());

    private final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
            materialTypeCellFactory = (modMaterial) ->
    {
        ProcurementCost cost = modMaterial.getValue().getMaterial();
        String type;
        if (cost instanceof Material) type = "Material";
        else if (cost instanceof Commodity) type = "Commodity";
        else type = "Unknown";
        return new SimpleStringProperty(type);
    };

    // custom cell object creates display for the progress indicator
    private final Callback<TableColumn<ItemCostData, ProgressIndicator>, TableCell<ItemCostData, ProgressIndicator>>
            materialProgressCellFactory = (modMaterial) -> new MaterialProgressCell();

    // wrapper object for progress indicator object
    private final Callback<TableColumn.CellDataFeatures<ItemCostData, ProgressIndicator>, ObservableValue<ProgressIndicator>>
            matProgressCellValueFactory = (modMaterial) ->
    {
        double progress = ((double) modMaterial.getValue().getHave()) / ((double) modMaterial.getValue().getNeed());

        ProgressIndicator progressIndicator = new ProgressIndicator(progress);

        if (progress >= 1.0)
        {
            progressIndicator.setStyle("-fx-progress-color: #6677ff ");
        }
        else progressIndicator.setStyle("-fx-progress-color: #ee5555 ");

        return new ReadOnlyObjectWrapper<>(progressIndicator);
    };


    // custom cell object creates display for the progress indicator
    private final Callback<TableColumn<ProcurementRecipeData, ProgressIndicator>, TableCell<ProcurementRecipeData, ProgressIndicator>>
            recipeProgressCellFactory = (modRecipeItem) -> new TaskProgressCell();

    // wrapper object for progress indicator object
    private final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProgressIndicator>, ObservableValue<ProgressIndicator>>
            recipeProgressCellValueFactory = (modRecipe) ->
    {
        ProcurementRecipeData procurementRecipeData = modRecipe.getValue();

        int count = procurementRecipeData.getCount();

        int total = procurementRecipeData.asPair().getValue().costStream()
                .mapToInt(c -> c.getQuantity() * count)
                .sum();

        int missing = procurementRecipeData.asPair().getValue().costStream()
                .mapToInt(cost->
                {
                    int banked = playerInventory.hasItem(cost.getCost());
                    int surplus = banked - (cost.getQuantity() * count);
                    return surplus < 0
                            ? -1 * surplus
                            : 0;
                })
                .sum();

        double progress = missing > 0
                ? (double) total / (double)(total + missing)
                : 1;

        ProgressIndicator progressIndicator = new ProgressIndicator(progress);

        if (progress >= 1.0)
        {
            progressIndicator.setStyle("-fx-progress-color: #6677ff ");
        }
        else progressIndicator.setStyle("-fx-progress-color: #ee5555 ");

        return new ReadOnlyObjectWrapper<>(progressIndicator);
    };

    /*
    Material sorting comparators
     */

    // sort InventoryData objects alphabetically by category name
    private final Comparator<InventoryData> costByCategory = Comparator.comparing(InventoryData::getCategory);

    // sort InventoryData objects numerically by grade, lowest to highest
    private final Comparator<InventoryData> materialByGrade =
            (a, b) -> a.getItem().getGrade().toString().compareTo(b.getItem().getGrade().toString());

    // sort InventoryData objects numerically by count, highest to lowest
    private final Comparator<InventoryData> cargoByCount =
            (a, b) -> b.getQuantity() - a.getQuantity();

    // sort ProgressIndicator objects by numerical progress, lowest to highest
    private final Comparator<ProgressIndicator> indicatorByProgress =
            (a, b) -> a.getProgress() == b.getProgress()
                    ? 0
                    : a.getProgress() > b.getProgress()
                            ? 1
                            : -1;

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
        Runnable inventorySyncTask = new InventorySyncTask(playerInventory, transactionQueue);
        Thread inventoryThread = new Thread(inventorySyncTask);
        inventoryThread.setDaemon(true);
        inventoryThread.start();
    }

    /**
     * Reflectively called by JavaFX after this class is instantiated. This is where the UI components are filled with
     * their respective data.
     */
    @FXML
    public void initialize()
    {
        // fill the inventory display tables with the player inventory items
        syncInventory();

        // set placeholder labels shown when the procurement list is empty
        procurementRecipeTable.setPlaceholder(recipeTableEmpty);
        procurementCostTable.setPlaceholder(materialTableEmpty);

        // set the cell value factories for the player inventory tabs
        rawCategoryColumn.setCellValueFactory(inventoryCategoryCellFactory);
        rawGradeColumn.setCellValueFactory(inventoryGradeCellFactory);
        rawMaterialColumn.setCellValueFactory(inventoryMaterialCellFactory);
        rawQuantityColumn.setCellValueFactory(inventoryQuantityCellFactory);

        manufacturedCategoryColumn.setCellValueFactory(inventoryCategoryCellFactory);
        manufacturedGradeColumn.setCellValueFactory(inventoryGradeCellFactory);
        manufacturedMaterialColumn.setCellValueFactory(inventoryMaterialCellFactory);
        manufacturedQuantityColumn.setCellValueFactory(inventoryQuantityCellFactory);

        dataCategoryColumn.setCellValueFactory(inventoryCategoryCellFactory);
        dataGradeColumn.setCellValueFactory(inventoryGradeCellFactory);
        dataMaterialColumn.setCellValueFactory(inventoryMaterialCellFactory);
        dataQuantityColumn.setCellValueFactory(inventoryQuantityCellFactory);

        cargoCategoryColumn.setCellValueFactory(inventoryCategoryCellFactory);
        cargoGradeColumn.setCellValueFactory(inventoryGradeCellFactory);
        cargoMaterialColumn.setCellValueFactory(inventoryMaterialCellFactory);
        cargoQuantityColumn.setCellValueFactory(inventoryQuantityCellFactory);

        // set the cell and cell value factories for the procurement recipe list
        recipeCountColumn.setCellValueFactory(modRollCellValueFactory);
        recipeCountColumn.setCellFactory(modRollCellFactory);
        recipeCountColumn.setStyle( "-fx-alignment: CENTER;");

        recipeNameColumn.setCellValueFactory(modNameCellValueFactory);
        recipeNameColumn.setCellFactory(modNameCellFactory);
        recipeRemoveColumn.setCellValueFactory(modControlCellValueFactory);
        recipeRemoveColumn.setCellFactory(modControlCellFactory);
        recipeProgressColumn.setCellValueFactory(recipeProgressCellValueFactory);
        recipeProgressColumn.setCellFactory(recipeProgressCellFactory);

        // set the cell and cell value factories for the procurement material list
        costProgressColumn.setCellValueFactory(matProgressCellValueFactory);
        costProgressColumn.setCellFactory(materialProgressCellFactory);
        costNeedColumn.setCellValueFactory(materialNeedCellFactory);
        costHaveColumn.setCellValueFactory(materialHaveCellFactory);
        costNameColumn.setCellValueFactory(materialNameCellFactory);
        costTypeColumn.setCellValueFactory(materialTypeCellFactory);


        // set the sorting comparator for the material progress column of the procurement list
        costProgressColumn.setComparator(indicatorByProgress);
        recipeProgressColumn.setComparator(indicatorByProgress);

        makeProcurementTree();

        initialzed = true;
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
    private void makeProcurementTree()
    {
        // create an root object for procurements
        TreeItem<ProcTreeData> root = new TreeItem<>(new ProcTreeData("root"));
        root.setExpanded(true);

        TreeItem<ProcTreeData> synthesis = makeSynthesisTree();
        TreeItem<ProcTreeData> modifications = makeModTree();
        TreeItem<ProcTreeData> experiments = makeExperimentTree();
        TreeItem<ProcTreeData> technology = makeTechnologyTree();

        root.getChildren().add(synthesis);
        root.getChildren().add(modifications);
        root.getChildren().add(experiments);
        root.getChildren().add(technology);

        // now that the root object has been filled with mods, add it to the tree
        procurementTree.setRoot(root);

        // use a custom cell factory so we can have more useful tree cells
        procurementTree
                .setCellFactory(param -> new ProcTreeCell(addTaskToProcurementList, this.playerInventory::hasItem));

        // hide the root, showing just it's children in the tree view (which are the mod categories)
        procurementTree.setShowRoot(false);
    }

    private void syncInventory()
    {
        // fill the inventory display tables with the player inventory items
        rawTable.getItems().clear();
        manufacturedTable.getItems().clear();
        dataTable.getItems().clear();
        cargoTable.getItems().clear();

        playerInventory.rawMaterialStream()
                .forEach(m -> rawTable.getItems().add(m));

        playerInventory.manufacturedMaterialStream()
                .forEach(m -> manufacturedTable.getItems().add(m));

        playerInventory.dataMaterialStream()
                .forEach(m -> dataTable.getItems().add(m));

        playerInventory.cargoStream()
                .filter(m->m.getQuantity() > 0)
                .forEach(m -> cargoTable.getItems().add(m));

        rawTable.refresh();
        manufacturedTable.refresh();
        dataTable.refresh();
        cargoTable.refresh();

        // sort pass 1, numerically by grade
        rawTable.getItems().sort(materialByGrade);
        manufacturedTable.getItems().sort(materialByGrade);
        dataTable.getItems().sort(materialByGrade);

        // sort pass 2, alphabetically, by category name
        rawTable.getItems().sort(costByCategory);
        manufacturedTable.getItems().sort(costByCategory);
        dataTable.getItems().sort(costByCategory);

        // Cargo sorts a bit differently,
        cargoTable.getItems().sort(materialByGrade);
        cargoTable.getItems().sort(cargoByCount);
    }

    private void syncUI()
    {
        if (!initialzed) return;

        procurementTree.refresh();

        syncInventory();

        // reset the counts since we will be recalculating them
        procurementRecipeTable.getItems().clear();
        procurementCostTable.getItems().clear();


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
                        procurementRecipeTable.refresh();
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
                                    procurementCostTable.refresh();
                                });

                        if (!matFound.get())
                        {
                            ItemCostData newItem = new ItemCostData(mat.getCost(), this.playerInventory::hasItem);
                            newItem.setCount(mat.getQuantity() * count);
                            procurementCostTable.getItems().add(newItem);
                        }
                    });
        });

        procurementRecipeTable.getItems()
                .sort((a, b) ->
                {
                    String as = a.asPair().getKey().toString() + a.asPair().getValue().toString();
                    String bs = b.asPair().getKey().toString() + b.asPair().getValue().toString();
                    return as.compareTo(bs);
                });

        procurementCostTable.getItems().sort((a, b)->
        {
            double ad = ((double)a.getHave() / (double)a.getNeed());
            double bd = ((double)b.getHave() / (double)b.getNeed());
            if (ad == bd) return 0;
            else return ad > bd ? 1 : -1;
        });
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
            data = objectMapper.readValue(inputStream, InventorySyncTask.mapTypeReference);
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
