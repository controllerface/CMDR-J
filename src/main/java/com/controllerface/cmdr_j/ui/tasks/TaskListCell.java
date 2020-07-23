package com.controllerface.cmdr_j.ui.tasks;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.tasks.CostData;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.classes.tasks.Task;
import com.controllerface.cmdr_j.enums.engineers.Engineer;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Controllerface on 5/4/2018.
 */
public class TaskListCell extends ListCell<Task>
{
    private final Consumer<Task> addMod;
    private final Function<TaskCost, Long> checkMat;
    private final ReadOnlyDoubleProperty parentWidth;

    public TaskListCell(Consumer<Task> addMod, Function<TaskCost, Long> checkMat, ReadOnlyDoubleProperty parentWidth)
    {
        this.addMod = addMod;
        this.checkMat = checkMat;
        this.parentWidth = parentWidth;
    }

    @Override
    protected void updateItem(Task item, boolean empty)
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
            Label gradeLabel = new Label(item.getRecipe().getShortLabel() + "  ");
            gradeLabel.getStyleClass().add("base_font");
            gradeLabel.paddingProperty().setValue(new Insets(0,0,0,5));

            List<CostData> data = this.getItem()
                    .getRecipe()
                    .costStream()
                    .filter(c->c.getQuantity() > 0)
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

            //AtomicInteger loops = new AtomicInteger(0);
            Set<CostData> missingSet = new HashSet<>();
            if (good.get() != count)
            {
                data.forEach(m ->
                {
                    long ch = checkMat.apply(m.getCost());
                    if(ch < m.getQuantity())
                    {
                        missingSet.add(m);
                    }
                });
            }

            double progress = ((double) good.get())/ ((double) count);

            ProgressBar progressIndicator = createProgressIndicator(progress, data, missingSet);

            HBox hBox = new HBox(1);
            hBox.getChildren().addAll(progressIndicator, gradeLabel);
            buttonBox.getChildren().addAll(hBox);
            hBox.alignmentProperty().setValue(Pos.CENTER_LEFT);


            TitledPane infoPane = new TitledPane();
            infoPane.getStyleClass().addAll("base_font");
            infoPane.setExpanded(false);
            infoPane.setAnimated(false);
            infoPane.setGraphic(buttonBox);
            infoPane.setTooltip(progressIndicator.getTooltip());

            VBox costEffectContainer = new VBox();
            costEffectContainer.setBackground(new Background(new BackgroundFill(Color.rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));



            // effects
            item.getRecipe().effects().effectStream()
                    .map(UIFunctions.Convert.effectToLabel)
                    .sorted(UIFunctions.Sort.byGoodness)
                    .forEach(label -> costEffectContainer.getChildren().add(label));

            if (item.getRecipe().effects() != ItemEffects.EMPTY)
            {
                Separator separator = new Separator();
                separator.setPrefHeight(10);
                costEffectContainer.getChildren().add(separator);
            }

            // costs
           item.getRecipe().costStream()
                    .map(c->
                    {
                        String quantity = c.getQuantity() < 0
                                ? "+" + Math.abs(c.getQuantity())
                                : "-" + c.getQuantity();
                        Label next = new Label(quantity + " " + c.getCost().getLocalizedName());
                        next.getStyleClass().addAll("base_font");
                        return next;
                    })
                    .forEach(label -> costEffectContainer.getChildren().add(label));


            List<Engineer> engineers = Engineer.findSupportedEngineers(item.getType(), item.getRecipe().getGrade());
            if (!engineers.isEmpty())
            {
                Separator separator2 = new Separator();
                separator2.setPrefHeight(10);
                costEffectContainer.getChildren().add(separator2);

                for (Engineer engineer : engineers)
                {
                    Label engineerLabel = new Label(engineer.getFullName() + " :: "
                            + engineer.getLocation().getSystemName());
                    engineerLabel.getStyleClass().addAll("base_font");
                    engineerLabel.setTextFill(UIFunctions.Style.darkOrange);
                    costEffectContainer.getChildren().add(engineerLabel);
                }
            }

            infoPane.setContent(costEffectContainer);
            infoPane.prefWidthProperty().bind(this.widthProperty().subtract(50));


            Button add = new Button();

            // Plus
            Line line1 = new Line();
            line1.setStroke(Color.BLACK);
            line1.setStrokeWidth(3);
            line1.setStartX(2);
            line1.setEndX(12);
            line1.setStartY(12);
            line1.setEndY(12);

            Line line2 = new Line();
            line2.setStroke(Color.BLACK);
            line2.setStrokeWidth(3);
            line2.setStartX(7);
            line2.setEndX(7);
            line2.setStartY(7);
            line2.setEndY(17);

            Pane addGraphic  = new Pane(line1, line2);

            add.setAlignment(Pos.CENTER);
            add.setOnMouseClicked((e) -> addMod.accept(this.getItem()));

            add.getStyleClass().addAll("base_font");
            add.prefHeightProperty().set(33);
            add.prefWidthProperty().set(33);
            add.setGraphic(addGraphic);
            HBox container = new HBox();

            container.prefWidthProperty().bind(this.widthProperty().subtract(UIFunctions.scrollBarAllowance));

            container.getChildren().addAll(add, infoPane);

            setGraphic(container);
            setText(null);
        }
        else
        {
            setText(item.toString());
        }
    }

    private ProgressBar createProgressIndicator(double progress, List<CostData> data, Set<CostData> missingSet)
    {
        ProgressBar progressIndicator = new ProgressBar(progress);
        progressIndicator.prefHeight(10);

        Tooltip tooltip;

        if (progress >= 1)
        {
            progressIndicator.setStyle("-fx-accent: #00b3f7;");

            String msg = data.stream()
                    .filter(d -> d.getQuantity() > 0)
                    .map(d-> checkMat.apply(d.getCost()) + " x " +
                            d.getCost().getLocalizedName()).collect(Collectors.joining("\n","\n","\n"));

            //tooltip = new Tooltip("You can craft " + surplus + " of this item" + msg);
            tooltip = new Tooltip("You can craft this item: " + msg);
        }
        else
        {
            progressIndicator.setStyle("-fx-accent: #ff0000;");

            String suffix = missingSet.size() > 1 ? "s" : "";
            String missingMessage = "You need the following component" + suffix + " to craft this item:" +
                    missingSet.stream()
                            .filter(x -> x.getQuantity() > 0)
                            .map(x-> x.getQuantity()+ " x " + x.getCost().getLocalizedName())
                            .collect(Collectors.joining("\n","\n","\n"));

            tooltip = new Tooltip(missingMessage);
        }

        tooltip.getStyleClass().addAll("base_font");
        progressIndicator.setTooltip(tooltip);

        return progressIndicator;
    }
}
