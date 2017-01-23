/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;


/**
 * FXML Controller class
 *
 * @author Nicolle
 */
public class TypeController implements Initializable {

    /**
     * Initializes the controller class.
     */
//    
//    @FXML
//    private VBox root;
//    
//    @FXML
//    private ImageView mainScreen;
//    
//    @FXML
//    private Label label;
//    
//    @FXML 
//    private javafx.scene.control.Button waterButton;
//    
//   @FXML 
//    private javafx.scene.control.Button psychicButton; 
    
    
    @FXML
    private void handleWater(ActionEvent event) throws IOException{
        DisplayController.data.pokemon = "water";
        Switch.switchTo("Water");

    }
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        //DisplayController.data.type = "type";
        Switch.switchTo("Display");
    }
    
    @FXML
    private void handlePsychic(ActionEvent event) throws IOException{
        DisplayController.data.type = "psychic";
        Switch.switchTo("Psychic");
        
    }

    
    @FXML
    private void handleFire(ActionEvent event) throws IOException{
        DisplayController.data.type = "fire";
        Switch.switchTo("Fire");
        
    }
    @FXML
    private void handleGrass(ActionEvent event) throws IOException{
        DisplayController.data.type = "grass";
        Switch.switchTo("Grass");
        
    }
    
    @FXML
    private void handleDragon(ActionEvent event) throws IOException{
        DisplayController.data.type = "dragon";
        Switch.switchTo("Dragon");   
    }
    
    @FXML
    private void handleGhost(ActionEvent event) throws IOException{
        DisplayController.data.type = "ghost";
        Switch.switchTo("Ghost");   
    }
    
    @FXML
    private void handleGround(ActionEvent event) throws IOException{
        DisplayController.data.type = "ground";
        Switch.switchTo("Ground");   
    }
    
    @FXML
    private void handleIce(ActionEvent event) throws IOException{
        DisplayController.data.type = "type";
        Switch.switchTo("Ice");   
    }
    
    @FXML
    private void handleFighting(ActionEvent event) throws IOException{
        DisplayController.data.type = "type";
        Switch.switchTo("Fighting");   
    }
    
    @FXML
    private void handleFairy(ActionEvent event) throws IOException{
        DisplayController.data.type = "fairy";
        Switch.switchTo("Fairy");   
    }
    
    @FXML
    private void handlePoison(ActionEvent event) throws IOException{
        DisplayController.data.type = "poison";
        Switch.switchTo("Poison");   
    }
    
    @FXML
    private void handleSteel(ActionEvent event) throws IOException{
        DisplayController.data.type = "steel";
        Switch.switchTo("Steel");   
    }
    
    @FXML
    private void handleBug(ActionEvent event) throws IOException{
        DisplayController.data.type = "bug";
        Switch.switchTo("Bug");   
    }
    
    @FXML
    private void handleDark(ActionEvent event) throws IOException{
        DisplayController.data.type = "dark";
        Switch.switchTo("Dark");   
    }
    
    @FXML
    private void handleElectric(ActionEvent event) throws IOException{
        DisplayController.data.type = "electric";
        Switch.switchTo("Electric");   
    }
    
    @FXML
    private void handleFlying(ActionEvent event) throws IOException{
        DisplayController.data.type = "flying";
        Switch.switchTo("Flying");   
    }
    
    @FXML
    private void handleNormal(ActionEvent event) throws IOException{
        DisplayController.data.type = "normal";
        Switch.switchTo("Normal");   
    }
    
    @FXML
    private void handleRock(ActionEvent event) throws IOException{
        DisplayController.data.type = "rock";
        Switch.switchTo("Rock");   
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
       

