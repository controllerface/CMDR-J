package com.controllerface.cmdr_j.classes.data;

public class Pair<T, U>
{
    private final T t;
    private final U u;

    public Pair(T t, U u)
    {
        this.t = t;
        this.u = u;
    }

    public T getKey()
    {
        return t;
    }

    public U getValue()
    {
        return u;
    }
}
