package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the initial view (LoginView.fxml)
        FXMLLoader loader = new FXMLLoader(getClass().getResource("view/loginView.fxml"));
        Parent root = loader.load();
        // Configure the primary stage
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(root, 520, 400));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
