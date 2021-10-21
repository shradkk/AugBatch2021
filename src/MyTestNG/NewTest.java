package MyTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		System.out.println("In NewTest Class");
	}
	
	
	@DataProvider(name="firstDP")
	public Object[][] myDP(){
		return new Object[][] {
			{1,2,3},{11,12,23},{10,20,-10},{20,1,19}
		};
	}

}
