/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package holamundowithtiers.view;

import javax.swing.JOptionPane;

/**
 * Clase para la implementacion Swing de HolaMundoWithTiers app
 * @author Leticia Garcia
 */
public class SwingViewImplementation implements View{
    /**
     * Muestra a greeting en una ventana de mensaje.
     * @param greeting El saludo
     */
  public void showGreeting (String greeting) { //Tenemos que definir el metodod
      
      
      String message = greeting;
      JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.INFORMATION_MESSAGE);
     //Esto es un comentario
  }
  
}
