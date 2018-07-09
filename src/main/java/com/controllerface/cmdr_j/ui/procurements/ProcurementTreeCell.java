package com.controllerface.cmdr_j.ui.procurements;

import com.controllerface.cmdr_j.data.procurements.ProcurementTask;
import com.controllerface.cmdr_j.structures.costs.materials.MaterialTradeType;
import com.controllerface.cmdr_j.structures.craftable.experimentals.ExperimentalType;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Label;
import javafx.scene.control.TreeCell;

/**
 * Created by Controllerface on 4/1/2018.
 */
public class ProcurementTreeCell extends TreeCell<ProcurementTask>
{
    private ProcurementTask thisItem = null;

    public ProcurementTreeCell(ObservableList<ProcurementTask> outputList, SimpleStringProperty outputLabel)
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
                        .map(recipe -> new ProcurementTask(thisItem.getType(), recipe))
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
    protected void updateItem(ProcurementTask item, boolean empty)
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