package Demo;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test2 
{

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
				
				//LAUNCH APPLICATION
				DesiredCapabilities capabilities= new DesiredCapabilities();

				//DEVICE DETAILS
				capabilities.setCapability("deviceName","Redmi 4A");
				capabilities.setCapability("platformName","Android");
				capabilities.setCapability("platformVersion","6.0.1");
				
				//APPLICATION DETAILS
				capabilities.setCapability("appPackage","com.crowdfire.aneeshabahukhandi.wadrobeassignment");
				capabilities.setCapability("appActivity","com.crowdfire.aneeshabahukhandi.wardrobeassignment.activity.WardrobeHome");
				
				//APPIUM SERVER DETAILS
				AndroidDriver driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
									
				Thread.sleep(3000);
				
				//GET APP SIXE
				Dimension size = driver.manage().window().getSize();
				System.out.println(size);
				Thread.sleep(4000);
			 
				int Startx= (int)(size.width*0.60);
				System.out.println("Startx is "+Startx);
				
				int Endx=(int)(size.width*0.20);
				System.out.println("Endx is "+Endx);
				
				int Starty= (int)(size.height*0.70);
				System.out.println("Starty is "+Starty);
			
				//SWIPE SHIRT FROM RIGHT TO LEFT  - 5 TIMES - TO CHECK SWIPE FUNCTIONALITY
					
				for(ini i=1; i<=5; i++)
				{
				driver.swipe(Startx, Starty, Endx, Starty, 1000);
				Thread.sleep(4000);
				}

				int Startx1= (int)(size.width*0.60);
				System.out.println("Startx1 is "+Startx1);
				
				int Endx1=(int)(size.width*0.20);
				System.out.println("Endx1 is "+Endx1);
				
				int Starty1= (int)(size.height*0.30);
				System.out.println("Starty is "+Starty1);
			
				//SWIPE PANT FROM RIGHT TO LEFT  - 5 TIMES - TO CHECK SWIPE FUNCTIONALITY
					
				for(ini j=1; j<=5; j++)
				{
				driver.swipe(Startx, Starty, Endx, Starty, 1000);
				Thread.sleep(4000);
				}

				// LAUNCH NAVIGATION OPTION
				driver.findElementByName("Open navigation drawer").click();
				
				//CLICK REMOVE CLOTHES FROM LIST OPTION USING ID
				driver.findElementsById("com.crowdfire.aneeshabahukhandi.wadrobeassignment:id/icon").get(4).click();

				//CLICK ADD CLOTHES TO LIST OPTION USING ID
				driver.findElementById("com.crowdfire.aneeshabahukhandi.wadrobeassignment:id/wishListFAB").click();

	}

}