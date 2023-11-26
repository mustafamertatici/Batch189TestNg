package techproed.tests.day20_annotations_softassert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.time.Duration;

public class C02_Priority {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test @Ignore
    public void youtubeTest() {
        driver.get("https://youtube.com");
          /*
     @Ignore annotation i bu testin calistirilirken görmezden gelmek icin kullanilir, Bu notasyona sahip test methodu calistirilmaz
     */
    }

    @Test(enabled = false)
    public void amazonTest() {
         /*
            @Test(enabled = false) parametresi bu testin devre disi birakilmasini saglar
            Bu yöntem kalici olarak devre disi birakmak icin kullanilr
         */
        driver.get("https://amazon.com");
    }

    @Test(priority = -1)
    public void facebookTest() {
        driver.get("https://facebook.com");

        boolean excelDosyaYolu=false;
        if (excelDosyaYolu ) {
            System.out.println("testleri çalistir");
        }
        else {
            throw new SkipException("Excel dosyasi baglantisindan dosya bulunamadı");
        }
        /*
        Bu testte SkipException kullanarak testin calistirilmasini run time da dynamic olarak durdurabiliriz
        SkipException firlatildiginda test "Skipped" olarak isaretlenir
        dolayisiyla bu yöntem testin belirli kosullar altinda atlanmasi gerektiginde kullanilabilir
         */
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}
