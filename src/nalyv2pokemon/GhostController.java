/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Nicolle
 */
public class GhostController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Ghost";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleGastlyButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "gastly.png");
    }
    
    @FXML
    public void handleHonedgeButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Honedge.png");
    }
    
    @FXML
    public void handlePhantumpButtonAction(MouseEvent event){
       
        saveAndSwitch(type, "Phantump.png");
    }
    
    @FXML
    public void handlePumpkabooButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Pumpkaboo copy.png");
    }
    
    @FXML
    public void handleSableyeButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Sableye.png");
    }
    
    @FXML
    public void handleShuppetButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Shuppet.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
