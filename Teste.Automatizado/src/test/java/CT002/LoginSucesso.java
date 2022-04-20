package CT002;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSucesso {
      
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
    public void loginSucesso() throws InterruptedException{
        iniciar();

        
        Thread.sleep(1000);
        //aciona o botão "Sign in" na pagina principal
        driver.findElement(By.className("header_user_info")).click();

        //login
        Thread.sleep(2000);
        //Peenche o campo email
        driver.findElement(By.id("email")).sendKeys("thor@gmail.com");
        Thread.sleep(1000);

        //Peenche o campo password
        driver.findElement(By.id("passwd")).sendKeys("123456");
        
        //aciona o botão "Sign in" 
        driver.findElement(By.className("icon-lock")).click();

        //Fechar o navegador se o teste for sucesso.
        Thread.sleep(2000);
        driver.close();

    }

}
