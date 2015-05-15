package junitPractise;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	JunitParameterization.class,
	TestApplication.class
})
	
public class MySuiteRunner {

}

