/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


/**
 * FXML Controller class
 *
 * @author Nicolle
 */
public class DisplayController implements Initializable {

    /**
     * Initializes the controller class.
     */
       
    public static DataModel data = new DataModel();
    
    @FXML
    private void handleExitButtonAction(ActionEvent event){
        System.exit(0);
    }
    
    
    //FROM WEBSITE EXAMPLE! http://www.javafxtutorials.com/tutorials/switching-to-different-screens-in-javafx-and-fxml/
    @FXML
    private void handleStartButtonAction(ActionEvent event) throws IOException{
        
        Switch.switchTo("Type");

    }
 
  @FXML
    private void handleAbout(ActionEvent event) {
        Switch.switchTo("About");
    }
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
    

