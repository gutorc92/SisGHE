/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Disciplinas;

import java.util.ArrayList;
import java.util.List;
import org.jdom2.Element;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class DaoDeserializaDisciplinasTest {
    
    public DaoDeserializaDisciplinasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of deserializaDisciplinasXml method, of class DaoDeserializaDisciplinas.
     */
    @Test
    public void testDeserializaDisciplinasXml() {
        System.out.println("deserializaDisciplinasXml");
        ArrayList expResult = null;
        ArrayList result = DaoDeserializaDisciplinas.deserializaDisciplinasXml();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of percorreDisciplinasXml method, of class DaoDeserializaDisciplinas.
     */
    @Test
    public void testPercorreDisciplinasXml() {
        System.out.println("percorreDisciplinasXml");
        List<Element> disciplinas = null;
        ArrayList listDisciplinas = null;
        DaoDeserializaDisciplinas.percorreDisciplinasXml(disciplinas, listDisciplinas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
