package ua.kiev.prog.automation.framework.product.app.progkievua.forum.blocks;

import org.openqa.selenium.By;

import ua.kiev.prog.automation.framework.core.product.component.object.BlockObject;
import ua.kiev.prog.automation.framework.product.app.progkievua.Forum;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.HelpPage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.ProfilePage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.SearchPage;
import ua.kiev.prog.automation.framework.product.app.progkievua.forum.UsersPage;

public class MainMenuBlock extends BlockObject
{

	private By _openHelpPage = By.xpath("//*[@id=\"button_help\"]/a");
    private By _openSearchPage = By.xpath("//*[@id=\"button_search\"]/a");
    private By _openProfilePage = By.xpath("//*[@id=\"button_profile\"]/a");
    private By _openUserPage = By.xpath("//*[@id=\"button_mlist\"]/a");

    public HelpPage openHelpPage ()
    {
        this.component().session().driver().findElement(_openHelpPage).click();
        return new HelpPage();
    }

    public SearchPage openSearchPage ()
    {
        this.component().session().driver().findElement(_openSearchPage).click();
        return new SearchPage();
    }

    public ProfilePage openProfilePage ()
    {
        this.component().session().driver().findElement(_openProfilePage).click();
        return new ProfilePage();
    }

    public UsersPage openUserPage ()
    {
        this.component().session().driver().findElement(_openUserPage).click();
        return new UsersPage();
    }
	@Override
	protected By readyLocator() {
		// TODO Auto-generated method stub
		return By.xpath("//div[@id='main_menu']");
	}

	@Override
	protected Class componentClass() {
		// TODO Auto-generated method stub
		return Forum.class;
	}

}
