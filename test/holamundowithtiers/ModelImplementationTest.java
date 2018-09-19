/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundowithtiers;

import holamundowithtiers.model.ModelImplementation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */



public class ModelImplementationTest {
    
    private ModelImplementation modelImple;
    
    
    @Before
    public void setUp() {
        
        
        modelImple = new ModelImplementation();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGreeting method, of class ModelImplementation.
     */
    
    //METODO DONDE SE VA A ESPECIFICAR UNA PRUEBA
    //Solo tiene un metodo porque la clase ModelImplemets solo tiene un metodo
    @Test
    public void testGetGreeting() {
         /*  System.out.println("getGreeting");
        ModelImplementation instance = new ModelImplementation();
        String expResult = "";
        String result = instance.getGreeting();
        assertEquals(expResult, result)
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");   */
        
        //CODIGO NECESARIO PARA PROBAR QUE VA BIEN LO QUE QUEREMOS PROBAR
        //Tenemos que comparar el metodo con lo que queremos qe devuelva.
        //Para hacer la prueba, necesitamos escribir:
            /*//Tenemos que crear el objeto ModeliMplementation
            ModelImplementation modelImple = new ModelImplementation(); ESto lo ponemos en la parte de arriba*/
      
            
            //Ahora tenemos que compararlo con unas funciones que se llaman ASERCIONES
            assertEquals("FALLO","Hola mundo", modelImple.getGreeting());
        
        
    }
    
}
