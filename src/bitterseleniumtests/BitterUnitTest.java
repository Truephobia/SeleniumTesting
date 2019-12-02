/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitterseleniumtests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Admin
 */
public class BitterUnitTest {
 public static boolean createAccount(WebDriver driver, String FirstName, String LastName,String Email, String ScreenName, String Password, String Confirm, String Phone, String Address, String Prov, String PostalCode, String Url, String Desc, String Location) throws InterruptedException {
        driver.get("http://10.10.0.30/qa/pavanim/signup.php");
        WebElement txtFirstName = BitterWebApplication.txtFirstName(driver);
        WebElement txtLastName = BitterWebApplication.txtLastName(driver);
        WebElement txtEmail = BitterWebApplication.txtEmail(driver);
        WebElement txtScreenName = BitterWebApplication.txtScreenName(driver);
        WebElement txtPassword = BitterWebApplication.txtPassword(driver);
        WebElement txtConfirm = BitterWebApplication.txtConfirm(driver);
        WebElement txtPhone = BitterWebApplication.txtPhone(driver);
        WebElement txtAddress = BitterWebApplication.txtAddress(driver);
        Select Province = BitterWebApplication.Province(driver);
        WebElement txtPostalCode = BitterWebApplication.txtPostalCode(driver);
        WebElement txtUrl = BitterWebApplication.txtUrl(driver);
        WebElement txtDesc = BitterWebApplication.txtDesc(driver);
        WebElement txtLocation = BitterWebApplication.txtLocation(driver);
        WebElement btnCreate = BitterWebApplication.btnCreate(driver);
        txtFirstName.sendKeys(FirstName);
        txtLastName.sendKeys(LastName);
        txtEmail.sendKeys(Email);
        txtScreenName.sendKeys(ScreenName);
        txtPassword.sendKeys(Password);
        txtConfirm.sendKeys(Confirm);
        txtPhone.sendKeys(Phone);
        txtAddress.sendKeys(Address);
        Province.selectByValue(Prov);
        txtPostalCode.sendKeys(PostalCode);
        txtUrl.sendKeys(Url);
        txtDesc.sendKeys(Desc);
        txtLocation.sendKeys(Location);
        
        btnCreate.click(); 

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/login.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Success! Account Created");
            return true;
        }
        else{
            System.out.println("Failure! Account Creation Failed");
            return false;
        }
    }
    public static boolean createAccounts(WebDriver driver, String FirstName, String LastName,String Email, String ScreenName, String Password, String Confirm, String Phone, String Address, String Prov, String PostalCode, String Url, String Desc, String Location) throws InterruptedException {
        driver.get("http://10.10.0.30/qa/pavanim/signup.php");
        WebElement txtFirstName = BitterWebApplication.txtFirstName(driver);
        WebElement txtLastName = BitterWebApplication.txtLastName(driver);
        WebElement txtEmail = BitterWebApplication.txtEmail(driver);
        WebElement txtScreenName = BitterWebApplication.txtScreenName(driver);
        WebElement txtPassword = BitterWebApplication.txtPassword(driver);
        WebElement txtConfirm = BitterWebApplication.txtConfirm(driver);
        WebElement txtPhone = BitterWebApplication.txtPhone(driver);
        WebElement txtAddress = BitterWebApplication.txtAddress(driver);
        Select Province = BitterWebApplication.Province(driver);
        WebElement txtPostalCode = BitterWebApplication.txtPostalCode(driver);
        WebElement txtUrl = BitterWebApplication.txtUrl(driver);
        WebElement txtDesc = BitterWebApplication.txtDesc(driver);
        WebElement txtLocation = BitterWebApplication.txtLocation(driver);
        WebElement btnCreate = BitterWebApplication.btnCreate(driver);
        txtFirstName.sendKeys(FirstName);
        txtLastName.sendKeys(LastName);
        txtEmail.sendKeys(Email);
        txtScreenName.sendKeys(ScreenName);
        txtPassword.sendKeys(Password);
        txtConfirm.sendKeys(Confirm);
        txtPhone.sendKeys(Phone);
        txtAddress.sendKeys(Address);
        Province.selectByValue(Prov);
        txtPostalCode.sendKeys(PostalCode);
        txtUrl.sendKeys(Url);
        txtDesc.sendKeys(Desc);
        txtLocation.sendKeys(Location);
        
        btnCreate.click(); 
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/login.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Success! Account Created");
            return true;
        }
        else{
            System.out.println("Failure! Account Creation Failed");
            return false;
        }
    }
