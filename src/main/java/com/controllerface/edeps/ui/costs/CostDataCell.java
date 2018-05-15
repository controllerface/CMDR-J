package com.controllerface.edeps.ui.costs;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialType;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * Created by Stephen on 4/26/2018.
 */
public class CostDataCell extends TableCell<ItemCostData, ItemCostData>
{
    private static double baseFontSize = -1;
    private static String baseFontFamily = null;

    @Override
    protected void updateItem(ItemCostData item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            super.setText(null);
            super.setGraphic(null);
        }
        else
        {
            VBox descriptionContainer = new VBox();
            descriptionContainer.setAlignment(Pos.CENTER);

            Accordion accordion = new Accordion();
            TitledPane titledPane = new TitledPane();
            titledPane.setAnimated(false);

            HBox hbox = new HBox();

            ProcurementCost cost = item.getCost();
            String type;
            if (cost instanceof Material)
            {
                type = MaterialType.findMatchingType(((Material) cost)).name();
                type = type.substring(0,1)
                        .concat(type.substring(1,type.length()).toLowerCase());
            }
            else if (cost instanceof Commodity) type = Commodity.class.getSimpleName();
            else type = "Unknown";


            synchronized (this)
            {
                if (baseFontSize == -1 && baseFontFamily == null)
                {
                    baseFontSize = getFont().getSize();
                    baseFontSize += baseFontSize / 4;
                    baseFontFamily = getFont().getFamily();
                }
            }

            Label costLabel = new Label(type + " :: "  + cost.getLocalizedName()) ;
            costLabel.setPrefHeight(20);
            costLabel.setFont(UIFunctions.Fonts.size2Font);
            costLabel.paddingProperty().set(new Insets(2,5,2,5));
            double progress = ((double) item.getHave()) / ((double) item.getNeed());

            ProgressBar progressBar = new ProgressBar(progress);

            progressBar.setOnMouseClicked((e)->titledPane.setExpanded(!titledPane.isExpanded()));

            if (progress >= 1.0)
            {
                progressBar.setStyle("-fx-accent: #00b3f7 ");
            }
            else progressBar.setStyle("-fx-accent: #ff0000 ");

            hbox.getChildren().addAll(progressBar, costLabel);







            HBox labelBox = new HBox();
            labelBox.alignmentProperty().set(Pos.CENTER);
            VBox locationContainer = new VBox();

            //String locationInformation

            Label locationInfo = new Label(item.getCost().getGrade().getLocationDescription());
            locationInfo.setFont(UIFunctions.Fonts.size1Font);
            locationInfo.alignmentProperty().set(Pos.CENTER_LEFT);
            locationContainer.getChildren().add(locationInfo);
            titledPane.setGraphic(labelBox);
            titledPane.setContent(locationContainer);
            titledPane.alignmentProperty().set(Pos.CENTER_LEFT);








            //titledPane.setContent(new Label("Coming Soon : Location Information"));








            titledPane.setGraphic(hbox);
            hbox.setAlignment(Pos.CENTER);

            accordion.getPanes().add(titledPane);
            descriptionContainer.getChildren().add(accordion);


            setGraphic(descriptionContainer);
        }
    }
}
