package OrangeHrm.Pages;

import OrangeHrm.DataBase.ConsultDataBase;
import OrangeHrm.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.sql.SQLException;

public class LoginPage {

    private ConsultDataBase consultDataBase;
    private ButtonPages buttonPages;

    @FindBy(how = How.NAME, using = "username")
    private WebElement txtName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txtPass;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    public void fillOutLogueo(String user, String password) throws SQLException {

        this.txtName.sendKeys(user);
        this.txtPass.sendKeys(password);
        this.buttonPages.btnLogin();
       // consultDataBase.consultUsers();
    }
}
