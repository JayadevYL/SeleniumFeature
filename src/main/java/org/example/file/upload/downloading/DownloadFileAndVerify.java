package org.example.file.upload.downloading;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class DownloadFileAndVerify {
    public static void main(String[] args) {
        String downloadPath=System.getProperty("user.dir");
        HashMap<String,Object>prefs=new HashMap<>();
        prefs.put("profile.default_content_settings.popups",0);
        prefs.put("download.default_directory",downloadPath);
        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs",prefs);
        WebDriver driver=new ChromeDriver(options);
        //Now write a code to download the file
    }
}
