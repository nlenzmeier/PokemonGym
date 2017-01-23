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
public class FairyController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Fairy";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleAzumarillButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "azumarill copy.png");
    }
    
    @FXML
    public void handleCarbinkButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Carbink.png");
    }
    
    @FXML
    public void handleClefairyButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Clefairy.png");
    }
    
    @FXML
    public void handleJigglypuffButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "jigglypuff.png");
    }
    
    @FXML
    public void handleSylvionButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "sylvion.png");
    }
    
    @FXML
    public void handleTogepiButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "togepi.png");
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
