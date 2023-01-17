package OrangeHrm.Definitions;

import OrangeHrm.Pages.LoginPage;
import OrangeHrm.Pages.PimPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import OrangeHrm.Steps.Conexion;
import io.cucumber.java.en.Given;

import java.sql.SQLException;


public class DefinitionsSteps {

    private WebDriver driver;
    private Conexion conexion = new Conexion();
    private LoginPage loginPage = new LoginPage(driver);
    private PimPage pimPage = new PimPage(driver);


    @Given("^abrir el navegador$")
    public void abrir_navegador() {
        this.conexion = new Conexion();
        this.driver = this.conexion.abrirNavegador();

    }

    @When("^fill out user (.*) password (.*)$")
    public void fillOutLogueo(String user, String password) throws SQLException {
        this.loginPage = new LoginPage(driver);
        this.loginPage.fillOutLogueo(user, password);
    }

    @When("^the user acesses to the add employee$")
    public void acessesAddEmployee() {
        this.pimPage = new PimPage(driver);
        this.pimPage.acessesAddEmployee();
    }

    @When("^the user fill out (.*) last name (.*) middle (.*)$")
    public void fillOutAddEmployee(String name, String lastName, String middle) {
        this.pimPage = new PimPage(driver);
        this.pimPage.fillOutAddEmployee(name, lastName, middle);
    }
}