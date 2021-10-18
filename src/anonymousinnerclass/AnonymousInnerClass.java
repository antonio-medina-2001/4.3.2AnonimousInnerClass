/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousInnerClass extends Application {
     @Override
    public void start(Stage primaryStage) {
        BorderPane panel = new BorderPane();
        
        Scene scene = new Scene(panel, 400, 150);
        
        HBox contenedorBotones = new HBox(25);
        panel.setCenter(contenedorBotones);    
        contenedorBotones.setAlignment(Pos.CENTER);
       
        // Creamos los botones
        Button btnNew = new Button("New");
        btnNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo proceso.");
            }
        });
        
        Button btnOpen = new Button("Open");
        btnOpen.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir proceso.");
            }
        });
        
        Button btnSave = new Button("Save");
        btnSave.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar proceso.");
            }
        });
        
        Button btnPrint = new Button("Print");
        btnPrint.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir proceso.");
            }
        });
        
        
        // Los añadimos el contenedor de botones
        contenedorBotones.getChildren().addAll(btnNew, btnOpen, btnSave, btnPrint);
        
        primaryStage.setTitle("InnerClassCirculo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
