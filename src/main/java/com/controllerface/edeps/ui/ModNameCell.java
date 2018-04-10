package com.controllerface.edeps.ui;

import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.data.ModRecipeItem;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.function.Function;

/**
 * Created by Stephen on 4/8/2018.
 */
public class ModNameCell extends TableCell<ModRecipeItem, ModRecipeItem>
{
    private final Function<Material, Integer> checkInventory;

    public ModNameCell(Function<Material, Integer> checkInventory)
    {
        this.checkInventory = checkInventory;
    }


    @Override
    protected void updateItem(ModRecipeItem item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setGraphic(null);
            return;
        }
        VBox vBox = new VBox();
        Label nameLabel = new Label(item.asPair().getKey().toString() + " :: " + item.asPair().getValue().toString());
        Font existingFont = nameLabel.getFont();
        Font boldFont = Font.font(existingFont.getFamily(), FontWeight.BOLD, existingFont.getSize());
        nameLabel.setFont(boldFont);
        vBox.getChildren().add(nameLabel);
        item.asPair().getValue().costStream()
                .map(c->
                {
                    Label next = new Label(" - " + c.getMaterial().getLocalizedName());
                    boolean hasEnough = checkInventory.apply(c.getMaterial()) >= c.getQuantity() * item.getCount();
                    next.setTextFill(hasEnough ? Color.BLUE : Color.RED);
                    return next;
                })
                .forEach(label -> vBox.getChildren().add(label));
        setGraphic(vBox);
    }
}
