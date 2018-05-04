package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.ProcTreeData;
import javafx.collections.ObservableList;
import javafx.scene.control.TreeCell;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Stephen on 4/1/2018.
 */
public class ProcTreeCell extends TreeCell<ProcTreeData>
{
    private final Consumer<ProcTreeData> addMod;
    private final Function<ProcurementCost, Integer> checkMat;
    private final ObservableList<ProcTreeData> outputList;
    private static final AtomicReference<Font> baseFont = new AtomicReference<>(null);

    private ProcTreeData thisItem = null;

    public ProcTreeCell(Consumer<ProcTreeData> addMod, Function<ProcurementCost, Integer> checkMat, ObservableList<ProcTreeData> outputList)
    {
        this.addMod = addMod;
        this.checkMat = checkMat;
        this.outputList = outputList;

        this.setOnMouseClicked((e)->
        {
            if (thisItem != null && thisItem.getBlueprint() != null && thisItem.getType() != null)
            {
                outputList.clear();
                outputList.add(thisItem);
                thisItem.getBlueprint().recipeStream()
                        .map(recipe -> new ProcTreeData(thisItem.getType(), recipe))
                        .forEach(outputList::add);
            }
        });
    }

    @Override
    protected void updateItem(ProcTreeData item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            setGraphic(null);
            setText(null);
            return;
        }
        else thisItem = item;

        synchronized (baseFont)
        {
            if (baseFont.get() == null)
            {
                Font ba = getFont();
                baseFont.set(Font.font(ba.getFamily(), FontWeight.BOLD, ba.getSize() + (ba.getSize() / 3)));
            }
        }

        Text text = new Text(item.toString());
        if (this.getTreeItem().isLeaf())
        {
            text.underlineProperty().setValue(true);
        }
        text.setFont(baseFont.get());
        setGraphic(text);
    }
}
