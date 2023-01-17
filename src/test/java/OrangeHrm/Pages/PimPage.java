package OrangeHrm.Pages;

import OrangeHrm.DataBase.InsertDataBase;
import OrangeHrm.Steps.ButtonPages;

import OrangeHrm.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;

    private InsertDataBase insertDataBase;
    private Questions questions;

    @FindBy(how = How.NAME, using = "firstName")
    private WebElement txtName;

    @FindBy(how = How.NAME, using = "middleName")
    private WebElement txtMiddle;

    @FindBy(how = How.NAME, using = "lastName")
    private WebElement txtLastName;

    public PimPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }

    public void acessesAddEmployee() {
        this.buttonPages.btnPim();
        this.buttonPages.btnAddEmployee();
    }

    public void fillOutAddEmployee(String name, String lastName, String middle) {
        this.questions.tiempoSegundos(1);
        this.txtName.sendKeys(name);
        this.txtMiddle.sendKeys(middle);
        this.txtLastName.sendKeys(lastName);
        insertDataBase.insertEmployee(name, lastName, middle);
        this.buttonPages.btnSave();

    }
}
