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
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
public class ControllerIT {

    public ControllerIT() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }
    
    //Creamos objetos de la clase

    private final PrintStream systemOut = System.out;
    private ByteArrayOutputStream testOut;
    
    
    
    @Before
    public void setUp() {
        testOut= new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class Controller.
     */
    @Test
    public void testRun() {
        /*   System.out.println("run");
        Model model = null;
        View view = null;
        Controller instance = new Controller();
        instance.run(model, view);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype."); */

        //Tenemos que ver si el mensaje que sale de la consola es el mensaje que nosotros queremos
        //COMO COGER LO QUE ESTA EN LA CONSOLA
        /*   String greeting= ModelFactory.getModel().getGreeting();
        ViewFactory.getView().showGreeting(greeting); */
        Model model = ModelFactory.getModel();
        View view = ViewFactory.getView();
        Controller controller = new Controller();
        String greeting = model.getGreeting();
        //Al controlador le mandas la vista y el modelo
        controller.run(model, view);
        //Greeting es lo que devuelve el modelo, y el testOut lo que esta escrito en la consola
        
        assertEquals("FALLO", greeting + "\n", testOut.toString()); 
    }

}
