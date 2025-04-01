package StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSteps {
    WebDriver driver;

    @Given("browser is open")
    public void browser_is_open() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @And("user is on google search")
    public void user_is_on_google_search() {
    driver.get("https://www.google.com");
    }

    @When("user enter a text in search box")
    public void user_enter_a_text_in_search_box() {
    driver.findElement(By.name("q")).sendKeys("cucumber BDD");
    }

    @And("hits enter")
    public void hits_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @Then("user navigated to search results")
    public void user_navigated_to_search_results() {
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        driver.quit();
    }

}
