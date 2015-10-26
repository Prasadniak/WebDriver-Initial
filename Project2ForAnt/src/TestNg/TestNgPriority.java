package TestNg;
import org.testng.Assert; 
import org.testng.annotations.Test;  
public class TestNgPriority {  
 /*@Test(priority=4) 
 public void login(){ 
  System.out.println("Log in"); 
 } 
  
 @Test(priority=2) 
 public void navigating(){ 
  System.out.println("navigating"); 
 } 
  
 @Test(priority=2) 
 public void logout(){ 
  System.out.println("Log out"); 
 }*/ 
  
  
 @Test() 
 public void login(){ 
  System.out.println("Log in"); 
  Assert.assertEquals("String1", "String1"); 
 } 
  
 @Test() 
 public void navigating()
 { 
  System.out.println("navigating"); 
 } 
  
 @Test(priority=3,dependsOnMethods={"login","navigating"}) 
 public void logout(){ 
  System.out.println("Log out"); 
 } 
  
  
} 