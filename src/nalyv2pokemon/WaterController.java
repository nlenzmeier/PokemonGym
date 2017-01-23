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
public class WaterController extends PokemonController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    String type = "Water";
    
//    @FXML
//    private VBox root;
//    
//    @FXML
//    private ImageView mainScreen;
//    
//    @FXML
//    private Label label;
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    

     //was private, but comment said it needed to be public, but still not working... 
    @FXML
    public void handleFroakieButtonAction(MouseEvent event){

        saveAndSwitch(type, "froakie.png"); 
    }
    
    @FXML
    public void handlePiplupButtonAction(MouseEvent event){

        saveAndSwitch(type, "piplup.png"); 
    }
    
    @FXML
    public void handleMudkipButtonAction(MouseEvent event){

        saveAndSwitch(type, "mudkip.png"); 
    }
    
    @FXML
    public void handleSquirtleButtonAction(MouseEvent event){

        saveAndSwitch(type, "squirtle.png"); 
    }
    
    @FXML
    public void handleBuizelButtonAction(MouseEvent event){

        saveAndSwitch(type, "buizel.png"); 
    }
    
    @FXML
    public void handleLaprasButtonAction(MouseEvent event){

        saveAndSwitch(type, "Lapras.png"); 
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //make arraylist that holds three options
    } 
    
    
    
}
