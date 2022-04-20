package CT001;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInvalido {
      
    private WebDriver driver;
    private final String Site = "http://automationpractice.com/index.php";
    private final String Caminho_Driver = "src/test/java/BaseNavegador/Navegador/ChromeDriver/chromedriver.exe";

    private void iniciar(){
        System.setProperty("webdriver.chrome.driver", Caminho_Driver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Site);
    }

    @Test
    public void Logininvalido() throws InterruptedException{
        iniciar();

        //aciona botão "Sign in" tela inicial
        Thread.sleep(1000);
        driver.findElement(By.className("header_user_info")).click();
        Thread.sleep(2000);

        //Peenche o campo email
        driver.findElement(By.id("email")).sendKeys("thor@gmail.com");
        
        //Peenche o campo passwoord
        driver.findElement(By.id("passwd")).sendKeys("matelinhoDeOuro");
        
        //aciona o botão "Sign in"
        driver.findElement(By.className("icon-lock")).click();

        //Fechar o navegador se o teste for sucesso.
        Thread.sleep(2000);
        driver.close();

    }

}
