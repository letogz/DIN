/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers.controler;

import holamundowithtiers.model.Model;
import holamundowithtiers.view.View;

/**
 *
 * @author 2dam
 */
public class Controller { //El controlador va a llamar al metodo getGreeting y despues al showGreeting
    
    
    //El controlador tiene un metodo que se llama run, y ese metodo llama al getGretting y el showGretting
    //Necesita el obketo Model y el objeto vista
    
    //El controlador tiene que saber cual es la vista y cual es el modelo. Pide y reparte.
    
       
    public void run (Model model, View view) { //Asi ya podemos utilizar los metodos de model y los metodos de view.
        
        //Llama al metodo getGreetin del objeto modelo, a la clade model
        String greeting = model.getGreeting(); //Aqui nos devuelve el saludo, entonce este saludo tenemos que mostrarlo llamando a ShowGreeting
        
        view.showGreeting(greeting); //El greeting es que hemos puesto arriba
        
        
    }
}
