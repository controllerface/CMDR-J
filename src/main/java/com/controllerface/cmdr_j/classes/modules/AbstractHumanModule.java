package com.controllerface.cmdr_j.classes.modules;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.Collections;
import java.util.List;

public abstract class AbstractHumanModule extends AbstractModule
{
    public AbstractHumanModule(String displayText, ItemEffects itemEffects)
    {
        super(displayText, itemEffects);
    }

    @Override
    public List<Icon> icons()
    {
        return Collections.singletonList(UIFunctions.Icons.aegisIcon);
    }
}
