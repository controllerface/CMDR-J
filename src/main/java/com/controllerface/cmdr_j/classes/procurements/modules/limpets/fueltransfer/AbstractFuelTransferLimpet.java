package com.controllerface.cmdr_j.classes.procurements.modules.limpets.fueltransfer;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.procurements.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractFuelTransferLimpet extends AbstractModule
{
    public AbstractFuelTransferLimpet(String displayText, ItemEffects itemEffects)
    {
        super(displayText, ModificationType.Fuel_Transfer_Limpet, itemEffects);
    }
}
