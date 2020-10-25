package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.ui.ShipModuleDisplay;
import javafx.scene.control.TableCell;
import javafx.scene.control.TitledPane;

/**
 * Created by Controllerface on 5/7/2018.
 */
public class ModuleDisplayCell extends TableCell<ShipModuleDisplay, ShipModuleDisplay>
{
    @Override
    protected void updateItem(ShipModuleDisplay shipModule, boolean empty)
    {
        super.updateItem(shipModule, empty);
        if (shipModule == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }
        shipModule.prepareGraphic();
        TitledPane titledPane = shipModule.getGraphic();
        setGraphic(titledPane);
    }
}
