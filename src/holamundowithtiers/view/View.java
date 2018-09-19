/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers.view;

/**
 * Esto es la clase de interfaz. Recibe el mensaje "Show Greeting"
 * @author 2dam
 */
public interface View {
    

//Un metodo devuelve algo o no. El show Greeting muestra el saludo por consola.
    
   public void showGreeting (String greeting); //Esto es la interfaz vista ahora tenemos que hacer el modelo.    
}
