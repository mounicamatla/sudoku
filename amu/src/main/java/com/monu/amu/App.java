package com.monu.amu;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	// declaration and instantiation of objects/variables
    	
    			//comment the above 2 lines and uncomment below 2 lines to use Chrome
    			System.setProperty("webdriver.chrome.driver","C:\\Users\\mounica\\Downloads\\chromedriver_win32\\chromedriver.exe");
    			WebDriver driver = new ChromeDriver();
    	    	
    	        String baseUrl = "https://www.sudokukingdom.com/";
    	        String expectedTitle = "Sudoku Kingdom - Play free sudoku puzzles online";
    	        String actualTitle = "";

    	        // launch Fire fox and direct it to the Base URL
    	      // driver.get(baseUrl);
    	       
    	       actualTitle=driver.getTitle();
    	       WebElement fb=driver.findElement(By.xpath("//*[@id=\"rt\"]/span[1]/a"));
    	       fb.click();
    	      
    	       ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    	       driver.switchTo().window(tabs2.get(1));
    	       Thread.sleep(10000);
    	       driver.close();
    	       driver.switchTo().window(tabs2.get(0));

    	       WebElement register=driver.findElement(By.xpath("//*[@id=\"rx\"]/div[2]/ul/li[1]/a"));
    	       register.click();
    	       WebElement name=driver.findElement(By.xpath("//*[@id=\"login_name\"]"));
    	       name.click();
    	       name.sendKeys("monu");
    	       WebElement password=driver.findElement(By.xpath("//*[@id=\"desired_password\"]"));
    	       password.click();
    	       password.sendKeys("12345678");
    	       WebElement retypePass=driver.findElement(By.xpath("//*[@id=\"retype_password\"]"));
    	       retypePass.click();
    	       retypePass.sendKeys("12345678");
    	       WebElement email=driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
    	       email.click();
    	       email.sendKeys("abcdef@gmail.com");
    	       Select country=new Select(driver.findElement(By.xpath("//*[@id=\"b2\"]/div/form/div[6]/select")));
    	       country.selectByVisibleText("India");
    	       Select Gender=new Select(driver.findElement(By.xpath("//*[@id=\"b2\"]/div/form/div[7]/select")));
    	       Gender.selectByVisibleText("Female");
    	       Select Age=new Select(driver.findElement(By.xpath("//*[@id=\"b2\"]/div/form/div[8]/select")));
    	       Age.selectByVisibleText("21 to 25");
    	       WebElement s=driver.findElement(By.xpath("//*[@id=\"b2\"]/div/form/div[10]/input"));
    	       s.click();
    	       WebElement submit=driver.findElement(By.xpath("//*[@id=\"b2\"]/div/form/div[11]/input"));
    	       submit.click();
    	       driver.navigate().back();
    	       WebElement tutorial= driver.findElement(By.xpath("//*[@id=\"k1c\"]/a[6]"));
    	       tutorial.click();
    	       WebElement dailySud= driver.findElement(By.xpath("//*[@id=\"rx\"]/div[1]/ul/li[3]/a"));
    	       dailySud.click();
    	       //driver.navigate().back();
    	      // WebElement fb1=driver.findElement(By.xpath("//*[@id=\"rt\"]/span[1]/a"));
    	     
    	       WebElement share= driver.findElement(By.xpath("//*[@id=\"u_0_5\"]/div/span"));
    	       share.click();
    	      
    	       String  var="https://www.facebook.com/";
    	      driver.get(var);
    	      

    	       
    	       if(actualTitle.contentEquals(expectedTitle))
    	       {
    	    	   System.out.println("test passed");
    	       }
    	       else
    	       {
    	    	   System.out.println("test faileds");
    	       }

    }
}
