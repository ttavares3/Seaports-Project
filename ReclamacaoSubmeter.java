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

@DisplayName("xxx - Submeter Reclamação")
@ExtendWith(TestWatcher.class)

public class ReclamacaoSubmeter {
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
  
  @DisplayName("xxx - Submeter Reclamação")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute(String xxxlicationURL) throws Exception {
	    // set timeout for driver actions (similar to step timeout)
	    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
	    By by;
	    boolean booleanResult;
	    LoginAgentexxx loginagentexxx;

	    // 1. Run Login - Agente
	    GeneratedUtils.sleep(500);
	    loginagentexxx = new LoginAgente();
	    loginagentexxx.xxxlicationURL = xxxlicationURL;
	    loginagentexxx.execute(driver);

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
	    
	    // 7. Click 'Submeter'
	    GeneratedUtils.sleep(500);
	    by = By.xpath("//a[normalize-space()='Submeter']");
	    driver.findElement(by).click();
	    
	    // 8. Is 'Estado Em Despacho' visible?
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