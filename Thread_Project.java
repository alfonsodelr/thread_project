package thread_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.Group;

public class Thread_Project extends Application {
    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
        
        HBox grid = new HBox();
        
        Handler one = new Handler("California");
        Handler two = new Handler("Korea");
        Handler three = new Handler("Hawaii");
        Handler four = new Handler("China");
        
        grid.getChildren().addAll(one,two,three,four); //add Handlers here
        root.getChildren().addAll(grid);
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Thread Project"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}


