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

@DisplayName("xxx - Criar Decisão")
@ExtendWith(TestWatcher.class)

public class DecisaoCriar {
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
  
  @DisplayName("xxx - Criar Decisão")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String xxxlicationURL) throws Exception {
	    // set timeout for driver actions (similar to step timeout)
	    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
	    By by;
	    boolean booleanResult;
	    LoginResponsavel loginresponsvel;

	    // 1. Run Login - Responsável da Decisão e Execusão
	    GeneratedUtils.sleep(500);
	    loginresponsvel = new LoginResponsavel();
	    loginresponsvel.xxxlicationURL = xxxlicationURL;
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
	    by = By.xpath("//div[@id='xxx-web-gn']/xxx-web-gn/block-ui/xxx-layout-with-sidenav/xxx-layout-navigation/section/xxx-vessel-call/div[2]/div/div/div/div[4]/xxx-summary-card[3]/div[2]/div[2]/div[2]");
	    driver.findElement(by).click();
	    
	    // 5. Click 'Primeira linha da tabela'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//tbody/tr[1]/td[1]");
	    driver.findElement(by).click();
	    
	    // 6. Click 'Menuxxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//*/x-xxx-complaints-process/x-xxx-complaint/xxx-sidebar-container/xxx-sidebar/aside/perfect-scrollbar/div/div[1]/div/div/xxx-sidebar-body/div[1]/div/div/xxx-xxx-menu/div/div/div/img");
	    driver.findElement(by).click();
	    
	    // 7. Is 'Criar Decisão' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//a[normalize-space()='Criar Decisão']");
	    driver.findElement(by).isDisplayed();
	    
	    // 8. Click 'Criar Decisão'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//a[normalize-space()='Criar Decisão']");
	    driver.findElement(by).click();
	    
	    // 9. Is '181 | xxx' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//label[normalize-space()='181 | xxx']");
	    driver.findElement(by).isDisplayed();

	    // 10. Click '181 | xxx'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//xxx-sidebar-body//div//div//div//div//xxx-complaint-decision-tariffs//div//table//tr//td//label[contains(text(),'181 | xxx')]");
	    driver.findElement(by).click();
	    
	    // 11. Click 'Selecione uma opção'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//span[contains(text(),'Selecione uma opção')]");
	    driver.findElement(by).click();
	    
	    // 12. Click 'Aceite ACE'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//form[@ng-reflect-form='[object Object]']//button[1]//li[1]");
	    driver.findElement(by).click();

	    // 13. Type 'Teste Decisao' in 'Indique a Decisão Final'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//textarea[@placeholder='Indique a Decisão Final']");
	    driver.findElement(by).sendKeys("Teste Decisao");
	    
	    // 14. Click 'Gravar Decisão'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//button[normalize-space()='Gravar']");
	    driver.findElement(by).click();
	    
	    // 15. Click 'MenuDCS'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//*/x-xxx-complaints-process/x-xxx-complaint/x-xxx-complaints-decision/xxx-sidebar-container/xxx-sidebar/aside/perfect-scrollbar/div/div[1]/div/div/xxx-sidebar-body/div[1]/div/div/xxx-xxx-menu/div/div[1]/div/img");
	    driver.findElement(by).click();
	    
	    // 16. Click 'Gravar'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//a[. = 'Gravar']");
	    driver.findElement(by).click();
	    
	    // 17. Is 'Estado Aceite' visible?
	    GeneratedUtils.sleep(5500);
	    by = By.xpath("//div[normalize-space()='Aceite']");
	    driver.findElement(by).isDisplayed();
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of("https://xxxxxx"));
  }
}