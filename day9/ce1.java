package day9;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class ce1 {
  @Test(dataProvider = "dp",priority=2)
  public void add(Integer n, Integer s) {
	  System.out.println("Add "+n+s);
  }
  @Test(dataProvider = "dp",priority=3)
  public void sub(Integer n, Integer s) {
	  System.out.println("Sub "+(n-s));
  }
  @Test(dataProvider = "dp",priority=1)
  public void mul(Integer n, Integer s) {
	  System.out.println("Mul "+n*s);
  }
  @Test(dataProvider = "dp",priority=4)
  public void div(Integer n, Integer s) {
	  System.out.println("Div "+n/s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 21,5  },
      new Object[] { 35,9 },
    };
  }
}
