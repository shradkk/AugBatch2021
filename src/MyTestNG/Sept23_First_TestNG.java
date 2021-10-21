package MyTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sept23_First_TestNG {
	@BeforeSuite
	void bsuit() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	void asuit() {
		System.out.println("After suite");
	}
	
	@BeforeTest
	void btest(){
		System.out.println("\tBefore Test");
	}
	@AfterTest
	void atest() {
		System.out.println("\tAfter Test");
	}
	
	@BeforeClass
	void bclass() {
		System.out.println("\t\tBefore class");
	}
	
	@AfterClass
	void aclass() {
		System.out.println("\t\tAfter class ");
	}
	
	@BeforeMethod
	void bmethod() {
		System.out.println("\t\t\tBefore Method");
	}
	
	@AfterMethod
void amethod() {
		System.out.println("\t\t\tAfter Method ");
	}
	
	@Test
	void add() {
		System.out.println("\t\t\t\tAddion method");
	}
	@Test(priority = -10)
	void sub() {
		System.out.println("\t\t\t\tSubtract Method");
	}
	@Test(priority = -20)
	void div() {
		System.out.println("\t\t\t\tDivision Method");
	}
	@Test(priority = 0)
	void Mul() {
		System.out.println("\t\t\t\tMultiplication Method");
	}

}

class xyz{
	@Test
	void Myclass() {
		System.out.println("\t\t\t\tMy class");
	}
}
