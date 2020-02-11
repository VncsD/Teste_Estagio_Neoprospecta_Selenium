import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebDriver driver;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void visitar() {
		driver.get("https://prova-dot-bioview-neopct.appspot.com");
	}
	
	public void logar(String email, String senha) {
		
		
		WebElement campoEmail = driver.findElement(By.id("mat-input-0"));
		WebElement campoSenha = driver.findElement(By.id("mat-input-1"));
		
		campoEmail.sendKeys(email);
		campoSenha.sendKeys(senha);
		
			
		WebElement btnEntrar = driver.findElement(By.className("mat-raised-button"));
		btnEntrar.click();
	}

}
