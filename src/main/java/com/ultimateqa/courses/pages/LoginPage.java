package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By signInText = By.linkText("Sign In");

    public void signInLink(String signin) {
        clickOnElement(signInText);
    }
    By verifyText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    public String getVerifyText() {
        return getTextFromElement(verifyText);
    }
    /*verify text
   String expectedMessage = "Welcome Back!";
   String actualMessage = getTextFromElement(By.xpath("//h1[@class='page__heading']"));
       Assert.assertEquals("Welcome Back!",expectedMessage,actualMessage);

    */
    By emailID = By.id("user[email]");
    public void enterEmail(String email){
    sendTextToElement(emailID, email);
}
    By passwardField = By.name("user[password]");
    public void enterPassward(String passward){
    sendTextToElement(passwardField,passward);
    }
    By loginButton = By.xpath("//input[@class='button button-primary g-recaptcha']");
    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

}
