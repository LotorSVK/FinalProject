package org.example;

import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class TutorialPointTable {

    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void cleanUp(){
        driver.close();
        driver.quit();
    }

    @Test
    public void test(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php#");
        String name = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[1]")).getText();
        String lastName = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[2]")).getText();
        String age = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[3]")).getText();
        String email = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[4]")).getText();
        String salary = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[5]")).getText();
        String department = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[6]")).getText();


        assertEquals("Alden", name);
        assertEquals("Cantrell",lastName);
        assertEquals("45",age);
        assertEquals("alden@example.com",email);
        assertEquals("12000",salary);
        assertEquals("Compliance",department);






    }

}
