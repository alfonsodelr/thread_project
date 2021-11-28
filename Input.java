
package thread_project;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Input extends GridPane{
    
    private String startTime = "";
    private String endTime = "";
    private Button start;
    private TextField sTime;
    private TextField eTime;
    
    public TextField getStimeButton(){
        return sTime;
    }
    
    public TextField getEtimeButton(){
        return eTime;
    }
    
    public Input(){
        drawInput();
    }
    
    public String getStartTime(){
        return startTime;
    }
    
  
    public Button getStart(){
        return start;
    }
    

    public void drawInput() {
        
        setPadding(new Insets(10, 10, 10, 10));
        setVgap(5);
        setHgap(5);
        
        sTime = new TextField();
        sTime.setPromptText("Start Time(HH:MM:SS):");
        sTime.setPrefColumnCount(10);
        sTime.getText();
        GridPane.setConstraints(sTime, 0, 0);
        getChildren().add(sTime);
       
        eTime = new TextField();
        eTime.setPromptText("End Time(HH:MM:SS):");
        GridPane.setConstraints(eTime, 0, 1);
        getChildren().add(eTime);
        
        Button fStart = new Button("Force Start");
        GridPane.setConstraints(fStart, 1, 0);
        getChildren().add(fStart);

        Button fstop = new Button("Force Stop");
        GridPane.setConstraints(fstop, 1, 1);
        getChildren().add(fstop);

        start = new Button("Start");
        GridPane.setConstraints(start, 1, 2);
        getChildren().add(start);
        
        
    }
    
}
