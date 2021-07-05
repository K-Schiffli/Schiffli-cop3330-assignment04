package Assignment04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ToDoLists extends Application {

    public static void main(String[] args) {

        //Create a new instance of the ListHandler class

        //Launch the GUI window
        launch(args);
    }

    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("ToDoLists.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ToDo Lists");
        primaryStage.show();
    }
}
