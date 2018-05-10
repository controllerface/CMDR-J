package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import com.controllerface.edeps.Statistic;
import com.controllerface.edeps.data.ShipModuleData;
import com.controllerface.edeps.data.commander.InventoryData;
import com.controllerface.edeps.data.commander.ShipStatisticData;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalBlueprint;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.edeps.structures.craftable.modifications.ModificationBlueprint;
import com.controllerface.edeps.structures.craftable.modifications.ModificationRecipe;
import com.controllerface.edeps.structures.craftable.modifications.WeaponModificationRecipe;
import com.controllerface.edeps.structures.craftable.synthesis.SynthesisBlueprint;
import com.controllerface.edeps.structures.craftable.synthesis.SynthesisCategory;
import com.controllerface.edeps.structures.craftable.synthesis.SynthesisRecipe;
import com.controllerface.edeps.structures.craftable.technologies.TechnologyBlueprint;
import com.controllerface.edeps.structures.craftable.technologies.TechnologyRecipe;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.commodities.CommodityCategory;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialCategory;
import com.controllerface.edeps.structures.equipment.ItemGrade;
import com.controllerface.edeps.ui.commander.CommanderStatDataCell;
import com.controllerface.edeps.ui.costs.CostDataCell;
import com.controllerface.edeps.ui.costs.CostValueCell;
import com.controllerface.edeps.ui.ship.ModuleDisplayCell;
import com.controllerface.edeps.ui.ship.SlotDataCell;
import com.controllerface.edeps.ui.ship.StatDataCell;
import com.controllerface.edeps.ui.ship.StatDisplayCell;
import com.controllerface.edeps.ui.tasks.TaskNameCell;
import com.controllerface.edeps.ui.tasks.TaskCountCell;
import com.controllerface.edeps.ui.tasks.TaskRemoveCell;
import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.util.Callback;
import javafx.util.Pair;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class stores several stateless functions and utility objects that are used to build or modify the GUI. These
 * functions are stored here in an effort to keep the UI controller classes and various custom cell/display object
 * classes from getting too cluttered with support functions.
 *
 * This class in organized such that related functionality resides within inner static classes of a common name,
 * for example the Data subclass houses various cell and cell data functions used to define how various table cells
 * are created or displayed.
 *
 * Created by Stephen on 4/19/2018.
 */
public class UIFunctions
{
    public static final int scrollBarAllowance = 20;

    public static class Fonts
    {
        public static final Color positiveBlue = Color.rgb(0x00, 0xb3, 0xf7);
        public static final Color negativeRed = Color.rgb(0xff, 0x00, 0x00);
        static final Color neutralBlack = Color.rgb(0x00, 0x00, 0x00);
        public static final Color standardOrange = Color.rgb(0xff, 0x71, 0x00);
        public static final Color specialYellow = Color.rgb(0xff, 0xb0, 0x00);

        static final Font baseFont = Font.getDefault();
        static final double size1 = baseFont.getSize() + (baseFont.getSize() / 5);
        static final double size2 = baseFont.getSize() + (baseFont.getSize() / 4);
        static final double size3 = baseFont.getSize() + (baseFont.getSize() / 3);
        static final double size4 = baseFont.getSize() + (baseFont.getSize() / 2);

