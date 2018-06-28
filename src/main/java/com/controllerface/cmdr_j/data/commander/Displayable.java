package com.controllerface.cmdr_j.data.commander;

import javafx.scene.Node;

/**
 * Denotes an object that is "Displayable" in a GUI by virtue of maintaining a graphical representation of itself and
 * makes that graphic available for use in a JavaFX UI application.
 *
 * Created by Stephen on 6/25/2018.
 */
public interface Displayable
{
    /**
     * Gets the graphical representation of the object
     *
     * @return a JavaFX {@linkplain Node} containing a graphical representation of the object
     */
    Node getGraphic();

    /**
     * Used to signal to the implementation that a display update is about to occur. For mutable objects, this allows
     * the implementation to ensure the graphical representation is up to date. For Immutable objects, this may be a
     * no-op.
     */
    void prepareGraphic();
}
