package com.controllerface.cmdr_j;

import javafx.application.Preloader;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Preloaderj extends Preloader
{
    ProgressBar bar;
    Stage stage;

    private Scene createPreloaderScene()
    {
        bar = new ProgressBar();
        BorderPane p = new BorderPane();
        p.setCenter(bar);
        return new Scene(p, 300, 150);
    }

    public void start(Stage stage) throws Exception
    {
        this.stage = stage;
        stage.setScene(createPreloaderScene());
        stage.show();
    }

    @Override
    public void handleProgressNotification(javafx.application.Preloader.ProgressNotification pn)
    {
        System.out.println("DEBUG 2: " + pn.getProgress());
        bar.setProgress(pn.getProgress());
    }

    @Override
    public void handleStateChangeNotification(javafx.application.Preloader.StateChangeNotification evt)
    {
        System.out.println("DEBUG 1: " + evt);
        if (evt.getType() == javafx.application.Preloader.StateChangeNotification.Type.BEFORE_START)
        {
           // stage.hide();
        }
    }

    @Override
    public void handleApplicationNotification(PreloaderNotification info)
    {
        System.out.println("DEBUG 3: " + ((StateChangeNotification) info).getType());
        stage.hide();
    }
}