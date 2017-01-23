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
public class PoisonController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Poison";
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleEkansButtonAction(MouseEvent event){

        saveAndSwitch(type, "Ekans.png");
    }
    
    @FXML
    public void handleGastlyButtonAction(MouseEvent event){

        saveAndSwitch(type, "gastly copy.png");
    }
    
    @FXML
    public void handleGloomButtonAction(MouseEvent event){

        saveAndSwitch(type, "gloom copy.png");
    }
    
    @FXML
    public void handleKoffingButtonAction(MouseEvent event){

        saveAndSwitch(type, "koffing.png");
    }
    
    @FXML
    public void handleVenonatButtonAction(MouseEvent event){

        saveAndSwitch(type, "Venonat copy.png");
    }
    
    @FXML
    public void handleZubatButtonAction(MouseEvent event){

        saveAndSwitch(type, "Zubat copy.png");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
