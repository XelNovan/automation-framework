package ua.kiev.prog.automation.framework.product.app.progkievua.forum;

import org.openqa.selenium.By;

import ua.kiev.prog.automation.framework.core.product.component.object.PageObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.blocks.MainMenuBlock;

public class UsersPage extends PageObject
{

	@Override
	protected Class componentClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected By readyLocator() {
		// TODO Auto-generated method stub
		return By.xpath("//li/a/span[text()='Список пользователей']");
	}
	final public MainMenuBlock mainMenu ()
	{
	 return new MainMenuBlock();
	}
}
