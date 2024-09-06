package NG2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class NewTest {
  @BeforeMethod()
	public void BF() {
	  System.out.println("Before Method!!!");
  }
  	@Parameters("val")
	@Test
  public void f1(String param) {
	System.out.println("Test Method 1"+" "+ param);  
  }
	
	@Test(dataProvider = "data1")
	  public void f2(String value) {
		System.out.println("Test Method 2" +" "+value);  
	  }
	@DataProvider
	public Object[][] data1() {
		return new Object[][] {
			{"one"},{"two"}
		};
		
	}
	
	
}
