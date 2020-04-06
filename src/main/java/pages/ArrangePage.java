package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrangePage {
    private WebDriver driver;

    public ArrangePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath="//*[@id=\"fancybox-container-1\"]/div[2]/div[4]/div/div/button")
    private WebElement closeElement;
    @FindBy(xpath = "//*[@id=\"modcookie\"]/div/div/a")
    private WebElement okElement;

    public void closeExcess(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        /*wait.until(ExpectedConditions.elementToBeClickable(closeElement));
        closeElement.click();*/
        wait.until(ExpectedConditions.elementToBeClickable(okElement));
        okElement.click();
    }


    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]/div/label/input")
    private WebElement inputCityFrom;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/div")
    private WebElement cityFromElement;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div[1]/div[2]/div[2]/div[1]/div/label/input")
    private WebElement inputCountryTo;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div/div[2]/div[2]/div[1]/div/label/input")
    private WebElement countryToElement;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div/label/input")
    private WebElement inputCityTo;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div")
    private WebElement cityToElement;

    public void inputDestinationInf(String cityFrom, String countryTo, String cityTo){
        inputCityFrom.sendKeys(cityFrom);
        cityFromElement.click();
        inputCountryTo.sendKeys(countryTo);
        countryToElement.click();
        inputCityTo.sendKeys(cityTo);
        cityToElement.click();
    }


    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div[2]/div[3]/div/div[2]/div[2]/div/div[1]/label/div/input")
    private WebElement inputWeight;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div[2]/div[3]/div/div[3]/button[2]")
    private WebElement btnDone;

    public WebElement getInputWeight()
    {
        return inputWeight;
    }
    public void inputCargoInf(String weight){
        inputWeight.sendKeys(weight);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnDone));
        btnDone.click();
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div[4]/div[3]/button")
    private WebElement btnCalculate;

    public WebElement getBtnCalculate(){
        return btnCalculate;
    }
    public void clickCalculate(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnCalculate));
        btnCalculate.click();
    }

    @FindBy(xpath = "//*[@id=\"result-block\"]/div/div[2]/div[1]/div/div[2]/div")
    private  WebElement btnArrange;

    public WebElement getBtnArrange(){
        return btnArrange;
    }
    public void clickArrange(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnArrange));
        btnArrange.click();
    }

    @FindBy(xpath = "//*[@id=\"secondStep\"]/header/div")
    private WebElement formTitle;

    public WebElement getFormTitle(){
        return formTitle;
    }
    public String getTitleText(){
        return formTitle.getText();
    }

    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[1]/div[4]/div[4]/label/input")
    private WebElement recipientPostcode;
    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[1]/div[4]/div[4]/div[2]/div")
    private WebElement postcodeElement;
    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[1]/div[4]/div[5]/label/input")
    private WebElement recipientAddress;

    public void inputAddress(String postcode, String address){
        recipientPostcode.sendKeys(postcode);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(postcodeElement));
        postcodeElement.click();
        recipientAddress.sendKeys(address);
    }

    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[3]/div[2]/div/div[2]/div/label/input")
    private WebElement senderName;
    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[3]/div[2]/div/div[4]/div/label/input")
    private WebElement senderNumber;
    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[3]/div[2]/div/div[5]/div/label/input")
    private WebElement senderEmail;
    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[3]/div[3]/div/div[2]/div/label/input")
    private WebElement recipientName;
    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[3]/div[3]/div/div[4]/div/label/input")
    private WebElement recipientNumber;

    public void inputContacts(String sName, String sNumber, String sEmail, String rName, String rNumber){
        senderName.sendKeys(sName);
        senderNumber.sendKeys(sNumber);
        senderEmail.sendKeys(sEmail);
        recipientName.sendKeys(rName);
        recipientNumber.sendKeys(rNumber);
    }

    @FindBy(xpath = "//*[@id=\"secondStep\"]/div[4]/button")
    private WebElement btnFurther;

    public WebElement getBtnFurther(){
        return btnFurther;
    }

    public void clickFurther(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnFurther));
        btnFurther.click();
    }

    @FindBy(xpath = "//*[@id=\"calculatedProduct\"]/div[3]/div[2]/div[2]")
    private WebElement confidentialText;

    public WebElement getConfidentialText(){
        return confidentialText;
    }

    @FindBy(css = "#calculatedProduct > div.total > div.total_confidential > div.checkbox")
    private WebElement agreement;

    public WebElement getAgreement(){
        return agreement;
    }
}