public static boolean createblankAccounts(WebDriver driver, String FirstName, String LastName,String Email, String ScreenName, String Password, String Confirm, String Phone, String Address, String Prov, String PostalCode, String Url, String Desc) throws InterruptedException {
        driver.get("http://10.10.0.30/qa/pavanim/signup.php");
        WebElement txtFirstName = BitterWebApplication.txtFirstName(driver);
        WebElement txtLastName = BitterWebApplication.txtLastName(driver);
        WebElement txtEmail = BitterWebApplication.txtEmail(driver);
        WebElement txtScreenName = BitterWebApplication.txtScreenName(driver);
        WebElement txtPassword = BitterWebApplication.txtPassword(driver);
        WebElement txtConfirm = BitterWebApplication.txtConfirm(driver);
        WebElement txtPhone = BitterWebApplication.txtPhone(driver);
        WebElement txtAddress = BitterWebApplication.txtAddress(driver);
        Select Province = BitterWebApplication.Province(driver);
        WebElement txtPostalCode = BitterWebApplication.txtPostalCode(driver);
        WebElement txtUrl = BitterWebApplication.txtUrl(driver);
        WebElement txtDesc = BitterWebApplication.txtDesc(driver);
        WebElement btnCreate = BitterWebApplication.btnCreate(driver);
        txtFirstName.sendKeys(FirstName);
        txtLastName.sendKeys(LastName);
        txtEmail.sendKeys(Email);
        txtScreenName.sendKeys(ScreenName);
        txtPassword.sendKeys(Password);
        txtConfirm.sendKeys(Confirm);
        txtPhone.sendKeys(Phone);
        txtAddress.sendKeys(Address);
        Province.selectByValue(Prov);
        txtPostalCode.sendKeys(PostalCode);
        txtUrl.sendKeys(Url);
        txtDesc.sendKeys(Desc);
        
        btnCreate.click(); 
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/login.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Success! Account Created");
            return true;
        }
        else{
            System.out.println("Failure! Account Creation Failed");
            return false;
        }
    } 
    public static boolean createblankAccount(WebDriver driver) throws InterruptedException {
        driver.get("http://10.10.0.30/qa/pavanim/signup.php");
        WebElement btnCreate = BitterWebApplication.btnCreate(driver);
        btnCreate.click(); 
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/login.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Success! Account Created");
            return true;
        }
        else{
            System.out.println("Failure! Account Creation Failed");
            return false;
        }
    }
    public static boolean Logins(WebDriver driver, String Username, String Password) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/login.php");
        WebElement txtScreenName = BitterWebApplication.txtScreenName(driver);
        WebElement txtPassword = BitterWebApplication.txtPassword(driver);
        WebElement btnSubmit = BitterWebApplication.btnCreate(driver);
        txtScreenName.sendKeys(Username);
        txtPassword.sendKeys(Password);
        
        btnSubmit.click();
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/login.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Success! Logged In");
            return true;
        }
        else{
            System.out.println("Failure! Failed To Log In");
            return false;
        }        
    }
    public static boolean Login(WebDriver driver, String Username, String Password) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/login.php");
        WebElement txtScreenName = BitterWebApplication.txtScreenName(driver);
        WebElement txtPassword = BitterWebApplication.txtPassword(driver);
        WebElement btnSubmit = BitterWebApplication.btnCreate(driver);
        txtScreenName.sendKeys(Username);
        txtPassword.sendKeys(Password);
        
        btnSubmit.click();
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/index.php?msg=Login%20Successful";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Success! Logged In");
            return true;
        }
        else{
            System.out.println("Failure! Could Not Log In");
            return false;
        }        
    }
    public static boolean Tweet(WebDriver driver, String myTweet) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/index.php");
        WebElement txtmyTweet = BitterWebApplication.txtMyTweet(driver);
        WebElement btnSubmit = BitterWebApplication.btnCreate(driver);
        txtmyTweet.sendKeys(myTweet);
        txtmyTweet.click();
        btnSubmit.click();
        btnSubmit.click();
        driver.switchTo().alert().accept();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/index.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Success! sent a tweet!");
            return true;
        }
        else{
            System.out.println("Failure! TweetFailed");
            return false;
        }     
    }
    public static boolean UserProfile(WebDriver driver) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/index.php");
        WebElement btnClick = BitterWebApplication.clickUser(driver);
        btnClick.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/userpage.php?id_mem=56";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Successfully redirected");
            return true;
        }
        else{
            System.out.println("Failure! did not redirect");
            return false;
        }     
    }
    public static boolean ClickProfile(WebDriver driver) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/index.php");
        WebElement btnClick = BitterWebApplication.ClickProfile(driver);
        btnClick.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/index.php?msg=Login%20Successful";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Failed to redirect");
            return true;
        }
        else{
            System.out.println("Successfully redirected");
            return false;
        }          
    }
    public static boolean ClickSignup(WebDriver driver) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/login.php");
        WebElement btnClick = BitterWebApplication.ClickSignup(driver);
        btnClick.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/signup.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Successfully redirected");
            return true;
        }
        else{
            System.out.println("Failed to redirected");
            return false;
        }          
    }
    public static boolean ClickReply(WebDriver driver) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/index.php");
        WebElement btnClick = BitterWebApplication.ClickReply(driver);
        try{
        btnClick.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/index.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Failed to redirect");
            return true;
        }
        else{
            System.out.println("Successfully redirected");
            return false;
        } 
        }
        catch(ElementNotInteractableException ex){
            System.out.println("Failed To redirect");
            return false;
        }
    }
    public static boolean ClickImage(WebDriver driver) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/index.php?");
        WebElement btnClick = BitterWebApplication.ClickPicture(driver);
        try{
        btnClick.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/edit_photo.php";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Seccessfully redirected");
            return true;
        }
        else{
            System.out.println("Failed to redirect");
            return false;
        } 
        }
        catch(ElementNotInteractableException ex){
            System.out.println("Failed to redirct");
            return false;
        }
    }
    public static boolean ClickRetweet(WebDriver driver) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/index.php?");
        WebElement btnClick = BitterWebApplication.ClickRetweet(driver);
        btnClick.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/index.php?message=Retweet%20successful";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Seccessfully redirected");
            return true;
        }
        else{
            System.out.println("Failed to redirect");
            return false;
        }         
    }
    public static boolean Search(WebDriver driver, String Search) throws InterruptedException{
        driver.get("http://10.10.0.30/qa/pavanim/index.php?");
        WebElement txtSearch = BitterWebApplication.ClickSearch(driver);
        WebElement btnSubmit = BitterWebApplication.ClickSearchbtn(driver);
        txtSearch.sendKeys(Search);
        btnSubmit.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Thread.sleep(3000);
        
        String strCurrentUrl = driver.getCurrentUrl();
        String strSuccessUrl = "http://10.10.0.30/qa/pavanim/search.php?search=S";
        
        if (strCurrentUrl.equalsIgnoreCase(strSuccessUrl)){
            System.out.println("Seccessfully redirected");
            return true;
        }
        else{
            System.out.println("Failed to redirect");
            return false;
        }     
    }
}
