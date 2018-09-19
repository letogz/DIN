/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers.model;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
     public static Model getModel(){ //Creamos el metodo model. Como no se puede hacer new model, hay que llamar a la clase donde se implemnetas ese Model
         
         return new ModelImplementation();
     
     } 
}
