/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;

import java.io.IOException;
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
public class WebController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private void handleWebPageButtonAction(MouseEvent event) throws IOException{
        System.out.println("Clicked Congratulations!");
//        Switch.switchTo("WebPage");
        WebPage web = new WebPage();
        web.createSite();
        
        
    }
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Display");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
