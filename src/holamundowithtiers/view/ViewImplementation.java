/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers.view;

/**
 *
 * @author 2dam
 */

//En esta clase es donde va a estar implementado el metodo de la interfaz view.
public class ViewImplementation implements View{
    
  public void showGreeting (String greeting) { //Tenemos que definir el metodod
      
      System.out.println(greeting); //Muestra el saludo. 
  
  }
  
}
