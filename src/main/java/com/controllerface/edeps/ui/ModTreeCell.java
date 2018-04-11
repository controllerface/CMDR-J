package com.controllerface.edeps.ui;

import com.controllerface.edeps.data.MaterialInventoryData;
import com.controllerface.edeps.enums.materials.Material;
import com.controllerface.edeps.data.ModTreeItem;
import com.sun.javafx.scene.control.skin.ProgressIndicatorSkin;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Stephen on 4/1/2018.
 */
public class ModTreeCell extends TreeCell<ModTreeItem>
{
    private final Consumer<ModTreeItem> addMod;
    private final Function<Material, Integer> checkMat;

    public ModTreeCell(Consumer<ModTreeItem> addMod, Function<Material, Integer> checkMat)
    {
        this.addMod = addMod;
        this.checkMat = checkMat;
    }

    @Override
    protected void updateItem(ModTreeItem item, boolean empty)
    {
        super.updateItem(item, empty);

        if (item == null)
        {
            setGraphic(null);
            setText(null);
            return;
        }

        if (item.getRecipe() != null && this.getTreeItem().isLeaf())
        {
            HBox cellBox = new HBox(10);
            VBox textBox = new VBox(1);
            Label gradeLabel = new Label(item.getRecipe().getGrade());

            Font existingFont = gradeLabel.getFont();
            Font boldFont = Font.font(existingFont.getFamily(), FontWeight.BOLD, existingFont.getSize());
            gradeLabel.setFont(boldFont);

            textBox.getChildren().add(gradeLabel);

            item.getRecipe().effects().pairStream()
                    .map(p ->
                    {
                        boolean moreIsGood = p.getKey().isMoreGood();
                        boolean valueIsPositive = p.getValue() >= 0;
                        boolean markGood = moreIsGood == valueIsPositive;
                        String buf = ((valueIsPositive ? "+" : "")
                                + p.getValue() + " "
                                + p.getKey().toString())
                                .replace(".0 ", " ");

                        // for on/off effects, the value will be 0, so just remove it form the text
                        buf = buf.replace("+0","");
                        Label nextLabel = new Label(buf);
                        nextLabel.setTextFill(markGood ? Color.BLUE : Color.RED);
                        return nextLabel;
                    })
                    .sorted((a,b)->a.getTextFill() == b.getTextFill() // do the text fill styles match?
                            ? 0 // if so, return 0 indicating they are equal
                            : a.getTextFill() == Color.BLUE // is a green?
                                    ? -1 // if so return -1 for green first
                                    : 1) // otherwise, return 1 for red last
                    .forEach(l->textBox.getChildren().add(l));

            Button button = new Button();
            button.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            button.setGraphic(textBox);
            ProgressIndicator progressIndicator = new ProgressIndicator(0);

            List<MaterialInventoryData> data = this.getItem()
                    .getRecipe()
                    .costStream()
                    .collect(Collectors.toList());

            int count = data.size();
            AtomicInteger good = new AtomicInteger(0);
            data.forEach(d->
            {
                if(checkMat.apply(d.getMaterial())>=d.getQuantity())
                {
                    good.incrementAndGet();
                }
            });

            AtomicInteger loops = new AtomicInteger(0);
            Set<MaterialInventoryData> missingSet = new HashSet<>();
            if (good.get() == count)
            {
                AtomicInteger innerGood = new AtomicInteger(count);
                while (innerGood.get() == count)
                {
                    loops.getAndIncrement();
                    innerGood.set(0);
                    data.forEach(m->
                    {
                        if(checkMat.apply(m.getMaterial()) >= (m.getQuantity()* loops.get() + 1))
                        {
                            innerGood.incrementAndGet();
                        }
                    });
                }
            }
            else
            {
                data.forEach(m ->
                {
                    int ch = checkMat.apply(m.getMaterial());
                    if(ch < m.getQuantity())
                    {
                        missingSet.add(m);
                    }
                });
            }

            // in order for text adjustments to be possible via CSS, we must get a skin and apply CSS first
            ProgressIndicatorSkin indicatorSkin = new ProgressIndicatorSkin(progressIndicator);
            progressIndicator.applyCss();

            // add a listener that modified the display of the percentage
            progressIndicator.progressProperty().addListener((ov, t, newValue) ->
            {
                // If progress is 100% then show Text
                Text text = (Text) progressIndicator.lookup(".percentage");
                if (text != null)
                {
                    if (newValue.doubleValue() >= 1)
                    {
                        double w = text.getLayoutBounds().getWidth();
                        text.setText(String.valueOf(loops.get()));
                        progressIndicator.setPrefWidth(w);
                        progressIndicator.setStyle("-fx-progress-color: #6677ff;");
                        String msg = data.stream()
                                .map(d-> checkMat.apply(d.getMaterial()) + " x " +
                                        d.getMaterial().getLocalizedName()).collect(Collectors.joining("\n","\n","\n"));

                        progressIndicator.setTooltip(new Tooltip("You can craft " + loops.get() + " of this mod" + msg));
                    }
                    else
                    {
                        String suffix = missingSet.size() > 1 ? "s" : "";
                        String missingMessage = "You need the following material" + suffix + " to craft this mod:" +
                                missingSet.stream()
                                        .map(x-> x.getQuantity()+ " x " + x.getMaterial().getLocalizedName())
                                        .collect(Collectors.joining("\n","\n","\n"));
                        progressIndicator.setStyle(" -fx-progress-color: #ee5555;");
                        progressIndicator.setTooltip(new Tooltip(missingMessage));
                    }
                }
            });

            progressIndicator.setProgress(((double) good.get())/ ((double) count));
            progressIndicator.setSkin(indicatorSkin);

            button.setOnMouseClicked((e) -> addMod.accept(this.getItem()));
            button.setTooltip(new Tooltip("Click to add: \n   " + item.getType() + " : " + item.toString() + "\nto your procurement list"));

            cellBox.getChildren().addAll(progressIndicator, button);

            setGraphic(cellBox);
            setText(null);
        }
        else
        {
            setGraphic(null);
            setText(item.toString());
        }
    }
}
