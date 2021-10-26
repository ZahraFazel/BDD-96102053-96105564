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
    private String op;
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
    public void an_input_value(int arg1, String operation)
    {
        value = arg1;
        op = operation;
    }
    @When("^I (reverse|square root) the value$")
    public void theValueAfterOp(String operation)
    {
        if(operation.equals("reverse"))
            output = calculator.rvs(value);
        else
            output = calculator.sqrt(value);
        System.out.print(output);
    }
    @Then("^I expect the result (-?\\d+(\\.\\d+))$")
    public void theResultShouldBe(double arg0, double arg1)
    {
        int numberOfDigits = Double.toString(arg1).length();
        double number = arg0 + arg1 * Math.pow(10, -numberOfDigits);
        Assert.assertEquals(number, output, 0.01);
    }
}