
package pathtransitioninanimation;


import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author crist
 */
public class PathTransitionInAnimation extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        //Creo Pane y Scene
        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 300);
        
        // Creo el circulo
        Circle circle = new Circle(150, 150, 80);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
                
        // Cro el rectangulo
        Rectangle rect = new Rectangle(100, 40,60, 30);
        rect.setFill(Color.YELLOW);
        rect.setScaleX(0.5);
        rect.setScaleY(2);             
                
        // Añado el circulo y el rectangulo a Pane
        root.getChildren().add(circle);
        root.getChildren().add(rect);
                
        // PathTransition y configuracion
        //Movimiento a lo largo de una ruta con variables de traslado y rotacion
        PathTransition path = new PathTransition(); 
        path.setDuration(new Duration(4000)); 
        path.setPath(circle);        
        path.setNode(rect); 
        path.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);  
        path.setCycleCount(Timeline.INDEFINITE);
        path.play();
        
        // Eventos
        circle.setOnMousePressed(e->path.pause()); 
        circle.setOnMouseReleased(e->path.play());
        
        primaryStage.setTitle("PathTransitionInAnimation");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
