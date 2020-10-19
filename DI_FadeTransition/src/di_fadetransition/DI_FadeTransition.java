/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_fadetransition;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author crist
 */
public class DI_FadeTransition extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
        // Creo Pane y Scene
        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 400);
     
        // Creo Elipse
        Ellipse elipse = new Ellipse(150, 150, 100, 70);
        elipse.setFill(Color.RED);
        root.getChildren().add(elipse);
        
        // FadeTransition y diseño
        //Cambia de opacidad durante un tiempo determinado
        FadeTransition fade = new FadeTransition();
        fade.setDuration(new Duration(3000));
        fade.setNode(elipse);
        fade.setFromValue(1.0); 
        fade.setToValue(0.1);
        fade.setCycleCount(Timeline.INDEFINITE);
        fade.setAutoReverse(true);
        fade.play();//Start animation
        
        // Control de Eventos
        elipse.setOnMousePressed(e->fade.pause()); 
        elipse.setOnMouseReleased(e->fade.play());
        
        primaryStage.setTitle("FadeTransition");
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
