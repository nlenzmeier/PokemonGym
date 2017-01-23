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
public class DarkController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Dark";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleMurkrowButtonAction(MouseEvent event){
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        saveAndSwitch(type, "murkrow.png");
    }
    
    @FXML
    public void handlePoochyenaButtonAction(MouseEvent event){
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        saveAndSwitch(type, "poochyena.png");
    }
    
    @FXML
    public void handlePurrloinButtonAction(MouseEvent event){
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        saveAndSwitch(type, "Purrloin.png");
    }
    
    @FXML
    public void handleSneaselButtonAction(MouseEvent event){
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        saveAndSwitch(type, "sneasel.png");
    }
    
    @FXML
    public void handleUmbreonButtonAction(MouseEvent event){
        saveAndSwitch(type, "umbreon.png");
    }
    
    @FXML
    public void handleZoruaButtonAction(MouseEvent event){
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        saveAndSwitch(type, "zorua.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
