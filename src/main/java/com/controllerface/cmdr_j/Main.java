package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.ui.CommanderJ;
import com.controllerface.cmdr_j.ui.LoadingScreen;
import javafx.application.Application;

public class Main
{
    public static void main(String[] args)
    {
        System.setProperty("javafx.preloader", LoadingScreen.class.getCanonicalName());
        Application.launch(CommanderJ.class, LoadingScreen.class.getCanonicalName());
    }
}
