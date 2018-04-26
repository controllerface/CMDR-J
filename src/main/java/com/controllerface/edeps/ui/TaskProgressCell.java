package com.controllerface.edeps.ui;

import com.controllerface.edeps.data.procurements.ProcurementRecipeData;
import com.sun.javafx.scene.control.skin.ProgressIndicatorSkin;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TableCell;
import javafx.scene.control.Tooltip;
import javafx.scene.text.Text;

import java.util.stream.Collectors;

/**
 * Created by Stephen on 4/2/2018.
 */
public class TaskProgressCell extends TableCell<ProcurementRecipeData, ProgressIndicator>
{
    @Override
    protected void updateItem(ProgressIndicator progressIndicator, boolean empty)
    {
        super.updateItem(progressIndicator, empty);
        if (progressIndicator == null) setGraphic(null);
        if (!empty && progressIndicator != null)
        {
            // in order for text adjustments to be possible via CSS, we must get a skin and apply CSS first
            ProgressIndicatorSkin indicatorSkin = new ProgressIndicatorSkin(progressIndicator);
            progressIndicator.applyCss();

            // If progress is 100% then show Text
            Text text = (Text) progressIndicator.lookup(".percentage");
            if (text != null)
            {

                double w = text.getLayoutBounds().getWidth();
                text.setText("");
                progressIndicator.setPrefWidth(w);
                progressIndicator.setPrefHeight(w);


                progressIndicator.setSkin(indicatorSkin);
            }



            progressIndicator.setPrefHeight(40);
            progressIndicator.setMinHeight(40);
            progressIndicator.setMaxHeight(40);

            setGraphic(progressIndicator);
        }
    }
}
