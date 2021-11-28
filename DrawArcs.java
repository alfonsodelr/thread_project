package thread_project;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class DrawArcs extends Pane{
    
    private float startAngle = 0.0f;
    
    DrawArcs(){
        paintArc();
    }
    
    public void setAngle(float x){
        this.startAngle = x;
        paintArc();
    }
    
    protected void paintArc(){
        
        Arc arc1 = new Arc();
        Arc arc2 = new Arc();
        Arc arc3 = new Arc();
        
        arc1.setType(ArcType.ROUND);
        arc2.setType(ArcType.ROUND);
        arc3.setType(ArcType.ROUND);
        
        arc1.setCenterX(125.0f); 
        arc1.setCenterY(125.0f); 
        arc1.setRadiusX(90.0f); 
        arc1.setRadiusY(90.0f); 
        arc1.setStartAngle(startAngle); 
        arc1.setLength(60.0f);
        
        arc2.setCenterX(125.0f); 
        arc2.setCenterY(125.0f); 
        arc2.setRadiusX(90.0f); 
        arc2.setRadiusY(90.0f); 
        arc2.setStartAngle(startAngle + 120.0f); 
        arc2.setLength(60.0f);
        
        arc3.setCenterX(125.0f); 
        arc3.setCenterY(125.0f); 
        arc3.setRadiusX(90.0f); 
        arc3.setRadiusY(90.0f); 
        arc3.setStartAngle(startAngle + 240.0f); 
        arc3.setLength(60.0f);
        
        getChildren().clear();
        getChildren().addAll(arc1,arc2,arc3);
        
    }
}
