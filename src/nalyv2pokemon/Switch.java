/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nalyv2pokemon;


import java.io.IOException;
import java.util.HashMap;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Nicolle
 */

public class Switch {
    
    public static Stage stage;
    
    public static void switchTo(String name) {
        System.out.println("Switching scene to: " + name);
         try {
            FXMLLoader loader = new FXMLLoader(Switch.class.getResource(name + ".fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            System.out.println("Error loading " + name + ".fxml\n" + ex);
        }
    }
}

//public class Switch {
//    public static Stage stage;
//    public static final HashMap<String, Scene> scenes = new HashMap<>();
//    
//    public static Scene add(String name) {        
//        Scene scene = scenes.get(name);
//        
//        if (scene == null) {
//            try {
//                FXMLLoader loader = new FXMLLoader(Switch.class.getResource(name + ".fxml"));
//                Parent root = loader.load();
//                scene = new Scene(root);
//                scenes.put(name, scene);
//            } catch (Exception ex) {
//                System.out.println("Error loading " + name + ".fxml\n" + ex);
//                scene = null;
//            }
//        }
//        
//        return scene;
//    }
//    
//    public static void switchTo(String name) {
//        Scene scene = add(name);
//        
//        if (scene != null) {
//            stage.setScene(scene);
//            stage.show();
//        }
//    }
//}

//public class Switch {
//    public static Scene scene;
//    public static final HashMap<String, Parent> parents = new HashMap<>();
//    
//    public static Parent add(String name) {        
//        Parent parent = parents.get(name);
//        
//        if (parent == null) {
//            try {
//                FXMLLoader loader = new FXMLLoader(Switch.class.getResource(name + ".fxml"));
//                parent = loader.load();
//                parents.put(name, parent);
//            } catch (Exception ex) {
//                System.out.println("Error loading " + name + ".fxml\n" + ex);
//                parent = null;
//            }
//        }
//        
//        return parent;
//    }
//    
//    public static void switchTo(String name) {
//        Parent parent = add(name);
//        
//        if (parent != null) {
//            if (scene != null) {
//                scene.setRoot(parent);
//            }
//        }
//    }
//}
//import java.io.IOException;
//import java.util.HashMap;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//
//public abstract class Switch {
//    public static Scene scene;
//    public static final HashMap<String, Switch> controllers = new HashMap<>();
//    //public static final HashMap controllers = new HashMap<>();
//
//    
//    private Parent root;  
//    
//    public void setRoot(Parent root) {
//        this.root = root;
//    }
//    
//    public Parent getRoot() {
//        return root;
//    }
//
//    public static Switch add(String name) {
//        Switch controller;
//        
//        controller = controllers.get(name);
//        
//        if (controller == null) {
//            try {
//                FXMLLoader loader = new FXMLLoader(Switch.class.getResource(name + ".fxml"));
//                Parent root = (Parent)loader.load();
//                controller = (Switch)loader.getController();
//                controller = loader.getController();
//                controller.setRoot(root);
//                controllers.put(name, controller);
//            }catch (Exception ex) {
//                System.out.println("Error loading " + name + ".fxml\n" + ex);
//                controller = null;
//            }
//        }
//        
//        return controller;
//    }
//    
//    public static void switchTo(String name) {
//        Switch controller = controllers.get(name);
//        
//        if (controller == null) {
//            controller = add(name);
//        }
//        
//        if (controller != null) {
//            if (scene != null) {
//                scene.setRoot(controller.getRoot());
//            }
//        }
//    }
//    
//    public static Switch getControllerByName(String name) {
//        return controllers.get(name);
//    }
//}
