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
import com.junit5.pt.xxx.qa.testautomation.TestCases.xxx.LoginResponsavel;
import com.junit5.pt.xxx.qa.testautomation.UtilityClasses.GeneratedUtils;
import com.junit5.pt.xxx.qa.testautomation.UtilityClasses.ProjectParameters;

@DisplayName("xxx - Criar Avaliação")
@ExtendWith(TestWatcher.class)

public class AvalicaoCriar {
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
  
  @DisplayName("xxx - Criar Avaliação")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String ApplicationURL) throws Exception {
	    // set timeout for driver actions (similar to step timeout)
	    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
	    By by;
	    boolean booleanResult;
	    LoginResponsavel loginresponsvel;

	    // 1. Run Login - Responsável da Avaliação
	    GeneratedUtils.sleep(500);
	    loginresponsvel = new LoginResponsavel();
	    loginresponsvel.ApplicationURL = ApplicationURL;
	    loginresponsvel.execute(driver);

	    // 2. Navigate to 'Escala de teste'
	    GeneratedUtils.sleep(500);
	    driver.navigate().to("https://xxxx");
	    
	    // 3. Is 'Reclamações' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//div[contains(text(),'Reclamações')]");
	    driver.findElement(by).isDisplayed();
	    
	    // 4. Click 'Reclamações'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//div[@id='xxx-web-gn']/xxx-web-gn/block-ui/app-layout-with-sidenav/app-layout-navigation/section/app-vessel-call/div[2]/div/div/div/div[4]/app-summary-card[3]/div[2]/div[2]/div[2]");
	    driver.findElement(by).click();
	    
	    // 5. Click 'Primeira linha da tabela'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//tbody/tr[1]/td[1]");
	    driver.findElement(by).click();
	    
	    // 6. Click 'Menuxxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//*/x-app-complaints-process/x-app-complaint/xxx-sidebar-container/xxx-sidebar/aside/perfect-scrollbar/div/div[1]/div/div/xxx-sidebar-body/div[1]/div/div/xxx-xxx-menu/div/div/div/img");
	    driver.findElement(by).click();
	    
	    // 7. Is 'Criar Avaliação' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//a[normalize-space()='Criar Avaliação']");
	    driver.findElement(by).isDisplayed();

	    // 8. Click 'Criar Avaliação'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//a[normalize-space()='Criar Avaliação']");
	    driver.findElement(by).click();
	    
	    // 9. Is '181 | xxx' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//label[normalize-space()='181 | xxx']");
	    driver.findElement(by).isDisplayed();

	    // 10. Click '181 | xxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//xxx-sidebar-body//div//div//app-complaint-evaluation-tariffs//div//table//tr//td//label[contains(text(),'181 | xxx')]");
	    driver.findElement(by).click();
	    
	    // 11. Is 'Adicionar Parecer da Avaliação' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//span[normalize-space()='Adicionar Parecer da Avaliação']");
	    driver.findElement(by).isDisplayed();

	    // 12. Click 'Adicionar Parecer da Avaliação'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[normalize-space()='Adicionar Parecer da Avaliação']");
	    driver.findElement(by).click();
	    
	    // 13. Type 'Teste Parecer Avaliacao' in 'Indique o Parecer da Avaliação'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//textarea[@placeholder='Indique o Parecer da Avaliação']");
	    driver.findElement(by).sendKeys("Teste Parecer Avaliacao");
	    
	    // 14. Click 'Fechar Sidebar'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//aside/div/img");
	    driver.findElement(by).click();
	    
	    // 15. Is 'Adicionar Grupo Parecer' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//span[normalize-space()='Adicionar Grupo Parecer']");
	    driver.findElement(by).isDisplayed();

	    // 16. Click 'Adicionar Grupo Parecer'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[normalize-space()='Adicionar Grupo Parecer']");
	    driver.findElement(by).click();
	    
	    // 17. Click 'Selecione uma opção'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[contains(text(),'Selecione uma opção')]");
	    driver.findElement(by).click();
	    
	    // 18. Is 'Faturação - APS' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//span[normalize-space()='Faturação - APS']");
	    driver.findElement(by).isDisplayed();

	    // 19. Click 'Faturação - APS'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[normalize-space()='Faturação - APS']");
	    driver.findElement(by).click();
	    
	    // 20. Click 'Fechar Sidebar'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//aside/div/img");
	    driver.findElement(by).click();
	    
	    // 21. Click 'Seta Menuxxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//xxx-xxx-menu[@ng-reflect-allow-selection='false']");
	    driver.findElement(by).click();
	    
	    // 22. Click 'MenuAVL'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//*/x-app-complaints-process/x-app-complaint/x-app-complaints-evaluation/xxx-sidebar-container/xxx-sidebar/aside/perfect-scrollbar/div/div[1]/div/div/xxx-sidebar-body/div[1]/div/div/xxx-xxx-menu/div/div/div/img");
	    driver.findElement(by).click();
	    
	    // 23. Click 'Gravar'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//a[. = 'Gravar']");
	    driver.findElement(by).click();
	    
	    // 24. Is 'Estado Em Elaboração' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//div[normalize-space()='Em elaboração']");
	    driver.findElement(by).isDisplayed();
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("https://xxxxx"));
  }
}