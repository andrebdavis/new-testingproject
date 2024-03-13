package com.github.andrebdavis.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSignUpPage {
    private WebDriver driver;

    final private By SignUpNameField = By.cssSelector("input[data-qa*='signup-name']");
    final private By EmailAddressField = By.cssSelector("input[data-qa*='signup-email']");


    public LoginSignUpPage(WebDriver driver){this.driver = driver;}

    public void nameClick(){
        driver.findElement(SignUpNameField).click();
    }
    public void EnterName(String name){
        WebElement nameField = driver.findElement(SignUpNameField);
        nameField.clear();
        nameField.sendKeys(name);
    }
    public void EmailClick(){
        driver.findElement(EmailAddressField).click();
        }
    public void EnterEmail(String email){
        WebElement EmailField = driver.findElement(EmailAddressField);
        EmailField.clear();
        EmailField.sendKeys(email);
    }
    }

