package test.guava;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.hamcrest.CoreMatchers; 

public class TestPreconditionsTest {

	@Test
	public void test() {
		try {
			boolean personByPrecondition = TestPreconditions.getPersonByPrecondition(8,"peida");
			assertTrue(personByPrecondition);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
        	TestPreconditions.getPersonByPrecondition(-9,"peida");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
        	TestPreconditions.getPersonByPrecondition(8,"");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
        	TestPreconditions.getPersonByPrecondition(8,null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 	}

}
