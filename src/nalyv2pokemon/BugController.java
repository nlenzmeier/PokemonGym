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
public class BugController extends PokemonController implements Initializable {

    String type = "Bug";
    
    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void handleVenonatButtonAction(MouseEvent event){
        saveAndSwitch(type, "Venonat.png");
    }
    
    @FXML
    public void handleCaterpieButtonAction(MouseEvent event){
        saveAndSwitch(type, "Caterpie.png");
    }
    
    @FXML
    public void handleHeracrossButtonAction(MouseEvent event){
        saveAndSwitch(type, "Heracross.png");
    }
    
    @FXML
    public void handleParasButtonAction(MouseEvent event){
        saveAndSwitch(type, "paras.png");
    }
    
    @FXML
    public void handlePinserButtonAction(MouseEvent event){
        saveAndSwitch(type, "pinser.png");
    }
    
    @FXML
    public void handleScytherButtonAction(MouseEvent event){
        saveAndSwitch(type, "scyther.png");
    }
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        //DisplayController.data.type = "type";
        Switch.switchTo("Type");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
