package junitPractise;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class LoginTest {
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	@Test
	public void testApp(){
		System.out.println("A");
		try{
			Assert.assertEquals("Hello","Hello123");
			Assert.assertTrue("errormessage",3>1);
		}catch(Throwable t){
			errCol.addError(t);
			System.out.println("error");
		}
		System.out.println("B");
		try{
			Assert.assertTrue("Link not present",false);
		}catch(Throwable t){
			errCol.addError(t);
		}
		System.out.println("Ending Test");
	}

}
