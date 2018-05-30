package com.controllerface.edeps.ui.procurements;

import com.controllerface.edeps.data.procurements.ProcurementTaskData;
import com.controllerface.edeps.structures.costs.materials.MaterialTradeType;
import com.controllerface.edeps.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.edeps.ui.UIFunctions;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableStringValue;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.TreeCell;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Controllerface on 4/1/2018.
 */
public class ProcurementTreeCell extends TreeCell<ProcurementTaskData>
{
    private ProcurementTaskData thisItem = null;

    public ProcurementTreeCell(ObservableList<ProcurementTaskData> outputList, SimpleStringProperty outputLabel)
    {
        // NOTE: the output list and label used here are part of the UI, so must only be updated on the JavaFX UI
        // thread. Luckily event handlers automatically trigger in that thread so there's no extra work needed here,
        // but care should be exercised that the objects aren't touched in non-UI threads later on. Make sure they
        // don't leak.
        this.setOnMouseClicked((e)->
        {
            if (this.getTreeItem() == null) return;

            if (thisItem != null && thisItem.getBlueprint() != null && thisItem.getType() != null)
            {
                outputList.clear();

                String displayText;

                if (thisItem.getType() instanceof ExperimentalType)
                {
                    displayText = "Experimental Effects :: " + thisItem.getBlueprint().toString();
                }
                else displayText = thisItem.getType().toString() + " :: " + thisItem.getBlueprint().toString();

                outputLabel.set(displayText);

                thisItem.getBlueprint().recipeStream()
                        .map(recipe -> new ProcurementTaskData(thisItem.getType(), recipe))
                        .forEach(outputList::add);
            }

            else
            {
                boolean toggle = !this.getTreeItem().expandedProperty().get();
                this.getTreeItem().setExpanded(toggle);
            }
        });
    }

    @Override
    protected void updateItem(ProcurementTaskData item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            setGraphic(null);
            setText(null);
            return;
        }
        else thisItem = item;

        Label text = new Label(item.toString());
        if (item.getType() != null && item.getType() instanceof MaterialTradeType)
        {
            text.setTextFill(UIFunctions.Fonts.darkOrange);
        }

        if (this.getTreeItem().isLeaf())
        {
            text.underlineProperty().setValue(true);
            text.setCursor(Cursor.HAND);
        }
        else text.setCursor(Cursor.OPEN_HAND);
        text.setFont(UIFunctions.Fonts.size3Font);
        setGraphic(text);
        this.paddingProperty().setValue(new Insets(5,5,5,5));
    }
}
