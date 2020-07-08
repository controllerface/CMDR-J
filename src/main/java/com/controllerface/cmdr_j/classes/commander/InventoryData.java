package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.procurements.*;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.commodities.CommodityCostCategory;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialSubCostCategory;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalBlueprint;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisBlueprint;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisRecipe;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyBlueprint;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.ui.Displayable;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Data container for an individual item in a player's inventory. This class also contains a graphical representation
 * of the item, along with some supplemental data about the item, which can be used to represent the item in a GUI app.
 *
 * Created by Controllerface on 3/27/2018.
 */
public class InventoryData implements Displayable
{

    /**
     * The actual inventory item being tracked
     */
    private final ProcurementCost inventoryItem;

    /**
     * Stores the current count of the inventory item
     */
    private long quantity;

    /**
     * Ordinal used when performing comparisons based on grade; used to sort collections of InventoryData objects.
     */
    private final int gradeOrdinal;

    /**
     * Ordinal used when performing comparisons based on category; used to sort collections of InventoryData objects.
     */
    private final int categoryOrdinal;

    /**
     * JavaFX UI component containing info about the inventory item and any other related information that may be
     * available for the item. Some items will have more info that others so this object may contain a wide variety
     * of child objects.
     */
    private final VBox mainGraphic = new VBox();

    /**
     * In the context of this inventory object, the graphical "progress" bar is used to denote what percentage of the
     * current capacity for the item is used. If the item does not have a maximum capacity, this bar may not be present
     * of if it is, may not containing meaningful information.
     *
     * todo: add some info for commodities, perhaps % of max capacity, just for UI sugar
     */
    private final ProgressBar capacityBar = new ProgressBar();

    /**
     * This is used to ensure the graphic is only completely rendered once, when this object's graphics are first
     * requested. Afterward, only the "live" components of the item's display are modified.
     */
    private final AtomicBoolean initialRenderComplete = new AtomicBoolean(false);

    /**
     * Describes the item's general "category", useful in text descriptions of the item
     */
    private final String categoryString;

    /**
     * Stores a newline (\n) delimited list of string names for all the tasks associated with this item
     */
    private final String associatedString;

    private final SimpleLongProperty haveCount = new SimpleLongProperty();
    private final SimpleBooleanProperty hasTrades = new SimpleBooleanProperty(false);

    private final Function<ProcurementCost, Long> checkInventory;
    private final Function<ProcurementCost, Integer> pendingTradeCost;
    private final Consumer<ProcurementTask> addTask;


    private final VBox itemDetails = new VBox();

    private final List<Button> upgrades = new ArrayList<>();
    private final List<Button> downgrades = new ArrayList<>();

    /**
     * Special formatting function for modifications and experimental effects. Since they have some odd cases
     * the basic .replace("_"," ") call isn't enough to make it look right
     */
    private static Function<String, String> formatModString = (s)->
    {
        int i = s.lastIndexOf("_");
        if (i == -1) return s;
        String r = s.substring(0,i).replace("_"," ");

        // remove duplicate "sensor sensor" strings, while preserving ACTUAL sensors (i.e. radar) labels
        if (r.startsWith("Sensor") && !"Sensor".equals(r)) r = r.replace("Sensor ","");

        // add spaces between capitalized groups. i.e. LooksLikeThis -> Looks Like This
        r = r.length() <= 3 ? r : Arrays.stream(r.split("(?=\\p{Lu})")).collect(Collectors.joining(" "));

        // fix up some cases where FSD is spaced out as F S D and has no trailing space
        return r.replace("F S D","FSD ");
    };

