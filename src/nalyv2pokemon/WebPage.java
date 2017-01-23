/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nicolle
 */
public class WebPage {
     public String generatePage() {
        String html = "";
       
        html += generateTop();
        //html += generateMiddle();
        html += generateBottom();
       
        return html;
    }
     
     private String generateTop() {
        String html = "";
        html += "<!DOCTYPE html>\n";
        html += "<html>\n";
        html += "<head>\n";
        html += "<title>Your Pokemon Gym!</title>\n";
        html += generateStyle();
        html += "</head>";
        html += "<body>";
        return html;
    }
     
      private String generateStyle() {
        String html = "";
       
        html += "<style>\n";
        html += ".parent {\n";
                //html += "   background-color: linen;\n";
        html += "   position: relative;\n";
                html += "   top: 0;\n";
                html += "   left: 0;\n";
        html += "}\n";
       
        html += ".image1 {\n";
                html += "   position: relative;\n";
                html += "   top: 360px;\n";
                html += "   left: 400px;\n";
                html += "   height: 100px;\n";
                html += "   width: 100px;\n";
        html += "}\n";
 
        html += ".image2 {\n";
                html += "   position: absolute;\n";
                html += "   top: 30px;\n";
                html += "   left: 70px;\n";
                html += "   height: 500px;\n";
                html += "   width: 800px;\n";
        html += "}\n";
        
        html += "h1 {\n";
                html += "   text-align: center;\n";
                html += "   color: darkseagreen;\n";
                html += "   font-size: 3em;\n";
        html += "}\n";
        
        html += "body {\n";
                html += "   background-color: darkslategray;\n";
        html += "}\n";
        
        html += "</style>";
        return html;
    }
   
    private String generateBottom() {
        String html = "";
        html += "<div>";
        html += "<h1>Your Pokemon Gym!</h1>";
        html += "<div class=\"parent\">";
        //html += "<img class=\"image2\" src="\"nalyv2pokemon\"" + DisplayController.data.backgroundFileName>";"
        //html += “<img class=“\image2\” src=\”” + DisplayController.data.backgroundFileName + “\”>”;
        html += "<img class=\"image2\" src=\"" + DisplayController.data.backgroundFileName + "\">";
        html += "<img class=\"image1\" src=\"" + DisplayController.data.characterFileName + "\">";
        html += "</div>";
        html += "</div>";
        html += "</body>";
        html += "</html>";
       
        return html;
    }
    
    public void createSite(){
        String string = generatePage();
         
        try{
            BufferedWriter writer = new BufferedWriter (new FileWriter(("nalyv2Pokemon/PokemonGym.html/")));
            
            writer.write(string);
            writer.close();
        }catch (IOException e){
           e.printStackTrace(); 
        }
        
        
    }
      
    
}
