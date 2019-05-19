package firstlaunch;

import org.testng.annotations.Test;

public class DataProviderScripts {

	@Test(dataProvider="dp1", dataProviderClass=DataProviderListener.class)
	public void dataprovider(String a, String b)
	{
		System.out.println(a);
		int c =Integer.parseInt(b);
		System.out.println(c);
	}
}
