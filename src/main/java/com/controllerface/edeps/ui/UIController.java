package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.data.*;
import com.controllerface.edeps.enums.experimentals.ExperimentalCategory;
import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.enums.materials.MaterialCategory;
import com.controllerface.edeps.enums.modifications.ModificationCategory;
import com.controllerface.edeps.tasks.DiskMonitorTask;
import com.controllerface.edeps.tasks.InventoryUpdateTask;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.Callback;
import javafx.util.Pair;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

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

    // Raw materials
    @FXML private TableView<MaterialInventoryData> rawTable;
    @FXML private TableColumn<MaterialInventoryData, String> rawCategoryColumn;
    @FXML private TableColumn<MaterialInventoryData, String> rawGradeColumn;
    @FXML private TableColumn<MaterialInventoryData, String> rawMaterialColumn;
    @FXML private TableColumn<MaterialInventoryData, Number> rawQuantityColumn;

    // Manufactured materials
    @FXML private TableView<MaterialInventoryData> manufacturedTable;
    @FXML private TableColumn<MaterialInventoryData, String> manufacturedCategoryColumn;
    @FXML private TableColumn<MaterialInventoryData, String> manufacturedGradeColumn;
    @FXML private TableColumn<MaterialInventoryData, String> manufacturedMaterialColumn;
    @FXML private TableColumn<MaterialInventoryData, Number> manufacturedQuantityColumn;

    // Data materials
    @FXML private TableView<MaterialInventoryData> dataTable;
    @FXML private TableColumn<MaterialInventoryData, String>dataCategoryColumn;
    @FXML private TableColumn<MaterialInventoryData, String>dataGradeColumn;
    @FXML private TableColumn<MaterialInventoryData, String>dataMaterialColumn;
    @FXML private TableColumn<MaterialInventoryData, Number>dataQuantityColumn;

    // Mod tree
    @FXML private TreeView<ModTreeItem> modTree;

    // procurement list
    @FXML private TableView<ProcurementRecipeItem> procurementRecipeTable;
    @FXML private TableColumn<ProcurementRecipeItem, ProcurementRecipeItem> recipeRollColumn;
    @FXML private TableColumn<ProcurementRecipeItem, ProgressIndicator> recipeProgressColumn;
    @FXML private TableColumn<ProcurementRecipeItem, ProcurementRecipeItem> recipeModColumn;
    @FXML private TableColumn<ProcurementRecipeItem, Pair<ProcurementType, ProcurementRecipe>> recipeControlsColumn;

    @FXML private TableView<ModMaterialItem> procurementMaterialsTable;
    @FXML private TableColumn<ModMaterialItem, ProgressIndicator> materialProgressColumn;
    @FXML private TableColumn<ModMaterialItem, Number> materialNeedColumn;
    @FXML private TableColumn<ModMaterialItem, Number> materialHaveColumn;
    @FXML private TableColumn<ModMaterialItem, String> materialNameColumn;


    /*
    =======================
    === Raw Data Objects ===
    =======================
     */

    private boolean initialzed = false;

    private final MaterialInventory materialInventory = new MaterialInventory();
    private final BlockingQueue<Pair<Material, Integer>> transactionQueue = new LinkedBlockingQueue<>();

    private final Map<Pair<ProcurementType, ProcurementRecipe>, Integer> procurementRecipeMap = new HashMap<>();

    private static final Label recipeTableEmpty = new Label("Use the \"Procurements\" menu to select tasks");
    private static final Label materialTableEmpty = new Label("Materials needed for selected recipes will appear here");


    /*
    ========================
    === Utility Functions ===
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
    Consumer function that accepts a ModTreeItem and adds it to the procurement list. If the mod already exists in the
    list, this effectively increments the roll count of that mod by 1
     */
    private final Consumer<ModTreeItem> addModToProcurementList =
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
    private final Callback<TableColumn.CellDataFeatures<MaterialInventoryData, String>, ObservableValue<String>>
            inventoryCategoryCellFactory =
            (materialData) ->
            {
                Material material = materialData.getValue().getMaterial();
                String category = MaterialCategory.findMatchingCategory(material).toString();
                return new SimpleStringProperty(category);
            };

    // simple string for material grade
    private final Callback<TableColumn.CellDataFeatures<MaterialInventoryData, String>, ObservableValue<String>>
            inventoryGradeCellFactory =
            (materialData) ->
            {
                String grade = materialData.getValue().getMaterial().getGrade().toString();
                return new SimpleStringProperty(grade);
            };

    // simple string for material name
    private final Callback<TableColumn.CellDataFeatures<MaterialInventoryData, String>, ObservableValue<String>>
            inventoryMaterialCellFactory =
            (materialData) ->
            {
                String materialName = materialData.getValue().getMaterial().getLocalizedName();
                return new SimpleStringProperty(materialName);
            };

    // simple integer for material count
    private final Callback<TableColumn.CellDataFeatures<MaterialInventoryData, Number>, ObservableValue<Number>>
            inventoryQuantityCellFactory =
            (materialData) ->
            {
                int quantity = materialData.getValue().getQuantity();
                return new SimpleIntegerProperty(quantity);
            };

    /*
     procurement List: Roll/Mod Blueprint
     */

    private final Callback<TableColumn.CellDataFeatures<ProcurementRecipeItem, ProcurementRecipeItem>, ObservableValue<ProcurementRecipeItem>>
            modRollCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue());

    // simple integer for number of rolls
    private final Callback<TableColumn<ProcurementRecipeItem, ProcurementRecipeItem>, TableCell<ProcurementRecipeItem, ProcurementRecipeItem>>
            modRollCellFactory = (modRecipe) -> new ModRollCell(procurementListUpdate);


    // simple string for blueprint/recipe name
    private final Callback<TableColumn.CellDataFeatures<ProcurementRecipeItem, ProcurementRecipeItem>, ObservableValue<ProcurementRecipeItem>>
            modNameCellValueFactory = (modRecipe) ->new ReadOnlyObjectWrapper<>(modRecipe.getValue());

    // simple string for blueprint/recipe name
    private final Callback<TableColumn<ProcurementRecipeItem, ProcurementRecipeItem>, TableCell<ProcurementRecipeItem, ProcurementRecipeItem>>
            modNameCellFactory = (modRecipe) -> new ModNameCell(materialInventory::hasMat);

    // wrapper object for recipe pair object
    private final Callback<TableColumn.CellDataFeatures<ProcurementRecipeItem, Pair<ProcurementType, ProcurementRecipe>>, ObservableValue<Pair<ProcurementType, ProcurementRecipe>>>
            modControlCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair());

    // custom cell object creates display for the controls
    private final Callback<TableColumn<ProcurementRecipeItem, Pair<ProcurementType, ProcurementRecipe>>, TableCell<ProcurementRecipeItem, Pair<ProcurementType, ProcurementRecipe>>>
            modControlCellFactory = (modRecipe) -> new ModControlCell(procurementListUpdate);

    /*
     procurement List: Material Need/Have, Progress information
     */

    // simple integer for the need count
    private final Callback<TableColumn.CellDataFeatures<ModMaterialItem, Number>, ObservableValue<Number>>
            materialNeedCellFactory = (modMaterial) -> new SimpleIntegerProperty(modMaterial.getValue().getNeed());

    // simple integer for the have count
    private final Callback<TableColumn.CellDataFeatures<ModMaterialItem, Number>, ObservableValue<Number>>
            materialHaveCellFactory = (modMaterial) -> new SimpleIntegerProperty(modMaterial.getValue().getHave());

    // simple string for the material name
    private final Callback<TableColumn.CellDataFeatures<ModMaterialItem, String>, ObservableValue<String>>
            materialNameCellFactory = (modMaterial) -> new SimpleStringProperty(modMaterial.getValue().toString());

    // custom cell object creates display for the progress indicator
    private final Callback<TableColumn<ModMaterialItem, ProgressIndicator>, TableCell<ModMaterialItem, ProgressIndicator>>
            materialProgressCellFactory = (modMaterial) -> new MaterialProgressCell();

    // wrapper object for progress indicator object
    private final Callback<TableColumn.CellDataFeatures<ModMaterialItem, ProgressIndicator>, ObservableValue<ProgressIndicator>>
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
    private final Callback<TableColumn<ProcurementRecipeItem, ProgressIndicator>, TableCell<ProcurementRecipeItem, ProgressIndicator>>
            recipeProgressCellFactory = (modRecipeItem) -> new ModRecipeProgressCell();

    // wrapper object for progress indicator object
    private final Callback<TableColumn.CellDataFeatures<ProcurementRecipeItem, ProgressIndicator>, ObservableValue<ProgressIndicator>>
            recipeProgressCellValueFactory = (modRecipe) ->
    {
        ProcurementRecipeItem procurementRecipeItem = modRecipe.getValue();

        int count = procurementRecipeItem.getCount();

        int total = procurementRecipeItem.asPair().getValue().costStream()
                .mapToInt(c -> c.getQuantity() * count)
                .sum();

        int missing = procurementRecipeItem.asPair().getValue().costStream()
                .mapToInt(cost->
                {
                    int banked = materialInventory.hasMat(cost.getMaterial());
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

    // sort MaterialInventoryData objects alphabetically by category name
    private final Comparator<MaterialInventoryData> materialByCategory =
            (a, b) -> a.getCategory().compareTo(b.getCategory());

    // sort MaterialInventoryData objects numerically by grade, lowest to highest
    private final Comparator<MaterialInventoryData> materialByGrade =
            (a, b) ->
            {
                int aGrade = Integer.parseInt(a.getMaterial().getGrade().toString());
                int bGrade = Integer.parseInt(b.getMaterial().getGrade().toString());
                return aGrade - bGrade;
            };

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

        // transaction processor
        Runnable inventoryUpdateTask = new InventoryUpdateTask((x) -> syncUI(), materialInventory, transactionQueue);
        Thread transactionThread = new Thread(inventoryUpdateTask);
        transactionThread.setDaemon(true);
        transactionThread.start();

        // disk monitor
        Runnable diskMonitorTask = new DiskMonitorTask(materialInventory, transactionQueue);
        Thread diskMonitorThread = new Thread(diskMonitorTask);
        diskMonitorThread.setDaemon(true);
        diskMonitorThread.start();
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
        procurementMaterialsTable.setPlaceholder(materialTableEmpty);

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

        // set the cell and cell value factories for the procurement recipe list
        recipeRollColumn.setCellValueFactory(modRollCellValueFactory);
        recipeRollColumn.setCellFactory(modRollCellFactory);
        recipeRollColumn.setStyle( "-fx-alignment: CENTER;");

        recipeModColumn.setCellValueFactory(modNameCellValueFactory);
        recipeModColumn.setCellFactory(modNameCellFactory);
        recipeControlsColumn.setCellValueFactory(modControlCellValueFactory);
        recipeControlsColumn.setCellFactory(modControlCellFactory);
        recipeProgressColumn.setCellValueFactory(recipeProgressCellValueFactory);
        recipeProgressColumn.setCellFactory(recipeProgressCellFactory);

        // set the cell and cell value factories for the procurement material list
        materialProgressColumn.setCellValueFactory(matProgressCellValueFactory);
        materialProgressColumn.setCellFactory(materialProgressCellFactory);
        materialNeedColumn.setCellValueFactory(materialNeedCellFactory);
        materialHaveColumn.setCellValueFactory(materialHaveCellFactory);
        materialNameColumn.setCellValueFactory(materialNameCellFactory);

        // set the sorting comparator for the material progress column of the procurement list
        materialProgressColumn.setComparator(indicatorByProgress);
        recipeProgressColumn.setComparator(indicatorByProgress);

        makeModTree();

        initialzed = true;
    }

    private TreeItem<ModTreeItem> makeMods()
    {
        TreeItem<ModTreeItem> modifications = new TreeItem<>(new ModTreeItem("Modifications"));
        modifications.setExpanded(true);

        // loop through all mod categories
        Arrays.stream(ModificationCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ModTreeItem> categoryItem = new TreeItem<>(new ModTreeItem(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ModTreeItem> typeItem = new TreeItem<>(new ModTreeItem(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.blueprintStream().forEach(blueprint ->
                {

                    String r = blueprint.toString() + " " + typeItem.getValue().toString();

                    // add a collapsible blueprint label
                    TreeItem<ModTreeItem> bluePrintItem =
                            new TreeItem<>(new ModTreeItem(r));

                    // for this blueprint, loop through all recipes it contains
                    blueprint.recipeStream().forEach(recipe->
                    {
                        // add a button allowing the user to add the recipe to their procurement list
                        TreeItem<ModTreeItem> recipeItem = new TreeItem<>(new ModTreeItem(type, recipe));

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

    private TreeItem<ModTreeItem> makeExperiements()
    {
        TreeItem<ModTreeItem> experiments = new TreeItem<>(new ModTreeItem("Experimental Effects"));
        experiments.setExpanded(true);

        // loop through all mod categories
        Arrays.stream(ExperimentalCategory.values()).forEach(category ->
        {
            // add a collapsible category label
            TreeItem<ModTreeItem> categoryItem = new TreeItem<>(new ModTreeItem(category.toString()));

            // for this category, loop through all mod types it contains
            category.typeStream().forEach(type ->
            {
                // add a collapsible mod type label
                TreeItem<ModTreeItem> typeItem = new TreeItem<>(new ModTreeItem(type.toString()));

                // for this mod type, loop through all blueprints it contains
                type.recipeStream().forEach(blueprint ->
                {
                    // add a collapsible blueprint label
                    TreeItem<ModTreeItem> bluePrintItem =
                            new TreeItem<>(new ModTreeItem(type, blueprint));

                    // add the blueprint item to this mod type
                    typeItem.getChildren().add(bluePrintItem);
                });

                // add the type item to this category
                categoryItem.getChildren().add(typeItem);
            });

            // add this category to the root
            experiments.getChildren().add(categoryItem);
        });

        return experiments;
    }

    // Builds the "Mod Tree" from which the user can select mods to add to their procurement list
    private void makeModTree()
    {
        TreeItem<ModTreeItem> root = new TreeItem<>(new ModTreeItem("root"));
        root.setExpanded(true);

        // create an root object for mods
        TreeItem<ModTreeItem> modifications = makeMods();
        TreeItem<ModTreeItem> experiments = makeExperiements();


        root.getChildren().add(modifications);
        root.getChildren().add(experiments);

        // now that the root object has been filled with mods, add it to the tree
        modTree.setRoot(root);

        // use a custom cell factory so we can have more useful tree cells
        modTree.setCellFactory(param -> new ModTreeCell(addModToProcurementList, checkMat));

        // hide the root, showing just it's children in the tree view (which are the mod categories)
        modTree.setShowRoot(false);
    }

    private void syncInventory()
    {
        // fill the inventory display tables with the player inventory items
        rawTable.getItems().clear();
        manufacturedTable.getItems().clear();
        dataTable.getItems().clear();

        materialInventory.rawMaterialStream()
                .forEach(m -> rawTable.getItems().add(m));

        materialInventory.manufacturedMaterialStream()
                .forEach(m -> manufacturedTable.getItems().add(m));

        materialInventory.dataMaterialStream()
                .forEach(m -> dataTable.getItems().add(m));

        rawTable.refresh();
        manufacturedTable.refresh();
        dataTable.refresh();

        // sort pass 1, numerically by grade
        rawTable.getItems().sort(materialByGrade);
        manufacturedTable.getItems().sort(materialByGrade);
        dataTable.getItems().sort(materialByGrade);

        // sort pass 2, alphabetically, by category name
        rawTable.getItems().sort(materialByCategory);
        manufacturedTable.getItems().sort(materialByCategory);
        dataTable.getItems().sort(materialByCategory);
    }

    private void syncUI()
    {
        if (!initialzed) return;

        modTree.refresh();

        syncInventory();

        // reset the counts since we will be recalculating them
        procurementRecipeTable.getItems().clear();
        procurementMaterialsTable.getItems().clear();


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
                ProcurementRecipeItem newItem = new ProcurementRecipeItem(pair.getKey(), pair.getValue(), count);
                procurementRecipeTable.getItems().add(newItem);
            }

            pair.getValue().costStream()
                    .forEach(mat->
                    {
                        AtomicBoolean matFound = new AtomicBoolean(false);
                        procurementMaterialsTable.getItems().stream()
                                .filter(m -> m.matches(mat.getMaterial()))
                                .findFirst()
                                .ifPresent(m ->
                                {
                                    matFound.set(true);
                                    m.add(mat.getQuantity() * count);
                                    procurementMaterialsTable.refresh();
                                });

                        if (!matFound.get())
                        {
                            ModMaterialItem newItem = new ModMaterialItem(mat.getMaterial(), this.materialInventory::hasMat);
                            newItem.setCount(mat.getQuantity() * count);
                            procurementMaterialsTable.getItems().add(newItem);
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

        procurementMaterialsTable.getItems().sort((a, b)->
        {
            double ad = ((double)a.getHave() / (double)a.getNeed());
            double bd = ((double)b.getHave() / (double)b.getNeed());
            if (ad == bd) return 0;
            else return ad > bd ? 1 : -1;
        });
    }

    private final Function<Material, Integer> checkMat = this.materialInventory::hasMat;

    @FXML
    private void clearProcurementList()
    {
        procurementRecipeMap.clear();
        syncUI();
    }


    private void localizeData()
    {
        FileReader reader = null;
        try
        {
            URL file = UIController.class.getResource("eng.json");
            reader = new FileReader(file.getFile());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> data;
        try
        {
            data = objectMapper.readValue(reader, DiskMonitorTask.mapTypeReference);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            throw new RuntimeException("Error reading localization data", ioe );
        }
        data.entrySet().forEach(e->
        {
            Material material = Material.valueOf(e.getKey());
            material.setLocalizedName(((String) e.getValue()));
        });
    }
}
