/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitterseleniumtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Admin
 */
public class BitterWebApplication {
    static WebElement txtFirstName(WebDriver driver){
        WebElement txtFirstName = driver.findElement(By.id("firstname"));
        return txtFirstName;
    }
    static WebElement txtLastName(WebDriver driver){
        WebElement txtLastName = driver.findElement(By.id("lastname"));
        return txtLastName;
    }
    static WebElement txtEmail(WebDriver driver){
        WebElement txtEmail = driver.findElement(By.id("email"));
        return txtEmail;
    }
    static WebElement txtScreenName(WebDriver driver){
        WebElement txtScreenName = driver.findElement(By.id("username"));
        return txtScreenName;
    }      
    static WebElement txtPassword(WebDriver driver){
        WebElement txtPassword = driver.findElement(By.id("password"));
        return txtPassword;
    }
    static WebElement txtConfirm(WebDriver driver){
        WebElement txtConfirm = driver.findElement(By.id("confirm"));
        return txtConfirm;
    }
    static WebElement txtPhone(WebDriver driver){
        WebElement txtPhone = driver.findElement(By.id("phone"));
        return txtPhone;
    }
    static WebElement txtAddress(WebDriver driver){
        WebElement txtAddress = driver.findElement(By.id("address"));
        return txtAddress;
    } 
    static Select Province(WebDriver driver){
        Select Province = new Select(driver.findElement(By.id("province")));
        return Province;
    }
    static WebElement txtPostalCode(WebDriver driver){
        WebElement txtPostalCode = driver.findElement(By.id("postalCode"));
        return txtPostalCode;
    }
    static WebElement txtUrl(WebDriver driver){
        WebElement txtUrl = driver.findElement(By.id("url"));
        return txtUrl;
    }
    static WebElement txtDesc(WebDriver driver){
        WebElement txtDesc = driver.findElement(By.id("desc"));
        return txtDesc;
    }
    static WebElement txtLocation(WebDriver driver){
        WebElement txtLocation = driver.findElement(By.id("location"));
        return txtLocation;
    }
    static WebElement btnCreate(WebDriver driver){
        return driver.findElement(By.name("button"));
    }
    static WebElement txtMyTweet(WebDriver driver){
        WebElement txtMyTweet = driver.findElement(By.id("myTweet"));
        return txtMyTweet;
    }
    static WebElement clickUser(WebDriver driver){
        WebElement clickUser = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[1]/a"));
        return clickUser;
    }
    static WebElement ClickProfile(WebDriver driver){
        WebElement clickProfile = driver.findElement(By.xpath("/html/body/div/div/div[3]/div/a[1]"));
        return clickProfile;
    }
    static WebElement ClickSignup(WebDriver driver){
        WebElement clickSignup = driver.findElement(By.xpath("/html/body/div/div/div[2]/p/a"));
        return clickSignup;
    }
    static WebElement ClickReply(WebDriver driver){
        WebElement clickReply = driver.findElement(By.xpath("//*[@id=\"tweet_form\"]/div/img[2]"));
        return clickReply;
    }
    static WebElement ClickPicture(WebDriver driver){
        WebElement clickPicture = driver.findElement(By.xpath("/html/body/nav/div/li/div/a[2]"));
        return clickPicture;
    }
    static WebElement ClickRetweet(WebDriver driver){
        WebElement clickRetweet = driver.findElement(By.xpath("//*[@id=\"tweet_form\"]/div/a[2]"));
        return clickRetweet;
    }
    static WebElement ClickSearch(WebDriver driver){
        WebElement clickSearch = driver.findElement(By.xpath("//*[@id=\"navbarsExampleDefault\"]/form/input"));
        return clickSearch;
    }
    static WebElement ClickSearchbtn(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"navbarsExampleDefault\"]/form/button"));
    }
        
}