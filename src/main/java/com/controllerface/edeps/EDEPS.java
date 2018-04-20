/**
 * Created by Stephen on 3/6/2018.
 */
package com.controllerface.edeps;

import com.controllerface.edeps.ui.UIController;
import com.oracle.jrockit.jfr.Producer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        //primaryStage.setResizable(false);
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception
    {
        super.stop();
        controller.stop();
    }
}
