package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.procurements.ProcTreeData;
import com.sun.javafx.scene.control.skin.ProgressIndicatorSkin;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Stephen on 4/1/2018.
 */
public class ProcTreeCell extends TreeCell<ProcTreeData>
{
    private final Consumer<ProcTreeData> addMod;
    private final Function<ProcurementCost, Integer> checkMat;
    private static final AtomicReference<Font> baseFont = new AtomicReference<>(null);

    public ProcTreeCell(Consumer<ProcTreeData> addMod, Function<ProcurementCost, Integer> checkMat)
    {
        this.addMod = addMod;
        this.checkMat = checkMat;
    }

    private ProgressBar createProgressIndicator(double progress, int surplus, List<CostData> data, Set<CostData> missingSet)
    {
        ProgressBar progressIndicator = new ProgressBar(progress);
        progressIndicator.prefHeight(10);

        if (progress >= 1)
        {
            progressIndicator.setStyle("-fx-accent: #00b3f7;");

            String msg = data.stream()
                    .map(d-> checkMat.apply(d.getCost()) + " x " +
                            d.getCost().getLocalizedName()).collect(Collectors.joining("\n","\n","\n"));

            progressIndicator.setTooltip(new Tooltip("You can craft " + surplus + " of this item" + msg));
        }
        else
        {
            progressIndicator.setStyle("-fx-accent: #ff0000;");

            String suffix = missingSet.size() > 1 ? "s" : "";
            String missingMessage = "You need the following component" + suffix + " to craft this item:" +
                    missingSet.stream()
                            .map(x-> x.getQuantity()+ " x " + x.getCost().getLocalizedName())
                            .collect(Collectors.joining("\n","\n","\n"));
            progressIndicator.setTooltip(new Tooltip(missingMessage));
        }

        return progressIndicator;
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

        synchronized (baseFont)
        {
            if (baseFont.get() == null)
            {
                Font ba = getFont();
                baseFont.set(Font.font(ba.getFamily(), FontWeight.BOLD, ba.getSize() + (ba.getSize() / 3)));
            }
        }

        setFont(baseFont.get());

        if (item.getRecipe() != null && this.getTreeItem().isLeaf())
        {
            VBox buttonBox = new VBox(1);
            Label gradeLabel = new Label(item.getRecipe().getLabel() + "  ");

            Font existingFont = gradeLabel.getFont();
            Font boldFont = Font.font(existingFont.getFamily(), FontWeight.BOLD, existingFont.getSize() + (existingFont.getSize() / 3));
            gradeLabel.setFont(boldFont);


            List<CostData> data = this.getItem()
                    .getRecipe()
                    .costStream()
                    .collect(Collectors.toList());

            int count = data.size();
            AtomicInteger good = new AtomicInteger(0);
            data.forEach(d->
            {
                if(checkMat.apply(d.getCost())>=d.getQuantity())
                {
                    good.incrementAndGet();
                }
            });

            AtomicInteger loops = new AtomicInteger(0);
            Set<CostData> missingSet = new HashSet<>();
            if (good.get() == count)
            {
                AtomicInteger innerGood = new AtomicInteger(count);
                while (innerGood.get() == count)
                {
                    loops.getAndIncrement();
                    innerGood.set(0);
                    data.forEach(m->
                    {
                        if(checkMat.apply(m.getCost()) >= (m.getQuantity()* loops.get() + 1))
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
                    int ch = checkMat.apply(m.getCost());
                    if(ch < m.getQuantity())
                    {
                        missingSet.add(m);
                    }
                });
            }

            double progress = ((double) good.get())/ ((double) count);



            ProgressBar progressIndicator = createProgressIndicator(progress, loops.get(),  data, missingSet);

            HBox hBox = new HBox(1);
            hBox.getChildren().addAll(progressIndicator, gradeLabel);
            buttonBox.getChildren().addAll(hBox);

            // add effect data to the button box
            item.getRecipe().effects().pairStream()
                    .map(UIFunctions.Convert.effectToLabel)
                    .sorted(UIFunctions.Sort.byGoodness)
                    .forEach(l->buttonBox.getChildren().add(l));

            Button button = new Button();
            button.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            button.setGraphic(buttonBox);
            button.setOnMouseClicked((e) -> addMod.accept(this.getItem()));
            progressIndicator.setOnMouseClicked((e)->button.getOnMouseClicked().handle(e));
            button.setTooltip(new Tooltip("Click to add: \n   " + item.getType() + " : " + item.toString() + "\nto your procurement list"));

            setGraphic(button);
            setText(null);
        }
        else
        {
            setGraphic(null);
            setText(item.toString());
        }
    }
}
