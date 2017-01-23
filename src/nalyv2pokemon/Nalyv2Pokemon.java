/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Nicolle
 */
public class Nalyv2Pokemon extends Application {
    
//    @Override
//    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("Display.fxml"));
//        
//        Scene scene = new Scene(root);
//        
//        stage.setScene(scene);
//        stage.show();
//    }
        @Override
    public void start(Stage stage) throws Exception {
        
        // UI if SceneManager can't switch to a Scene
        //HBox root = new HBox();
//        root.setPrefSize(600, 400);
//        root.setAlignment(Pos.CENTER);
//        Text message = new Text("I am a failure!");
//        message.setFont(Font.font(STYLESHEET_MODENA, 32));
//        root.getChildren().add(message);

           Switch.stage = stage;
           Switch.switchTo("Display");

//        Parent root = FXMLLoader.load(getClass().getResource("Display.fxml"));
//        
//        // create Scene and init UI to show failure in case switch fails
//        Scene scene = new Scene(root);
//        
//        Switch.scene = scene;
//        //Switch.switchTo("Type");
//        
//        stage.setScene(scene);
//        stage.show();
        
//        Scene ascene = new Scene(root);
//        Switch.scene = ascene;
//        Switch.switchTo("About");
//        
//        stage.setScene(ascene);
//        stage.show();
        
    }
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
