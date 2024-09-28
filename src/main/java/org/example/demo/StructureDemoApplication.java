package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class StructureDemoApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(StructureDemoApplication.class.getResource("structuredemo-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 400);

        // https://www.flaticon.com/free-icons/fairy-tale
        Image icon = new Image(String.valueOf(StructureDemoApplication.class.getResource("dragon.png")));
        stage.getIcons().add(icon);

        stage.setTitle("Structure Demo for Revision Parser");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}