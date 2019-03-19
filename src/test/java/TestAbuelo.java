/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.testproyectoabuelo.Menu;
import com.mycompany.testproyectoabuelo.Persona;
import java.util.HashMap;
/**
 *
 * @author Sebastian Rincon, Edward Ramos
 */
public class TestAbuelo {
    
    static Menu men;
    static Persona per;
    static public HashMap<Integer, Persona> mapaAbuelo;
    public TestAbuelo() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    
    mapaAbuelo = new HashMap<>();
    mapaAbuelo.put(1, new Persona(1, "Juan"));
    mapaAbuelo.put(1, new Persona(2,"Jose"));
    mapaAbuelo.get(1).getDatos().put(3, new Persona(3, "Andres"));
    mapaAbuelo.get(1).getDatos().put(4, new Persona(4, "Maria"));
    mapaAbuelo.get(1).getDatos().put(5, new Persona(5, "Carlos"));
    mapaAbuelo.get(2).getDatos().put(6, new Persona(6, "Alberto"));
    mapaAbuelo.get(2).getDatos().put(7, new Persona(7, "Jimmy"));
    mapaAbuelo.get(2).getDatos().put(8, new Persona(8, "Jhon"));
    mapaAbuelo.get(1).getDatos().get(3).getDatos().put(9, new Persona(9, "Juana"));
    mapaAbuelo.get(1).getDatos().get(3).getDatos().put(10, new Persona(10, "Paola"));
    mapaAbuelo.get(1).getDatos().get(4).getDatos().put(11, new Persona(11, "Sofia"));
    mapaAbuelo.get(1).getDatos().get(5).getDatos().put(12, new Persona(12, "Jaime"));
    mapaAbuelo.get(2).getDatos().get(6).getDatos().put(13, new Persona(13, "Tatiana"));
    mapaAbuelo.get(2).getDatos().get(6).getDatos().put(14, new Persona(14, "Fernanda"));
    mapaAbuelo.get(2).getDatos().get(7).getDatos().put(15, new Persona(15, "Viviana"));
    mapaAbuelo.get(2).getDatos().get(8).getDatos().put(16, new Persona(16, "Diana"));
    }
    
    @AfterClass
    public static void tearDownClass() {
        mapaAbuelo= null;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAbuelo(){
        
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
