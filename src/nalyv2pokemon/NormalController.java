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
public class NormalController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Normal";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleDittoButtonAction(MouseEvent event){

        saveAndSwitch(type, "ditto.png");
    }
    
    @FXML
    public void handleEveeButtonAction(MouseEvent event){

        saveAndSwitch(type, "evee.png");
    }
    
    @FXML
    public void handleFarfetchButtonAction(MouseEvent event){

        saveAndSwitch(type, "Farfetch'd.png");
    }
    
    @FXML
    public void handleJigglypuffButtonAction(MouseEvent event){

        saveAndSwitch(type, "jigglypuff.png");
    }
    
    @FXML
    public void handleMeowthButtonAction(MouseEvent event){

        saveAndSwitch(type, "meowth.png");
    }
    
    @FXML
    public void handleSnorlaxButtonAction(MouseEvent event){

        saveAndSwitch(type, "snorlax.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
