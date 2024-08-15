package org.example.fxscenebuilder2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene=new Scene(fxmlLoader.load());
        //Apply style sheet more than one scene
        String css = this.getClass().getResource("application.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}