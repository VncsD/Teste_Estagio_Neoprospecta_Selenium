import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardPage {

	
private WebDriver driver;
	
	public DashBoardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void visitarPaginaDeFiltros() {
		WebElement btnFiltro = driver.findElement(By.xpath("//a[@href='/filter']"));
		btnFiltro.click();
	}
}
