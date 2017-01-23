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
public class SteelController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Steel";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleAronButtonAction(MouseEvent event){

        saveAndSwitch(type, "Aron.png"); 
    }
    
    @FXML
    public void handleBelbumButtonAction(MouseEvent event){

        saveAndSwitch(type, "belbum.png"); 
    }
    
    @FXML
    public void handleHonedgeButtonAction(MouseEvent event){

        saveAndSwitch(type, "Honedge copy.png"); 
    }
    
    @FXML
    public void handleMagnemiteButtonAction(MouseEvent event){

        saveAndSwitch(type, "magnemite.png"); 
    }
    
    @FXML
    public void handleMawileButtonAction(MouseEvent event){

        saveAndSwitch(type, "Mawile.png"); 
    }
    
    @FXML
    public void handleShieldonButtonAction(MouseEvent event){

        saveAndSwitch(type, "Shieldon.png"); 
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
