/**
 * Created by Controllerface on 3/6/2018.
 */
package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.data.WindowDimensions;
import com.controllerface.cmdr_j.ui.UIController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class CommanderJ extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    UIController controller;

    volatile double x = 0;
    volatile double y = 0;
    volatile double width = 0;
    volatile double height = 0;

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
        CountDownLatch showLatch = new CountDownLatch(1);

        primaryStage.addEventHandler(WindowEvent.WINDOW_SHOWN,
                (e) ->
                {
                    dimensions.set(controller.showVisuals());
                    showLatch.countDown();
                });

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
        Scene scene = new Scene(root);
        //scene.getStylesheets().add("/cmdr_j.css"); todo: play with this later
        primaryStage.setScene(scene);
        primaryStage.show();

        try
        {
            showLatch.await();
            primaryStage.setX(dimensions.get().getX());
            primaryStage.setY(dimensions.get().getY());
            primaryStage.setWidth(dimensions.get().getWidth());
            primaryStage.setHeight(dimensions.get().getHeight());
            System.out.println("shown!");


        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

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

}
