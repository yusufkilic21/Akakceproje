package kutuphane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    //bunun sartı extends olması ve basta yer alması

    static //tearstart
    {
        driver = new ChromeDriver();
    }

    public static void BaslangıcIslemlerı() {
        WebDriver driver = new ChromeDriver();

        //drıver.manage().wındow().maxımıze();//ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); //20 sn muhlet: sayfayı yukeleme muhletı
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //20 sn muhlet : elementı bulma muhletı
    }


    public static void BekleKapat() {
        MyFunc.Bekle(3);
        driver.quit();
    }
}
