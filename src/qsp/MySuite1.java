package qsp;

import org.testng.annotations.Factory;

public class MySuite1 
{
	@Factory
public Object[] runTest()
{
		Object[] allTest=new Object[2];
		DemoA d1=new DemoA();
		allTest[0]=d1;
		
		DemoB d2=new DemoB();
		allTest[1]=d2;
		
		return allTest;
}
}
