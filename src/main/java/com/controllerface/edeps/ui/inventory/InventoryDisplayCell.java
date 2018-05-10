package com.controllerface.edeps.ui.inventory;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.data.commander.InventoryData;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.commodities.CommodityCategory;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialCategory;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalBlueprint;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.edeps.structures.craftable.modifications.ModificationRecipe;
import com.controllerface.edeps.structures.craftable.modifications.WeaponModificationRecipe;
import com.controllerface.edeps.structures.craftable.synthesis.SynthesisBlueprint;
import com.controllerface.edeps.structures.craftable.synthesis.SynthesisRecipe;
import com.controllerface.edeps.structures.craftable.technologies.TechnologyBlueprint;
import com.controllerface.edeps.structures.craftable.technologies.TechnologyRecipe;
import com.controllerface.edeps.structures.equipment.ItemGrade;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by sroebuck on 5/10/2018.
 */
public class InventoryDisplayCell extends TableCell<InventoryData, InventoryData>
{
    @Override
    protected void updateItem(InventoryData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }


        ProcurementCost cost = item.getItem();
        String category = "";
        if (cost instanceof Material) category = MaterialCategory.findMatchingCategory(cost).toString();
        else if (cost instanceof Commodity) category = CommodityCategory.findMatchingCategory(cost).toString();

        String materialName = category + " :: " + item.getItem().getLocalizedName();

        ItemGrade grade =item.getItem().getGrade();

        int maximum;
        switch (grade)
        {
            case VERY_COMMON:
                maximum = 300;
                break;

            case COMMON:
                maximum = 250;
                break;

            case STANDARD:
                maximum = 200;
                break;

            case RARE:
                maximum = 150;
                break;

            case VERY_RARE:
                maximum = 100;
                break;

            default:
                maximum = -1;
                break;
        }

        int quantity = item.getQuantity();


        VBox descriptionContainer = new VBox();
        Accordion accordion = new Accordion();
        TitledPane titledPane = new TitledPane();
        titledPane.setAnimated(false);
        descriptionContainer.getChildren().add(accordion);
        accordion.getPanes().add(titledPane);
        descriptionContainer.setAlignment(Pos.CENTER_LEFT);

        Label label = new Label(materialName);
        HBox labelBox = new HBox();
        labelBox.alignmentProperty().set(Pos.CENTER);

        if (maximum > 0)
        {
            ProgressBar progressBar = new ProgressBar();
            double progress = ((double) quantity / (double)maximum);
            progressBar.setProgress(progress);
            progressBar.setStyle("-fx-accent: #ff7100");
            labelBox.getChildren().add(progressBar);
        }

        VBox locationContainer = new VBox();

        label.setFont(UIFunctions.Fonts.size2Font);
        label.setPadding(new Insets(0,0,0,10));
        label.alignmentProperty().set(Pos.CENTER_LEFT);
        labelBox.getChildren().add(label);
        labelBox.alignmentProperty().set(Pos.CENTER_LEFT);


        Label locationLabel = new Label(item.getItem().getLocationInformation());
        locationLabel.setFont(UIFunctions.Fonts.size1Font);
        locationLabel.alignmentProperty().set(Pos.CENTER_LEFT);
        locationContainer.getChildren().add(locationLabel);
        titledPane.setGraphic(labelBox);
        titledPane.setContent(locationContainer);
        titledPane.alignmentProperty().set(Pos.CENTER_LEFT);


        List<ProcurementRecipe> syns = new ArrayList<>();
        List<ProcurementRecipe> mods = new ArrayList<>();
        List<ProcurementRecipe> spec = new ArrayList<>();
        List<ProcurementRecipe> weap = new ArrayList<>();
        List<ProcurementRecipe> tech = new ArrayList<>();


       item.getItem().getAssociated().forEach(i->
        {
            if (i instanceof SynthesisRecipe) syns.add(i);
            if (i instanceof ModificationRecipe) mods.add(i);
            if (i instanceof ExperimentalRecipe) spec.add(i);
            if (i instanceof WeaponModificationRecipe) weap.add(i);
            if (i instanceof TechnologyRecipe) tech.add(i);
        });

        Function<String, String> f = (s)->
        {
            int i = s.lastIndexOf("_");
            if (i == -1) return s;
            String r = s.substring(0,i).replace("_"," ");
            if (r.startsWith("Sensor") && !"Sensor".equals(r)) r = r.replace("Sensor ","");
            r = Arrays.stream(r.split("(?=\\p{Lu})")).collect(Collectors.joining(" "));
            return r;
        };

        String synthesis = Arrays.stream(SynthesisBlueprint.values())
                .flatMap(blueprint-> blueprint.recipeStream()
                        .filter(syns::contains)
                        .distinct()
                        .map(r -> blueprint.name() + " :: " + r.getGrade())
                        .map(s -> s.replace("_", " ")))
                .collect(Collectors.joining("\n"));
        synthesis = synthesis.isEmpty() ? "" : "\nSynthesis:\n" + synthesis;

        String modifications = Arrays.stream(ModificationBlueprint.values())
                .flatMap(blueprint-> blueprint.recipeStream()
                        .filter(recipe -> mods.contains(recipe) || weap.contains(recipe))
                        .distinct()
                        .map(r->f.apply(blueprint.name()) + " :: " + r.getDisplayLabel()))
                .collect(Collectors.joining("\n"));
        modifications = modifications.isEmpty() ? "" : "\n\nModifications:\n" + modifications;

        String experimentals = Arrays.stream(ExperimentalBlueprint.values())
                .flatMap(blueprint-> blueprint.recipeStream()
                        .filter(spec::contains)
                        .distinct()
                        .map(r -> blueprint.name() + " :: " + r.getDisplayLabel())
                        .map(s -> s.replace("_", " ")))
                .collect(Collectors.joining("\n"));
        experimentals = experimentals.isEmpty() ? "" : "\n\nExperimental Effects:\n" + experimentals;

        String technology = Arrays.stream(TechnologyBlueprint.values())
                .flatMap(blueprint-> blueprint.recipeStream()
                        .filter(tech::contains)
                        .distinct()
                        .map(r -> blueprint.name() + " :: " + r.getShortLabel())
                        .map(s -> s.replace("_", " ")))
                .collect(Collectors.joining("\n"));
        technology = technology.isEmpty() ? "" : "\n\nTech Broker Unlocks:\n" + technology;


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

        setGraphic(descriptionContainer);
    }
}
