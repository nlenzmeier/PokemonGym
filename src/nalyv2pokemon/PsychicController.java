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
public class PsychicController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Psychic";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleMeowsticButtonAction(MouseEvent event){

       saveAndSwitch(type, "femaleMeowstic.png"); 
    }
    
    @FXML
    public void handleAbraButtonAction(MouseEvent event){

        saveAndSwitch(type, "abra.png");
    }
    
    @FXML
    public void handleSmoochumButtonAction(MouseEvent event){

        saveAndSwitch(type, "Smoochum copy.png");
    }
    
    @FXML
    public void handleCelebiButtonAction(MouseEvent event){

        saveAndSwitch(type, "Celebi copy.png");
    }
    
    @FXML
    public void handleEspeonButtonAction(MouseEvent event){

        saveAndSwitch(type, "espeon.png");
    }
    
    @FXML
    public void handleWobbuffetButtonAction(MouseEvent event){

        saveAndSwitch(type, "wobbuffet.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
}
