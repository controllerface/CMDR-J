package com.controllerface.cmdr_j.data.commander;

/**
 * Created by Stephen on 1/4/2019.
 */
public class MarketData
{
    private final String name;
    private final String market;
    private final int buy;
    private final int sell;
    private final int mean;
    private final int stock;
    private final int demand;


    private MarketData(Builder builder)
    {
        this.name = builder.name;
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

    public static class Builder
    {
        private String name;
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
