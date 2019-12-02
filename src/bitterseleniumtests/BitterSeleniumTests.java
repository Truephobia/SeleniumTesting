/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitterseleniumtests;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Admin
 */
public class BitterSeleniumTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        //these grab the elements found on the webpage
        // 28/30
        driver.get("http://10.10.0.30/qa/pavanim/signup.php");
        try {
            //Honestly have no clue how many of these are actually failures due to a bug or just a failure of the proc page so just +1ing them aside from the massive failures
            boolean bTest = BitterUnitTest.createblankAccount(driver);
            //Was Intended to fail does fail because everything is blank started off slow before things go off the deep end. +1 Total: 1
            boolean bTest1 = BitterUnitTest.createAccount(driver, "Bob", "Bobbery", "1234512345", "BobWasHere", "12345678", "12345678", "(506)444-4444", "123 Fake Street", "NB", "E1C 8H9", "bob.bitter.com", "the place", "space");
            //Was Intended to Fail but failed in a different way Invalid Email instead of returning to the SignUp Page and giving an Error with an Alert instead freezes on signup Proc. +2 Total:3            
            boolean bTest2 = BitterUnitTest.createAccount(driver, "Bob", "Bobbery", "bob@hotmail.com", "BobWasHere", "12345678", "12345", "(506)444-4444", "123 Fake Street", "NB", "E1C 8H9", "bob.bitter.com", "the place", "space");
            //Was Intended to Fail by having the password not match Failed in this manner probably +1   Total:4
            boolean bTest3 = BitterUnitTest.createAccount(driver, "Bob", "Bobbery", "bob@hotmail.com", "BobWasHere", "12345", "12345", "(506)444-4444", "123 Fake Street", "NB", "H0H 0H0", "bob.bitter.com", "the place", "space");
            //Was Intended to Fail by having the postalcode be H0H0H0 and it did fail in this manner. +1    Total:5
            boolean bTest4 = BitterUnitTest.createAccount(driver, "Bob", "Bobbery", "bob@hotmail.com", "nick", "12345", "12345", "(506)444-4444", "123 Fake Street", "NB", "E1C 8H9", "bob.bitter.com", "the place", "space");
            //Was Intended to Fail by Having the screenname be taken(nick) and it did fail in this manner. +1   Total:6
            boolean bTest5 = BitterUnitTest.createAccount(driver, "Bob", "Bobbery", "bob@hotmail.com", "BobWasHere", "12345", "12345", "(506)444-4444", "123 Fake Street", "NS", "E1C 8H9", "bob.bitter.com", "the place", "space");
            //Was Intended to Fail by Having the Province not match the PostalCode does fail in this manner. +1 Total:7
            boolean bTest6 = BitterUnitTest.createAccounts(driver, "Bob", "Bobbery", "bob@hotmail.com", "BobWasHere", "12345", "12345", "1234567890", "123 Fake Street", "NB", "E1C 8H9", "bob.bitter.com", "the place", "space");
            //Was intended to Fail by having an invalid Phone number it actually failed successfully showing an alert this time. +1 Total:8
            boolean bTest7 = BitterUnitTest.createAccount(driver, "Bob", "Bobbery", "bob@hotmail.com", "BobWasHere", "12345", "12345", "(506)444-4444", "123 Fake Street", "NB", "81234", "bob.bitter.com", "the place", "space");
            //Was intended to Fail as Postalcode is American +1 Total: 9
            boolean bTest8 = BitterUnitTest.createAccount(driver, "Bob", "Bobbery", "bobishere@hotmail.com", "select * from users;", "12345", "12345", "(506)444-4444", "123 Fake Street", "NB", "E1C 8H9", "bob.bitter.com", "the place", "space");
            //Try to enter SQL as a screenname +1 Total :10
            boolean bTest9 = BitterUnitTest.createAccount(driver, "Bob", "Bobbery", "bobishere@hotmail.com", "BobIsHere", "12345", "12345", "(506)444-4444", "123 Fake Street", "NB", "E1C 8H9", "bob.bitter.com", "the place", "space");
            //Account Should be created successfully for some reason it fails anyway +2 Total:12 (Possibly due to stack trace error in validiting the the Province found if you inspect the element of Province.)
            boolean bTest10 = BitterUnitTest.createAccounts(driver, "Bobsnameissolongthatitshouldbreakthe50characterlimitinyourdatabasedidyouvalidatethis?", "Bobbery", "1234512345", "BobWasHere", "12345678", "12345678", "(506)444-4444", "123 Fake Street", "NB", "E1C 8H9", "bob.bitter.com", "the place", "space");
            //Username is longer then the database can take in expect an alert got an alert +1 Total:13
            boolean bTest11 = BitterUnitTest.createblankAccounts(driver, "Bob", "Bobbery", "bobishere@hotmail.com", "BobIsHere", "12345", "12345", "(506)444-4444", "123 Fake Street", "NB", "E1C 8H9", "bob.bitter.com", "the place");
            //Should allow Location to be null does allow location to be null +1 Total:14
            driver.get("http://10.10.0.30/qa/pavanim/login.php");
            boolean bTest12 = BitterUnitTest.Logins(driver, "BobIsHere", "12345");
            //Should fail because user does not exist never checks if user exists instead says incorrect password. +2   Total:16
            boolean bTest13 = BitterUnitTest.Logins(driver, "Nick", "1234512345");
            //Should fail because password is incorrect does fail because password is incorrect. +1 Total:17
            boolean btest14 = BitterUnitTest.ClickSignup(driver);
            //Should succeed going to signup page. +1 Total: 18
            boolean bTest15 = BitterUnitTest.Login(driver, "Nick", "asdf");
            //Should succeed does log in successfully. +1   Total:19
            driver.get("http://10.10.0.30/qa/pavanim/index.php");
            boolean bTest16 = BitterUnitTest.Tweet(driver, "I want to send a tweet that is so incredibly long that it will fail by default so I thought how much could I ramble? Jokes on you I could ramble untill the sun dies of heat death and implodes in on itself. Did you know 'Humans you 10%' of their brain is a myth that is easily debunked. Grapefruits were an accident people wanted to grow pomelo's and it just so happen there was another citrus fruit orchid too close which resulted in cross pollenation and creating a new freak of nature fruit with skin that is a greenish colour and is like 85% just rine with very small amount of fruit inside, Somehow this horrible fruit is still in demand in some places in the world. Speaking of the World did you know that the Pacific Ocean is shrinking and its just a matter of time before western north american slams into eastern asia creating huge amounts of earthquakes and volcanic erruptions? Yeah thats a fun fact we are all probably going to go extinct in the subsequent endless winter that it will generate but this is millions of years from now and we will probably be extinct by then if that puts your mind at ease what is actually wrong with you man? I forget what is the actual tweet limit for bitter is it like 1000? is it 2000? Is it 22,000 ? Who knows man I barely paid attention so I'm just going to see lets hit send. ");
            //Should fail because its wayyy too long does fail. +1 Total:20
            boolean bTest17 = BitterUnitTest.Tweet(driver, "I just tweeted from a robot");
            //Should be Successful. +1 Total:21
            boolean bTest18 = BitterUnitTest.UserProfile(driver);
            //Should be Successful. +1 Total 22
            boolean bTest19 = BitterUnitTest.ClickProfile(driver);
            //Should redirect does redirect. +1 Total: 23
            boolean bTest20 = BitterUnitTest.ClickReply(driver);
            //Should click on reply and open the reply menu Reply doesn't exist so it does litterally nothing +2 Total:25
            boolean bTest21 = BitterUnitTest.ClickImage(driver);
            //Should redirect to edit image page what it does instead is explode +2 Total:27
            boolean btest22 = BitterUnitTest.ClickRetweet(driver);
            //Should retweet does retweet +1 Total:28
            boolean btest23 = BitterUnitTest.Search(driver, "S");
            //Should redirect to search page does +1 Total:29
            boolean btest24 = BitterUnitTest.Search(driver, "Hello Kevin This Search Should Fail");
            //redirects to a blank page +1 Total:30
            
            //Nothing on Pavani's Index Page has an ID/Name or anything else they are literally all just a href="url"
        } catch (InterruptedException ex) {
            Logger.getLogger(BitterSeleniumTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
