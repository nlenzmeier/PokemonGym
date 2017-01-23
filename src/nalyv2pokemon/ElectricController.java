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
public class ElectricController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Electric";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleDedenneButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "dedenne.png");
    }
    
    @FXML
    public void handleElekidButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "elekid.png");
    }
    
    @FXML
    public void handleJolteonButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "jolteon.png");
    }
    
    @FXML
    public void handlePachirisuButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Pachirisu.png");
    }
    
    @FXML
    public void handlePikachuButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "pikachu.png");
    }
    
    @FXML
    public void handleShinxButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "shinx.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
