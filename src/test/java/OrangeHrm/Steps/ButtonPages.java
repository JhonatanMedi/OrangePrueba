package OrangeHrm.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {

    @FindBy(how = How.XPATH, using = "//button[@type= 'submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//ul//li//a[@href = '/web/index.php/pim/viewPimModule']")
    private WebElement btnPim;

    @FindBy(how = How.XPATH, using = "//div[@class ='orangehrm-header-container']//button[@type = 'button']")
    private WebElement btnAddEmployee;

    @FindBy(how = How.XPATH, using = "//button[@type= 'submit']")
    private WebElement btnSave;


    public ButtonPages(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void btnLogin(){
        this.btnLogin.isDisplayed();
        this.btnLogin.click();
    }

    public void btnPim(){
        this.btnPim.isDisplayed();
        this.btnPim.click();
    }

    public void btnAddEmployee(){
        this.btnAddEmployee.isDisplayed();
        this.btnAddEmployee.click();
    }

    public void btnSave(){
        this.btnSave.isDisplayed();
        this.btnSave.click();
    }
}
