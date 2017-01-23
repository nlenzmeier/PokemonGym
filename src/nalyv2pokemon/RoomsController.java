/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javax.imageio.ImageIO;

/**
 * FXML Controller class
 *
 * @author Nicolle
 */
public class RoomsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    public void handleBackButtonAction(MouseEvent event){
        Switch.switchTo("Type");
    }
    
    @FXML
    public void handleRooftopAction(MouseEvent event){
        System.out.println("Clicked Froakie");
        //ADDED AT 6:55
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        String imagePath = "/nalyv2pokemon/Rooms/rooftop.jpg";
        Image image = new Image(imagePath);

        File directoryPath = new File("nalyv2Pokemon/rooftop.png/");
        directoryPath.mkdirs();
        DisplayController.data.backgroundFileName = "rooftop.png";
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "jpg", directoryPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        DisplayController.data.room = "rooftop";
        Switch.switchTo("Web");
        
    }
    
    public void handleGrandRoomAction(MouseEvent event){
        System.out.println("Clicked Froakie");
        //ADDED AT 6:55
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        String imagePath = "/nalyv2pokemon/Rooms/grandRoom.png";
        Image image = new Image(imagePath);

        File directoryPath = new File("nalyv2Pokemon/grandRoom.png/");
        directoryPath.mkdirs();
        DisplayController.data.backgroundFileName = "grandRoom.png";
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "jpg", directoryPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        //NEW TO SWITCH SCENES
        //Switch.switchTo("Rooms");
        
        DisplayController.data.type = "grandroom";
        Switch.switchTo("Web");
    }
    
    public void handlePurpleAction(MouseEvent event){
        System.out.println("Clicked Froakie");
        //ADDED AT 6:55
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        String imagePath = "/nalyv2pokemon/Rooms/purpleDisco.jpg";
        Image image = new Image(imagePath);

        File directoryPath = new File("nalyv2Pokemon/purpleDisco.png/");
        directoryPath.mkdirs();
        DisplayController.data.backgroundFileName = "purpleDisco.png";
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "jpg", directoryPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        //NEW TO SWITCH SCENES
        //Switch.switchTo("Rooms");
        
        DisplayController.data.room = "purple";
        Switch.switchTo("Web");
    }
    
    public void handleRedRoomAction(MouseEvent event){
        System.out.println("Clicked Froakie");
        //ADDED AT 6:55
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        String imagePath = "/nalyv2pokemon/Rooms/redRoom.jpg";
        Image image = new Image(imagePath);

        File directoryPath = new File("nalyv2Pokemon/redRoom.png/");
        directoryPath.mkdirs();
        DisplayController.data.backgroundFileName = "redRoom.png";
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "jpg", directoryPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        //NEW TO SWITCH SCENES
        //Switch.switchTo("Rooms");
        DisplayController.data.room = "redroom";
        Switch.switchTo("Web");
    }
    
    public void handleDarkRoomAction(MouseEvent event){
        System.out.println("Clicked Froakie");
        //ADDED AT 6:55
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        String imagePath = "/nalyv2pokemon/Rooms/darkRoom.jpg";
        Image image = new Image(imagePath);

        File directoryPath = new File("nalyv2Pokemon/darkRoom.png/");
        directoryPath.mkdirs();
        DisplayController.data.backgroundFileName = "darkRoom.png";
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "jpg", directoryPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        //NEW TO SWITCH SCENES
        //Switch.switchTo("Rooms");
        DisplayController.data.room = "darkroom";
        Switch.switchTo("Web");
    }
    
    public void handleCastleAction(MouseEvent event){
        System.out.println("Clicked Froakie");
        //ADDED AT 6:55
        //TRYING TO SAVE IMAGE TO A FILE CALLED "NewFile"
        String imagePath = "/nalyv2pokemon/Rooms/castle.jpg";
        Image image = new Image(imagePath);

        File directoryPath = new File("nalyv2Pokemon/" + "castle.png/");
        directoryPath.mkdirs();
        DisplayController.data.backgroundFileName = "castle.png";
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "jpg", directoryPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
        //NEW TO SWITCH SCENES
        //Switch.switchTo("Rooms");
        DisplayController.data.room = "castle";
        Switch.switchTo("Web");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
