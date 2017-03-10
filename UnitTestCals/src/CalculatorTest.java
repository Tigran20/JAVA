import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void getCircleSquareTest()
    {
        Calculator calculator = new Calculator();
        int actualSquare = (int) calculator.getCircleSquare(20.7);
        int expectedSquare = 1346;

        Assert.assertEquals(actualSquare, expectedSquare);
    }

    @Test
    public void getRectangleSquareTest()
    {
        Calculator calculator = new Calculator();
        int actualSquare = calculator.getRectangleSquare(4,8);
        int expectedSquare = 32;

        Assert.assertEquals(actualSquare, expectedSquare);
    }
}
