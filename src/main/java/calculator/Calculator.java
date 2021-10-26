package calculator;

public class Calculator
{
    public int add(int a, int b)
    {
        return a + b;
    }

    public double rvs(int a)
    {
        if (a != 0)
            return 1.0 / a;
        else
            return Double.NaN;
    }

    public double sqrt(int a)
    {
        if (a >= 0)
            return Math.sqrt(a);
        else
            return -1;
    }
}
