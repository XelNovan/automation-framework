package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;

import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.blocks.MainMenuBlock;

public class SearchPage extends PageObject
{

	@Override
	protected Class componentClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected By readyLocator() {
		// TODO Auto-generated method stub
		return By.xpath("//li[@class='last']/a/span[text()='Поиск']");
	}
	final public MainMenuBlock mainMenu ()
	{
	 return new MainMenuBlock();
	}
}
