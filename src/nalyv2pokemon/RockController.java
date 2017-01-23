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
public class RockController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Rock";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleAmauraButtonAction(MouseEvent event){

        saveAndSwitch(type, "Amaura copy.png");
    }
    
    @FXML
    public void handleCarbinkButtonAction(MouseEvent event){

        saveAndSwitch(type, "Carbink copy.png");
    }
    
    @FXML
    public void handleGeodudeButtonAction(MouseEvent event){

        saveAndSwitch(type, "Geodude copy.png");
    }
    
    @FXML
    public void handleOnixButtonAction(MouseEvent event){

        saveAndSwitch(type, "onix copy.png");
    }
    
    @FXML
    public void handleRhyhornButtonAction(MouseEvent event){

        saveAndSwitch(type, "rhyhorn.png");
    }
    
    @FXML
    public void handleSudowoodoButtonAction(MouseEvent event){

        saveAndSwitch(type, "sudowoodo.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
