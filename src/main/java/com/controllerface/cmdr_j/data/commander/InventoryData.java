package com.controllerface.cmdr_j.data.commander;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
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
 * Created by Controllerface on 3/27/2018.
 *
 * NOTE: Mutable state data object
 *
 */
public class InventoryData implements Displayable
{
    private int quantity;
    private final ProcurementCost material;
    private final int gradeOrdinal;
    private final int categoryOrdinal;

    private final VBox descriptionContainer = new VBox();
    private final ProgressBar progressBar = new ProgressBar();

    private final AtomicBoolean initialRenderComplete = new AtomicBoolean(false);

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

    InventoryData(ProcurementCost material, int quantity)
    {
        this.material = material;
        this.quantity = quantity;
        this.gradeOrdinal = material.getGrade().getNumericalValue();
        this.categoryOrdinal = MaterialSubCostCategory.findMatchingSubCategory(material)
                .map(MaterialSubCostCategory::getNumericalValue)
                .orElse(-1);
        progressBar.setPadding(new Insets(6,6,0,6));
    }

    private void renderProgress()
    {
        double progress = ((double) quantity / (double)getItem().getGrade().getMaximumQuantity());
        progressBar.setProgress(progress);
        progressBar.setStyle("-fx-accent: #ff7100");
    }

    private void render()
    {
        descriptionContainer.getChildren().clear();
        ProcurementCost cost = getItem();
        String category = "";
        if (cost instanceof Material)
        {
            Optional<MaterialSubCostCategory> matchingSubCategory = MaterialSubCostCategory.findMatchingSubCategory(cost);
            category = matchingSubCategory.isPresent()
                    ? matchingSubCategory.get().toString()
                    : "(Unknown Material)" + cost;
        }
        else if (cost instanceof Commodity)
        {
            Optional<CommodityCostCategory> matchingCategory = CommodityCostCategory.findMatchingCategory(cost);
            category = matchingCategory.isPresent()
                    ? matchingCategory.get().toString()
                    : "(Unknown Commodity)" + cost;
        }

        String materialName = category + " :: " + getItem().getLocalizedName();


        //Accordion accordion = new Accordion();
        TitledPane titledPane = new TitledPane();
        titledPane.setAnimated(false);
        titledPane.expandedProperty().setValue(false);
        descriptionContainer.getChildren().add(titledPane);
        descriptionContainer.setAlignment(Pos.CENTER_LEFT);

        Label label = new Label(materialName);
        renderProgress();



        //todo: fix progress for commodities

        VBox locationContainer = new VBox();

        label.setFont(UIFunctions.Fonts.size2Font);
        label.alignmentProperty().set(Pos.CENTER_LEFT);

        VBox overBox = new VBox();
        overBox.fillWidthProperty().setValue(true);
        HBox labelBox = new HBox();
        labelBox.getChildren().add(label);

//        if (getItem().getGrade().getMaximumQuantity() != -1)
//        {
//            Region region = new Region();
//            HBox.setHgrow(region, Priority.ALWAYS);
//            labelBox.getChildren().add(region);
//            labelBox.getChildren().add(progressBar);
//            HBox.setHgrow(labelBox, Priority.ALWAYS);
//
////            Parent parent = titledPane.getParent();
////            if (parent instanceof VBox)
////            {
//////                region.prefWidthProperty().bind(((VBox) parent).widthProperty().subtract(progressBar.widthProperty())
//////                        .subtract(label.widthProperty()));
////            }
//        }
        overBox.getChildren().add(labelBox);





        Label locationLabel = new Label("Relevant Locations");
        locationLabel.underlineProperty().setValue(true);
        locationLabel.setFont(UIFunctions.Fonts.size2Font);
        Label locationInfo = new Label(getItem().getLocationInformation());
        locationInfo.setFont(UIFunctions.Fonts.size1Font);
        locationInfo.alignmentProperty().set(Pos.CENTER_LEFT);
        locationContainer.getChildren().add(locationLabel);
        locationContainer.getChildren().add(locationInfo);
        locationContainer
                .setBackground(new Background(new BackgroundFill(Color
                        .rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));

        titledPane.setGraphic(overBox);
        titledPane.setContent(locationContainer);
        titledPane.alignmentProperty().set(Pos.CENTER_LEFT);


        List<ProcurementRecipe> syns = new ArrayList<>();
        List<ProcurementRecipe> mods = new ArrayList<>();
        List<ProcurementRecipe> spec = new ArrayList<>();
        List<ProcurementRecipe> weap = new ArrayList<>();
        List<ProcurementRecipe> tech = new ArrayList<>();

        getItem().getAssociated().forEach(i->
        {
            if (i instanceof SynthesisRecipe) syns.add(i);
            if (i instanceof ModificationRecipe) mods.add(i);
            if (i instanceof ExperimentalRecipe) spec.add(i);
            if (i instanceof WeaponModificationRecipe) weap.add(i);
            if (i instanceof TechnologyRecipe) tech.add(i);
        });

        String synthesis = syns.isEmpty()
                ? ""
                : Arrays.stream(SynthesisBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(syns::contains)
                                .distinct()
                                .map(r -> blueprint.name() + " :: " + r.getGrade())
                                .map(s -> s.replace("_", " ")))
                        .collect(Collectors.joining("\n - ","\nSynthesis:\n - ", "\n"));

        String modifications = mods.isEmpty() && weap.isEmpty()
                ? ""
                : Arrays.stream(ModificationBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(recipe -> mods.contains(recipe) || weap.contains(recipe))
                                .distinct()
                                .map(r->formatModString.apply(blueprint.name()) + " :: " + r.getDisplayLabel()))
                        .collect(Collectors.joining("\n - ","\nModifications:\n - ", "\n"));

        String experimentals = spec.isEmpty()
                ? ""
                : Arrays.stream(ExperimentalBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(spec::contains)
                                .distinct()
                                .map(r -> blueprint.name() + " :: " + r.getDisplayLabel())
                                .map(s -> s.replace("_", " ")))
                        .collect(Collectors.joining("\n - ","\nExperimental Effects:\n - ", "\n"));

        String technology = tech.isEmpty()
                ? ""
                : Arrays.stream(TechnologyBlueprint.values())
                        .flatMap(blueprint-> blueprint.recipeStream()
                                .filter(tech::contains)
                                .distinct()
                                .map(r -> blueprint.name() + " :: " + r.getShortLabel())
                                .map(s -> s.replace("_", " ")))
                        .collect(Collectors.joining("\n - ","\nTech Broker Unlocks:\n - ", "\n"));

        String associated = synthesis + modifications + experimentals + technology;

        Separator separator = new Separator();
        separator.paddingProperty().set(new Insets(5,0,5,0));
        locationContainer.getChildren().add(separator);

        Label label1 = new Label(associated.trim());

        if (associated.isEmpty())
        {
            label1.setText("No Known Uses");
            locationContainer.getChildren().add(label1);
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
            locationContainer.getChildren().add(vBox);
            locationContainer.setAlignment(Pos.CENTER_LEFT);
        }


        label1.setFont(UIFunctions.Fonts.size1Font);
    }

    @Override
    public String toString()
    {
        return material + " : " + quantity;
    }

    public ProcurementCost getItem()
    {
        return material;
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
        return descriptionContainer;
    }

    public ProgressBar getProgressBar()
    {
        return progressBar;
    }
}
