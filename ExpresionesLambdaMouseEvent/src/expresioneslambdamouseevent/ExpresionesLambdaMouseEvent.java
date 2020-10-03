/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresioneslambdamouseevent;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


/**
 *
 * @author crist
 */
public class ExpresionesLambdaMouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Text texto = new Text("Llevame de Paseo");
      
            texto.setTranslateX(90);
            texto.setTranslateY(70);
        //texto.setTextAlignment(TextAlignment.CENTER);
        
        //Manejador de Eventos
        texto.setOnMouseDragged(event ->{
            
            texto.setTranslateX(event.getX());
            texto.setTranslateY(event.getY());
            
        });
        
        
        Pane root = new Pane();
        root.getChildren().add(texto);
        
        Scene scene = new Scene(root, 300, 200);
        
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
