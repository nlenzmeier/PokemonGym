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
public class FlyingController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Flying";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleZubatButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Zubat.png");
    }
    
    @FXML
    public void handleSwabluButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "swablu.png");
    }
    
    @FXML
    public void handleScytherButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Scyther.png");
    }
    
    @FXML
    public void handleNoibatButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Noibat copy.png");
    }
    
    @FXML
    public void handleMurkrowButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "murkrow copy.png");
    }
    
    @FXML
    public void handleDucklettButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Ducklett.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