    InventoryData(ProcurementCost inventoryItem,
                  long quantity,
                  Function<ProcurementCost, Long> checkInventory,
                  Function<ProcurementCost, Integer> pendingTradeCost,
                  Consumer<ProcurementTask> addTask)
    {
        this.inventoryItem = inventoryItem;
        this.quantity = quantity;
        this.gradeOrdinal = inventoryItem.getGrade().getNumericalValue();
        this.categoryOrdinal = MaterialSubCostCategory.findMatchingSubCategory(inventoryItem)
                .map(MaterialSubCostCategory::getNumericalValue)
                .orElse(-1);
        this.checkInventory = checkInventory;
        this.pendingTradeCost = pendingTradeCost;
        this.addTask = addTask;

        this.categoryString = getCategoryString();
        this.associatedString = generateAssociatedString();

        mainGraphic.setAlignment(Pos.CENTER_LEFT);
        itemDetails.setAlignment(Pos.CENTER_LEFT);
        itemDetails.getStyleClass().add("information_panel");

        capacityBar.setPadding(new Insets(6,6,0,6));


        findMaterialTrades();

    }

    /**
     * Renders the capacity bar UI element
     */
    private void renderProgress()
    {
        double progress = ((double) quantity / (double)getItem().getGrade().getMaximumQuantity());
        capacityBar.setProgress(progress);
        capacityBar.setStyle("-fx-accent: #ff7100");
    }

    /**
     * Generates a suitable "short description" of this item's category and classification.
     *
     * @return category string for this item
     */
    private String getCategoryString()
    {
        String category = "";
        if (inventoryItem instanceof Material)
        {
            category = MaterialSubCostCategory.findMatchingSubCategory(inventoryItem)
                    .map(MaterialSubCostCategory::toString)
                    .orElseGet(() -> "(Unknown Material)" + inventoryItem);
        }
        else if (inventoryItem instanceof Commodity)
        {
            category = CommodityCostCategory.findMatchingCategory(inventoryItem)
                    .map(CommodityCostCategory::toString)
                    .orElseGet(() -> "(Unknown Commodity)" + inventoryItem);
        }
        return category;
    }

    /**
     * Generates a Label object with text including a short description of the inventory item
     *
     * @return Label describing this item
     */
    private Label createNameLabel()
    {
        // build a string descriptor for this item and a Label used to display it in the GUI
        String itemDescriptor = categoryString + " :: " + getItem().getLocalizedName();
        Label nameLabel = new Label(itemDescriptor);
        nameLabel.getStyleClass().add("base_font");
        nameLabel.alignmentProperty().set(Pos.CENTER_LEFT);
        nameLabel.getStyleClass().add("inventory_label");
        return nameLabel;
    }

    private Label createLocationHeaderLabel()
    {
        Label locationHeaderLabel = new Label("Relevant Locations");
        locationHeaderLabel.getStyleClass().addAll("inventory_label", "base_font");
        return locationHeaderLabel;
    }

    private Label createLocationInfoLabel()
    {
        Label locationInfoLabel = new Label(getItem().getLocationInformation());
        locationInfoLabel.alignmentProperty().set(Pos.CENTER_LEFT);
        locationInfoLabel.getStyleClass().addAll("light_color_label", "base_font");
        return locationInfoLabel;
    }

