package com.controllerface.cmdr_j.data;

/**
 * Created by Stephen on 9/16/2018.
 */
public class WindowDimensions
{
    private final double x;
    private final double y;
    private final double height;
    private final double width;

    private WindowDimensions(double x, double y, double height, double width)
    {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
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

    public double getHeight()
    {
        return height;
    }

    public double getWidth()
    {
        return width;
    }

    public static class Builder
    {
        double x = 0;
        double y = 100;
        double h = 100;
        double w = 100;

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

        public Builder setHeight(double h)
        {
            this.h = h;
            return this;
        }

        public Builder setWidth(double w)
        {
            this.w = w;
            return this;
        }

        public WindowDimensions build()
        {
            return new WindowDimensions(x, y, h, w);
        }
    }
}
