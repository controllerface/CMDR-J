package com.controllerface.edeps.ui;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.CostData;
import com.controllerface.edeps.data.procurements.ProcurementTaskData;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by sroebuck on 5/4/2018.
 */
public class ProcListCell extends ListCell<ProcurementTaskData>
{
    private final Consumer<ProcurementTaskData> addMod;
    private final Function<ProcurementCost, Integer> checkMat;
    private final ReadOnlyDoubleProperty parentWidth;

    public ProcListCell(Consumer<ProcurementTaskData> addMod, Function<ProcurementCost, Integer> checkMat, ReadOnlyDoubleProperty parentWidth)
    {
        this.addMod = addMod;
        this.checkMat = checkMat;
        this.parentWidth = parentWidth;
    }


    @Override
    protected void updateItem(ProcurementTaskData item, boolean empty)
    {
        super.updateItem(item, empty);
        if (item == null || empty)
        {
            setGraphic(null);
            setText(null);
            return;
        }

        if (item.getRecipe() != null)
        {
            VBox buttonBox = new VBox(1);
            buttonBox.prefWidthProperty().bind(parentWidth.subtract((UIFunctions.scrollBarAllowance * 2) + 5));
            Label gradeLabel = new Label(item.getRecipe().getShortLabel() + "  ");
            Font existingFont = gradeLabel.getFont();
            Font boldFont = Font.font(existingFont.getFamily(), FontWeight.BOLD, existingFont.getSize() + (existingFont.getSize() / 3));
            gradeLabel.setFont(boldFont);
            gradeLabel.paddingProperty().setValue(new Insets(0,0,0,5));

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
            hBox.alignmentProperty().setValue(Pos.CENTER_LEFT);

            Button button = new Button();
            button.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
            button.setGraphic(buttonBox);
            button.setOnMouseClicked((e) -> addMod.accept(this.getItem()));
            progressIndicator.setOnMouseClicked((e)->button.getOnMouseClicked().handle(e));

            button.setTooltip(progressIndicator.getTooltip());

            setGraphic(button);
            setText(null);
        }
        else
        {
            setText(item.toString());
        }
    }

    private ProgressBar createProgressIndicator(double progress, int surplus, List<CostData> data, Set<CostData> missingSet)
    {
        ProgressBar progressIndicator = new ProgressBar(progress);
        progressIndicator.prefHeight(10);

        Tooltip tooltip;

        if (progress >= 1)
        {
            progressIndicator.setStyle("-fx-accent: #00b3f7;");

            String msg = data.stream()
                    .map(d-> checkMat.apply(d.getCost()) + " x " +
                            d.getCost().getLocalizedName()).collect(Collectors.joining("\n","\n","\n"));

            tooltip = new Tooltip("You can craft " + surplus + " of this item" + msg);
        }
        else
        {
            progressIndicator.setStyle("-fx-accent: #ff0000;");

            String suffix = missingSet.size() > 1 ? "s" : "";
            String missingMessage = "You need the following component" + suffix + " to craft this item:" +
                    missingSet.stream()
                            .map(x-> x.getQuantity()+ " x " + x.getCost().getLocalizedName())
                            .collect(Collectors.joining("\n","\n","\n"));

            tooltip = new Tooltip(missingMessage);
        }

        Font toolTipFont = tooltip.getFont();
        Font adjustedFont = Font.font(toolTipFont.getFamily(), FontWeight.BOLD, toolTipFont.getSize() + (toolTipFont.getSize() / 3));
        tooltip.setFont(adjustedFont);
        progressIndicator.setTooltip(tooltip);

        return progressIndicator;
    }
}
