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
public class IceController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Ice";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleAmauraButtonAction(MouseEvent event){

        saveAndSwitch(type, "Amaura.png");
    }
    
    @FXML
    public void handleGlaceonButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Glaceon.png");
    }
    
    @FXML
    public void handleJynxButtonAction(MouseEvent event){
       
        saveAndSwitch(type, "jynx.png");
    }
    
    @FXML
    public void handleLaprasButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Lapras copy.png");
    }
    
    @FXML
    public void handleSmoochumButtonAction(MouseEvent event){

        saveAndSwitch(type, "Smoochum.png");
    }
    
    @FXML
    public void handleSneaselButtonAction(MouseEvent event){

        saveAndSwitch(type, "sneasel copy.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
