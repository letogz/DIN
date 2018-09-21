/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers.view;

import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  Construir los objetos necesarios para una aplicacion JavaFX. Tiene la resposabilidad tambien de vista, es decir, mostrar un saludo.
 * @author 2dam
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View{ 
//Tiene que estar el metodo showGreeting
    private static String greeting ; //static porque al hacer launch, se supone que esta "abriendo" un objeto que igual no es ese, entonces como queremos ese ponemos static, asi el atributo es el mismo para todos
    
    @Override
    public void showGreeting(String greeting) { //lo que te llega
        JavaFXViewImplementation.greeting = greeting; //Aqui doy valor al atributo que no tiene nada con lo que me han pasado
            launch();
        
    }

    //METODO DE LA APLICACION..
    @Override
    public void start(Stage stage) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        
        
        
       
         FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
         //Cragar el documento
            Parent root =loader.load();
         
         FXMLDocumentController ctrl = loader.getController();
       ctrl.setGreeting(greeting);
      
         Scene newScene = new Scene(root);
        
         stage.setScene(newScene);
         stage.show();
     
      }
        
        /*  //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml")); //Lo que hace es cargar el archivo XML, donde esta definida mi vista.
        
      
      
        
    // URL fxml = getClass().getClassLoader().getResource("FXMLDocument.fxml");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = (Parent)loader.load();
        // set the ControllerFactory       
    
      Scene scene = new Scene(vbox);
      
      
        //Vamos a tener dos objetos, scene y stage.
        //El stage lo genera solo, pero el otro lo tenemos que crear nosotros.
       // Scene scene = new Scene(root); //Creamos la escena. En la escena mostramos la vista, donde se carga en root esa vista.
        
        stage.setScene(new Scene(fxmlLoader.load()));  //Cargamos la escena en el escenario.
        stage.show(); */
    
    //Settter
    public void setGreeting(String greeting){
    JavaFXViewImplementation.greeting= greeting;
    }

}
    


