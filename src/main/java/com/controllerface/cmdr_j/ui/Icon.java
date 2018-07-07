package com.controllerface.cmdr_j.ui;

import javafx.scene.shape.SVGPath;

/**
 * Created by Stephen on 7/6/2018.
 */
public class Icon
{
    private final SVGPath iconPath;
    private final double baseWidth;
    private final double baseHeight;

    public Icon(SVGPath iconPath, double baseWidth, double baseHeight)
    {
        this.iconPath = iconPath;
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
    }

    public SVGPath getIconPath()
    {
        return iconPath;
    }

    public double getBaseWidth()
    {
        return baseWidth;
    }

    public double getBaseHeight()
    {
        return baseHeight;
    }
}
