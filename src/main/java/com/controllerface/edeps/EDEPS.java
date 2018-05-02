/**
 * Created by Stephen on 3/6/2018.
 */
package com.controllerface.edeps;

import com.controllerface.edeps.ui.UIController;
import javafx.application.Application;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.io.InputStream;

public class EDEPS extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    UIController controller;

    private Parent loadRoot()
    {
        try
        {
            InputStream file = getClass().getResourceAsStream("/edeps.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent parent = fxmlLoader.load(file);
            controller = fxmlLoader.getController();
            return parent;
        }
        catch (IOException e)
        {
            throw new RuntimeException("Could not start EDEPS", e);
        }
    }

    @Override
    public void start(Stage primaryStage)
    {
        Parent root = loadRoot();
        root.getStyleClass().add("main");

        Scene scene = new Scene(root);

        // todo: play with this later
        //scene.getStylesheets().add("/edeps.css");

        primaryStage.setTitle("Elite Dangerous Engineering Procurement System");
        primaryStage.setScene(scene);
        primaryStage.show();

        primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST,
                (e)->
                {
                    System.out.println("X:"+primaryStage.getX());
                    System.out.println("Y:"+primaryStage.getY());
                    System.out.println("H:"+primaryStage.getHeight());
                    System.out.println("W:"+primaryStage.getWidth());

                });

    }

    @Override
    public void stop() throws Exception
    {
        super.stop();
        controller.stop();
    }
}
