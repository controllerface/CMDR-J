package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.ItemCostData;
import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.costs.materials.MaterialType;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
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

            Label costLabel = new Label(cost.getLocalizedName() + " :: " + type);
            Font baseFont = Font.font(baseFontFamily, FontWeight.BOLD, baseFontSize);
            costLabel.setFont(baseFont);

            double progress = ((double) item.getHave()) / ((double) item.getNeed());

            ProgressBar progressBar = new ProgressBar(progress);

            if (progress >= 1.0)
            {
                progressBar.setStyle("-fx-progress-color: #00b3f7 ");
            }
            else progressBar.setStyle("-fx-progress-color: #ff0000 ");

            hbox.getChildren().addAll(progressBar, costLabel);
            setGraphic(hbox);
        }
    }
}
