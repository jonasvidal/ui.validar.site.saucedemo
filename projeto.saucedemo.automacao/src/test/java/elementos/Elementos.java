package elementos;

import org.openqa.selenium.By;

public class Elementos {

	public By username = By.id("user-name");
	public By password = By.id("password");
	public By login = By.id("login-button");
	public By msgInvalida = By.xpath("//h3[@data-test='error']");
}
