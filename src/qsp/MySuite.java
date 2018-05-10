package qsp;

import org.testng.annotations.Factory;

public class MySuite 
{
@Factory
public Object[] runTest()
{
	Object[] allTest=new Object[1];
	DemoB d1=new DemoB();
	allTest[0]=d1;
	return allTest;
}
}
