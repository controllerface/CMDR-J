package com.controllerface.cmdr_j.ui;

import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
;

/**
 * Created by Stephen on 7/6/2018.
 */
public class Icon
{
    private final SVGPath iconPath;
    private final double baseWidth;
    private final double baseHeight;
    private final Color color;
    private final String hexColor;

    public Icon(SVGPath iconPath, double baseWidth, double baseHeight)
    {
        this(iconPath, baseWidth, baseHeight, Color.BLACK);
    }

    public Icon(SVGPath iconPath, double baseWidth, double baseHeight, Color color)
    {
        this.iconPath = iconPath;
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
        this.color = color;
        this.hexColor = "#" + this.color.toString().substring(2, 8);
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

    public Color getColor()
    {
        return color;
    }

    public String getHexColorString()
    {
        return hexColor;
    }
}
