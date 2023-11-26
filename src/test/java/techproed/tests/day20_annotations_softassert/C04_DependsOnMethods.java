package techproed.tests.day20_annotations_softassert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C04_DependsOnMethods {

    /*
      Test NG de DependsOnMethods ozelligini kullanarak bazi testlerin bagimli oldugu
      diger testlerin basarili olmasi durumuna göre calistirabilirsiniz
      DependsOnMethods baglandigi testin sonucuna bakar, passed olursa calisir fail olursa hic calismaz
   */
    WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void test01() {
        //amazon syf gidiniz
        driver.get("https://amazon.com");
        //arama kusunda iphone aratiniz
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");
        searchBox.submit();
        Assert.assertEquals(2,3);
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {

        //sonuc yazisinin iphone icerdigini test edelim
      String sonucYazisi=driver.findElement(By.tagName("h1")).getText();
        Assert.assertTrue(sonucYazisi.contains("iphone"));

    }
}
