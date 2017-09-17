package Demo;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
				//LAUNCH APP
				DesiredCapabilities capabilities= new DesiredCapabilities();
				
				//dDEVICE DETAILS
				capabilities.setCapability("deviceName","Redmi 4A");
				capabilities.setCapability("platformName","Android");
				capabilities.setCapability("platformVersion","6.0.1");
				
				//APP DETAILS
				capabilities.setCapability("appPackage","com.crowdfire.aneeshabahukhandi.wadrobeassignment");
				capabilities.setCapability("appActivity","com.crowdfire.aneeshabahukhandi.wardrobeassignment.activity.WardrobeHome");
				
				//APPIUM DETAILS
				AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
							
				Thread.sleep(3000);
				
				//GET DIMENSION
				Dimension size = driver.manage().window().getSize();
				System.out.println(size);
				Thread.sleep(4000);
				
				List<WebElement> ele_cloth = driver.findElementsById("com.crowdfire.aneeshabahukhandi.wadrobeassignment:id/clothing");
			 	int Startx1= ele_cloth.get(0).getLocation().getX();
			
				WebElement ele = driver.findElementById("com.crowdfire.aneeshabahukhandi.wadrobeassignment:id/clothing");
				int Starty1 = ele_cloth.get(0).getLocation().getY();

				int Endx=(int)(size.width*0.20);
				System.out.println("Endx is "+Endx);

				driver.swipe(Startx1, Starty1, Endx, Starty1, 1000);
				Thread.sleep(4000);
		
			
	}

}
