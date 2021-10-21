package MyTestNG;

import org.testng.annotations.Test;

public class Sept25_Group {
  @Test(groups = {"gr1","gr2"})
  public void f() {
	  System.out.println("in function f");
  }
  
  @Test(groups = {"gr1"})
  public void face() {
	  System.out.println("in function face");
  }
  
  @Test(priority=-2, groups = {"gr2"})
  public void fish() {
	  System.out.println("in function fish");
  }
  
  @Test(groups = {"gr1","gr3"},priority = -11)
  public void flower() {
	  System.out.println("in function flower");
  }
  
}
