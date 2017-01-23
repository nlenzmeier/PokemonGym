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
public class FireController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Fire";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleCharmanderButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "charmander.png");
    }
    
    @FXML
    public void handleFlareonButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Flareon.png");
    }
    
    @FXML
    public void handleTorchickButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "torchick.png");
    }
    
    @FXML
    public void handleVulpixButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "vulpix.png");
    }
    
    @FXML
    public void handleChimcharButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "chimchar.png");
    }
    
    @FXML
    public void handleFennekinButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "fennekin.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
