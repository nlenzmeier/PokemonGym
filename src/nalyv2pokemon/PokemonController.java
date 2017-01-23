/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javax.imageio.ImageIO;

/**
 *
 * @author Nicolle
 */
public class PokemonController {
    public void saveAndSwitch(String type, String fileName) {
        // extract base name from fileName
        int dot = fileName.indexOf(".");
        String name = fileName.substring(0, dot);
        
        String sourceImagePath = "/nalyv2pokemon/Pokemon/" + type + "/" + fileName;
        Image image = new Image(sourceImagePath);

        File destinationImagePath = new File("nalyv2Pokemon/" + name + ".png");
        destinationImagePath.mkdirs();
        DisplayController.data.characterFileName = fileName;
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, "png", destinationImagePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        DisplayController.data.pokemon = name;
        Switch.switchTo("Rooms");
    }
}

