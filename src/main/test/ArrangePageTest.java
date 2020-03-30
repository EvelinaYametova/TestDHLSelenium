import config.SeleniumConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.ArrangePage;

import static org.junit.Assert.*;

public class ArrangePageTest {
    private static SeleniumConfig config;

    @BeforeClass
    public static void init() {
        config = new SeleniumConfig();
        config.open("https://express.dhl.ru/calculator/");
    }

    @AfterClass
    public static void destroy(){
        config.close();
    }

    @Test
    public void inputWeightDisplayed() {
        ArrangePage arrangePage = new ArrangePage(config.getDriver());
        arrangePage.closeExcess();
        arrangePage.inputDestinationInf("Санкт-Петербург", "Россия", "Москва");
        assertTrue(arrangePage.getInputWeight().isDisplayed());
    }

    @Test
    public void btnCalculateDisplayed() {
        ArrangePage arrangePage = new ArrangePage(config.getDriver());
        arrangePage.closeExcess();
        arrangePage.inputDestinationInf("Санкт-Петербург", "Россия", "Москва");
        arrangePage.inputCargoInf("1");
        assertTrue(arrangePage.getBtnCalculate().isDisplayed());
    }

    @Test
    public void btnArrangeDisplayed() {
        ArrangePage arrangePage = new ArrangePage(config.getDriver());
        arrangePage.closeExcess();
        arrangePage.inputDestinationInf("Санкт-Петербург", "Россия", "Москва");
        arrangePage.inputCargoInf("1");
        arrangePage.clickCalculate();
        assertTrue(arrangePage.getBtnArrange().isDisplayed());
    }

    @Test
    public void checkFormTitle() {
        ArrangePage arrangePage = new ArrangePage(config.getDriver());
        arrangePage.closeExcess();
        arrangePage.inputDestinationInf("Санкт-Петербург", "Россия", "Москва");
        arrangePage.inputCargoInf("1");
        arrangePage.clickCalculate();
        arrangePage.clickArrange();
        assertNotNull(arrangePage.getTitleText());
        assertTrue(arrangePage.getTitleText().contains("Оформление отправления из офиса DHL"));
    }

    @Test
    public void btnFurtherDisplayed() {
        ArrangePage arrangePage = new ArrangePage(config.getDriver());
        arrangePage.closeExcess();
        arrangePage.inputDestinationInf("Санкт-Петербург", "Россия", "Москва");
        arrangePage.inputCargoInf("1");
        arrangePage.clickCalculate();
        arrangePage.clickArrange();
        arrangePage.inputAddress("101000", "Садовническая ул, дом 82");
        arrangePage.inputContacts("Андрей Михайленко", "89473672635",
                "michal80@yandex.ru", "Дмитрий Маурин", "89744371687");
        assertTrue(arrangePage.getBtnFurther().isDisplayed());
    }

    @Test
    public void checkAgreementText() {
        ArrangePage arrangePage = new ArrangePage(config.getDriver());
        arrangePage.closeExcess();
        arrangePage.inputDestinationInf("Санкт-Петербург", "Россия", "Москва");
        arrangePage.inputCargoInf("1");
        arrangePage.clickCalculate();
        arrangePage.clickArrange();
        arrangePage.inputAddress("101000", "Садовническая ул, дом 82");
        arrangePage.inputContacts("Андрей Михайленко", "89473672635",
                "michal80@yandex.ru", "Дмитрий Маурин", "89744371687");
        arrangePage.clickFurther();
        assertTrue(arrangePage.getConfidentialText().getText().contains("Я подтверждаю согласие с(-на)"));
    }

    @Test
    public void agreementDisplayed() {
        ArrangePage arrangePage = new ArrangePage(config.getDriver());
        arrangePage.closeExcess();
        arrangePage.inputDestinationInf("Санкт-Петербург", "Россия", "Москва");
        arrangePage.inputCargoInf("1");
        arrangePage.clickCalculate();
        arrangePage.clickArrange();
        arrangePage.inputAddress("101000", "Садовническая ул, дом 82");
        arrangePage.inputContacts("Андрей Михайленко", "89473672635",
                "michal80@yandex.ru", "Дмитрий Маурин", "89744371687");
        arrangePage.clickFurther();
        assertTrue(arrangePage.getAgreement().isDisplayed());
    }
}
