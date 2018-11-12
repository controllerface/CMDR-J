package com.controllerface.cmdr_j.data;

/**
 * Created by Stephen on 9/16/2018.
 */
public class WindowDimensions
{
    private final double x;
    private final double y;
    private final double width;
    private final double height;

    private WindowDimensions(Builder builder)
    {
        this.x = builder.x;
        this.y = builder.y;
        this.width = builder.w;
        this.height = builder.h;
    }

    public static Builder builder()
    {
        return new Builder();
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public static class Builder
    {
        double x = 0;
        double y = 0;
        double w = 960;
        double h = 540;

        public Builder setX(double x)
        {
            this.x = x;
            return this;
        }

        public Builder setY(double y)
        {
            this.y = y;
            return this;
        }

        public Builder setWidth(double w)
        {
            this.w = w;
            return this;
        }

        public Builder setHeight(double h)
        {
            this.h = h;
            return this;
        }

        public WindowDimensions build()
        {
            return new WindowDimensions(this);
        }
    }
}
