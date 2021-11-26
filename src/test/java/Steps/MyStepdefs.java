package Steps;

import Pages.calculator_page;
import Utils.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs extends TestContext {


    calculator_page calc_page;
    @Given("I am on BMI_Calculator page")
   public void iAmOnBMI_CalculatorPage() {

        calc_page = new calculator_page(driver,wait);
    }

    @When("I enter <age> in calculator")
    public void iEnterAgeInCalculator() throws InterruptedException {
        calc_page.enterAge();
    }

    @And("I select <gender> in calculator")
    public void iSelectGenderInCalculator() {
        calc_page.selectGender();
    }


    @And("I Press <Calculate> in calculator")
    public void iPressCalculateInCalculator() {
        calc_page.clickCalculateButton();
    }

    @Then("I see the result is <Expected_result>")
    public void iSeeTheResultIsExpected_result() {
        calc_page.getResult();
    }

    @And("I enter <HeightAndWeight>")
    public void iEnterHeightAndWeight() throws InterruptedException {

        calc_page.enterHeight();
        calc_page.enterWeight();
    }

//    @Given("I am on BMI_calculator page")
//    public void iAmOnBMI_calculatorPage() {
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        calc_page = new calculator_page(driver);
//    }
}
