package junitPractise;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.Test;

//step 1:
@RunWith(Parameterized.class)
public class JunitParameterization {
	//step 2: declare the data variable
	public String bankName;
	public int actNum;
	
	//step 3: Build the constructor of the class
	public JunitParameterization(String bankName,int actNum){
		this.bankName = bankName;
		this.actNum = actNum;
	}
	
	@Test
	public void checkBalance(){
		System.out.println("Executing the test with " +bankName+ "----" +actNum);
	}
	
	//Step 4
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data = new Object[2][2];
		data[0][0] = "HSBC";
		data[0][1] = 1234;
		data[1][0] = "Citi";
		data[1][1] = 34567;
		return Arrays.asList(data);
		
		
	}
	
}

