package testing_code_Oct30;

import org.testng.annotations.*;

public class BeforeSuteTest {
  @BeforeSute
  public void BeforeSute() {
	  System.out.println("Testing @BeforeSute annotation");
  }
  @BeforeTest
  public void BeforeTest() {
	  System.out.println("Testing @BeforeTest annotation");
  }
  @BeforeClass
  public void BeforeClass() {
	  System.out.println("Testing @BeforeClass annotation");
  }
  @BeforeMethod
  public void BeforeMethod() {
	  System.out.println("Testing @BeforeMethod annotation");
   }
  @Test
  public void testcase() {
	  System.out.println("My code ");
  
  
  
