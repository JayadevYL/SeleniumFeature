package org.example.file.upload.downloading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowAuthentication {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
        //https://username:password@url
    }
}
