package com.controllerface.edeps;

/**
 * Represents a procedure call that con be provided to a class, to be called at some later state, to
 * allow the caller to signal the provider of the procedure that some event has occurred.
 *
 * This method intentionally takes no arguments and returns no value. It is useful solely as a callback
 * mechanism whereby some class (A) creates an instance of some other class (B) and A wishes to provide
 * B with a simple signaling mechanism that does not require B to have any knowledge of A.
 *
 * Created by Stephen on 4/13/2018.
 */
@FunctionalInterface
public interface Procedure
{
    void call();
}