    private String generateAssociatedString()
    {
        List<ProcurementRecipe> synthesisRecipes = new ArrayList<>();
        List<ProcurementRecipe> modificationRecipes = new ArrayList<>();
        List<ProcurementRecipe> experimentalRecipes = new ArrayList<>();
        List<ProcurementRecipe> techBrokerRecipes = new ArrayList<>();

        inventoryItem.getAssociated().forEach(recipe ->
        {
            if (recipe instanceof SynthesisRecipe) synthesisRecipes.add(recipe);
            if (recipe instanceof ModificationRecipe) modificationRecipes.add(recipe);
            if (recipe instanceof ExperimentalRecipe) experimentalRecipes.add(recipe);
            if (recipe instanceof TechnologyRecipe) techBrokerRecipes.add(recipe);
        });


        //todo: make these buttons instead of just strings
        String synthesis = synthesisRecipes.isEmpty()
                ? ""
                : Arrays.stream(SynthesisBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(synthesisRecipes::contains)
                                .distinct()
                                .map(recipe -> blueprint.name() + " :: " + recipe.getGrade())
                                .map(text -> text.replace("_", " ")))
                        .collect(Collectors.joining("\n","\nSynthesis\n", "\n"));

        String modifications = modificationRecipes.isEmpty()
                ? ""
                : Arrays.stream(ModificationBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(modificationRecipes::contains)
                                .distinct()
                                .map(text -> formatModString.apply(blueprint.name()) + " :: " + text.getDisplayLabel()))
                        .collect(Collectors.joining("\n","\nModifications\n", "\n"));

        String experiments = experimentalRecipes.isEmpty()
                ? ""
                : Arrays.stream(ExperimentalBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(experimentalRecipes::contains)
                                .distinct()
                                .map(recipe -> blueprint.name() + " :: " + recipe.getDisplayLabel())
                                .map(text -> text.replace("_", " ")))
                        .collect(Collectors.joining("\n","\nExperimental Effects\n", "\n"));

        String techUnlocks = techBrokerRecipes.isEmpty()
                ? ""
                : Arrays.stream(TechnologyBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(techBrokerRecipes::contains)
                                .distinct()
                                .map(recipe -> blueprint.name() + " :: " + recipe.getShortLabel())
                                .map(text -> text.replace("_", " ")))
                        .collect(Collectors.joining("\n","\nTech Broker Unlocks\n", "\n"));

        return synthesis + modifications + experiments + techUnlocks;
    }


    /**
     * Generates a TitledPane object used to house all of the information about the item. The pane's "title" in this
     * case if the name of the inventory item. When the pane is expanded (by clicking on it) the full details and
     * extra information about the item is displayed.
     *
     * @return TitledPane used to hold item information
     */
    private TitledPane createItemDataPane()
    {
        TitledPane dataPanel = new TitledPane();
        dataPanel.setAnimated(false);
        dataPanel.expandedProperty().setValue(false);
        dataPanel.setGraphic(createNameLabel());
        dataPanel.alignmentProperty().set(Pos.CENTER_LEFT);
        dataPanel.setOnMouseMoved((e)->renderHave());
        dataPanel.getStyleClass().addAll("general_panel", "base_font");
        return dataPanel;
    }

    private void renderHave()
    {
        Integer committedCost = pendingTradeCost.apply(inventoryItem);
        int committed = (committedCost == null) ? 0 : committedCost;
        long have = checkInventory.apply(inventoryItem) - committed;
        haveCount.set(have);
        hasTrades.set(committed > 0);
    }


