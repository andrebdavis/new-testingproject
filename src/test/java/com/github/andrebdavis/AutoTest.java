package com.github.andrebdavis;
import com.github.andrebdavis.Pages.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;
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


    }


}
