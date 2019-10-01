package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.ui.Displayable;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Stephen on 1/4/2019.
 */
public class MarketData implements Displayable
{
    private final String name;
    private final String category;
    private final String market;
    private final int buy;
    private final int sell;
    private final int mean;
    private final int stock;
    private final int demand;

    /**
     * JavaFX UI component containing info about the inventory item and any other related information that may be
     * available for the item. Some items will have more info that others so this object may contain a wide variety
     * of child objects.
     */
    private final VBox mainGraphic = new VBox();

    /**
     * This is used to ensure the graphic is only completely rendered once, when this object's graphics are first
     * requested. Afterward, only the "live" components of the item's display are modified.
     */
    private final AtomicBoolean initialRenderComplete = new AtomicBoolean(false);

    private MarketData(Builder builder)
    {
        this.name = builder.name;
        this.category = builder.category;
        this.market = builder.market;
        this.buy = builder.buy;
        this.sell = builder.sell;
        this.mean = builder.mean;
        this.stock = builder.stock;
        this.demand = builder.demand;

    }

    public String getName()
    {
        return name;
    }

    public String getCategory()
    {
        return category;
    }

    public String getMarket()
    {
        return market;
    }

    public int getBuy()
    {
        return buy;
    }

    public int getSell()
    {
        return sell;
    }

    public int getMean()
    {
        return mean;
    }

    public int getStock()
    {
        return stock;
    }

    public int getDemand()
    {
        return demand;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    @Override
    public Node getGraphic()
    {
        return mainGraphic;
    }

    @Override
    public void prepareGraphic()
    {
        if (!initialRenderComplete.getAndSet(true))
        {
            render();
        }
    }

    private void render()
    {
        TitledPane itemDataPane = createItemDataPane();
        VBox itemDetails = new VBox();
        itemDetails.getChildren().add(createLocationHeaderLabel());
        itemDetails.getChildren().add(createLocationInfoLabel());
        itemDetails.setBackground(new Background(new BackgroundFill(
                Color.rgb(0xEE, 0xEE, 0xEE), CornerRadii.EMPTY, Insets.EMPTY)));
        itemDataPane.setContent(itemDetails);
        mainGraphic.getChildren().add(itemDataPane);
    }

    private Label createLocationHeaderLabel()
    {
        Label locationHeaderLabel = new Label("Relevant Locations");
        locationHeaderLabel.setTextFill(UIFunctions.Style.darkOrange);
        locationHeaderLabel.setFont(UIFunctions.Style.size2Font);
        return locationHeaderLabel;
    }

    private Label createLocationInfoLabel()
    {
        Label locationInfoLabel = new Label("TODO: get this information...");
        locationInfoLabel.setFont(UIFunctions.Style.size1Font);
        locationInfoLabel.alignmentProperty().set(Pos.CENTER_LEFT);
        return locationInfoLabel;
    }

    private TitledPane createItemDataPane()
    {
        TitledPane dataPanel = new TitledPane();
        dataPanel.setAnimated(false);
        dataPanel.expandedProperty().setValue(false);
        dataPanel.setGraphic(createNameLabel());
        dataPanel.alignmentProperty().set(Pos.CENTER_LEFT);
        return dataPanel;
    }

    private Label createNameLabel()
    {
        // build a string descriptor for this item and a Label used to display it in the GUI
        String itemDescriptor = category + " :: " + name;
        Label nameLabel = new Label(itemDescriptor);
        nameLabel.setFont(UIFunctions.Style.size2Font);
        nameLabel.alignmentProperty().set(Pos.CENTER_LEFT);
        return nameLabel;
    }

    public static class Builder
    {
        private String name;
        private String category;
        private String market;
        private int buy;
        private int sell;
        private int mean;
        private int stock;
        private int demand;

        public Builder setName(String name)
        {
            this.name = name;
            return this;
        }

        public Builder setCategory(String category)
        {
            this.category = category;
            return this;
        }

        public Builder setMarket(String market)
        {
            this.market = market;
            return this;
        }

        public Builder setBuy(int buy)
        {
            this.buy = buy;
            return this;
        }

        public Builder setSell(int sell)
        {
            this.sell = sell;
            return this;
        }

        public Builder setMean(int mean)
        {
            this.mean = mean;
            return this;
        }

        public Builder setStock(int stock)
        {
            this.stock = stock;
            return this;
        }

        public Builder setDemand(int demand)
        {
            this.demand = demand;
            return this;
        }

        public MarketData build()
        {
            return new MarketData(this);
        }
    }
}
