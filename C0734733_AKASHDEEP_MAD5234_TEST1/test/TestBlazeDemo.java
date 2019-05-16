/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Akashdeep Singh
 */
public class TestBlazeDemo {

    public TestBlazeDemo() {
    }

    final String URL = "https://www.blazedemo.com/";
    final String DRIVER_PATH = "C:\\chromedriver.exe";

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        // Setup Selenium + Chrome
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.get(URL);
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(1000);				// OPTION 1
        TimeUnit.SECONDS.sleep(1);		// OPTION 2
        driver.close();
    }
// http://blazedemo.com/vacation.html

    @Test
    public void testdestinationForWeek() {
        
        	WebElement link = driver.findElement(By.linkText("destination of the week! The Beach!"));
		link.click();
    }

}
