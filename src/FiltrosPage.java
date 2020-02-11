import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FiltrosPage {
	
	private WebDriver driver;
	
	public FiltrosPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void AdicionarFiltro(String filtro) {
		
		WebElement btnAdicionar = driver.findElement(By.className("mat-fab"));
		btnAdicionar.click();
		
		WebElement campoNomeFiltro = driver.findElement(By.id("mat-input-3"));
		campoNomeFiltro.sendKeys(filtro);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		WebElement btnAvancar =wait.until(ExpectedConditions.elementToBeClickable(
				driver.findElement(By.xpath("//span[@class = 'mat-button-wrapper' and contains(text(), 'Avançar')]"))));
		btnAvancar.click();
	}

}