    private void findMaterialTrades()
    {
        if (inventoryItem instanceof Material)
        {

            Optional<MaterialSubCostCategory> materialSubCostCategory =
                    MaterialSubCostCategory.findMatchingSubCategory(getItem());

            // separate any in-category material trades into upgrade/downgrade lists
            materialSubCostCategory.ifPresent(materialSubCostCategory1 -> materialSubCostCategory1.materials()
                    .filter(material -> material != inventoryItem)
                    .map(material -> material.getTradeBlueprint().orElse(null))
                    .filter(Objects::nonNull)
                    .flatMap(ProcurementBlueprint::recipeStream)
                    .filter(r -> r.costStream().findFirst().get().getCost() == inventoryItem)
                    .forEach(recipe ->
                    {
                        Optional<CostData> possibleTradeCost = recipe.costStream().findFirst();
                        Optional<CostData> possibleTradeYield = recipe.costStream().reduce((a, b) -> b);

                        if (possibleTradeCost.isPresent() && possibleTradeYield.isPresent())
                        {
                            if (materialSubCostCategory1.hasMaterial(((Material) possibleTradeCost.get().getCost())))
                            {
                                CostData tradeCost = possibleTradeCost.get();
                                CostData tradeYield = possibleTradeYield.get();

                                Optional<MaterialTradeType> tradeType =
                                        MaterialTradeType.findMatchingTradeType(((Material) tradeCost.getCost()));

                                if (tradeType.isPresent())
                                {
                                    boolean upgrade = tradeCost.getCost().getGrade()
                                            .compareTo(tradeYield.getCost().getGrade()) < 0;

                                    Icon costIcon = tradeCost.getCost()
                                            .getGrade()
                                            .getIcon();

                                    Icon yieldIcon = tradeYield.getCost()
                                            .getGrade()
                                            .getIcon();

                                    Region from = UIFunctions.Convert.createMaterialIconRegion(costIcon.getIconPath(),
                                            costIcon.getBaseWidth(), costIcon.getBaseHeight(), "#b75200");

                                    Region to = UIFunctions.Convert.createMaterialIconRegion(yieldIcon.getIconPath(),
                                            yieldIcon.getBaseWidth(), yieldIcon.getBaseHeight(), "#b75200");

                                    Label toLabel = new Label(" to ");
                                    toLabel.getStyleClass().addAll("inventory_label", "base_font");

                                    HBox convBox = new HBox(from, toLabel, to);
                                    ProcurementTask tradeTask = new ProcurementTask(tradeType.get(), recipe);

                                    VBox btnhldr = new VBox();
                                    HBox btnlbl = new HBox();

                                    Label descOpen = new Label();
                                    descOpen.getStyleClass().addAll("inventory_label",  "base_font");

                                    Label descHave = new Label();
                                    descHave.getStyleClass().addAll("base_font");
                                    Label descClose = new Label();
                                    descClose.getStyleClass().addAll("inventory_label",  "base_font");

                                    renderHave();

                                    String x = tradeCost.getQuantity()
                                            //+ " "
                                            //+ tradeCost.getCost().getLocalizedName()
                                            + " for "
                                            + Math.abs(tradeYield.getQuantity())
                                            + " :: "
                                            + tradeYield.getCost().getLocalizedName()
                                            + " (";

                                    descOpen.setText(x);

                                    descHave.textProperty().bind(haveCount.asString());
                                    descHave.textFillProperty()
                                            .bind(Bindings.when(hasTrades)
                                                    .then(UIFunctions.Style.standardOrange)
                                                    .otherwise(UIFunctions.Style.darkOrange));

                                    descClose.setText(")");

                                    Region region1 = new Region();
                                    HBox.setHgrow(region1, Priority.ALWAYS);

                                    btnlbl.getChildren().add(descOpen);
                                    btnlbl.getChildren().add(descHave);
                                    btnlbl.getChildren().add(descClose);

                                    btnlbl.getChildren().add(region1);
                                    btnlbl.getChildren().add(convBox);
                                    btnhldr.getChildren().add(btnlbl);

                                    Button button = new Button();
                                    button.getStyleClass().add("material_trade_button");

                                    button.setGraphic(btnhldr);
                                    button.prefWidthProperty().bind(itemDetails.widthProperty());

                                    button.setOnMouseClicked((e) ->
                                    {
                                        //addTask.accept(tradeTask);
                                        renderHave();
                                    });

                                    button.setOnMouseExited((e) ->
                                    {
                                        renderHave();
                                    });

                                    button.setOnMousePressed((e)->
                                    {
                                        addTask.accept(tradeTask);
                                        renderHave();
                                    });

                                    if (upgrade)
                                    {
                                        upgrades.add(button);
                                    }
                                    else
                                    {
                                        downgrades.add(button);
                                    }
                                }
                            }
                        }
                    }));

        }
    }


