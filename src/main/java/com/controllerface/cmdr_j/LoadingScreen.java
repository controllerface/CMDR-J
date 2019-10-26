package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Preloader;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.css.PseudoClass;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Separator;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class LoadingScreen extends Preloader
{
    ProgressBar bar;
    Stage stage;
    Label loadingMessage;
    private Scene createPreloaderScene()
    {
        bar = new ProgressBar();
        BorderPane p = new BorderPane();

        Label windowMessage = new Label("Starting CMDR J");
        windowMessage.paddingProperty().setValue(new Insets(5,0,0,5));

        loadingMessage = new Label("Initializing UI Components ...");
        loadingMessage.paddingProperty().setValue(new Insets(0,0,5,0));

        VBox vBox = new VBox();
        vBox.alignmentProperty().setValue(Pos.CENTER);
        vBox.getChildren().add(loadingMessage);
        vBox.getChildren().add(bar);

        p.setTop(windowMessage);
        p.setCenter(vBox);
        bar.setPrefWidth(250);
        bar.setProgress(.25);

        String styleFile = getClass().getResource("/loading_screen.css").toExternalForm();
        vBox.getStylesheets().add(styleFile);

        return new Scene(p, 300, 100);
    }

    public void start(Stage stage) throws Exception
    {
        this.stage = stage;
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(createPreloaderScene());
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/cmdrj_icon.png")));
        stage.show();
    }

    @Override
    public void handleProgressNotification(javafx.application.Preloader.ProgressNotification pn)
    {
        bar.setProgress(.5);
    }

    @Override
    public void handleApplicationNotification(PreloaderNotification info)
    {
        loadingMessage.setText("Reading Journal Data ...");
        if (info instanceof ProgressNotification)
        {
            double progress = ((ProgressNotification) info).getProgress();
            progress = UIFunctions.Data.mapRange(progress,0,1,.5,1);
            bar.setProgress(progress);
        }
        else stage.hide();
    }

    public static void main(String[] args)
    {
        System.out.println("Wrong entry point");
        System.exit(0);
    }
}