        static final Font size1Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, size1);
        public static final Font size2Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, size2);
        public static final Font size3Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, size3);
        public static final Font size4Font = Font.font(baseFont.getFamily(), FontWeight.BOLD, size4);
    }

    /**
     * Callback and Callback producing functions that control how various UI elements are created and displayed
     */
    static class Data
    {
        static final Callback<TableColumn<ShipModuleData, ShipModuleData>, TableCell<ShipModuleData, ShipModuleData>>
                moduleDisplayCellFactory = (x) -> new ModuleDisplayCell();

        static final Callback<TableColumn.CellDataFeatures<InventoryData, HBox>, ObservableValue<HBox>>
                inventoryCategoryCellFactory =
                (inventoryData) ->
                {
                    ProcurementCost cost = inventoryData.getValue().getItem();
                    String category = "";
                    if (cost instanceof Material) category = MaterialCategory.findMatchingCategory(cost).toString();
                    else if (cost instanceof Commodity) category = CommodityCategory.findMatchingCategory(cost).toString();
                    HBox hBox = new HBox();
                    Label label = new Label(category);
                    label.setFont(Fonts.size2Font);
                    hBox.getChildren().add(label);
                    return new ReadOnlyObjectWrapper<>(hBox);
                };

        static final Callback<TableColumn.CellDataFeatures<InventoryData, HBox>, ObservableValue<HBox>>
                inventoryGradeCellFactory =
                (inventoryData) ->
                {
                    String grade = inventoryData.getValue().getItem().getGrade().toString();
                    HBox hBox = new HBox();
                    Label label = new Label(grade);
                    label.setFont(Fonts.size2Font);
                    hBox.getChildren().add(label);
                    return new ReadOnlyObjectWrapper<>(hBox);
                };

        static final Callback<TableColumn.CellDataFeatures<InventoryData, VBox>, ObservableValue<VBox>>
                inventoryItemCellFactory =
                (materialData) ->
                {
                    String materialName = materialData.getValue().getItem().getLocalizedName();

                    ItemGrade grade = materialData.getValue().getItem().getGrade();

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

                    int quantity = materialData.getValue().getQuantity();


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

                    label.setFont(Fonts.size2Font);
                    label.setPadding(new Insets(0,0,0,10));
                    label.alignmentProperty().set(Pos.CENTER_LEFT);
                    labelBox.getChildren().add(label);
                    labelBox.alignmentProperty().set(Pos.CENTER_LEFT);




                    Label locationLabel = new Label(materialData.getValue().getItem().getLocationInformation());
                    locationLabel.setFont(Fonts.size1Font);
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


                    materialData.getValue().getItem().getAssociated().stream()
                            .forEach(i->
                            {
                                if (i instanceof SynthesisRecipe) syns.add(i);
                                if (i instanceof ModificationRecipe) mods.add(i);
                                if (i instanceof ExperimentalRecipe) spec.add(i);
                                if (i instanceof WeaponModificationRecipe) weap.add(i);
                                if (i instanceof TechnologyRecipe) tech.add(i);
                            });

//                    Arrays.stream(SynthesisBlueprint.values())
//                            .flatMap(SynthesisBlueprint::recipeStream)
//                            .filter(syns::contains)
//                            .map(ProcurementRecipe::getDisplayLabel)
//                            .collect(Collectors.joining("\n", "Synthesis:\n", "\n\n"))


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
                        label1.setText("No Known Crafting Uses");
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
                        Label useLabel = new Label("Known Crafting Uses");
                        useLabel.setFont(Fonts.size1Font);
                        pane.setGraphic(useLabel);
                        pane.setExpanded(false);
                        locationContainer.getChildren().add(vBox);
                        locationContainer.setAlignment(Pos.CENTER_LEFT);
                    }



                    label1.setFont(Fonts.size1Font);


                    return new ReadOnlyObjectWrapper<>(descriptionContainer);
                };

        static final Callback<TableColumn.CellDataFeatures<InventoryData, Label>, ObservableValue<Label>>
                inventoryQuantityCellFactory =
                (materialData) ->
                {
                    int quantity = materialData.getValue().getQuantity();
                    Label label = new Label(String.valueOf(quantity));
                    label.paddingProperty().setValue(new Insets(5,0,0,0));
                    label.setFont(Fonts.size2Font);
                    return new ReadOnlyObjectWrapper<>(label);
                };

    /*
     procurement List: Roll/Mod Blueprint
     */

        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProcurementRecipeData>, ObservableValue<ProcurementRecipeData>>
                modRollCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue());

        static final Function<BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer>,
            Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>>
                makeModRollCellFactory = (func) -> (x) -> new TaskCountCell(func);

        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, ProcurementRecipeData>, ObservableValue<ProcurementRecipeData>>
                modNameCellValueFactory = (modRecipe) ->new ReadOnlyObjectWrapper<>(modRecipe.getValue());

        static final Function<Function<ProcurementCost, Integer>,
                Callback<TableColumn<ProcurementRecipeData, ProcurementRecipeData>, TableCell<ProcurementRecipeData, ProcurementRecipeData>>>
                makeModNameCellFactory = (func) -> (x) -> new TaskNameCell(func);

        static final Callback<TableColumn.CellDataFeatures<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, ObservableValue<Pair<ProcurementType, ProcurementRecipe>>>
                modControlCellValueFactory = (modRecipe) -> new ReadOnlyObjectWrapper<>(modRecipe.getValue().asPair());

        static final Function<BiFunction<Integer, Pair<ProcurementType, ProcurementRecipe>, Integer>,
            Callback<TableColumn<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>, TableCell<ProcurementRecipeData, Pair<ProcurementType, ProcurementRecipe>>>>
                makeModControlCellFactory = (updateFunction) -> (modRecipe) -> new TaskRemoveCell(updateFunction);

    /*
     procurement List: Material Need/Have, Progress information
     */

        static final Callback<TableColumn.CellDataFeatures<ItemCostData, String>, ObservableValue<String>>
                costNeedCellFactory = (modMaterial) ->
        {
            int left = 0;
            int need = modMaterial.getValue().getNeed();
            int have = modMaterial.getValue().getHave();
            boolean ok = need <= have;
            if (!ok)
            {
                left = need - have;
            }

            return new SimpleStringProperty(String.valueOf(left));
        };

        static final Callback<TableColumn<ItemCostData, ItemCostData>, TableCell<ItemCostData, ItemCostData>>
                boldCostStringCellFactory = (x) -> new CostDataCell();

        static final Callback<TableColumn<ItemCostData, String>, TableCell<ItemCostData, String>>
                boldCostNumberCellFactory = (x) -> new CostValueCell();

        static final Callback<TableColumn<Pair<Statistic, String>, String>, TableCell<Pair<Statistic, String>, String>>
                boldStringNameCellFactory = (x) -> new CommanderStatDataCell();

        static final Callback<TableColumn<ShipModuleData, String>, TableCell<ShipModuleData, String>>
                boldSlotNameCellFactory = (x) -> new SlotDataCell();

        static final Callback<TableColumn<ShipStatisticData, String>, TableCell<ShipStatisticData, String>>
                boldStatNameCellFactory = (x) -> new StatDataCell();

        static final Callback<TableColumn.CellDataFeatures<ItemCostData, ItemCostData>, ObservableValue<ItemCostData>>
                costNameCellValueFactory = (modMaterial) -> new ReadOnlyObjectWrapper<>(modMaterial.getValue());

        static Callback<TableColumn<ShipStatisticData, ShipStatisticData>, TableCell<ShipStatisticData, ShipStatisticData>>
                boldStatDataCellFactory = (x) -> new StatDisplayCell();

    }

    /**
     * Mapping functions used to produce UI elements from other data objects
     */
    public static class Convert
    {
        // Creates a Label object from a Pair<ItemEffect, Double>. The provided pair represents the effect that some
        // modification or experimental effect would have on whatever item it is applied to, and the magnitude of that
        // effect. If the magnitude is a positive number, it would be added to the base value of any modified item, and
        // likewise, a negative value would become a subtraction from any base value.
        public static Function<Pair<ItemEffect, Double>, Label> effectToLabel = (pair) ->
        {
            // get the "more is good" flag for this effect
            boolean moreIsGood = pair.getKey().isMoreGood();

            // set a flag to capture whether the value is negative or positive
            boolean valueIsPositive = pair.getValue() >= 0;

            // now set a flag marking this effect as "good" or "bad". This is used primarily to add a corresponding
            // color to the UI indicating good/bad status. For example, "bad" effects are often displayed in red
            boolean isGood = moreIsGood == valueIsPositive;

            // we want positive changes to have a plus sign (+) in their text. Negative values have a minus sign (-)
            // prefix by default, so we only need to explicitly do this for positive numbers

            String text = pair.getKey().toString()
                    + (valueIsPositive ? " +" : " ")
                    + String.valueOf(pair.getValue()) ;

            // some effects have a zero value, such effects are generally "binary" on/off values, so we can just remove
            // the trailing "point zero" suffix
            text = text.replace(".0","");

            // todo: clean this up, there's extra checks here
            // to make the text match the in game values, add a percent sign (%)
            if (text.contains("-") || text.contains("+")) text += "%";
            text = text.replace("+0%","");

            // now create the label object using the text we just created
            Label nextLabel = new Label(text);

            // todo: in the future this will be done with CSS
            nextLabel.setFont(Fonts.size1Font);

            // text fill is a separate value, set it to the "good" or "bad" font as appropriate
            nextLabel.setTextFill(isGood ? Fonts.positiveBlue : Fonts.negativeRed);

            return nextLabel;
        };


        public static BiFunction<Boolean, CostData, Label> costToLabel = (hasEnough, cost) ->
        {
            Label next = new Label(cost.getQuantity() + "x " + cost.getCost().getLocalizedName());
            next.setFont(Fonts.size1Font);
            next.setTextFill(hasEnough ? Fonts.neutralBlack : Fonts.negativeRed);
            return next;
        };
    }

    /**
     * Comparators, used when sorting data sets in various ways
     */
    public static class Sort
    {
        // sort Label objects by "good/bad status" where blue is good and red is bad. Good comes before bad
        public static final Comparator<Label> byGoodness = (a, b) -> a.getTextFill() == b.getTextFill()
                ? 0
                : a.getTextFill() == Color.BLUE
                        ? -1
                        : 1;

        // sort InventoryData objects alphabetically, by category
        static final Comparator<InventoryData> costByCategory =
                Comparator.comparing(InventoryData::getCategory);

        // sort InventoryData objects numerically by grade, lowest to highest
        static final Comparator<InventoryData> materialByGrade =
                (a,b) -> a.getItem().getGrade().getNumericalValue() - b.getItem().getGrade().getNumericalValue();

        // sort InventoryData objects numerically by count, highest to lowest
        static final Comparator<InventoryData> cargoByCount =
                (a, b) -> b.getQuantity() - a.getQuantity();

        // used for Label objects that are actually just string representations of Integer values. Will sort them
        // numerically lowest to highest
        static final Comparator<Label> quantityByNumericValue =
                Comparator.comparingInt(a -> Integer.parseInt(a.getText()));
    }
}
