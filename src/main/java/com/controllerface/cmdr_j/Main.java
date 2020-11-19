package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.ui.CommanderJ;
import com.controllerface.cmdr_j.ui.LoadingScreen;
import javafx.application.Application;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        System.setProperty("javafx.preloader", LoadingScreen.class.getCanonicalName());
        Application.launch(CommanderJ.class, LoadingScreen.class.getCanonicalName());
    }
}
