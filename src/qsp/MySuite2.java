package qsp;

import org.testng.annotations.Factory;

public class MySuite2 
{
@Factory
public Object[] runTest() throws Exception
{
	String[] testName={"qsp.DemoA","qsp.DemoB"};
	
	int count=testName.length;
	
	Object[] allTest=new Object[count];
	
	for(int i=0;i<count;i++)
	{
		String tn=testName[i];
		Object obj=Class.forName(tn).newInstance();
		allTest[i]=obj;
				
	}
	return allTest;
}
}
