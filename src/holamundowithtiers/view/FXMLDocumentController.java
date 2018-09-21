/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers.view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * Clase para las referencias de los objetos de la interfaz grafica.
 * Su resposabilidad es mostrar un saludo en la etiqueta cuando se pulsa el boton CLICK ME
 * @author 2dam
 */
public class FXMLDocumentController  {
    
    @FXML
    private Label label;
    private String saludo;

    //constructor creado por la clase para el mensaje
   /* FXMLDocumentController(String greeting) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.saludo= greeting;
    }
    */
    @FXML
    private void handleButtonAction(ActionEvent event) {
       
        label.setText(saludo); //Muestra el mensaje hola mundo en la etiqueta
    }
    
   public void setGreeting (String saludo){
   this.saludo = saludo;
   }
}
