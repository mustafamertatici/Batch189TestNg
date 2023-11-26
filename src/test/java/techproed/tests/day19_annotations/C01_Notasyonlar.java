package techproed.tests.day19_annotations;

import org.testng.annotations.*;

public class C01_Notasyonlar {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Herseyden once BeforeSuite notasyonuna sahip olan method bir kez calisir");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Herseyden sonra AfterSuite notasyonuna sahip olan method bir kez calisir");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Testlerden once BeforeTest notasyonuna sahip olan method 1 kez calisir ");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("Testlerden once AfterTest notasyonuna sahip olan method 1 kez calisir ");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Her class ton once  beforeClass notasyonuna sahip olan method 1 kez calisir");
        System.out.println("*****************************************************************************");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Her class ton sonra  AfterClass notasyonuna sahip olan method 1 kez calisir");
        System.out.println("*****************************************************************************");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("BeforeMethod notasyonuna sahip olan method her test methodundan once 1 kez calisir");
        System.out.println("*****************************************************************************");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("AfterMethod notasyonuna sahip olan method her test methodundan sonra 1 kez calisir");

    }

    @Test
    public void test01() {
        System.out.println("test01 methodu calisti");
    }
    @Test
    public void test02() {
        System.out.println("test02 methodu calisti");
    }
    @Test
    public void test03() {
        System.out.println("test03 methodu calisti");
    }

     /*
    Junit te  @BeforeClass ve  @AfterClass annotationina sahip methodhlar static olmak zorundaydi
    Test NG bu zorunlulugu kaldirdi
     */
}