    /**
     * Renders the main UI component
     */
    private void render()
    {
        // render any progress first
        renderProgress();

        renderHave();

        // just in case there was somehow something placed in the main component, we should clear it out
        mainGraphic.getChildren().clear();

        // this pane is the main UI element. By default it is not expanded, containing just a short description of
        // the item. When expanded, it will show more detailed information about the item including any relevant
        // locations in-game where the player might find or purchase the item, as well as known uses (if any) and
        // if tradeable at a material trader, any relevant trades.
        TitledPane itemDataPane = createItemDataPane();

        // add the data pane to the main graphic object
        mainGraphic.getChildren().add(itemDataPane);

        itemDataPane.setContent(itemDetails);

        itemDataPane.expandedProperty().addListener((_x, wasCollapsed, wasExpanded) ->
        {
            if (wasExpanded && itemDetails.getChildren().isEmpty())
            {
                itemDetails.getChildren().add(createLocationHeaderLabel());
                itemDetails.getChildren().add(createLocationInfoLabel());
                itemDetails.setBackground(new Background(new BackgroundFill(
                        Color.rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));

                Separator separator = new Separator();
                separator.paddingProperty().set(new Insets(5, 0, 0, 0));
                itemDetails.getChildren().add(separator);


                if (!upgrades.isEmpty())
                {
                    Label upgradeLabel = new Label("Upgrades");
                    upgradeLabel.setPadding(new Insets(5, 0, 2, 0));
                    upgradeLabel.setTextFill(UIFunctions.Style.darkOrange);
                    upgradeLabel.getStyleClass().addAll("base_font");
                    itemDetails.getChildren().add(upgradeLabel);
                    itemDetails.getChildren().addAll(upgrades);
                }

                if (!downgrades.isEmpty())
                {
                    Label downgradeLabel = new Label("Downgrades");
                    downgradeLabel.setPadding(new Insets(5, 0, 2, 0));
                    downgradeLabel.setTextFill(UIFunctions.Style.darkOrange);
                    downgradeLabel.getStyleClass().addAll("base_font");
                    itemDetails.getChildren().add(downgradeLabel);
                    itemDetails.getChildren().addAll(downgrades);
                }


                if (associatedString.isEmpty())
                {
                    Label noUses = new Label();
                    noUses.getStyleClass().addAll("base_font");
                    noUses.setText("No Crafting Uses");
                    itemDetails.getChildren().add(noUses);
                }
                else
                {
                    Label knownUsesLabel = new Label("Known Uses");
                    knownUsesLabel.setPadding(new Insets(5, 0, 2, 0));
                    knownUsesLabel.setTextFill(UIFunctions.Style.darkOrange);
                    knownUsesLabel.getStyleClass().addAll("base_font");
                    itemDetails.getChildren().add(knownUsesLabel);


                    VBox vBox = new VBox();
                    String parts[] = associatedString.split("\n\n");
                    for (String category : parts)
                    {
                        boolean title = false;
                        String items[] = category.trim().split("\n");

                        TitledPane knownUsesDropDown = new TitledPane();
                        knownUsesDropDown.getStyleClass().addAll("stats_pane", "base_font");
                        VBox knownUses = new VBox();

                        for (String descLine : items)
                        {
                            if (!title)
                            {
                                title = true;
                                Label useLabel = new Label(descLine);
                                useLabel.getStyleClass().addAll("general_panel_label", "base_font");
                                knownUsesDropDown.setGraphic(useLabel);
                            }
                            else
                            {
                                Label associatedTasks = new Label(descLine);
                                associatedTasks.getStyleClass().addAll("light_color_label", "base_font");
                                knownUses.getChildren().add(associatedTasks);

                                knownUsesDropDown.setAnimated(false);
                                knownUsesDropDown.setExpanded(false);
                                //vBox.getChildren().add(knownUsesDropDown);
                            }
                        }

                        knownUsesDropDown.setContent(knownUses);
                        vBox.getChildren().add(knownUsesDropDown);
                    }
                    itemDetails.getChildren().add(vBox);
                }
            }
        });

    }

    @Override
    public String toString()
    {
        return inventoryItem + " : " + quantity;
    }

    public ProcurementCost getItem()
    {
        return inventoryItem;
    }

    public int getGradeOrdinal()
    {
        return gradeOrdinal;
    }

    public int getCategoryOrdinal()
    {
        return categoryOrdinal;
    }

    public long getQuantity()
    {
        return quantity;
    }

    boolean adjustCount(long adjustment)
    {
        this.quantity += adjustment;
        renderProgress();
        return quantity >= 0;
    }

    public void prepareGraphic()
    {
        if (!initialRenderComplete.getAndSet(true))
        {
            render();
        }
    }

    public Node getGraphic()
    {
        return mainGraphic;
    }

    public ProgressBar getProgressBar()
    {
        return capacityBar;
    }
}
