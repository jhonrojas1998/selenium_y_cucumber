package stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class RetoTest {

    private ChromeDriver driver;

    @Given("^que quiero registrarme en el sistema$")
    public void que_quiero_registrarme_en_el_sistema() throws Throwable {
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLSe1eYSAQ3s6pmunySehXROONEco02ammSCGM63vSc573JBFuQ/viewform?vc=0&c=0&w=1&flr=0");
        driver.manage().window().maximize();


    }

    @When("^ingrese los datos del formulario y haga clic en enviar$")
    public void ingrese_los_datos_del_formulario_y_haga_clic_en_enviar() throws Throwable {
        WebElement nombresyapellidos = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        nombresyapellidos.click();
        nombresyapellidos.sendKeys("jhon hader rojas cabrera");

        WebElement edad = driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/span"));
        edad.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement edad23 = driver.findElement(By.xpath("//form[@id='mG61Hd']/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div[24]/span"));
        edad23.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement hombre = driver.findElement(By.xpath("//*[@id=\"i16\"]/div[3]/div"));
        hombre.click();
        WebElement direccion = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        direccion.click();
        direccion.sendKeys("cll 120 #46-52 interior 18");
        WebElement correoelectronico = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        correoelectronico.click();
        correoelectronico.sendKeys("jhonjaderrojas1998@gmail.com");
        WebElement telefono = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div[1]/div/div[1]/input"));
        telefono.click();
        telefono.sendKeys("3234946955");
        WebElement puestointeres = driver.findElement(By.xpath("//*[@id=\"i45\"]/div[2]"));
        puestointeres.click();
        WebElement enviar = driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div[1]/div/span/span"));
        enviar.click();

    }

    @Then("^debeo poder visualizar una modal que diga usuario registrado con exito$")
    public void debeo_poder_visualizar_una_modal_que_diga_usuario_registrado_con_exito() throws Throwable {
        //driver.quit();

    }
}
