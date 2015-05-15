package junitPractise;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;


public class JunitClass {
	@BeforeClass
	public static void init(){
		System.out.println("Initializing test environment");
	}
	
	@Before
	public void openBrowser(){
		System.out.println("Opening Browser");
		Assume.assumeTrue(false); //does not run any test case but runs before and after annotations
	}
	@Test
	public void testLogin(){
		System.out.println("Test Login");
	}
	//@Ignore//does not run that particular test case and before and after for that test case
	@Test
	public void testRegisteration(){
		System.out.println("Testing Registeration");
	}
	@After
	public void closeBrowser(){
		System.out.println("Closing Browser");
	}
	
	@AfterClass
	public static void close(){
		System.out.println("Closing Test Environment");
	}

}

