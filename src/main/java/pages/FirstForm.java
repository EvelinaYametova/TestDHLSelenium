package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.annotations.Name;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

@Name("First form")
@FindBy(css = "div.preparaion.calc-page_form.site-form")
public class FirstForm extends HtmlElement {
    ////*[@id="app"]/div[2]/div[4]/div[1]/div[1]
    /*@Name("From zabrat")
    @FindBy(xpath = "//div[text()='Откуда забрать?']..")
    private TextInput FromInput;

    @Name("To dostavit")
    @FindBy(xpath = "//div[text()='Куда доставить?']..")
    private TextInput ToInput;*/
}
