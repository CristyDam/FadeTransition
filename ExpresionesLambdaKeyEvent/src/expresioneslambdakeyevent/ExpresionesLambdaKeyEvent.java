/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresioneslambdakeyevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author crist
 */
public class ExpresionesLambdaKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
         
        Text texto = new Text(20, 20, "A");
     
     
        Pane root = new Pane();
        
        Scene scene = new Scene(root, 300, 150);
        
        root.getChildren().add(texto);
        
         scene.setOnKeyPressed(e -> {           
            switch(e.getCode())
            {
                case UP:
                    texto.setY(texto.getY() - 10);
                    break;
                case DOWN:
                    texto.setY(texto.getY() + 10);
                    break;
                case RIGHT:
                    texto.setX(texto.getX() + 10);
                    break;
                case LEFT:
                    texto.setX(texto.getX() - 10);
                    break;
                
                default:
                    
                    break;
            }            
        });
        
        primaryStage.setTitle("ExpresionesLambdaKeyEvent");
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
