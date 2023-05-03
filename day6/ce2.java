package day6;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ce2 {
  @Test (priority=3)
  public void add() {
	  int a=10,b=20,res=0;
	  res=a+b;
	  System.out.println("Add ="+res);
	  Assert.assertEquals(res, 30);
	  
  }
  @Test (priority=2)
  public void sub() {
	  int a=20,b=10,res=0;
	  res=a-b;
	  System.out.println("Sub ="+res);
	  Assert.assertEquals(res, 10);
	  }
  
  @Test (priority=1)
  public void mul() {
	  int a=20,b=10,res=0;
	  res=a*b;
	  System.out.println("Mul ="+res);
	  Assert.assertEquals(res, 200);
	  
  }
  @Test (priority=4)
  public void div() {
	  int a=20,b=10,res=0;
	  res=a/b;
	  System.out.println("Div ="+res);
	  Assert.assertEquals(res, 2);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
