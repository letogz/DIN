/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers;

import holamundowithtiers.model.Model;
import holamundowithtiers.model.ModelFactory;
import holamundowithtiers.view.ViewFactory;
import holamundowithtiers.view.View;
import holamundowithtiers.controler.Controller;

/**
 * Esta es la clase aplicacion para el hola mundo con capas
 * @author Leticia Garcia
 * 
 */
public class Application  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //Y ahora las factorias tienen que crear las vistas y el modelo que es lo que necesitamos para el run
        
        //Creamos la vista
        View view = ViewFactory.getView(); //esto me devuelve una vista que se guarda en view. Al ser de metodo estatico es metodo de clase.
        
        //Creamos el modelo
        Model model = ModelFactory.getModel();
        
        //Creamos el controlador que es el que tiene el metodo run
        Controller controler = new Controller();
        //Llamamos al metodo run
        controler.run(model, view);
        
        
    }
    
}
