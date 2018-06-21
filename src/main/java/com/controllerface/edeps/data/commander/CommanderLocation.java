package com.controllerface.edeps.data.commander;

import com.controllerface.edeps.data.StarSystem;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.Label;

/**
 * Created by Stephen on 6/14/2018.
 */
public class CommanderLocation
{
    private StarSystem starSystem;
    private final SimpleStringProperty currentLocation = new SimpleStringProperty("Nowhere");

    public void associateStarSystem(Label systemLabel)
    {
        systemLabel.textProperty().bind(currentLocation);
    }

    public void setStarSystem(StarSystem starSystem)
    {
        this.starSystem = starSystem;
        Platform.runLater(()->
        {
            synchronized (currentLocation)
            {
                currentLocation.set(this.starSystem.getSystemName());
            }
        });
    }

    public StarSystem getStarSystem()
    {
        return starSystem;
    }
}
