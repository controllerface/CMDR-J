package com.controllerface.cmdr_j.classes.commander;

import com.controllerface.cmdr_j.classes.StarSystem;
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
    private final SimpleStringProperty currentStation = new SimpleStringProperty("Undocked");
    private final SimpleStringProperty currentEconomy = new SimpleStringProperty("None");

    public void associateStarSystem(Label systemLabel)
    {
        systemLabel.textProperty().bind(currentLocation);
    }

    public void associateSpaceStation(Label stationLabel)
    {
        stationLabel.textProperty().bind(currentStation);
    }

    public void associateEconomy(Label economyLabel)
    {
        economyLabel.textProperty().bind(currentEconomy);
    }

    public void setStation(String station)
    {
        Platform.runLater(()->
        {
            synchronized (currentStation)
            {
                currentStation.set(station);
            }
        });
    }

    public void setEconomy(String economy)
    {
        Platform.runLater(()->
        {
            synchronized (currentEconomy)
            {
                currentEconomy.set(economy);
            }
        });
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
