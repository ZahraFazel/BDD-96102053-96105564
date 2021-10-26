package calculator;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs
{
    private Calculator calculator;
    private int value1;
    private int value2;
    private int result;
    private int value;
    private double output;
    @Before
    public void before()
    {
        calculator = new Calculator();
    }
    @Given("^Two input values, (-?\\d+) and (-?\\d+)$")
    public void twoInputValuesAnd(int arg0, int arg1)
    {
        value1 = arg0;
        value2 = arg1;
    }
    @When("^I add the two values$")
    public void iAddTheTwoValues()
    {
        result = calculator.add(value1, value2);
        System.out.print(result);
    }
    @Then("^I expect the result (-?\\d+)$")
    public void iExpectTheResult(int arg0)
    {
        Assert.assertEquals(arg0, result);
    }

    @Given("^An input value (-?\\d+) and operator (rvs|sqrt)$")
    public void an_input_value(int arg, String operation)
    {
        value = arg;
    }
    @When("^I (reverse|square root) the value$")
    public void theValueAfterOp(String operation)
    {
        output = operation.equals("reverse") ? calculator.rvs(value) : calculator.sqrt(value);
    }
    @Then("^I expect the result (-?\\d+(\\.\\d+))$")
    public void theResultShouldBe(double arg0, double arg1)
    {
        double number = arg0 + arg1 * Math.pow(10, -Double.toString(arg1).length());
        Assert.assertEquals(number, output, 0.01);
    }
    @Then("^I expect the result out of (rvs|sqrt)\'s domain$")
    public void theResultShouldBe(String operation)
    {
        if (operation.equals("rvs"))
            Assert.assertEquals(0.0, output, 0.01);
        else
            Assert.assertEquals(-1.0, output, 0.01);
    }
}
