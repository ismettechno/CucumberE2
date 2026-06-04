package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {
    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();

    public static WebDriver getDriver(){
        //system i tamamen ingilizceye çalıştır
        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        if (threadDriver.get() == null)//bu hatta driver yok ise
        {
            threadDriver.set(new ChromeDriver());  // bu hatta bir driver set et
            threadDriver.get().manage().window().maximize(); // Ekranı max yapıyor.
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        }

        return threadDriver.get();
    }

    public static void quitDriver()
    {
        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() !=null) {
            threadDriver.get().quit();

            WebDriver driver=threadDriver.get(); // hattaki driver ı ver
            driver=null;  // içini boşalt
            threadDriver.set(driver);  // tekrar ilgili iş hattına ver
        }
    }



}
