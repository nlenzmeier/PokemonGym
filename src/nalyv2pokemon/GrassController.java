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
public class GrassController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Grass";
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleSceptileButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "sceptile.png");
    }
    
    @FXML
    public void handleChespinButtonAction(MouseEvent event){
       
        saveAndSwitch(type, "chespin.png");
    }
    
    @FXML
    public void handlePhantumpButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Phantump copy.png");
    }
    
    @FXML
    public void handleBulbasaurButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Bulbasaur.png");
    }
    
    @FXML
    public void handlePumpkabooButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Pumpkaboo.png");
    }
    
    @FXML
    public void handleChikoritaButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Chikorita.png");
    }
    
    
}
