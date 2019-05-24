package com.controllerface.cmdr_j.ui.ship;

import com.controllerface.cmdr_j.classes.ShipModuleData;
import javafx.scene.control.TableCell;

/**
 * Created by Controllerface on 5/7/2018.
 */
public class ModuleDisplayCell extends TableCell<ShipModuleData, ShipModuleData>
{
    @Override
    protected void updateItem(ShipModuleData shipModule, boolean empty)
    {
        super.updateItem(shipModule, empty);
        if (shipModule == null || empty)
        {
            setText(null);
            setGraphic(null);
            return;
        }
        shipModule.prepareGraphic();
        setGraphic(shipModule.getGraphic());
    }
}
