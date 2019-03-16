import org.junit.Assert;
import org.junit.Test;
import task_5.operations.Addition;
import task_5.operations.Division;
import task_5.operations.Multiplication;
import task_5.operations.Subtraction;

public class CalcJunitTests {

    @Test
    public void additionTest() {
        Addition add = new Addition();
        double exp = 8;
        Assert.assertEquals(exp, add.operation(4, 4), 0);
    }

    @Test
    public void divisionTest() {
        Division div = new Division();
        double exp = 2;
        Assert.assertEquals(exp, div.operation(8, 4), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionByZeroTest() {
        new Division().operation(8.64, 0);
    }

    @Test
    public void multiplicationTest() {
        Multiplication mul = new Multiplication();
        double exp = 7;
        Assert.assertEquals(exp, mul.operation(3.5, 2), 0);
    }

    @Test
    public void subtractionTest() {
        Subtraction sub = new Subtraction();
        double exp = 2.5;
        Assert.assertTrue(String.format("You made a mistake: expected [%f], but was [%f]", exp, sub.operation(5.7, 3.2)),
                exp == sub.operation(5.7, 3.2));
    }
}
