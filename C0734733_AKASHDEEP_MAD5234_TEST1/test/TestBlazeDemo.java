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
import org.openqa.selenium.support.ui.Select;

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
//    

    @Test
    public void testDepratureCities() {

        Select selectDropdown = new Select(driver.findElement(By.name("fromPort")));
        List<WebElement> listOptionDropdown = selectDropdown.getOptions();
        int result = listOptionDropdown.size();
        assertEquals(7, result);

        // navigating page to flights page
        driver.navigate().to("http://blazedemo.com/reserve.php");

        // finding flight information
        //WebElement form = driver.findElement(By.name("VA12"));
        // form.getAttribute("td")
    }

    @Test
    public void testVirginFlight43() {

        WebElement button = driver.findElement(By.name("VA43"));
        button.click();
        // check if button clicked or not 
        // if not then test fail
        // otherwise test pass
        assertEquals(true, button.isSelected());

    }

    @Test
    public void testcheckFlight12() {
        // get the row for flight 12 to get all data
        WebElement flight = driver.findElement(By.name("VA12"));

        // getting price from hidden form 
        WebElement price = driver.findElement(By.name("price"));
        String val = price.getText();
        assertEquals("765.32", val);

        // get depart time from flight data
        // Grab the table 
        
        
        // TESTING CODE TO GET TABLE DATA 
        // VA12 IS A ROOT ELEMENT FOR TR WITH SPECIFIC NAME 
        WebElement table = driver.findElement(By.name("VA12"));
        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.println(cell.getText());
           
        }}

    }

}
