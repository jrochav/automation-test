package CriaUsuario;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CriaUsuario {
      
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

        //Criando usuario
        Thread.sleep(1000);
        driver.findElement(By.className("header_user_info")).click();
        Thread.sleep(1000);

        //Preenche o campo email
        driver.findElement(By.name("email_create")).sendKeys("thor_martelinho_de_ouro@gmail.com");
        driver.findElement(By.className("icon-user")).click();
        Thread.sleep(3000);
        
        //seleciona genero
        WebElement genero = driver.findElement(By.id("id_gender1"));
        genero.click();
        
        //Preenche o campo nome
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")).sendKeys("Thor");
         
         //Preenche o campo nome sobre nome
         driver.findElement(By.name("customer_lastname")).sendKeys("Asgard");
         
         //Preenche o campo password
         driver.findElement(By.name("passwd")).sendKeys("123456");
         Thread.sleep(1000);
         
         //seleciona campo dia nascimento
         Select data = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select")));
         data.selectByValue("9");

         //seleciona campo mês nascimento
         Select mes = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select")));
         mes.selectByValue("10");
         
         //seleciona o campo ano nascimento
         Select ano = new Select(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select")));
         ano.selectByValue("1996");
         
         //Preenche o campo endereço 1
         driver.findElement(By.id("address1")).sendKeys("Nome");
         
         //Preenche o campo cidade
         driver.findElement(By.name("city")).sendKeys("Adolfo");
         Thread.sleep(1000);
         
         //seleciona o campo estado
         Select combobox = new Select(driver.findElement(By.id("id_state")));
         combobox.selectByVisibleText("Alabama");
         
         //preenche o campo "Postal Code"
         driver.findElement(By.name("postcode")).sendKeys("00000");
         Thread.sleep(1000);
         //preenche o campo "Mobile phone"
         driver.findElement(By.name("phone_mobile")).sendKeys("000000");

         //aciona o botão "Register"
         driver.findElement(By.name("submitAccount")).click();

         //Fechar o navegador se o teste for sucesso.
         Thread.sleep(2000);
         driver.close();
    }

}
