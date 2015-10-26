import java.net.MalformedURLException; 
import java.net.URL;  
import org.openqa.selenium.By; 
import org.openqa.selenium.Platform; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.remote.DesiredCapabilities; 
import org.openqa.selenium.remote.RemoteWebDriver; 
import org.testng.annotations.Test;  
public class Example1 {
 WebDriver driver; 
  
 @Test 
 public void test() throws InterruptedException, MalformedURLException{ 
   
  DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
  capabilities.setCapability("platform", Platform.WIN8_1); 
  capabilities.setCapability("version", "44.0"); 
  driver = new RemoteWebDriver(new URL("http://@ondemand.saucelabs.com:80/wd/hub"), capabilities);
    Thread.sleep(10000); 
  driver.get("http://www.rediff.com/"); 
  Thread.sleep(5000); 
   
  driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click(); 
   
  Thread.sleep(5000); 
  driver.quit(); 
   
 } 
} 
