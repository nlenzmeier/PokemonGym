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
public class FightingController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Fighting";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleHawluchaButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "hawlucha.png");
    }
    
    @FXML
    public void handleMachopButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "machop.png");
    }
    
    @FXML
    public void handleMakuhitaButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "makuhita.png");
    }
    
    @FXML
    public void handleMankeyButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "mankey.png");
    }
    
    @FXML
    public void handlePanchamButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "pancham.png");
    }
    
    @FXML
    public void handleRioluButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "riolu.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
