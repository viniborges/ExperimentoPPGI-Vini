/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bean.index;
import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author alexandrelerario
 */
public class TestUser {
    
    public TestUser() {
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
     * Test of SelectByNome method, of class CrudTeste.
    */
    
    @Test
    public void test01() {
        System.out.println("Test01 -> insert user");
        
        index  i = new index();
        i.setName("Test01");
        
        assertEquals(true, i.save());
    }
    
    
}
