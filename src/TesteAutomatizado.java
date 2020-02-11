import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteAutomatizado {
	
	private ChromeDriver driver;
	
	@Before
	public void inicializa() {
		this.driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
		public void deveAdicionarUmFiltro() {
		TesteAutomatizado teste = new TesteAutomatizado();
		
		LoginPage login = new LoginPage(driver);
		login.visitar();
		login.logar("vncs.du@gmail.com","estagio#neo@06");
		
		teste.pausa(5000);
		
	
		DashBoardPage dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.visitarPaginaDeFiltros();
		
		teste.pausa(3000);
		
		FiltrosPage filtrosPage = new FiltrosPage(driver);
		filtrosPage.AdicionarFiltro("Filtro Automatizado");
		
		
		
		
	}
	
	
	
	public void pausa(int milisegundos) {
		
		try {
	        Thread.sleep(milisegundos);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
		
	}
	
}
	
	


