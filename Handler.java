package thread_project;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class Handler extends Pane{
    private StillClock clock;
    private DrawArcs fan;
    private Input field;
    boolean status = false;
    private String startTime = "";
    private String endTime = "";
    private int sHour = 0;
    private int sMinute = 0;
    private int sSecond = 0;
    private int eHour = 0;
    private int eMinute = 0;
    private int eSecond = 0;
    
    public Handler(String name){
        this.clock = new StillClock(0, 0, 0, name);
        this.fan = new DrawArcs();
        this.field = new Input();
        drawBox();
    }
    
    public StillClock getClock(){
        return clock;
    }
        public void setStartHour(int x){
        this.sHour = x;
    }
    public void setStartMinute(int x){
        this.sMinute = x;
    }
    public void setStartSecond(int x){
        this.sSecond = x;
    }
      public int getStartingHour(){
        return sHour;
     }
    public int getStartingMinute(){
        return sMinute;
    }
    public int getStartingSecond(){
        return sSecond;
    }
    public int getEndingHour(){
        return eHour;
    }
    public int getEndingMinute(){
        return eMinute;
    }
    public int getEndingSecond(){
        return eSecond;
    }

    public void loop(int hour, int minute, int second){
        clock.setNewTime(hour, minute, second);
    }
    
    protected void drawBox(){
        
        HBox pane1 = new HBox(10);
        pane1.setPadding(new Insets(0, 20, 20, 0));
        HBox pane2 = new HBox(10);
        pane2.setPadding(new Insets(0, 20, 20, 0));
        HBox pane3 = new HBox(10);
        pane3.setPadding(new Insets(0, 20, 20, 0));
        
        pane1.getChildren().addAll(clock);
        pane2.getChildren().addAll(fan);
        pane3.getChildren().addAll(field);
        
        pane2.setTranslateY(200);
        pane2.setTranslateX(10);
        pane3.setTranslateY(450);
        pane3.setTranslateX(10);
        
        getChildren().addAll(pane1,pane2,pane3);
        
        field.getStart().setOnAction((ActionEvent)->{
                startTime = field.getStimeButton().getText();
                endTime =  field.getEtimeButton().getText();
                
                String[] arr = startTime.split(":");
                sHour = Integer.parseInt(arr[0]);
                sMinute = Integer.parseInt(arr[1]);
                sSecond = Integer.parseInt(arr[2]);

                String[] arr2 = endTime.split(":");
                eHour = Integer.parseInt(arr2[0]);
                eMinute = Integer.parseInt(arr2[1]);
                eSecond = Integer.parseInt(arr2[2]);
                
                status = true;
                
                clock.setNewTime(sHour, sMinute, sSecond);
                
        });
        
        
        
    }
    
    
}
