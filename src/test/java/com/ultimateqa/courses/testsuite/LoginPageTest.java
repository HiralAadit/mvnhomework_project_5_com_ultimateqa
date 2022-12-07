package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();


    @Test
    public void verifyUserShouldNavigaateToLoginPageSuccessfully() {
loginPage.signInLink("Sign In");
String expectedMessage = "Welcome Back!";
        Assert.assertEquals(loginPage.getVerifyText(),expectedMessage,"Message is not displayed");
   }
        @Test
        public void verifyTheErrorMessage () {
        loginPage.signInLink("Sign In");
        loginPage.enterEmail("123@gmail.com");
        loginPage.enterPassward("secret123");
        loginPage.clickOnLoginButton();
        }
    }