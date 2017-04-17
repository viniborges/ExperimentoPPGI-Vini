package test;

import bean.Requisitions;
import bean.Services;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestService {
	public TestService() {
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
	@Test
    public void test01() {
        System.out.println("Test 01 -> insert service");
        
        Services  s = new Services();
        s.setName("Service01");
        model.Users u = new model.Users();
        u.setId(1);
        s.setIdUser(u.getId());
        
        
        assertEquals(true, s.save());
    }  

}
