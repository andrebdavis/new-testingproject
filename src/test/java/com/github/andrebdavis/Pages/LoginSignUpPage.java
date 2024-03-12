package com.github.andrebdavis.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSignUpPage {
    private WebDriver driver;

    final private By SignUpNameField = By.cssSelector("input[data-qa*='signup-name']");

    public LoginSignUpPage(WebDriver driver){this.driver = driver;}

    public void nameClick(){
        driver.findElement(SignUpNameField).click();
    }
    public void EnterName(String name){
        WebElement nameField = driver.findElement(SignUpNameField);
        nameField.clear();
        nameField.sendKeys(name);
    }
}
