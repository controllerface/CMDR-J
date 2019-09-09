/**
 * Created by Controllerface on 3/6/2018.
 */
package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.classes.WindowDimensions;
import com.controllerface.cmdr_j.ui.UIController;
import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class CommanderJ extends Application
{
    private UIController controller;

    private double x = 0;
    private double y = 0;
    private double width = 0;
    private double height = 0;

    private AtomicBoolean isInitialized = new AtomicBoolean(false);

    private Parent loadRoot()
    {
        try
        {
            InputStream file = getClass().getResourceAsStream("/cmdrj.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent parent = fxmlLoader.load(file);
            controller = fxmlLoader.getController();
            return parent;
        }
        catch (IOException e)
        {
            throw new RuntimeException("Could not start Commander J", e);
        }
    }



    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("CMDR J");

        AtomicReference<WindowDimensions> dimensions = new AtomicReference<>();

        primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST,
                (e) ->
                {
                    x = primaryStage.getX();
                    y = primaryStage.getY();
                    width = primaryStage.getWidth();
                    height = primaryStage.getHeight();
                });

        Parent root = loadRoot();
        root.getStyleClass().add("main");
        String cssFile = CommanderJ.class.getResource("/cmdrj.css").toExternalForm();
        System.out.println(cssFile);
        Scene scene = new Scene(root);
        root.getStylesheets().add(cssFile);
        primaryStage.setScene(scene);


        /*
        TODO: maybe tie refresh to a button/settign menu, etc. Just remember the CSS file has to be CHANGED and
          then changed back fro JavaFX to notice it. May need a "dummy" file or something just for this.
        AtomicBoolean x = new AtomicBoolean(false);
        scene.addEventHandler(KeyEvent.KEY_PRESSED, t ->
        {
            if(t.getCode()== KeyCode.F5)
            {
                System.out.println("F5 pressed");

                String cssFile2;
                if (x.get())
                {
                    cssFile2 = CommanderJ.class.getResource("/cmdrj2.css").toExternalForm();
                    x.set(false);
                }
                else
                {
                    cssFile2 = CommanderJ.class.getResource("/cmdrj.css").toExternalForm();
                    x.set(true);
                }

                root.getStylesheets().clear();
                root.getStylesheets().add(cssFile2);
            }
        });
        */


        dimensions.set(controller.showVisuals());

        primaryStage.show();

        primaryStage.setX(-10000);
        primaryStage.setY(-10000);

        controller.setInitialLoadCallback((s)->
        {
            notifyPreloader(new Preloader.ProgressNotification(s));

            if (s >= 1.0d && !isInitialized.get())
            {
                notifyPreloader(new Preloader.StateChangeNotification(Preloader.StateChangeNotification.Type.BEFORE_LOAD));
                primaryStage.setX(dimensions.get().getX());
                primaryStage.setY(dimensions.get().getY());
                primaryStage.setWidth(dimensions.get().getWidth());
                primaryStage.setHeight(dimensions.get().getHeight());
                isInitialized.set(true);
            }
        });
    }

    @Override
    public void stop() throws Exception
    {
        super.stop();

        WindowDimensions windowDimensions = WindowDimensions.builder()
                .setX(x)
                .setY(y)
                .setWidth(width)
                .setHeight(height)
                .build();

        controller.stop(windowDimensions);
    }

    public static void main(String[] args)
    {
        System.out.println("Wrong entry point");
        System.exit(0);
    }
}
