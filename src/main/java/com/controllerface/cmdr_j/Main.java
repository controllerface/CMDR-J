package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.ui.CommanderJ;
import com.controllerface.cmdr_j.ui.LoadingScreen;
import com.sun.javafx.application.LauncherImpl;

public class Main
{
    public static void main(String[] args)
    {
        LauncherImpl.launchApplication(CommanderJ.class, LoadingScreen.class, args);
    }
}
