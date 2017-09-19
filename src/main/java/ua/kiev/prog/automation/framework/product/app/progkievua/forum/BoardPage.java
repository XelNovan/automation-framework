package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;

import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;

public class BoardPage extends PageObject
{

	@Override
	protected Class componentClass() {
		// TODO Auto-generated method stub
		return Forum.class;
	}

	@Override
    protected By readyLocator()
    {
        return By.xpath("//*[@id=\"main_content_section\"]/div[2]/div/ul/li[4]/a/span"); // Локатор готовности страницы
    }
    final public BoardPage clickQAAutomation10082017 ()
    {
        
        this.component().session().driver().findElement(_QAAutomation10082017).click();

        return new BoardPage();
    }
    private By _QAAutomation10082017 = By.xpath("//*[@id=\"msg_30305\"]/a");
}
