package com.controllerface.cmdr_j;

import com.sun.javafx.application.LauncherImpl;

public class Main
{
    public static void main(String[] args)
    {
        LauncherImpl.launchApplication(CommanderJ.class, LoadingScreen.class, args);
    }
}
