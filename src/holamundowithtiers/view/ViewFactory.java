/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers.view;

/**
 * Crear y devolver una view
 * @author 2dam
 */
public class ViewFactory {
    
    
    public static View getView(){ //Creamos el metodo de View.
        
       // return new ViewImplementation();
     //  return new SwingViewImplementation();
     return new JavaFXViewImplementation();
    }
}
