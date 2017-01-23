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
public class GroundController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Ground";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleCuboneButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Cubone.png");
    }
    
    @FXML
    public void handleDiglettButtonAction(MouseEvent event){
     
        saveAndSwitch(type, "Diglett.png");
    }
    
    @FXML
    public void handleGeodudeButtonAction(MouseEvent event){
       
        saveAndSwitch(type, "Geodude.png");
    }
    
    @FXML
    public void handleGibleButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Gible copy.png");
    }
    
    @FXML
    public void handleOnixButtonAction(MouseEvent event){

        saveAndSwitch(type, "onix.png");
    }
    
    @FXML
    public void handleSandshrewButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "sandshrew.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
