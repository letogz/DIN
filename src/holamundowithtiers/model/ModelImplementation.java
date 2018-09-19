
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers.model;

/**
 * Esta clase va a devolver el saludo en forma de cadena
 * @author 2dam
 */
public class ModelImplementation  implements Model{


    public String getGreeting() {
       //Aqui tenemos que poner el String y hacemos el return. Aqui es donde definimos el saludo.
       String greeting = "Hola mundo bonito";
      return greeting;
       
    }
    
    
}
