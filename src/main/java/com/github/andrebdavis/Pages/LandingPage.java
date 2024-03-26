package com.github.andrebdavis.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
    //Create

    private By SignUpLink = By.cssSelector("a[href*='/login']");

    private WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSignUpLink(){
        driver.findElement(SignUpLink).click();
    }

}
