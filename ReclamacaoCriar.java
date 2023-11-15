package com.junit5.pt.xxx.qa.testautomation.TestCases.xxx;

import java.lang.Exception;
import java.lang.String;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.junit5.pt.xxx.qa.testautomation.Listeners.TestWatcher;
import com.junit5.pt.xxx.qa.testautomation.TestCases.xxx.LoginAgente;
import com.junit5.pt.xxx.qa.testautomation.UtilityClasses.GeneratedUtils;
import com.junit5.pt.xxx.qa.testautomation.UtilityClasses.ProjectParameters;

@DisplayName("xxx - Criar Reclamação")
@ExtendWith(TestWatcher.class)

public class ReclamacaoCriar {
	public static WebDriver driver;
	
  @BeforeAll
  static void setup() throws Exception {

		System.setProperty("webdriver.chrome.driver", ProjectParameters.chromedriverPath);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--window-size=1920,1200");
		options.addArguments("--ignore-certificate-errors");
		options.addArguments("--disable-extensions");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--proxy-bypass-list=localhost");
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		Dimension newDimension = new Dimension(1920, 1080);
		driver.manage().window().setSize(newDimension);
	}
  
  @DisplayName("xxx - Criar Reclamação")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String xxxlicationURL) throws Exception {
	    // set timeout for driver actions (similar to step timeout)
	    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
	    By by;
	    boolean booleanResult;
	    LoginAgente loginagente;

	    // 1. Run Login - Agente
	    GeneratedUtils.sleep(500);
	    loginagente = new LoginAgente();
	    loginagente.xxxlicationURL = xxxlicationURL;
	    loginagente.execute(driver);

	    // 2. Navigate to 'Escala de teste'
	    GeneratedUtils.sleep(500);
	    driver.navigate().to("https://xxxx");
	    
	    // 3. Is 'Reclamações' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//div[contains(text(),'Reclamações')]");
	    driver.findElement(by).isDisplayed();
	    
	    // 4. Click 'Reclamações'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//div[@id='xxx-web-gn']/xxx-web-gn/block-ui/xxx-layout-with-sidenav/xxx-layout-navigation/section/xxx-vessel-call/div[2]/div/div/div/div[4]/xxx-summary-card[3]/div[2]/div[2]/div[2]");
	    driver.findElement(by).click();
	    
	    // 5. Click 'Menuxxx Inicial'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//div[@ng-reflect-auto-close='true']//div[@aria-haspopup='true']//div//img");
	    driver.findElement(by).click();
	    
	    // 6. Is 'Adicionar Reclamação' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//a[normalize-space()='Adicionar Reclamação']");
	    driver.findElement(by).isDisplayed();

	    // 7. Click 'Adicionar Reclamação'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//a[normalize-space()='Adicionar Reclamação']");
	    driver.findElement(by).click();
	    
	    // 8. Is 'Adicionar Dados da Reclamação' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//span[normalize-space()='Adicionar Dados da Reclamação']");
	    driver.findElement(by).isDisplayed();

	    // 9. Click 'Adicionar Dados da Reclamação'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[normalize-space()='Adicionar Dados da Reclamação']");
	    driver.findElement(by).click();
	    
	    // 10. Click 'Selecione uma opção'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[contains(text(),'Selecione uma opção')]");
	    driver.findElement(by).click();
	    
	    // 11. Is 'APS - xxx' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//span[contains(text(),'APS - xxx')]");
	    driver.findElement(by).isDisplayed();

	    // 12. Click 'APS - xxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[contains(text(),'APS - xxx')]");
	    driver.findElement(by).click();
	    
	    // 13. Click 'Selecione uma opção'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[contains(text(),'Selecione uma opção')]");
	    driver.findElement(by).click();
	    
	    // 14. Is 'Pré Factura xxx, xxx' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//span[normalize-space()='Pré Factura xxx, xxx']");
	    driver.findElement(by).isDisplayed();

	    // 15. Click 'Pré Factura xxx, xxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[normalize-space()='Pré Factura xxx, xxx']");
	    driver.findElement(by).click();
	    
	    // 16. Click 'Fechar Sidebar'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//aside/div/img");
	    driver.findElement(by).click();
	    
	    // 17. Is '181 | xxx' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//label[normalize-space()='181 | xxx']");
	    driver.findElement(by).isDisplayed();

	    // 18. Click '181 | xxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//label[normalize-space()='181 | xxx']");
	    driver.findElement(by).click();
	    
	    // 19. Is 'Alegação' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//span[normalize-space()='Alegação']");
	    driver.findElement(by).isDisplayed();

	    // 20. Click 'Alegação'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[normalize-space()='Alegação']");
	    driver.findElement(by).click();
	    
	    // 21. Type 'Teste Alegacao' in 'Indique a Alegação'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//textarea[@placeholder='Indique a Alegação']");
	    driver.findElement(by).sendKeys("Teste Alegacao");
	    
	    // 22. Click 'Fechar Sidebar'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//aside/div/img");
	    driver.findElement(by).click();
	    
	    // 23. Click 'Seta Menuxxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//xxx-xxx-menu[@ng-reflect-allow-selection='false']//img");
	    driver.findElement(by).click();
	    
	    // 24. Click 'Menuxxx gravar'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//*/x-xxx-complaints-process/x-xxx-complaint/xxx-sidebar-container/xxx-sidebar/aside/perfect-scrollbar/div/div[1]/div/div/xxx-sidebar-body/div[1]/div/div/xxx-xxx-menu/div/div/div/img");
	    driver.findElement(by).click();
	    
	    // 25. Click 'Gravar'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//a[. = 'Gravar']");
	    driver.findElement(by).click();
	    
	    // 26. Is 'Estado Em Elaboração' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//*/x-xxx-complaints-process/x-xxx-complaint/xxx-sidebar-container/xxx-sidebar/aside/perfect-scrollbar/div/div[1]/div/div/xxx-sidebar-body/div[2]/div[1]/div/xxx-complaints-main-data/xxx-add-card-button/div/div/div[1]/div/div[2]/div/img");
	    driver.findElement(by).isDisplayed();    
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("https://xxxx"));
  }
}
