package com.github.andrebdavis;
import com.github.andrebdavis.Pages.LandingPage;
import com.github.andrebdavis.Pages.LoginSignUpPage;
import com.github.andrebdavis.Pages.MetaDataUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.Test;

import javax.swing.*;

public class AutoTest {
    @Test
    public void smokeTest(){

        //Use WebDriver to mange firefox
        WebDriverManager.firefoxdriver().setup();

        //Initialize the webDriver
        WebDriver driver = new FirefoxDriver();

        // Navigate to webpage
        driver.get("https://automationexercise.com/");

        //Instantiating Landing Page
        final LandingPage landingPage = new LandingPage(driver);

        //Click signUp/Log Link
        landingPage.clickSignUpLink();

        // Test URL location
        String actualURL = driver.getCurrentUrl();

        String expectedURL = "https://automationexercise.com/login";
        Assert.assertEquals(expectedURL, actualURL);

        //Instantiating LoginsignUp Page
        final LoginSignUpPage loginSignUpPage = new LoginSignUpPage(driver);

        //click the name field
        loginSignUpPage.nameClick();

        //Create name for name field
         String name = MetaDataUtility.createRandomName();

         //Enter name into name Field
        loginSignUpPage.EnterName(name);






    }


}
