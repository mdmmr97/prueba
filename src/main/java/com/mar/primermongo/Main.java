package com.mar.primermongo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        try{
            InputStream input = this.getClass().getClassLoader().getResourceAsStream("setting.properties");
            Properties prop = new Properties();
            prop.load(input);
            System.out.println(prop.getProperty("URL_MONGO"));
        }
        catch (Exception e){

        }
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}