/**
 * Created by Controllerface on 3/6/2018.
 */
package com.controllerface.cmdr_j.ui;

import com.controllerface.cmdr_j.classes.WindowDimensions;
import javafx.application.Application;
import javafx.application.Preloader;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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

    // OS tray icon support is not strictly needed, but could be helpful from a UX perspective for
    //  some tasks. Originally, I was planning to use the "toast" notifications when a task was marked
    //  "completed", but never wired it up. It is disabled here though, because it is not currently
    //  supported when compiling a native binary. Any use of AWT classes prevents an app from compiling
    //  to a native binary.
//    public static TrayIcon trayIcon = new TrayIcon(Toolkit.getDefaultToolkit()
//            .createImage(CommanderJ.class.getResource("/com/controllerface/cmdr_j/cmdrj_icon.png")), "Commander J");


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
    public void start(Stage primaryStage) throws IOException
    {

// disabled for now because of AWT
//        try
//        {
//
//            trayIcon.setImageAutoSize(true);
//            //trayIcon.addActionListener(e -> System.out.println("Did a thing? " + e));
//            SystemTray.getSystemTray().add(trayIcon);
//            //trayIcon.displayMessage("Commander J", "Starting up..", TrayIcon.MessageType.INFO);
//        }
//        catch (AWTException e)
//        {
//            e.printStackTrace();
//        }

        // todo: add UI menu to control this? probably set a minimum to avoid losing the window completely
        //primaryStage.setOpacity(0.5);

        primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("/cmdrj_icon.png")));
        AtomicReference<WindowDimensions> dimensions = new AtomicReference<>();

        Parent root = loadRoot();
        root.getStyleClass().add("main");
        String cssFile = CommanderJ.class.getResource("/cmdrj.css").toExternalForm();
        Scene scene = new Scene(root,100,100, true, SceneAntialiasing.BALANCED);
        //Scene scene = new Scene(root);
        root.getStylesheets().add(cssFile);
        primaryStage.setScene(scene);

        primaryStage.xProperty().addListener((obs, oldVal, newVal) ->
        {
            x = newVal.doubleValue();
        });

        primaryStage.yProperty().addListener((obs, oldVal, newVal) ->
        {
            y = newVal.doubleValue();
        });

        primaryStage.widthProperty().addListener((obs, oldVal, newVal) ->
        {
            width = newVal.doubleValue();
        });

        primaryStage.heightProperty().addListener((obs, oldVal, newVal) ->
        {
            height = newVal.doubleValue();
        });

        /*
        TODO: maybe tie refresh to a button/setting menu, etc. Just remember the CSS file has to be CHANGED and
          then changed back for JavaFX to notice it. May need to write a temp "dummy" file just for this.
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
                if (dimensions.get() == null)
                {
                    primaryStage.setX(0);
                    primaryStage.setY(0);
                }
                else
                {
                    primaryStage.setX(dimensions.get().getX());
                    primaryStage.setY(dimensions.get().getY());
                    primaryStage.setWidth(dimensions.get().getWidth());
                    primaryStage.setHeight(dimensions.get().getHeight());
                }
                isInitialized.set(true);

                // disabled for now because of AWT
                //trayIcon.displayMessage("Commander J", "Started", TrayIcon.MessageType.INFO);
            }
        });
    }

    @Override
    public void stop() throws Exception
    {
        super.stop();

        // disabled for now because of AWT
        //SystemTray.getSystemTray().remove(trayIcon);

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
        launch(args);
    }
}
