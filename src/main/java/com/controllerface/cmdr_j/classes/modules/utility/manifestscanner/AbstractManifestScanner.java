package com.controllerface.cmdr_j.classes.modules.utility.manifestscanner;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.modules.AbstractModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

public abstract class AbstractManifestScanner extends AbstractModule
{
    public AbstractManifestScanner(String displayText, ItemEffects itemEffects)
    {
        super("Manifest Scanner", ModificationType.Manifest_Scanner, itemEffects);
    }
}
