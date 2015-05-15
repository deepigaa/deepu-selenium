package junitPractise;
import org.junit.Assert;
import org.junit.Test;

public class TestApplication {
	@Test
	public void testApp(){
		System.out.println("A");
		try{
			Assert.assertEquals("Hello","Hello123");
		}catch(Throwable t){
			System.out.println("error");
		}
		
		System.out.println("B");
		
		
	}

}

