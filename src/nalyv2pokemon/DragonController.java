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
public class DragonController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Dragon";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleAxewButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "axew.png");
    }
    
    @FXML
    public void handleBagonButtonAction(MouseEvent event){
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        saveAndSwitch(type, "Bagon.png");
    }
    
    @FXML
    public void handleDratiniButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "dratini.png");
    }
    
    @FXML
    public void handleGibleButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Gible.png");
    }
    
    @FXML
    public void handleGoomyButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "goomy.png");
    }
    
    @FXML
    public void handleNoibatButtonAction(MouseEvent event){
        
        saveAndSwitch(type, "Noibat.png");
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
