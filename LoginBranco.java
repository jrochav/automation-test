package CT003;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginBranco  {
      
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
    public void loginEmBranco() throws InterruptedException{
        iniciar();

        
        Thread.sleep(1000);
        //aciona o botão "Sign in" na pagina principal
        driver.findElement(By.className("header_user_info")).click();

        //Aciona o botão "Sign in"
        Thread.sleep(2000);
        driver.findElement(By.className("icon-lock")).click();

        //Fechar o navegador se o teste for sucesso.
        Thread.sleep(2000);
        driver.close();

    }

}
