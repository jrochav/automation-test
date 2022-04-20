package BaseNavegador.Navegador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseNavegador {

    protected static WebDriver driver;
    private static final String Site = "http://automationpractice.com/index.php";
    private static final String Caminho_Driver = "src/test/java/BaseNavegador/Navegador/ChromeDriver/chromedriver.exe";
    
    @BeforeClass
    protected void iniciar(){
        System.setProperty("webdriver.chrome.driver", Caminho_Driver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Site);
    }
    
    @AfterClass
    protected static void finalizar(){
        driver.quit();
    }
}
