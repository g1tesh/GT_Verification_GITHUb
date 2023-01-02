package Gold_Template;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GT_Verification {
	
	FileInputStream FI;
	Properties prop;
	FileInputStream BO;
	Properties BOprop;
	
	
	@BeforeClass
	public void setup() throws IOException
	{
		FI = new FileInputStream("C:\\Users\\gpatil\\Desktop\\Nikhil.properties");
		BO = new FileInputStream("C:\\\\Users\\\\gpatil\\\\Desktop\\\\BO.properties");
		
		prop = new Properties();
		BOprop = new Properties();
		
		prop.load(FI);
		BOprop.load(BO);
		
		
	}
	
	@Test
	public void verify()
	{
		
		
		SoftAssert Assert = new SoftAssert();
		System.out.println("HEllo");
		Assert.assertEquals(prop.getProperty("92.22.13"), BOprop.getProperty("92.22.13"));
		Assert.assertEquals(prop.getProperty("92.22.12"), BOprop.getProperty("92.22.12"));
		Assert.assertEquals(prop.getProperty("92.22.15"), BOprop.getProperty("92.22.15"));
		Assert.assertEquals(prop.getProperty("92.22.14"), BOprop.getProperty("92.20.6"));
		Assert.assertEquals(prop.getProperty("92.17.7"), BOprop.getProperty("92.17.7"));
		Assert.assertEquals(prop.getProperty("92.17.9"), BOprop.getProperty("92.17.9"));
		Assert.assertEquals(prop.getProperty("3.4"), BOprop.getProperty("3.4"));
		Assert.assertEquals(prop.getProperty("3.4"), BOprop.getProperty("3.4"));
		Assert.assertEquals(prop.getProperty("3.4"), BOprop.getProperty("3.4"));
		Assert.assertEquals(prop.getProperty("3.4"), BOprop.getProperty("3.4"));
		Assert.assertEquals(prop.getProperty("3.4"), BOprop.getProperty("3.4"));
		Assert.assertEquals(prop.getProperty("3.4"), BOprop.getProperty("3.4"));
		Assert.assertEquals(prop.getProperty("3.4"), BOprop.getProperty("3.4"));
		
		/*
		 * Assert.assertEquals(prop.getProperty("3.5"), "15.315");
		 * Assert.assertEquals(prop.getProperty("4.20"), "840");
		 * Assert.assertEquals(prop.getProperty("71.3.13"), "0");
		 * Assert.assertEquals(prop.getProperty("71.3.14"), "46245");
		 * Assert.assertEquals(prop.getProperty("92.1.2"), "uat42.auruspay.com");
		 * Assert.assertEquals(prop.getProperty("92.1.3"), "uat42.auruspay.com");
		 * Assert.assertEquals(prop.getProperty("92.10.1"), "0");
		 * Assert.assertEquals(prop.getProperty("92.10.2"), "0");
		 * Assert.assertEquals(prop.getProperty("92.17.11"), "1");
		 * Assert.assertEquals(prop.getProperty("92.17.12"), "1");
		 * Assert.assertEquals(prop.getProperty("92.18.1"), "6000");
		 * Assert.assertEquals(prop.getProperty("92.19.10"), "99");
		 * Assert.assertEquals(prop.getProperty("92.19.11"), "0");
		 * Assert.assertEquals(prop.getProperty("92.19.12"), "111");
		 * Assert.assertEquals(prop.getProperty("92.19.13"), "100");
		 * Assert.assertEquals(prop.getProperty("92.19.2"), "1");
		 * Assert.assertEquals(prop.getProperty("92.19.3"), "1");
		 * Assert.assertEquals(prop.getProperty("92.19.8"), "COM5");
		 * Assert.assertEquals(prop.getProperty("92.19.9"), "ip");
		 * Assert.assertEquals(prop.getProperty("92.2.1"), "111100000");
		 * Assert.assertEquals(prop.getProperty("92.2.3"), "0");
		 * Assert.assertEquals(prop.getProperty("92.2.4"), "1");
		 * Assert.assertEquals(prop.getProperty("92.2.5"), "6");
		 * Assert.assertEquals(prop.getProperty("92.2.6"), "0");
		 * Assert.assertEquals(prop.getProperty("92.22.1"), "2");
		 * Assert.assertEquals(prop.getProperty("92.22.10"), "07:00");
		 * Assert.assertEquals(prop.getProperty("92.22.11"), "0");
		 * Assert.assertEquals(prop.getProperty("92.22.12"), "25");
		 * Assert.assertEquals(prop.getProperty("92.22.13"), "60");
		 * Assert.assertEquals(prop.getProperty("92.22.14"), "15");
		 * Assert.assertEquals(prop.getProperty("92.22.15"), "0");
		 * Assert.assertEquals(prop.getProperty("92.22.3"), "0");
		 * Assert.assertEquals(prop.getProperty("92.22.5"), "11100011100");
		 * Assert.assertEquals(prop.getProperty("92.22.6"), "1");
		 * Assert.assertEquals(prop.getProperty("92.22.7"), "0");
		 * Assert.assertEquals(prop.getProperty("92.22.8"), "1");
		 * Assert.assertEquals(prop.getProperty("92.22.9"), "3");
		 * Assert.assertEquals(prop.getProperty("92.3.2"), "0");
		 * Assert.assertEquals(prop.getProperty("92.3.3"), "0");
		 * Assert.assertEquals(prop.getProperty("92.3.4"), "1");
		 * Assert.assertEquals(prop.getProperty("92.3.5"), "1");
		 * Assert.assertEquals(prop.getProperty("92.3.6"), "1");
		 * Assert.assertEquals(prop.getProperty("92.4.1"), "0");
		 * Assert.assertEquals(prop.getProperty("92.4.2"), "0");
		 * Assert.assertEquals(prop.getProperty("92.4.3"), "0");
		 * Assert.assertEquals(prop.getProperty("92.5.1"), "1");
		 * Assert.assertEquals(prop.getProperty("92.5.7"), "0");
		 * Assert.assertEquals(prop.getProperty("92.6.1"), "2");
		 * Assert.assertEquals(prop.getProperty("92.6.2"), "9999.99");
		 * Assert.assertEquals(prop.getProperty("92.6.3"), "50");
		 * Assert.assertEquals(prop.getProperty("92.6.4"), "1");
		 * Assert.assertEquals(prop.getProperty("92.6.5"), "23:12");
		 * Assert.assertEquals(prop.getProperty("92.6.6"), "250");
		 * Assert.assertEquals(prop.getProperty("92.6.7"), "125");
		 */

		
		Assert.assertAll();
		
		
		
	}

	
	

}
