package com.controllerface.cmdr_j.data.commander;

import com.controllerface.cmdr_j.ProcurementBlueprint;
import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.structures.costs.commodities.Commodity;
import com.controllerface.cmdr_j.structures.costs.commodities.CommodityCostCategory;
import com.controllerface.cmdr_j.structures.costs.materials.Material;
import com.controllerface.cmdr_j.structures.costs.materials.MaterialSubCostCategory;
import com.controllerface.cmdr_j.structures.craftable.experimentals.ExperimentalBlueprint;
import com.controllerface.cmdr_j.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.structures.craftable.modifications.ModificationRecipe;
import com.controllerface.cmdr_j.structures.craftable.modifications.WeaponModificationRecipe;
import com.controllerface.cmdr_j.structures.craftable.synthesis.SynthesisBlueprint;
import com.controllerface.cmdr_j.structures.craftable.synthesis.SynthesisRecipe;
import com.controllerface.cmdr_j.structures.craftable.technologies.TechnologyBlueprint;
import com.controllerface.cmdr_j.structures.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
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
    private int quantity;

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

    InventoryData(ProcurementCost inventoryItem, int quantity)
    {
        this.inventoryItem = inventoryItem;
        this.quantity = quantity;
        this.gradeOrdinal = inventoryItem.getGrade().getNumericalValue();
        this.categoryOrdinal = MaterialSubCostCategory.findMatchingSubCategory(inventoryItem)
                .map(MaterialSubCostCategory::getNumericalValue)
                .orElse(-1);

        this.categoryString = getCategoryString();

        mainGraphic.setAlignment(Pos.CENTER_LEFT);

        capacityBar.setPadding(new Insets(6,6,0,6));
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
            Optional<MaterialSubCostCategory> matchingSubCategory =
                    MaterialSubCostCategory.findMatchingSubCategory(inventoryItem);

            category = matchingSubCategory.isPresent()
                    ? matchingSubCategory.get().toString()
                    : "(Unknown Material)" + inventoryItem;
        }
        else if (inventoryItem instanceof Commodity)
        {
            Optional<CommodityCostCategory> matchingCategory =
                    CommodityCostCategory.findMatchingCategory(inventoryItem);

            category = matchingCategory.isPresent()
                    ? matchingCategory.get().toString()
                    : "(Unknown Commodity)" + inventoryItem;
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
        nameLabel.setFont(UIFunctions.Fonts.size2Font);
        nameLabel.alignmentProperty().set(Pos.CENTER_LEFT);
        return nameLabel;
    }

    private Label createLocationHeaderLabel()
    {
        Label locationHeaderLabel = new Label("Relevant Locations");
        locationHeaderLabel.underlineProperty().setValue(true);
        locationHeaderLabel.setFont(UIFunctions.Fonts.size2Font);
        return locationHeaderLabel;
    }

    private Label createLocationInfoLabel()
    {
        Label locationInfoLabel = new Label(getItem().getLocationInformation());
        locationInfoLabel.setFont(UIFunctions.Fonts.size1Font);
        locationInfoLabel.alignmentProperty().set(Pos.CENTER_LEFT);
        return locationInfoLabel;
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
        return dataPanel;
    }

    /**
     * Renders the main UI component
     */
    private void render()
    {
        // render any progress first
        renderProgress();

        // just in case there was somehow something placed in the main component, we should clear it out
        mainGraphic.getChildren().clear();

        // this pane is the main UI element. By default it is not expanded, containing just a short description of
        // the item. When expanded, it will show more detailed information about the item including any relevant
        // locations in-game where the player might find or purchase the item, as well as known uses (if any) and
        // if tradeable at a material trader, any relevant trades.
        TitledPane itemDataPane = createItemDataPane();

        // add the data pane to the main graphic object
        mainGraphic.getChildren().add(itemDataPane);

        // WORKING AREA: upgrade/downgrade trade listings
        if (getItem() instanceof Material)
        {

            Optional<MaterialSubCostCategory> materialSubCostCategory =
                    MaterialSubCostCategory.findMatchingSubCategory(getItem());

            if (materialSubCostCategory.isPresent())
            {
                Optional<ProcurementBlueprint> tradeBlueprint = ((Material) getItem()).getTradeBlueprint();
                if (tradeBlueprint.isPresent())
                {
                    tradeBlueprint.get().recipeStream()
                            .forEach(r ->
                            {
                                Optional<CostData> cost1 = r.costStream().findFirst();
                                Optional<CostData> cost2 = r.costStream().reduce((a, b) -> b);

                                if (cost1.isPresent() && cost2.isPresent())
                                {
                                    if (materialSubCostCategory.get().hasMaterial(((Material) cost1.get().getCost())))
                                    {

                                        cost1.get().getCost().getGrade()
                                                .compareTo(cost2.get().getCost().getGrade());

                                        System.out.println("DEBUG:" + cost1.get().toString() + "->" +cost2.get().toString());
                                    }
                                }
                            });
                }
            }
        }
        // END WORKING AREA



        VBox itemDetails = new VBox();
        itemDetails.getChildren().add(createLocationHeaderLabel());
        itemDetails.getChildren().add(createLocationInfoLabel());
        itemDetails.setBackground(new Background(new BackgroundFill(
                Color.rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));


        List<ProcurementRecipe> synthesisRecipes = new ArrayList<>();
        List<ProcurementRecipe> modificationRecipes = new ArrayList<>();
        List<ProcurementRecipe> experimentalRecipes = new ArrayList<>();
        List<ProcurementRecipe> weaponModRecipes = new ArrayList<>();
        List<ProcurementRecipe> techBrokerRecipes = new ArrayList<>();

        getItem().getAssociated().forEach(i->
        {
            if (i instanceof SynthesisRecipe) synthesisRecipes.add(i);
            if (i instanceof ModificationRecipe) modificationRecipes.add(i);
            if (i instanceof WeaponModificationRecipe) weaponModRecipes.add(i);
            if (i instanceof ExperimentalRecipe) experimentalRecipes.add(i);
            if (i instanceof TechnologyRecipe) techBrokerRecipes.add(i);
        });

        String synthesis = synthesisRecipes.isEmpty()
                ? ""
                : Arrays.stream(SynthesisBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(synthesisRecipes::contains)
                                .distinct()
                                .map(r -> blueprint.name() + " :: " + r.getGrade())
                                .map(s -> s.replace("_", " ")))
                        .collect(Collectors.joining("\n - ","\nSynthesis:\n - ", "\n"));

        String modifications = modificationRecipes.isEmpty() && weaponModRecipes.isEmpty()
                ? ""
                : Arrays.stream(ModificationBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(recipe -> modificationRecipes.contains(recipe) || weaponModRecipes.contains(recipe))
                                .distinct()
                                .map(r->formatModString.apply(blueprint.name()) + " :: " + r.getDisplayLabel()))
                        .collect(Collectors.joining("\n - ","\nModifications:\n - ", "\n"));

        String experiments = experimentalRecipes.isEmpty()
                ? ""
                : Arrays.stream(ExperimentalBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(experimentalRecipes::contains)
                                .distinct()
                                .map(r -> blueprint.name() + " :: " + r.getDisplayLabel())
                                .map(s -> s.replace("_", " ")))
                        .collect(Collectors.joining("\n - ","\nExperimental Effects:\n - ", "\n"));

        String techUnlocks = techBrokerRecipes.isEmpty()
                ? ""
                : Arrays.stream(TechnologyBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(techBrokerRecipes::contains)
                                .distinct()
                                .map(r -> blueprint.name() + " :: " + r.getShortLabel())
                                .map(s -> s.replace("_", " ")))
                        .collect(Collectors.joining("\n - ","\nTech Broker Unlocks:\n - ", "\n"));

        String associated = synthesis + modifications + experiments + techUnlocks;

        Separator separator = new Separator();
        separator.paddingProperty().set(new Insets(5,0,5,0));
        itemDetails.getChildren().add(separator);

        Label label1 = new Label(associated.trim());
        label1.setFont(UIFunctions.Fonts.size1Font);

        if (associated.isEmpty())
        {
            label1.setText("No Known Uses");
            itemDetails.getChildren().add(label1);
        }
        else
        {
            TitledPane pane = new TitledPane();
            VBox vBox = new VBox();
            HBox hBox = new HBox();
            hBox.getChildren().add(label1);
            vBox.getChildren().add(pane);
            vBox.alignmentProperty().set(Pos.CENTER_LEFT);
            pane.setAnimated(false);

            label1.setText(associated.trim());
            pane.setContent(hBox);
            Label useLabel = new Label("Known Uses");
            useLabel.setFont(UIFunctions.Fonts.size1Font);
            pane.setGraphic(useLabel);
            pane.setExpanded(false);
            itemDetails.getChildren().add(vBox);
            itemDetails.setAlignment(Pos.CENTER_LEFT);
        }

        itemDataPane.setContent(itemDetails);
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

    public int getQuantity()
    {
        return quantity;
    }

    boolean adjustCount(int adjustment)
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
