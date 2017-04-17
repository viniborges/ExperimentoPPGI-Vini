package test;

import bean.Index;
import bean.Requisitions;

import java.util.List;
import javax.persistence.EntityManager;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestRequisition {

	public TestRequisition() {
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
        System.out.println("Test 01 -> insert requisition");
        
        Requisitions  r = new Requisitions();
        r.setDescription("Description01");
        r.setIdService(1);
        
        assertEquals(true, r.save());
    }  
}
